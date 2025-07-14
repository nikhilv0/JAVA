package com.xworkz.service;

import com.xworkz.dto.SignUpDTO;
import com.xworkz.repository.SignUpRepository;
import com.xworkz.repository.SignUpRepositoryImp;

public class SignUpServiceImp implements SignUpService {
    @Override
    public String validateAndsave(SignUpDTO signUpDTO) {
        if (signUpDTO != null) {
            String email = signUpDTO.getEmail();
            String userId = signUpDTO.getUserId();
            String password = signUpDTO.getPassword();
            String confPassword = signUpDTO.getConfirmPassword();

            if (email == null) {
                System.out.println("invalid mail");
                return "enter valid email";
            }
            if (userId.length() < 5 || userId.length() > 20) {
                System.out.println("Invalid userId");
                return "enter valid userID";
            }
            if (password.length() < 5 || password.length() > 20) {
                System.out.println("Invalid password");
                return "enter valid password";
            }
            if (!password.equals(confPassword)) {
                System.out.println("mismatched password");
                return "mismatched password";
            }
            SignUpRepository signUpRepository = new SignUpRepositoryImp();
            signUpRepository.save(signUpDTO);

        }
        return "SuccessFully sumbitted";
    }

    @Override
    public SignUpDTO findBy(String mail,String password) {
        if ((mail.length() > 4 && password.length() > 5)) {
            System.out.println("valid userId and password");
            SignUpRepository signUpRepository = new SignUpRepositoryImp();
            return signUpRepository.findById(mail,password);

        } else {
            System.out.println("invalid user Id and password");
        }
        return null;
    }


    @Override
    public SignUpDTO findByUser( String email) {

        if ( email != null) {
            System.out.println("valid email");
            SignUpRepository signUpRepository = new SignUpRepositoryImp();
            SignUpDTO signUpDTO = signUpRepository.findByUser(email);
            return signUpDTO;

        } else {
            System.out.println("invalid email");
        }
        return null;
    }

    @Override
    public String generateOtp(String otp,String otpFromSession,String emailSession) {  //otp for sign
            if (otp.equals(otpFromSession)){
                System.out.println("valid otp for signIn");
                SignUpRepository signUpRepository=new SignUpRepositoryImp();
                signUpRepository.storeOTP(otpFromSession,emailSession);
                return "validated otp for singIn";
            }
            else {
//                System.out.println("Enter valid otp ");
                return "Enter valid otp";
            }
    }
    @Override
    public String validateForgototp(String forgototp,String otp, String email) { //otp for forgot
        if (forgototp.equals(otp)) {
            System.out.println("valid otp for Forgot");
            SignUpRepository signUpRepository = new SignUpRepositoryImp();
            signUpRepository.forgotStoreOTP(otp, email);
            return "validated otp for forgot";
        }
        else {
            return "Enter valid otp";
        }
    }
}



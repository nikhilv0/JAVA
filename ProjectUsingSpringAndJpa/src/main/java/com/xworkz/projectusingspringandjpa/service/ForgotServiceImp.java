package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.dto.ForgotDTO;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import com.xworkz.projectusingspringandjpa.repository.ForgotRepository;
import com.xworkz.projectusingspringandjpa.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ForgotServiceImp implements ForgotService {
    @Autowired
    ForgotRepository forgotRepository;

    @Autowired
    SignUpRepository signUpRepository;

    private final BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();

    @Override
    public boolean mailExits(ForgotDTO forgotDTO) {
        System.out.println("Validating user exits!");

        return forgotRepository.mailExits(forgotDTO.getEmail());
    }

    //    ???
//    @Modifying
//    @Transactional
//    @Query("UPDATE SignUpEntity s SET s.resetToken = :token, s.tokenExpiry = :expiry, s.updatedAt = CURRENT_TIMESTAMP WHERE s.email = :email")
//    int updateTokenFields(@Param("token") String token,
//                          @Param("expiry") LocalDateTime expiry,
//                          @Param("email") String email);
//}
    @Override
    public String updateToken(String token, ForgotDTO forgotDTO) {
        Optional<SignUpEntity> optionalUser = signUpRepository.findByEmail(forgotDTO.getEmail());

        if (!optionalUser.isPresent()) {
            return "User not found to store token";
        }

        SignUpEntity signUpEntity = optionalUser.get();
        signUpEntity.setResetToken(token);
        signUpEntity.setTokenExpiry(LocalDateTime.now().plusMinutes(15)); // token valid 15 mins
        signUpEntity.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        signUpRepository.save(signUpEntity);

        return "Token saved successfully";
    }


    @Override
    public boolean isValidToken(String token) {
        System.out.println("Validating token exits!");
        SignUpEntity signUpEntity = signUpRepository.isValidToken(token);

        return signUpEntity != null && signUpEntity.getTokenExpiry().isAfter(LocalDateTime.now());
    }

    @Override
    public String resetPassword(String token, String password) {
        System.out.println("Validating reset password");
        SignUpEntity signUpEntity = signUpRepository.isValidToken(token);

        if (signUpEntity== null || signUpEntity.getTokenExpiry().isBefore(LocalDateTime.now())) {
            return "error";
        }
        String encryptedPassword=passwordEncoder.encode(password);
        signUpEntity.setPassword(encryptedPassword);
        signUpEntity.setResetToken(null);
        signUpEntity.setTokenExpiry(null);
        signUpRepository.save(signUpEntity);
        return "success";
    }
}

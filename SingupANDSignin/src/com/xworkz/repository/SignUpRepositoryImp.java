package com.xworkz.repository;

import com.xworkz.constant.DBconstant;
import com.xworkz.dto.SignUpDTO;
import org.mindrot.jbcrypt.BCrypt;

import java.sql.*;
import java.time.LocalDate;

public class SignUpRepositoryImp implements SignUpRepository {
    @Override
    public String save(SignUpDTO signUpDTO) {
        try {
            Class.forName(DBconstant.DRIVER.getValue());
            Connection connection = DriverManager.getConnection(DBconstant.URL.getValue(), DBconstant.USERNAME.getValue(), DBconstant.PASSWORD.getValue());

            String hashedPassword = BCrypt.hashpw(signUpDTO.getPassword(), BCrypt.gensalt());
            String sql = "insert into sign_up (id,email, user_id, password, reg_date) values(?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, 0);
            preparedStatement.setString(2, signUpDTO.getEmail());
            preparedStatement.setString(3, signUpDTO.getUserId());
            preparedStatement.setString(4, hashedPassword);
//            preparedStatement.setString(5,signUpDTO.getConfirmPassword());
            preparedStatement.setDate(5, java.sql.Date.valueOf(LocalDate.now()));

            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return "false";
    }

    @Override
    public SignUpDTO findById(String mail,String enteredPassword) {

        try {
            Class.forName(DBconstant.DRIVER.getValue());
            Connection connection=DriverManager.getConnection(DBconstant.URL.getValue(),DBconstant.USERNAME.getValue(), DBconstant.PASSWORD.getValue());

            String sql = "SELECT * FROM sign_up WHERE email = '" + mail + "'";
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);

            while (resultSet.next()) {
                int pk = resultSet.getInt("id");
                String user = resultSet.getString("user_id");
                String storedHashedPassword= resultSet.getString("password");
                String email=resultSet.getString("email");
//                String conformPassword=resultSet.getString("confirmPassword");

                if (BCrypt.checkpw(enteredPassword, storedHashedPassword)) {
//                    System.out.println(enteredPassword);
                    System.out.println(storedHashedPassword);
                    System.out.println("from DB");
                SignUpDTO signUpDTO1 = new SignUpDTO(user,email,enteredPassword);
                System.out.println(signUpDTO1);
                return signUpDTO1;
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
 }

    @Override
    public SignUpDTO findByUser( String email) {

        try {
            Class.forName(DBconstant.DRIVER.getValue());
            Connection connection=DriverManager.getConnection(DBconstant.URL.getValue(),DBconstant.USERNAME.getValue(), DBconstant.PASSWORD.getValue());

            String sql="select * from sign_up where email= ? ";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,email);
            ResultSet resultSet=preparedStatement.executeQuery();

            while(resultSet.next()){
                int pk=resultSet.getInt("id");
                String user1=resultSet.getString("user_Id");
                String mail=resultSet.getString("email");
                String password=resultSet.getString("password");

                SignUpDTO signUpDTO=new SignUpDTO(user1,mail,password);
                System.out.println(signUpDTO);
                return signUpDTO;
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public String storeOTP(String emailSession,String otpSession) {
        if (emailSession.length() > 100) {

        try {
            Class.forName(DBconstant.DRIVER.getValue());
            Connection connection=DriverManager.getConnection(DBconstant.URL.getValue(),DBconstant.USERNAME.getValue(),DBconstant.PASSWORD.getValue());

            String sql="insert into otp_signIn values(?,?,?,?)";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);

            preparedStatement.setInt(1,0);
            preparedStatement.setString(2,emailSession);
            preparedStatement.setString(3,otpSession);
            preparedStatement.setTimestamp(4, new Timestamp(System.currentTimeMillis()));

            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
            throw new IllegalArgumentException("Email too long to be stored");
        }

        return "working";
    }

    @Override
    public String forgotStoreOTP(String forgotMail, String forgotOTP) {

        try {
            Class.forName(DBconstant.DRIVER.getValue());
            Connection connection=DriverManager.getConnection(DBconstant.URL.getValue(),DBconstant.USERNAME.getValue(), DBconstant.PASSWORD.getValue());

            String sql="insert into otp_forgot values(?,?,?,?)";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);

            preparedStatement.setInt(1,0);
            preparedStatement.setString(2,forgotMail);
            preparedStatement.setString(3,forgotOTP);
            preparedStatement.setTimestamp(4,new Timestamp(System.currentTimeMillis()));

            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return "Successfully stored forgot otp";
    }

    @Override
    public String saveCredentials(String newPassword,String forgotmail) {

        try {
            Class.forName(DBconstant.DRIVER.getValue());
            Connection connection=DriverManager.getConnection(DBconstant.URL.getValue(),DBconstant.USERNAME.getValue(),DBconstant.PASSWORD.getValue());

            String sql="update sign_up SET password = ?,updated_date = CURRENT_TIMESTAMP WHERE email = ?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);

            preparedStatement.setString(1,newPassword);
            preparedStatement.setString(2,forgotmail);
            preparedStatement.executeUpdate();

            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()) {
                String password = resultSet.getString("password");

                System.out.println("password from db");
                SignUpDTO signUpDTO2 = new SignUpDTO(password);

                System.out.println(signUpDTO2);
//                return password;

            }

            System.out.println("Forgot Credentials Stored");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return "Forgot Credentials Stored";
    }
}

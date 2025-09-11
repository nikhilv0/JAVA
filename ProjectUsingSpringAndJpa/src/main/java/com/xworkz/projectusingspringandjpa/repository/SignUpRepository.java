package com.xworkz.projectusingspringandjpa.repository;

import com.xworkz.projectusingspringandjpa.dto.ForgotDTO;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;

import java.util.Optional;

public interface SignUpRepository {

    String save(SignUpEntity signUpEntity);

    boolean existsByEmail(String email);

    Optional<SignUpEntity> findByEmail(String email);

    SignUpEntity isValidToken(String token);

}

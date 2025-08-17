package com.xworkz.projectusingspringandjpa.repository;

import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;

public interface SignUpRepository {

    String save(SignUpEntity signUpEntity);

    boolean existsByEmail(String email);

}

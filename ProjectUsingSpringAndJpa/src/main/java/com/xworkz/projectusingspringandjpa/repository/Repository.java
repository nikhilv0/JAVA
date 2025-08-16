package com.xworkz.projectusingspringandjpa.repository;

import com.xworkz.projectusingspringandjpa.entity.SignInEntity;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;

public interface Repository {

    String save(SignUpEntity signUpEntity);

    boolean existsByEmail(String email);

    SignUpEntity getEntityByMail(String mail);

    String login(SignInEntity signInEntity);


}

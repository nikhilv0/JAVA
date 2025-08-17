package com.xworkz.projectusingspringandjpa.repository;

import com.xworkz.projectusingspringandjpa.entity.SignInEntity;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;

public interface SignInRepository {

    SignUpEntity getEntityByMail(String mail);

    String login(SignInEntity signInEntity);


}

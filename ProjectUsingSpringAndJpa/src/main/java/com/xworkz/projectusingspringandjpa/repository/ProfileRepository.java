package com.xworkz.projectusingspringandjpa.repository;

import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;

public interface ProfileRepository {

    SignUpEntity getEntityByMail(String email);

}

package com.xworkz.projectusingspringandjpa.repository;

import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import java.util.List;

public interface ProfileRepository {

    List<SignUpEntity> getEntityByMail(String email);
}

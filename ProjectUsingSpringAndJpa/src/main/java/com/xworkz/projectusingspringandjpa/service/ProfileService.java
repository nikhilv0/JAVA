package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;

import java.util.List;

public interface ProfileService {

    boolean exitsByMail(String email);

    List<SignUpEntity> getEntityByMail(String email);
}

package com.xworkz.springandjpa.repository;

import com.xworkz.springandjpa.entity.SignUpEntity;

public interface SignUpRepository {

    String save(SignUpEntity signUpEntity);
}

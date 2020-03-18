package com.ojas.registrationWithEmail.Dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.registrationWithEmail.model.UserRegistration;

public interface Userdao extends JpaRepository<UserRegistration, Integer> {

}

package com.hexagonal.architecture.hexagonalarchetype.user.infraestructure.user.controller;

import com.hexagonal.architecture.hexagonalarchetype.user.application.create.UserCreator;
import com.hexagonal.architecture.hexagonalarchetype.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  UserCreator userCreator;

  public void method(){
    userCreator.save(new User());
  }
}

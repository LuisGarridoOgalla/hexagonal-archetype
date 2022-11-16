package com.hexagonal.architecture.hexagonalarchetype.user.infraestructure.user.adapter;

import com.hexagonal.architecture.hexagonalarchetype.user.domain.User;
import com.hexagonal.architecture.hexagonalarchetype.user.domain.port.SaveUserRepository;

public class UserCreatorAdapter implements SaveUserRepository {

  @Override
  public User save(User user) {
    return null;
  }
}

package com.hexagonal.architecture.hexagonalarchetype.user.application.create;

import com.hexagonal.architecture.hexagonalarchetype.user.domain.User;
import com.hexagonal.architecture.hexagonalarchetype.user.domain.UserRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserCreator {

  private UserRepository userRepository;

  public User save(User user) {
    return userRepository.save(user);
  }
}

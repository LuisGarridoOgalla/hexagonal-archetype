package com.hexagonal.architecture.hexagonalarchetype.user.application.create;

import com.hexagonal.architecture.hexagonalarchetype.user.domain.User;
import com.hexagonal.architecture.hexagonalarchetype.user.domain.port.SaveUserRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserCreatorImpl implements UserCreator{

  private final SaveUserRepository userRepository;

  public User save(User user) {
    return userRepository.save(user);
  }
}

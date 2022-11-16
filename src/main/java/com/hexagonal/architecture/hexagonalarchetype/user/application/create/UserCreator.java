package com.hexagonal.architecture.hexagonalarchetype.user.application.create;

import com.hexagonal.architecture.hexagonalarchetype.user.domain.User;

public interface UserCreator {
  public User save(User user);
}

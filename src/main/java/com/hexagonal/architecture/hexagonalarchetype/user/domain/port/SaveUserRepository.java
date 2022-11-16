package com.hexagonal.architecture.hexagonalarchetype.user.domain.port;

import com.hexagonal.architecture.hexagonalarchetype.user.domain.User;

public interface SaveUserRepository {
  User save(User user);
}

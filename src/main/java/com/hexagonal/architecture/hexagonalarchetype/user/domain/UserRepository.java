package com.hexagonal.architecture.hexagonalarchetype.user.domain;

public interface UserRepository {
  User save(User user);
  User search(Long id);
  User remove(Long id);
}

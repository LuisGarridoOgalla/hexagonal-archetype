package com.hexagonal.architecture.hexagonalarchetype.user.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class User {

  private String name;

  private String surname;

  private String phone;

  private String birthday;

}

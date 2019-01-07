package com.project.pachoos.service.users;

import com.project.pachoos.model.users.Users;

import java.util.List;

public interface UsersService {

    List<Users> findAllByIsdeletedFalse();

    Users findAllById(Long id);

    Users save(Users users);
}

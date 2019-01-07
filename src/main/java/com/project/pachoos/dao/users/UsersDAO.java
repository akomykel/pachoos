package com.project.pachoos.dao.users;

import com.project.pachoos.model.users.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersDAO extends JpaRepository<Users, Long> {

    List<Users> findAllByIsdeletedFalse();

    Users findAllById(Long id);

    Users save(Users users);
}

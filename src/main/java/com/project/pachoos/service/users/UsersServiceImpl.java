package com.project.pachoos.service.users;

import com.project.pachoos.dao.users.UsersDAO;
import com.project.pachoos.model.users.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("usersService")
public class UsersServiceImpl implements UsersService{

    @Autowired
    UsersDAO usersDAO;

    @Override
    public List<Users> findAllByIsdeletedFalse(){
        return usersDAO.findAllByIsdeletedFalse();
    }

    public Users findAllById(Long id){
        return usersDAO.findAllById(id);
    }

    public Users save(Users users) {
        return usersDAO.save(users);
    }
}

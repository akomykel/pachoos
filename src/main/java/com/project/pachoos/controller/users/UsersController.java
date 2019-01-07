package com.project.pachoos.controller.users;

import com.project.pachoos.model.users.Users;
import com.project.pachoos.service.users.UsersService;
import com.project.pachoos.utils.AppConstants;
import com.project.pachoos.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping(AppConstants.USER_LIST_MAP)
    public List<Users> getAllUsers(){
        return usersService.findAllByIsdeletedFalse();
    }

    @PostMapping(AppConstants.USER_CREATE_MAP)
    public Users addUser(@Valid @RequestBody Users userDetails){

        Users user = new Users();
        user.setLastname(userDetails.getLastname());
        user.setFirstname(userDetails.getFirstname());
        user.setMiddlename(userDetails.getMiddlename());
        user.setContactnumber(userDetails.getContactnumber());
        user.setDateadded(DateUtils.getCurrentDate());
        user.setAddedBy(1);
        user.setDatealtered(DateUtils.getCurrentDate());
        user.setAlteredby(0);
        user.setRemarks(AppConstants.MSG_NEW_USER_ADDED);
        user.setIsdeleted(Boolean.FALSE);

        return usersService.save(user);
    }

    @GetMapping(AppConstants.USER_GET_BY_ID_MAP)
    public ResponseEntity<Users> getUserById(@PathVariable(value = AppConstants.PARAMETER_ID) Long id){
        Users users = usersService.findAllById(id);
        return ResponseEntity.ok().body(users);
    }
}

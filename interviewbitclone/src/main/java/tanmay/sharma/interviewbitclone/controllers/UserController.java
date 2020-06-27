package tanmay.sharma.interviewbitclone.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tanmay.sharma.interviewbitclone.dto.ResponseDto;
import tanmay.sharma.interviewbitclone.models.User;
import tanmay.sharma.interviewbitclone.services.UserService;
import tanmay.sharma.interviewbitclone.utils.Constants;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(Constants.USERS_END_POINT)
public class UserController {

    private UserService userService;

    @Autowired
    public  UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping(Constants.CREATE_USER)
    public User createUser(@RequestBody User user){
        var user1 =  userService.createUser(user);
        return  user1;
    }

    @GetMapping(Constants.GET_ALL_USER)
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping(Constants.Id)
    public ResponseEntity<User> getUser(@PathVariable(name = "id") UUID id){
        var userServiceResponse = userService.getUser(id);

        return userServiceResponse==null
                ? new ResponseEntity<User>(userServiceResponse, HttpStatus.NOT_FOUND)
                : new ResponseEntity(userServiceResponse, HttpStatus.FOUND);

    }

}

package com.geekster.Instagram.controller;

import com.geekster.Instagram.dto.SignInInput;
import com.geekster.Instagram.dto.SignInOutput;
import com.geekster.Instagram.dto.SignUpInput;
import com.geekster.Instagram.dto.SignUpOutput;
import com.geekster.Instagram.model.User;
import com.geekster.Instagram.service.AuthenticationService;
import com.geekster.Instagram.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    AuthenticationService authenticationService;

    @PostMapping("/signup")
    public SignUpOutput signUp(@RequestBody SignUpInput signUpInput){

        return userService.signUp(signUpInput);
    }
    @PostMapping("/post")
    public String postdata(@RequestBody User user){
          userService.postdata(user);
          return "user posted.......";
    }



    @PostMapping("/signin")
    public SignInOutput signIn(@RequestBody SignInInput signInInput){
        return userService.signIn(signInInput);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateUser(@RequestParam String email,@RequestParam String token,@RequestBody SignUpInput signUpInput){
        HttpStatus status;
        String message = "";
        if(authenticationService.authenticate(email,token)){
            userService.updateUser(signUpInput);
            message = "Updated Successully";
            status = HttpStatus.ACCEPTED;
        }else{
            message ="Invalid Details to update";
            status = HttpStatus.FORBIDDEN;
        }
        return new ResponseEntity<String>(message,status);

    }
}

package com.vasudev.userDetails.Controller;

import com.vasudev.userDetails.Service.UserService;
import com.vasudev.userDetails.UserInputs.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

//    @RequestMapping(method = RequestMethod.GET , value = "/show")
//    public String showDetails(@RequestParam (name = "name" , defaultValue = "Khan"),  String name , String qualification ,
//                              UserData userData){
//        userData.addAttribute()
//
//        return "dsd";
//    }

    @RequestMapping(method = RequestMethod.GET , value = "/user")
    public List<UserData> getDetails(){

        return this.userService.getData();
//        return "Get Request Made !!";
    }

//    @RequestMapping(method = RequestMethod.POST , value = "/user" , consumes = "application/json")
//    public String postDetails(){
//    public  String postDetails(@RequestBody UserData userData){
//
//        UserData uData = this.userService.addData(userData);
//        System.out.println(userData);
//        return "Name is :: "+userData.getName()+"\n Qualification is :: "+userData.getQualification()+
//                "\n Id is :: "+userData.getId()+"\n Discipline is :: "+userData.getDiscipline();


//        return "Post Request Made";
}

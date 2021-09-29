package com.vasudev.userDetails.Service;

import com.vasudev.userDetails.UserInputs.UserData;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Service
public class UserService {

    public List<UserData> userList = Arrays.asList(new UserData("Vasudev" , "Btech" , "Q-22319" , "CSE"));


    public List<UserData> getData(){

        return userList;

    }

    public UserData addData(UserData u){
        userList.add(u);
        return u;
    }

}

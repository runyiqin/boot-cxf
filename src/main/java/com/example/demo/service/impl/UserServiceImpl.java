package com.example.demo.service.impl;

import java.util.Date;

import javax.jws.WebService;

import com.example.demo.service.UserService;

@WebService(serviceName = "UserService",targetNamespace="http://service.demo.example.com/",endpointInterface = "com.example.demo.service.UserService")
public class UserServiceImpl implements UserService {
	
	 @Override
    public String sayHello(String user) {
        return user+"，现在时间："+"("+new Date()+")";
    }
}
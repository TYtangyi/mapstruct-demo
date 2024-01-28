package com.example.webservice.service;

import com.example.webservice.domain.User;

import java.util.List;

public interface MyService {

    String sayHello(String msg);

    List<User> getUsers();
}

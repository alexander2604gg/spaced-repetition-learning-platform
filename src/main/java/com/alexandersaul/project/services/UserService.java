package com.alexandersaul.project.services;

import com.alexandersaul.project.models.User;

public interface UserService {

    void registerUser (String userName , String password);
    User authenticaUser (String userName , String password);
}

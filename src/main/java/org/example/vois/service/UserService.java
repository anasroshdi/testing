package org.example.vois.service;

import org.example.vois.repositories.UserRepositories;

public class UserService {

    private final UserRepositories userRepositories;

    public UserService(UserRepositories userRepositories) {
        this.userRepositories = userRepositories;
    }
}

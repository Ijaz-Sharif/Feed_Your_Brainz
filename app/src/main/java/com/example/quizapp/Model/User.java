package com.example.quizapp.Model;

public class User {
    String email,password,userId;

    public User(String email, String password, String userId) {
        this.email = email;
        this.password = password;
        this.userId = userId;
    }
    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUserId() {
        return userId;
    }
}

package com.example.guitarlog;

public class User {
    int id;
    static String username;
    static String password;
    public User() {
    }
    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public void setId (int id) {
        this.id = id;
    }
    public static String getUsername() {
        return username;
    }
    public static void setUsername(String username) {
        User.username = username;
    }
    public static String getPassword() {
        return password;
    }
    public static void setPassword(String password) {
        User.password = password;
    }
}

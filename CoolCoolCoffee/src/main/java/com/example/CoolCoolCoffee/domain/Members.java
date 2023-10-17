package com.example.CoolCoolCoffee.domain;

public class Members {
    String user_name;
    String user_password;
    Long age;
    Long weight;
    Long goal_sleep_time;
    Boolean app_access;
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getGoal_sleep_time() {
        return goal_sleep_time;
    }

    public void setGoal_sleep_time(Long goal_sleep_time) {
        this.goal_sleep_time = goal_sleep_time;
    }

    public Boolean getApp_access() {
        return app_access;
    }

    public void setApp_access(Boolean app_access) {
        this.app_access = app_access;
    }
}

package com.demowebshop.models;

public class NewUserAccount {
    public String email;
    public String password;
    public String confirmPassword;

    public NewUserAccount setEmail(String email) {
        this.email = email;
        return this;
    }

    public NewUserAccount setPassword(String password) {
        this.password = password;
        return this;
    }

    public NewUserAccount setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
}

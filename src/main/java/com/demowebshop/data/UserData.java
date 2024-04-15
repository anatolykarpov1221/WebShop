package com.demowebshop.data;

import java.util.Random;

public class UserData {

    public static final String EMAIL = "olesia123@yahoo.com";
    public static final String PASSWORD = "Olesia$2024";
    public static final String CREATE_EMAIL = createEmail();

    public static String createEmail() {
        Random random = new Random();
        int i = random.nextInt(1000)+1000;
        return "olesia" + i + "@yahoo.com";
    }
}

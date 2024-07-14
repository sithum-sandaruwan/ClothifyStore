package edu.icet.pos.util;

import java.util.regex.Pattern;

public class RegExPattern {

    private static Pattern usernamePattern = Pattern.compile("[a-zA-Z0-9]{5,}");
    private static Pattern emailPattern = Pattern.compile(
            "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");

    private static  Pattern passwordPattern = Pattern.compile("^[a-zA-Z0-8]{5,}$");

    public static Pattern getUsernamePattern() {

        return usernamePattern;
    }

    public static Pattern getEMailPattern() {
        return emailPattern;
    }

    public static Pattern getPasswordPattern() {
        return passwordPattern;
    }
}



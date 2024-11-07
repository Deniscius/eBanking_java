package org.example.ebanking.utiles;

public class Constant {
    public static final int LAST_NAME_MAX_LENGHT =30;
    public static final int FIRST_NAME_MAX_LENGHT =30;
    public static final int EMAIL_MAX_LENGHT =50;
    public static final int EMAIL_MIN_LENGHT =10;
    public static final int PHONE_NUMBER_MAX_LENGHT =50;
    public static final int ADDRESS_MAX_LENGHT =50;
    public static final int PASSWORD_MAX_LENGHT =30;
    public static final int PASSWORD_MIN_LENGHT =8;

    public static final String PATTERN = "(?=.*[0-9])(?=.[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
}

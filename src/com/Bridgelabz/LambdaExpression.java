package com.Bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterface
interface UserRegistration {
    void validPassword(String Password); // single abstract method
}

public class LambdaExpression{
    public static void main(String[] args) {
        System.out.println("User Registration program using LambdaExpression");
        UserRegistration function = (Password) ->{
            boolean check = Pattern.matches("(?=.*[0-9])\"+\"(?=.*[a-z])(?=.*[A-Z])\"+\"(?=.*[@#$%^&+=])\"+\"(?=\\\\S+$).{8,}", Password);
            if (check == true){
                System.out.println("Password is valid");
            }
            else
                System.out.println("Incorrect Password ,Please enter correct password");
        };
        function.validPassword("Pooja@456");
    }
}


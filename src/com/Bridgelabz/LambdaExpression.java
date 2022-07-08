package com.Bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterface
interface UserRegistration {
    void contact(String phoneNumber); // single abstract method
}

public class LambdaExpression{
    public static void main(String[] args) {
        System.out.println("User Registration program using LambdaExpression");
        UserRegistration function = (phoneNumber) ->{
            boolean check = Pattern.matches("([1-9]{1,2}[ ])+([6-9]{1}[0-9]{9})", phoneNumber);
            if (check == true){
                System.out.println("PhoneNumber is valid");
            }
            else
                System.out.println("PhoneNumber is not valid ,Please enter valid phonenumber");
        };
        function.contact("91 9919819801");
    }
}


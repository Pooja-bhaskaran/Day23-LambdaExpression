package com.Bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterface
interface UserRegistration {
    void email(String emailId); // single abstract method
}

public class LambdaExpression{
    public static void main(String[] args) {
        System.out.println("User Registration program using LambdaExpression");
        UserRegistration function =(emailID)->{
            boolean check = Pattern.matches("([A-Z a-z 0-9]+([.][A-Za-z0-9]+)@([a-z]+[.][a-z]{2,3})+([.][a-z]+))", emailID);
            if (check == true){
                System.out.println("emailId is valid");
            }
            else
                System.out.println("emailId is not valid ,Please enter valid email");
        };
        function.email("abc.xyz@bl.com.in");
    }
}


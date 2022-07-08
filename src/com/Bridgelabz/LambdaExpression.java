package com.Bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterface
interface UserRegistration {
    void firstname(String name); // single abstract method

}

public class LambdaExpression{
    public static void main(String[] args) {
        System.out.println("User Registration program using LambdaExpression");
        UserRegistration function =(name)->{
            boolean check = Pattern.matches("([A-Z]{1}[a-z]{1,})", name);
            if (check == true){
                System.out.println("Firstname is valid");
            }
            else
                System.out.println("Firstname is not valid ,Please enter valid name");
        };
        function.firstname("Pooja");
    }
}


package com.company;

public class Main {

    public static void main(String[] args) {

        //pédányosítás
        PasswordGenerator genarator = new PasswordGenerator();
        //a PasswordGenerator egy példányára meghívjuk a generatePassword metódust
        String password =  genarator.generatePassword(8);
        //kiíratás
        System.out.println(password);
    }
}

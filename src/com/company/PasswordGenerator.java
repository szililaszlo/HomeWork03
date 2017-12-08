package com.company;

public class PasswordGenerator {

    //konstruktor
    public  PasswordGenerator(){

    }

    //metódus
    public String generatePassword(int length) {
        String password = "";
        char actualCharacter;
        //használható karakterek
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789%!?";
        //for ciklussal történő karakter feltöltés
        for(int i=0; i<length; i++) {
            int postition = (int) (Math.random() * ((characters.length() - 0) + 0));

            //a véletlen generált pozicióba található karakter kimentése
            actualCharacter = characters.charAt(postition);
            //majd a hozzáírás a jelszóhoz
            password += actualCharacter;
        }
        return password;
    }
}

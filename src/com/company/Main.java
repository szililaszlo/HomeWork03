package com.company;

public class Main {

    public static void main(String[] args) {
        //1
        //pédányosítás
        PasswordGenerator genarator = new PasswordGenerator();
        //a PasswordGenerator egy példányára meghívjuk a generatePassword metódust
        String password =  genarator.generatePassword(8);
        //kiíratás
        System.out.println(password);

        //2
        System.out.println("-------------------------------");
        //User tipusú firstUser példányosítása
        User firstUser = new User("Nagy","Béla", 5);
        System.out.println("First name: " + firstUser.getFirstname());
        System.out.println("Last name: " +firstUser.getLastname());
        System.out.println("Password: " +firstUser.getPassword());
        System.out.println("Age: " +firstUser.getAge());

        //3
        System.out.println("-------------------------------");
        //példányosítás
        Game firstGame =new Game();
        // Game osztály egy példányára meghívjuk a playBarchobaWithNumbers metódust
        firstGame.playBarchobaWithNumbers();

        //4
        System.out.println("-------------------------------");
        //példányosítás
        Temperature firstTemperatures =new Temperature();
        // Temperature osztály egy példányára meghívjuk a getTemperatureDataFromConsole metódust
        firstTemperatures.getTemperatureDataFromConsole();
    }
}

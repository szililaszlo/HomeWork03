package com.company;

import java.util.Scanner;

public class Temperature {

    public void getTemperatureDataFromConsole() {
        //tömb deklarálás
        int [] temperatures =  new int[10];
        //kezdeti max érték
        int max = -11111111;
        //kezdeti min érték
        int min = 11111111;
        //for ciklus
        //a program bekér egy értéket a felhasználótól és azt hozzáadja a tömbhöz, annyiszor amilyen hosszú a tömb
        for (int i =0; i<temperatures.length;i++) {

            //adatbekérés
            System.out.println(i+1 +".érték, Kérek egy hőmérsékleti értéket: ");
            Scanner newTemperature = new Scanner(System.in);
            int temperature= newTemperature.nextInt();
            //max érték rögzítése
            if(temperature>max) {
                max =temperature;
            }
            //min érték rögzítése
            if(temperature<min) {
                min =temperature;
            }
            //tömb i-edik eleméhez hozzárendelés
            temperatures[i] = temperature;

        }
        //függvényhívások max és min értékekkel
        printHighestTemperature(max);
        printLowestTemperature(min);
    }

    //maximum kiíratás függvény
    public void printHighestTemperature( int max) {
        System.out.println("A legnagyobb hőmérsékleti érték: " +max);
    }

    //minimum kiíratás függvény
    public void printLowestTemperature(int min) {
        System.out.println("A legkisebb hőmérsékleti érték: " +min);
    }
}

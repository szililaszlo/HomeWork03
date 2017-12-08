package com.company;

import java.util.Scanner;

public class Game {


    public void playBarchobaWithNumbers() {
        //életpontok
        int life = 10;
        //maximum tipp
        int max = 50;
        //minimum tipp
        int min = 0;
        //vélelteln szám a gép résézre
        int pcNumber = (int) (Math.random() * ((max - min) + min));
        //while ciklus használata, ha az életpont elfogy a program továbblép
        while (life != 0) {
            //scanner segítségével történő tipp bekérés
            System.out.println("Kérek egy egész számot " + max + " és " + min + " között: ");
            Scanner playerNumber = new Scanner(System.in);
            int playerGuess = playerNumber.nextInt();
            //győzelem és ciklus elhagyás
            if (playerGuess == pcNumber) {
                System.out.println("Gratulálunk! Győztél");
                break;
            }
            //túl magas tipp
            else if (playerGuess > pcNumber) {
                max = playerGuess;
                life--;
                System.out.println("A tipped nagyobb mint a cél szám! Életeid száma: "+ life);
            }
            //túl alacsony tipp
            else {
                min = playerGuess;
                life--;
                System.out.println("A tipped kisebb mint a cél szám! Életeid száma: "+ life);
            }
        }
        //Vereség
        if (life == 0) {
            System.out.println("Sajnos elfogyott az életed! Kiestél! Próbáld újra!");
        }
    }
}

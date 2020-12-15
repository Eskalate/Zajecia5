package com.company;

import java.util.Scanner;
import java.util.logging.Logger;


public class Sklep {

    private static final Logger MainLogger = Logger.getLogger(Sklep.class.getName());
    
        Product produkt1 = new Product("bulka", 10, 9);
        Product produkt2 = new Product("chleb", 1, 5);


    public void zmienCene1(){
        System.out.println("Podaj nowa cene: ");
        int nowaCena;
        Scanner scanCena = new Scanner(System.in);
        nowaCena = scanCena.nextInt();

     produkt1.setCena(nowaCena);
     MainLogger.info("zmiana ceny");

    }
    public void pokazProdukty(){
        System.out.printf("Cena:%d, Nazwa: %s, Ilosc = %d", produkt1.getCena(), produkt1.getNazwa(), produkt1.getIlosc());
        System.out.printf("Cena: %d, Nazwa: %s, Ilosc = %d", produkt2.getCena(), produkt2.getNazwa(), produkt2.getIlosc());
        MainLogger.info("pokazano produkty");
        System.out.println();
    }


}

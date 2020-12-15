package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;


/*import static com.company.Sklep.produkt1;
import static com.company.Sklep.produkt2;
*/
public class Main {
    private static final Logger MainLogger = Logger.getLogger(Main.class.getName());

    static {
        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream("logg.properties"));
        } catch (IOException e) {
            System.err.println("Brak pliku loggera");
        }
    }
    public static void main(String[] args) throws IOException{







        Sklep sklep1 = new Sklep();
        sklep1.pokazProdukty();
        sklep1.zmienCene1();
        sklep1.pokazProdukty();


    }
}

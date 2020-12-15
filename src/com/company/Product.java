package com.company;
import java.io.IOException;
import java.util.logging.*;
import java.util.logging.ConsoleHandler;
import java.io.FileInputStream;


public class Product {

    private static final Logger MainLogger = Logger.getLogger(Product.class.getName());

    private static int globalID = 1;
    public int ID;
    private String nazwa;
    private int ilosc;
    private int cena;

    public Product(String nazwa, int ilosc, int cena){

        ID = globalID;
        globalID++;
        this.nazwa = nazwa;
        this.ilosc = ilosc;
        this.cena = cena;
    }

    public int getCena(){
        MainLogger.info("log getCena");
        return cena;}
    public void setCena(int cena){
        MainLogger.info("log setCena");
        this.cena = cena; }
    public String getNazwa(){
        MainLogger.info("log getNazwa");
        return nazwa;
    }
    public void setNazwa(){this.nazwa = nazwa;
        MainLogger.info("log setNazwa");}
    public int getIlosc(){
        MainLogger.info("log getIlosc");
        return ilosc;}
    public void setIlosc(){this.ilosc = ilosc;
        MainLogger.info("log setIlosc");}




}

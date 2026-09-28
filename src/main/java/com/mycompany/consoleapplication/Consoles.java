/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consoleapplication;

/**
 *
 * @author Student
 */
public abstract class Consoles implements IConsoles{
    private final String ConsoleType;
    private final String storeName;
    private final int totalSales;  
    
//Constructor

    public Consoles(String ConsoleType, String storeName, int totalSales) {
        this.ConsoleType = ConsoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    @Override
    public  int getTotalSales();
      return totalSales;
      
    @Override
    public String getScores();
      return storeName;
      
    @Override
    public String getConsoleType();
      return consoleType;
}
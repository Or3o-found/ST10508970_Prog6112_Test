/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconslereport;

/**
 *
 * @author Student
 */
public class GamingConsleReport {

    public static void main(String[] args) {
     
//1-D array for the cities
   String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
   
//2-D array for the console sales
   int[][] sales ={
       {1000, 2000,3000}, 
       {2000, 3000, 4000},
       {1500, 1100, 1200}
   };
//1-D array to store the total sales for each sales
   int[] cityTotals = new int[3];
   
// Calculation of the total sales
  for(int i=0; i < sales.length; i++){
      cityTotals[i] = sales[i][0] + sales[i][1] + sales[i][2];
   }
  
  int highestSales = cityTotals[0];
  String cityWithMostSales = cities[0];
  for(int i=0; i < cityTotals.length; i++){
      if (cityTotals[i] > highestSales){
          highestSales = cityTotals[i];
          cityWithMostSales = cities[i];
      }
      
//Displaying the report
  System.out.println("--------------------------");
  System.out.println("Gaming Console Report");
  System.out.println("--------------------------");
  
  System.out.printf("%-20s-12s%-12s%-12s%n", "", "PS5", "XBOX", "SWITCH");
    
        System.out.printf("%-20s-12d%-12d%-12d%n", 
                cities[i],
                sales[i][0],
                sales[i][1],
                sales[i][2]);
  
   System.out.println("--------------------------");
   System.out.println("Console Sales Totals For Each City");
   System.out.println("--------------------------");
   
   
       System.out.println(cities[i]+ "   " +cityTotals[i]);
   
   System.out.println();
   System.out.println("CITY WITH THE MOST SALES:" + cityWithMostSales);
   
   System.out.println("--------------------------");
   }
    }
}

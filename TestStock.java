/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stock.java;


public class TestStock {
  public static void main(String[]args){
      Stock stock=new Stock ("ORCL","Oracle Corporation");
      stock.previousClosingPrice=34.5;
      stock.currentPrice=34.35;
      
      System.out.println("Price-change percentage:"+ stock.getChangePercent());
  }  
}

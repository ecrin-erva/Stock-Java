/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stock.java;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    
    public Stock(String symbol , String name ){
        this.symbol=symbol;
        this.name=name;
    }
    public double getChangePercent(){
        return (currentPrice-previousClosingPrice)/previousClosingPrice*100;
    }
}
  

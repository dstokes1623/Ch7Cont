/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0798727
 */
public class Rainfall {
    private double[] last12MonthsRainfall;
    
    public Rainfall(double[] rain){
        this.last12MonthsRainfall = last12MonthsRainfall;
        
    }
    public double getTotalRainfall(){
        double total = 0;
        
        for (double monthRain : last12MonthsRainfall){
            total += monthRain;
        }
        return total;
    }
    
    public double getAverageMonthlyRainfall(){
        return getTotalRainfall() / last12MonthsRainfall.length;
    }
   
    public int getMonthWithMostRain(){
        int indexOfHighestRainAmount = 0;
        double highestAmount = 0;
        
        for (int i = 0; i < last12MonthsRainfall.length; i++){
            if(last12MonthsRainfall[i] > highestAmount){
                highestAmount = last12MonthsRainfall[i];
                indexOfHighestRainAmount = i;
            }
            
        }
        return indexOfHighestRainAmount + 1;
    }
    
    public int getMonthWithLeastRain(){
        int indexOfLowestRainAmount = 0;
        double lowestAmount = last12MonthsRainfall[0];
        
        for (int i = 0; i < last12MonthsRainfall.length; i++){
            if(last12MonthsRainfall[i] < lowestAmount){
                lowestAmount = last12MonthsRainfall[i];
                indexOfLowestRainAmount = i;
            }
            
        }
        return indexOfLowestRainAmount + 1;
    }
}

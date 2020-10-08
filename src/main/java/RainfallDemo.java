/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0798727
 */
public class RainfallDemo {
    
    public static void main(String[] args) {
        
        double[] monthsOfRain = {6.0, 2.1, 3.5, 2.3, 5.6, 6.2, 1.1, 2.2, 9.9, 1.1, 10.1, 5.1};
        
        Rainfall myRainfall = new Rainfall(monthsOfRain);
        
        System.out.println(myRainfall.getTotalRainfall());
        System.out.println(myRainfall.getAverageMonthlyRainfall());
        System.out.println(myRainfall.getMonthWithLeastRain());
        System.out.println(myRainfall.getMonthWithMostRain());
        
    }
}

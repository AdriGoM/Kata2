/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author adri
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = {1,2,3,4,5,6,7,7,7,4,1,2,9,3,1};
        Histogram histo = new Histogram(numeros);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for(Map.Entry<Integer,Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + " ==> " +  entry.getValue());
        }
    }
    
}

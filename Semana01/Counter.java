
/**
 * Escreva a descrição da classe Counter aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

import java.util.ArrayList;
import java.util.Arrays;
public class Counter {
    
    public void counterWords(String text){
        int counts [] = new int[26];
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0 ;i<text.length();i++){
           int index = alpha.indexOf(text.toLowerCase().charAt(i));
           if(index != -1){
              counts[index] += 1;  
           }
        }
        print(alpha,counts);
    }   
    
    
    public void print  (String alpha, int[] counts){
        for(int i = 0 ; i < counts.length ; i++){
            if(counts[i] > 0){
                System.out.println(alpha.charAt(i) + "  " + counts[i]);
            }
        }
    }

}

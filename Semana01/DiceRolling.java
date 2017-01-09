
/**
 * Escreva a descrição da classe DiceRolling aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

import java.util.Random;
public class DiceRolling {
    
    public void simulate (int rolls){
    
        Random rand = new Random();
        int [] counts =new int [13] ;
        
        for( int k=0; k < rolls; k++){
            int d1 = rand.nextInt(6) + 1;
            int d2 = rand.nextInt(6) + 1;
            System.out.println(d1  + " - " +  d2);
            counts[d1+d2] += 1;
        }
        
        
        for (int k = 0 ; k < counts.length ; k++){
            System.out.println(k + "'s=\t" + counts[k] + "\t" + 100.0 * counts[k]/rolls);
        }
    }

}

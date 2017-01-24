
/**
 * Escreva a descrição da classe WordsLengths aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import edu.duke.*;
public class WordsLengths {
    
    public void countWordLengths(FileResource resource, int [] counts){
        
        for(String word : resource.words()) {
           if(!Character.isLetter(word.charAt(0))){
               counts[word.length()-1] += 1;
           }else if (!Character.isLetter(word.charAt(word.length()-1))){
               counts[word.length()-1] += 1;
            }else{
                counts[word.length()] += 1;
            }
            
            
        }
    }
        
    public void testCountWordLengths(){
        FileResource resource = new FileResource("/tmp/errors.txt");
        int[] counts = new int[31];
        countWordLengths(resource,counts);
        
        for(int k = 0 ; k < counts.length; k++){
            System.out.println(k + " - " + counts[k]);
        }
        
        System.out.println("Max" + indexOfMax(counts));
    }
    
    public int indexOfMax(int[] values){
        
       int maxIndex = 0;
        for(int k=0; k < values.length; k++){
            if (values[k] > values[maxIndex]){
                maxIndex = k;
            }
        }
        return maxIndex;
        
    }

}

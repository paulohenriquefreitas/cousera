
/**
 * Escreva a descrição da classe WordsLengths aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import edu.duke.*;
public class CommonWords {
    
   public String[] getCommons(){
       FileResource resource = new FileResource("/tmp/common.txt");
       String[] common = new String[20];
       int index = 0;
       for(String s : resource.words()){
           common[index] = s;
           index += 1;
        }
       return common;
    }
    
    void countShakespeare(){
       String[] plays = {"caesar.txt","errors.txt","hamlet.txt","likeit.txt","macbeth.txt","romeo.txt"};
       String[] common = getCommons();
       int[] counts = new int[common.length];
       for(int k=0; k < plays.length; k++){
           FileResource resource = new FileResource("/tmp/"+plays[k]);
           countWords(resource,common,counts);
           System.out.println("done with " + plays[k]);
        }
        
        for(int k = 0 ; k < common.length; k++){
            System.out.println(common[k] + "\t" + counts[k]);
        }
    }
    
    public int indexOf(String [] list, String word){
        for(int k = 0 ; k < list.length; k++){
            if(list[k].equals(word)){
                return k;
            }
        }
        return -1;
    }
    
    public void countWords(FileResource resource, String[] common,int[] counts){
        for(String word : resource.words()){
            word = word.toLowerCase();
            int index = indexOf(common,word);
            if(index != -1){
                counts[index] += 1;
            }
        }
    }
    
    

}

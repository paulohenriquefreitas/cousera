
import edu.duke.*;
import java.util.ArrayList;     
public class WordFrequencies{
   
    private ArrayList<String> myWords;
    private ArrayList<Integer> myFreqs;
    
    public WordFrequencies(){
        myWords = new ArrayList<String>();
        myFreqs = new ArrayList<Integer>();
    }
    
    
    public void findUnique(){
        FileResource resource = new FileResource();
        myWords.clear();
        myFreqs .clear();
        for(String s : resource.words()){
            s= s.toLowerCase();
            int index = myWords.indexOf(s);
            if (index == -1){
                myWords.add(s);
                myFreqs.add(1);
            }else{
                myFreqs.set(index,myFreqs.get(index) + 1);
            }
        }
    }
    
    
    public void tester(){
        findUnique();
        System.out.println("Number of unique words: " + myWords.size());
        for(int k=0; k < myWords.size(); k++){
            System.out.println(myFreqs.get(k) + "\t" + myWords.get(k));
        }
        int maxIndex= findIndexOfMax();
        System.out.println("The word that occurs most often and its count are: " + myFreqs.get(maxIndex) + "\t" + myWords.get(maxIndex)); ;
    }
    
    public int findIndexOfMax(){
        int max = 0;
        for(Integer i: myFreqs){
            if(max < i){
                max = i;
            }
        }
        return myFreqs.indexOf(max);
    }   
    
            
}

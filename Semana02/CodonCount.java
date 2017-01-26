
/**
 * Write a description of class CodonCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import edu.duke.*;
public class CodonCount{
    
    private HashMap<String, Integer> dnaMap;
    private String source = "/home/paulo/Cursos/Coursera/cousera/Semana02";
    
    public CodonCount(){
        dnaMap = new HashMap<String, Integer>();
        
    }
    
    public void buildCodonMap(int start, String dna){
        dnaMap.clear();
        for (int i = start; i < dna.length(); i=i+3){
           String codon = dna.substring(i,i+3);
           if(dnaMap.containsKey(codon)){
               dnaMap.put(codon,dnaMap.get(codon)+1);
            }else{
                dnaMap.put(codon,1);
            }
        }
        
        printCodonCounts(1,5);
    }
    
    public String getMostCommonCodon(){
        return "";
    }
    
    public void printCodonCounts(int start, int end){
       for (Map.Entry<String,Integer> pair : dnaMap.entrySet()) {
            System.out.println(pair.getKey());
            System.out.println(pair.getValue());
        }
    }
    
    public void testDna(int start){
        String template = source+"/smalldna.txt";
        FileResource resource = new FileResource(template);
        for(String word : resource.words()){
            buildCodonMap(start,word);
        }        
        
    }
    

    
}

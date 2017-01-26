
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
//    private String source = "/home/paulo/Cursos/Coursera/cousera/Semana02";
    private String source = "/home/paulo.freitas/Cursos/cousera/Semana02";
    
    public CodonCount(){
        dnaMap = new HashMap<String, Integer>();
        
    }
    
    public void buildCodonMap(int start, String dna){
        dnaMap.clear();
        for (int i = start; i < dna.length(); i=i+3){
            if(i+3 <= dna.length()){
               String codon = dna.substring(i,i+3);
               if(dnaMap.containsKey(codon)){
                   dnaMap.put(codon,dnaMap.get(codon)+1);
                }else{
                    dnaMap.put(codon,1);
                }
            }
        }
        
        printCodonCounts(start,1,5);
    }
    
    public String getMostCommonCodon(){
        int maior = 0;
        for (Map.Entry<String,Integer> pair : dnaMap.entrySet()) {
            if(pair.getValue() > maior){
                maior = pair.getValue();
            }
        }
        
         for (Map.Entry<String,Integer> pair : dnaMap.entrySet()) {
            if(pair.getValue() == maior){
                return pair.getKey();
            }
        }
        return "";
    }
    
    public void printCodonCounts(int startIndex,int start, int end){
      System.out.println("Reading frame starting with " + startIndex + " results in " + dnaMap.size() + " unique codons");
      System.out.println("and most common codon is "+ getMostCommonCodon()  + " with count " + dnaMap.get(getMostCommonCodon()));
      System.out.println("Counts of codons between " + start + " and " + end + " inclusive are:");
       for (Map.Entry<String,Integer> pair : dnaMap.entrySet()) {
           if(pair.getValue() >= start && pair.getValue() <= end){
             System.out.println(pair.getKey() + "\t" + pair.getValue());
           }
        }
    }
    
    public void testDna(int start){
        String template = source+"/ILikeIt.txt";
        FileResource resource = new FileResource(template);
        for(String word : resource.words()){
            buildCodonMap(start,word.toUpperCase().trim());
        }        
        
    }
    

    
}

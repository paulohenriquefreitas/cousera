
/**
 * Write a description of class GladLibs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import edu.duke.*;
public class GladLibs{
    
   private ArrayList<String> adjectiveList; 
   private ArrayList<String> noumList;
   private ArrayList<String> colorList;   
   private ArrayList<String> countryList;
   private ArrayList<String> nameList;
   private ArrayList<String> animalList;
   private ArrayList<String> timeList;
   private Random myRandom = new Random();
   private String source = "/home/paulo.freitas/Cursos/cousera/Semana02";
   
   private String processWord(String w){
       int first = w.indexOf("<");
       int last = w.indexOf(">",first);
       if(first== -1 || last == -1 ){
           return w;
        }
        
        return getSubstitute(w.substring(first+1,last));
   }
   
   private String getSubstitute(String label){
           if(label.equals("adjective")){
           return randomFrom(adjectiveList);
        }
       if(label.equals("noum")){
           return randomFrom(noumList);
        }
       if(label.equals("color")){
           return randomFrom(colorList);
        } 
       if(label.equals("country")){
           return randomFrom(countryList);
        }
       if(label.equals("name")){
           return randomFrom(adjectiveList);
        }
       if(label.equals("animal")){
           return randomFrom(animalList);
        }
       if(label.equals("time")){
           return randomFrom(timeList);
        } 
       else {
           return "UNKNOWN";
        }
    }
    
    private void initializaFromSource(String source){
       adjectiveList = readIt(source+"/adjective.txt");
      
    }
    
    public void makeStory(){
        initializaFromSource(source);
        String template = source+"/madtemplate.txt";
        FileResource resource = new FileResource(template);
       for(String word : resource.words()){
            System.out.println(processWord(word));
        }
    }
    
    private String randomFrom(ArrayList<String> source){
        int index = myRandom.nextInt(source.size());
        return source.get(index);
    }
   
   private void printout(String message, int lineWidth){
       System.out.println(message);
    }
    
   private ArrayList<String> readIt(String source){
       ArrayList<String> list = new ArrayList<String>();
        FileResource resource = new FileResource(source);
       for(String word : resource.words()){
            list.add(word);
        }
       return list;
    }
    
  
}


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
   private ArrayList<String> colorList;   
   private ArrayList<String> countryList;
   private ArrayList<String> nameList;
   private ArrayList<String> animalList;
   private ArrayList<String> timeList;
    private ArrayList<String> timeLineList;
   private ArrayList<String> verbList;
   private ArrayList<String> numberList;
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
       if(label.equals("color")){
           return randomFrom(colorList);
        } 
       if(label.equals("country")){
           return randomFrom(countryList);
        }
       if(label.equals("name")){
           return randomFrom(nameList);
        }
       if(label.equals("animal")){
           return randomFrom(animalList);
        }
       if(label.equals("time")){
           return randomFrom(timeList);
        } 
        if(label.equals("verb")){
           return randomFrom(verbList);
        }
        if(label.equals("number")){
           return randomFrom(numberList);
        }
        if(label.equals("timeline")){
           return randomFrom(timeLineList);
        }
       else {
           return "UNKNOWN";
        }
    }
    
    private void initializaFromSource(String source){
       adjectiveList = readIt(source+"/adjective.txt");      
       colorList = readIt(source+"/color.txt");
       countryList = readIt(source+"/country.txt");
       nameList = readIt(source+"/name.txt");
       animalList = readIt(source+"/animal.txt");
       timeList = readIt(source+"/time.txt");
       verbList = readIt(source+"/verb.txt");
       numberList = readIt(source+"/number.txt");
       timeLineList = readIt(source+"/timeline.txt");
    }
    
    public void makeStory(){
        initializaFromSource(source);
        String template = source+"/madtemplate.txt";
        FileResource resource = new FileResource(template);
       for(String word : resource.words()){
            System.out.print(processWord(word) + " ");
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

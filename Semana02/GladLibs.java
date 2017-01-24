
/**
 * Write a description of class GladLibs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
public class GladLibs{
    
   private ArrayList<String> adjectiveList; 
   private ArrayList<String> noumList;
   private ArrayList<String> colorList;   
   private ArrayList<String> countryList;
   private ArrayList<String> nameList;
   private ArrayList<String> animalList;
   private ArrayList<String> timeList;
   private Random myRandom;
   
   private String processWord(String w){
       int first = w.indexOf("<");
       int last = w.indexOf(">",first);
       if(first== -1 || last == -1 ){
           return w;
        }
        
        return "";
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
       noumList = readIt(source+"/noum.txt");
       colorList = readIt(source+"/color.txt");
       countryList = readIt(source+"/country.txt");
       nameList = readIt(source+"/name.txt");
       animalList = readIt(source+"/animal.txt");
       timeList = readIt(source+"/time.txt");
    }
    
    public void makeStory(){
        String template = fromTemplate(dataSourceDirectroy+"/madTemplate.txt");
        printout(template,60)
    }
    
    private String randomFrom(ArrayList<String> source){
        int index = myRandom.nextInt(source.size());
        return source.get(index);
    }
   
   private void printout(String message, int lineWidth){
       int charsWritten = 0;
    }
    
   private readIt(String source){
       ArrayList<String> list = new ArrayList<String>();
    }
}

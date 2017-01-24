
/**
 * Write a description of class CharactersInPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.ArrayList;
public class CharactersInPlay{
    private ArrayList<String> names;
    private ArrayList<Integer> counts;
    
    public CharactersInPlay(){
        names = new ArrayList<String>();
        counts = new ArrayList<Integer>();
    }
    
    public void update (String name){
         int index = names.indexOf(name);
            if (index == -1){
                names.add(name);
                counts.add(1);
            }else{
                counts.set(index,counts.get(index) + 1);
            }
    }
    
    public void findAllCharacters(){
        FileResource resource = new FileResource();
        for(String word : resource.words()){
            for(int k=0; k<word.length(); k++){
                if(word.charAt(k) == '.' && Character.isUpperCase(word.charAt(k-1)) && word.length() > 3){
                    update(word);
                }
            }
        }
        
    }
    
    public void tester(){
        names.clear();
        counts.clear();
        findAllCharacters();
        for(int k=0; k<names.size(); k++){
            System.out.println(names.get(k) + " \t " + counts.get(k)); 
        }
    }
}


/**
 * Write a description of class WordsInFiles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)

*/
import java.util.*;
import java.io.File;
import java.io.*;
public class WordsInFiles{
    private HashMap<String,ArrayList<String>> fileNames;
    private String source = "/home/paulo/Cursos/Coursera/cousera/Semana02/";
    private String[] playList = {"brief1.txt","brief2.txt","brief3.txt","brief4.txt",};
    
    public WordsInFiles(){
        fileNames = new HashMap<String,ArrayList<String>>();
    }
    
    public void addWordsFromFile(File f){
        try{
             BufferedReader br = new BufferedReader(new FileReader(f)); 
            
            
            String line = null;  
            while ((line = br.readLine()) != null)  
            {  
                for ( int i = 0 ; i < line.length(); i++){ 
                    System.out.println(line.split(" ").toString());
                    /*ArrayList<String> files = new ArrayList<String>();
                    files.add(f.getName());
                    if(!fileNames.containsKey(word)){
                        fileNames.put(word,files);
                    }else{
                        fileNames.get(word).add(f.getName());
                    }*/
                }
            }
        }catch(Exception e){
        }
    }
    
    public void buildWordFileMap(){
       for(int k = 0 ; k < playList.length; k++){
           //System.out.println(source+playList[k]);
           File f = new File(source+playList[k]);
           //System.out.println(f);
           addWordsFromFile(f);
        }
    }
    
    private int maxNumber(){
        return 0;
    }
    
    private ArrayList<String> wordsInNumFiles(int number){
        return null;
    }
    
    private void printFilesIn(String word){
    }
    
    private void tester(){
    }
}

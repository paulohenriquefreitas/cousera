
/**
 * Escreva a descrição da classe Reverse aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Reverse {
    
    public String alphabetic(int key){
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String newAlpha = "";
        newAlpha = alpha.substring(key);
        newAlpha = newAlpha + alpha.substring(0,key);
        return newAlpha;
        
    }
    
    public void print(){
        System.out.println(alphabetic(1));
    }
    
    public String Caezar(String origin, int key1, int key2){
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result ="";
        String alphaProcessed = alphabetic(26-key1);
        String alphaProcessed02 = alphabetic(26-key2);
        String alphaProcessedResult="";
        for(int i = 0 ; i < origin.length(); i++){
            if(isEven(i)){
                alphaProcessedResult=alphaProcessed;
            }else{
                alphaProcessedResult=alphaProcessed02;
            }
            int index = alpha.indexOf(origin.toUpperCase().charAt(i));
            if(index == -1){ result= result + origin.charAt(i); continue;};                  
                result = result + alphaProcessedResult.charAt(index); 
        }
        System.out.println(result);
       return result;
        
    }
        
        
        
    
    
    public boolean isLowerCase(Character ch){
        return Character.isLowerCase(ch);
    }
    
    public boolean isEven(int num){
        return (num % 2 ==0);
    }
    

}
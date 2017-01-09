
/**
 * Escreva a descrição da classe ReverseOneKey aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ReverseOneKey {
    
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
    
    public void encrypt(String origin, int key1){
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result ="";
        String alphaProcessed = alphabetic(key1);      
        String alphaProcessedResult="";
        for(int i = 0 ; i < origin.length(); i++){
           
            alphaProcessedResult=alphaProcessed;
            
            int index = alpha.indexOf(origin.toUpperCase().charAt(i));
            if(index == -1){ result= result + origin.charAt(i); continue;};
            
            if(isLowerCase(origin.charAt(i))){
               result = result + Character.toLowerCase(alphaProcessedResult.charAt(index)); 
            }else{
                result = result + alphaProcessedResult.charAt(index); 
            };
        }
       System.out.println(alphaProcessed) ;
       System.out.println(result);
        
        
    }
    
    public boolean isLowerCase(Character ch){
        return Character.isLowerCase(ch);
    }    


}

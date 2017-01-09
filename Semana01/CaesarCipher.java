
/**
 * Escreva a descrição da classe CaesarCipher aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class CaesarCipher {
    
    public String encrypt(String input, int key1){
        
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = alphabet.substring(key1) + alphabet.substring(0,key1);        
        
        for(int i = 0 ; i < encrypted.length(); i++){
            
            char currChar = encrypted.charAt(i);
            
            int idx = alphabet.indexOf(currChar);
            
            if (idx != -1){
                char newChar = shiftedAlphabet.charAt(idx);
                encrypted.setCharAt(i,newChar); 
            }
            
                      
            
        }
      
      return encrypted.toString()  ;
        
    }
    
    public void print(String input, int key1){
        System.out.println(encrypt(input,key1));
    }

}
;
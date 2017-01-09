
/**
 * Escreva a descrição da classe Decryption aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Decryption {
    public int[] counterLetters(String message){
        int counts [] = new int[26];
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0 ;i<message.length();i++){
           char ch = Character.toUpperCase(message.charAt(i));
           int index = alpha.indexOf(ch);
           if(index != -1){
              counts[index] += 1;  
           }
        }   
        
        return counts;
    }
    
    public void decrypt (String encrypted){
        CaesarCipher rok = new CaesarCipher();
        int[] freqs = counterLetters(encrypted);
        int maxDex = maxIndex(freqs);
        int dkey = maxDex -4 ;
        if(maxDex < 4){
            dkey = 26 - (4-maxDex);
        }
       rok.print(encrypted,26-dkey);
    }
    
    public int maxIndex(int[] myFreqs){               
        int maxIndex = 0;
        for(int k=0; k < myFreqs.length; k++){
            if (myFreqs[k] > myFreqs[maxIndex]){
                maxIndex = k;
            }
        }
        return maxIndex;
    
    }
    
    public void testDecrypet (String message){
        decrypt(message);
    }
    
    public String halfOfString(String message, int start){
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < message.length(); i = i + 2){
            sb.append(message.charAt(i));
        }
        
        return sb.toString();
    }
    
    public int getKey(String s){
        int[] count = counterLetters(s);
        return  maxIndex(count);
    }
    
    public String decryptTwoKeys(String encrypted){
        String halfeven = halfOfString(encrypted,0);
        String halfodd = halfOfString(encrypted,1);
        System.out.println(getKey(halfeven));
        System.out.println(getKey(halfodd));
        Reverse r = new Reverse();
        return r.Caezar(encrypted,getKey(halfeven), getKey(halfodd));
    }
}


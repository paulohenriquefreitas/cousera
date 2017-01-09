
/**
 * Escreva a descrição da classe Cap01 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Cap01 {  
    
    public String reverse(String s){
           String ret = "";
           for(int k=0; k < s.length(); k +=2){
              ret = s.charAt(k) + ret;
           }
           return ret;
        }
    public void print() {
        System.out.println(reverse("computer"));
    }   

}

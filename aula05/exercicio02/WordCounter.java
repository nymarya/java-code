import java.util.Map;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.io.InputStream;
import java.io.IOException;

public class WordCounter{
    
    //Classe auxiliar para tratar frase recebida
    private TokenScanner tk;
    
    //Guarda palavra e quantidade de vezes que aparece
    private Map<String, Integer> words;
    
    /**
     * 
     */
    public WordCounter(InputStream input) throws IOException{
        words = new HashMap<String, Integer>();
        tk = new TokenScanner(input);
    }
    
    public void countWords() throws IOException{
        while( tk.hasNext()){
            String newKey = tk.next();
            int value = 1;
            try{    
                value = words.put(newKey, value);
                words.put(newKey, value + 1);
            
            } catch( NullPointerException e){
                words.put(newKey, value);
            }
        }
    }
    
    public void print(){
        for (String key : words.keySet()) {          
            //Recupera quantidade de vezes que palavra apareceu
            int value = words.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
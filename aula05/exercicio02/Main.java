import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        
	    WordCounter ct = new WordCounter(System.in);
	    
        ct.countWords();
        ct.print();
    }
}

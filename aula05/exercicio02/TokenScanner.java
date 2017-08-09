import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * TokenScanner reads typed text input from the standard text terminal. 
 * The text typed by a user is then chopped into words.
 * 
 * @author     Mayra Dantas de Azevedo
 * @date       27 Jul 2017
 */

public class TokenScanner{
     
    //Provide for the efficient reading of characters, arrays, and lines.
    private BufferedReader buffer;

    //Keep the tokens from the string
    private StringTokenizer token;
    
    /**
     * Create a new TokenScanner that reads text from the text terminal
     * and keeps the token.
     */
    public TokenScanner( InputStream input ) throws IOException{
        
        buffer = new BufferedReader(new InputStreamReader( input ));
        token = new StringTokenizer(  buffer.readLine() );
    }
    
    /**
     * Get a string received from the user.
     *
     * @return  A word typed by the user, or null
     *          if there are no more tokens.
     */
    public String next() throws IOException{
        
        //If tokenizer don't have more tokens, try to get next line
        while( !token.hasMoreTokens() ){
            String line = buffer.readLine();
            if (line == null) {
                return null;
            }
            token = new StringTokenizer(line);
        }

        return token.nextToken();
    }
    
    /**
     * Get the next int received from the user.
     *
     * @return  A int typed by the user.
     */
    public int nextInt() throws IOException{
        return Integer.parseInt( next() );
    }
    
    /**
     * Check if there are tokens to read.
     *
     * @return  True if there are more tokens, false otherwise.
     */
    public boolean hasNext(){
        return (token.hasMoreTokens());
    }
    
    /**
     * Closes the stream and releases any system resources associated with it.
     */
    public void close() throws IOException{
        buffer.close();
    }
}
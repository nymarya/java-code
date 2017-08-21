/**
 * Write a description of class TubaraoMartelo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TubaraoMartelo
{
    // instance variables - replace the example below with your own    
    private String nome;
    private int comprimento;
    private String cor = "Cinzento";
    private String ambiente = "Mar";    
    private int nivelFome = 0;
    private String alimento = "Peixes";    
    private String classificacao = "Cartilaginoso";
    
    /**
     * Constructor for objects of class PeixePalhaco
     */
    public TubaraoMartelo(String nome, int comprimento)
    {
       this.nome = nome;
       this.comprimento = comprimento;
    }
    
    public int getComprimento()
    {
        return comprimento;
    }

    public String getCor()
    {
         return cor;        
    }
 
    public void setComprimento(int comprimento)
    {
        this.comprimento = comprimento;
    }

    public void setCor(String cor)
    {
         this.cor = cor;        
    }

        public void alimentarTubaraoMartelo(){
        nivelFome += 30;
        System.out.println("O tubarão Martelo está comendo..\nSeu nivel de fome agora é: " + nivelFome);        
    }
}

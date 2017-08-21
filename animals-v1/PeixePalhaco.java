/**
 * Write a description of class PeixePalhaco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PeixePalhaco
{
    // instance variables - replace the example below with your own    
    private String nome;
    private int comprimento;
    private String cor;
    private String ambiente = "Água";    
    private int nivelFome = 0;
    private String alimento;    
    private String classificacao = "Ósseo";
    
    /**
     * Constructor for objects of class PeixePalhaco
     */
    public PeixePalhaco(String nome, int comprimento, String cor, String alimento)
    {
       this.nome = nome;
       this.comprimento = comprimento;
       this.cor = cor;       
       this.alimento = alimento;
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

        public void alimentarPeixePalhaco(){
        nivelFome += 1;
        System.out.println("O peixe Palhaço está comendo..\nSeu nivel de fome agora é: " + nivelFome);        
    }
}


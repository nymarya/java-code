/**
 * Write a description of class Cavalo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cavalo
{
    // instance variables - replace the example below with your own
    private int numeroPatas = 4;
    private String nome;
    private int comprimento;
    private String cor;
    private String ambiente = "Terra";
    private float velocidade;
    private int nivelFome = 0;
    private String alimento = "Grama";
    
    /**
     * Constructor for objects of class Animal
     */
    public Cavalo(String nome, int comprimento, String cor, float velocidade)
    {
       this.nome = nome;
       this.comprimento = comprimento;
       this.cor = cor;
       this.velocidade = velocidade;            
    }
    
    public int getComprimento()
    {
        return comprimento;
    }

      public String getCor()
    {
         return cor;        
    }

    public float getVelocidade(float velocidade)
    {
       return velocidade;
    }
        
    public void setComprimento(int comprimento)
    {
        this.comprimento = comprimento;
    }

    public void setCor(String cor)
    {
         this.cor = cor;        
    }

    public void setVelocidade(float velocidade)
    {
       this.velocidade = velocidade;
    }

    public void alimentarCavalo(){
        nivelFome += 10;
        System.out.println("O calalo está comendo..\nSeu nivel de fome agora é: " + nivelFome);        
    }
}

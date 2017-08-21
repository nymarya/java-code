/**
 * Write a description of class Cachorro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cachorro
{
    // instance variables - replace the example below with your own
    private int numeroPatas = 4;
    private String nome;
    private int comprimento;
    private String cor;
    private String ambiente = "Terra";
    private float velocidade;
    private int nivelFome = 0;
    private String alimento;
    private int nivelStress = 15;
    private String raca;
    
    /**
     * Constructor for objects of class Gato
     */
    public Cachorro(String nome, int comprimento, String cor, float velocidade, String alimento, String raca )
    {
       this.nome = nome;
       this.comprimento = comprimento;
       this.cor = cor;
       this.velocidade = velocidade;
       this.alimento = alimento;
       this.raca = raca;
    }
    
    public int getComprimento()
    {
        return comprimento;
    }

    public String getCor()
    {
         return cor;        
    }
    
    public String getRaca()
    {
         return raca;        
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

      public void setRaca(String cor)
    {
         this.cor = raca;        
    }
    
    public void setVelocidade(float velocidade)
    {
       this.velocidade = velocidade;
    }

    public void CachorroGato(){
        nivelFome += 15;
        System.out.println("O cachorro está comendo..\nSeu nivel de fome agora é: " + nivelFome);        
    }
    
    public void passearCachorro(){
        nivelStress -= 10;
        nivelFome -= 5;
        System.out.println("O cachorro está passeando..\nSeu nivel de stress agora é: " + nivelStress);        
    }
}

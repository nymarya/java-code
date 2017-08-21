
/**
 * Write a description of class Águia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aguia
{
    // instance variables - replace the example below with your own
    private int numeroPatas = 2;
    private String nome;
    private int comprimento;
    private String cor;
    private String ambiente = "Ar";
    private float velocidade;
    private int nivelFome = 0;
    private String alimento;
    private int tamanhoBico;
    
    /**
     * Constructor for objects of class Águia
     */
    public Aguia(String nome, int comprimento, String cor, float velocidade, String alimento, int tamanhoBico)
    {
       this.nome = nome;
       this.comprimento = comprimento;
       this.cor = cor;
       this.velocidade = velocidade;
       this.alimento = alimento;
       this.tamanhoBico = tamanhoBico;
    }
    
    public int getComprimento()
    {
        return comprimento;
    }
    
    public int getTamanhoBico()
    {
        return tamanhoBico;
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
    
    public void setTamanhoBico(int tamanhoBico)
    {
        this.tamanhoBico = tamanhoBico;
    }    

    public void setCor(String cor)
    {
         this.cor = cor;        
    }

    public void setVelocidade(float velocidade)
    {
       this.velocidade = velocidade;
    }

        public void alimentarAguia(){
        nivelFome += 7;
        System.out.println("A águia está comendo..\nSeu nivel de fome agora é: " + nivelFome);        
    }
}
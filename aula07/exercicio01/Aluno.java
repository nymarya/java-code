import java.util.ArrayList;

public class Aluno{
    private ArrayList<Prova> provas;

    public Aluno( Prova p1, Prova p2){
    	provas = new ArrayList<Prova>();
	provas.add(p1);
	provas.add(p2);
    }    

    public void adicionaProva( Prova prova){
	provas.add(prova);
    }

    public double calcularMedia(){
	double soma = 0.0;
	
	for( Prova prova: provas)
	    soma += prova.calcularNotaTotal();

	return soma / provas.size();
    }

}

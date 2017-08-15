import java.util.ArrayList;

public class Prova{
    private ArrayList<Double> notas;

    public Prova( Double n1, Double n2){
	notas = new ArrayList<Double>();
	notas.add(n1);
	notas.add(n2);    
    }

    public void adicionaNota(double nota){
	notas.add(nota);
    }

    public double calcularNotaTotal(){
	double soma = 0.0;
	
	for( double nota: notas)
	    soma += nota;

	return soma / notas.size();
    }
}


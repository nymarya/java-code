import java.util.ArrayList;

public class Turma{
    private ArrayList<Aluno> alunos;

    public Turma(Aluno a1, Aluno a2, Aluno a3 ){
        alunos = new ArrayList<Aluno>();
	alunos.add(a1);
	alunos.add(a2);
	alunos.add(a3);
    }

    public void matriculaAluno(Aluno aluno){
    	alunos.add(aluno);
    }

    public double calcularMedia(){
        double soma = 0.0;

	for( Aluno aluno : alunos)
	    soma += aluno.calcularMedia();

	return soma / alunos.size();
    }
}

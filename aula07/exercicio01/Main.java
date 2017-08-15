public class Main{

    public static void main(String [] args){
	//Cadastra provas e notas
	Prova p1a1 = new Prova(4.0, 2.5);
	Prova p2a1 = new Prova(1.0, 7.0);

	System.out.println("Media prova1 aluno1: " + p1a1.calcularNotaTotal() );
	System.out.println("Media prova2 aluno1: " + p2a1.calcularNotaTotal() ); 

	Prova p1a2 = new Prova(6.5, 3.5);
	Prova p2a2 = new Prova(0.0, 3.0);

	System.out.println("Media prova1 aluno2: " + p1a2.calcularNotaTotal());
	System.out.println("Media prova 2 aluno2 " + p2a2.calcularNotaTotal());	

	Prova p1a3 = new Prova( 5.0, 4.0);
	Prova p2a3 = new Prova(6.0, 1.5);

	System.out.println("Media prova1 aluno3: "+ p1a3.calcularNotaTotal());
	System.out.println("Media prova2 aluno3: "+p2a3.calcularNotaTotal());

	//Cria alunos
	Aluno aluno1 = new Aluno( p1a1, p2a1);
	System.out.println("Media aluno1: "+aluno1.calcularMedia());

	Aluno aluno2 = new Aluno( p1a2, p2a2);
	System.out.println("Media aluno2: "+aluno2.calcularMedia());

	Aluno aluno3 = new Aluno( p1a3, p2a3);
	System.out.println("Media aluno3: "+ aluno3.calcularMedia());

	//Cria turma
	Turma turma = new Turma( aluno1, aluno2, aluno3);
	System.out.println("Media da turma: "+turma.calcularMedia());
    }
}

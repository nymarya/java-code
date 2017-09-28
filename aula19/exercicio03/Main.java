import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<NotaAluno> alunos = new ArrayList<NotaAluno>();
		
		alunos.add(new NotaAluno(918219, "Bloom", 3.00, 4.00, 5.00));
		alunos.add(new NotaAluno(287332, "Tecna", 7.60, 8.70, 9.99));
		alunos.add(new NotaAluno(583982, "Musa", 6.54, 5.67, 4.32));
		alunos.add(new NotaAluno(782743, "Flora", 2.00, 4.50, 2.75));
		alunos.add(new NotaAluno(382739, "Stella", 5.00, 5.00, 5.00));

		Collections.sort(alunos);
		
		for(int i = 0; i < alunos.size(); i++) {   
	        System.out.println(alunos.get(i));
	    } 
	}

}

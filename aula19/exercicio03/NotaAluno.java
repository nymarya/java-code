/**
 * @author Mayra D. de Azevedo
 * @date Sep 27, 2017
 */


public class NotaAluno implements Comparable<NotaAluno> {

	private int matricula;
	private String nomeAluno;
	private double nota1;
	private double nota2;
	private double nota3;
	
	
	
	/**
	 * Contrói objeto para classe NotaAluno
	 * @param matricula Matrpicula do aluno
	 * @param nomeAluno Nome do aluno
	 * @param nota1 Nota do aluno
	 * @param nota2 Nota do aluno
	 * @param nota3 Nota do aluno
	 */
	public NotaAluno(int matricula, String nomeAluno, double nota1, double nota2, double nota3) {
		this.matricula = matricula;
		this.nomeAluno = nomeAluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	/**
	 * Compara objetos da classe NotaAluno
	 * @param outro Objeto a ser comparado
	 * @return Um inteiro negativo, positivo e zero se o objeto é menor, 
	 * 		   menor ou igual ao outro objeto.
	 */
	public int compareTo(NotaAluno outro) {
		if( this.calculaMedia() < outro.calculaMedia())
			return -1;
		else if( this.calculaMedia() > outro.calculaMedia())
			return 1;
		return 0;
	}

	/**
	 * Recupera matrícula do aluno.
	 * @return A matricula
	 */
	public int getMatricula() {
		return matricula;
	}

	/**
	 * Atualiza matrícula do aluno
	 * @param matricula A nova matrícula
	 */
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	/**
	 * Recupera nome do aluno
	 * @return O nome do aluno
	 */
	public String getNomeAluno() {
		return nomeAluno;
	}

	/**
	 * Atualiza nome do aluno
	 * @param nomeAluno O novo nome do aluno
	 */
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	/**
	 * Recupera primeira nota.
	 * @return Primeira nota.
	 */
	public double getNota1() {
		return nota1;
	}

	/**
	 * Atualiza primeira nota
	 * @param nota1 Nova nova
	 */
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	/**
	 * Recupera segunda nota
	 * @return Segunda nota
	 */
	public double getNota2() {
		return nota2;
	}

	/**
	 * Atualiza segunda nota.
	 * @param nota2 Nova nota
	 */
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	/**
	 * Recupera terceira nota
	 * @return A terceira nota
	 */
	public double getNota3() {
		return nota3;
	}

	/**
	 * Atualiza terceira nota
	 * @param nota3 A nova nota
	 */
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	/**
	 * Calcula média aritmética
	 * @return Média das 3 notas.
	 */
	public double calculaMedia() {
		return (nota1+nota2+nota3)/3;
	}
	
	/**
	 * Cria representação em String de NotaAluno.
	 */
	public String toString() {
		String notaAlunoStr = "Nome: "+ nomeAluno;
		notaAlunoStr += "\nNotas: " + nota1 + ", " + nota2 + ", " + nota3;
		notaAlunoStr += "\nMédia: " + String.format("%.2f", calculaMedia());
		return notaAlunoStr;
	}
	
}

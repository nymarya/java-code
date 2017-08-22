public class Main {

    public static void main( String [] args ) {
	
	ProfessorIntegral prof = new ProfessorIntegral("Joao Neve", "20150809", 30, 20000.0);
	ProfessorHorista substituto = new ProfessorHorista("Dayana Tavares","2017060504", 20, 360, 30.0);

	System.out.println("Prof: " + prof.getNome() );
	System.out.println("salario: " + prof.getSalario() );

	System.out.println("Prof: " + substituto.getNome() );
	System.out.println("salario: " + substituto.salario() );

	substituto.setSalarioHora( 50.0 );
	System.out.println("apos aumento: "+ substituto.salario() );
    }
}

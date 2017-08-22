public class ProfessorIntegral extends Professor {

    private double salario;

    public ProfessorIntegral( String nome, String matricula, int idade, double salario ){
    	super( nome, matricula, idade);
	this.salario = salario;
    }

    public double getSalario(){
	return salario;
    }

    public void setSalario( double salario) {
	this.salario = salario;
    }

}

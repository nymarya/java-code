public class ProfessorHorista extends Professor {
    
    private int totalHoras;
    private double salarioHora;

    public ProfessorHorista( String nome, String matricula, int idade, int total_horas, double salario_hora) {
	super( nome, matricula, idade);
        this.totalHoras = total_horas;
	this.salarioHora = salario_hora;
    }

    public int getTotalHoras() {
	return totalHoras;
    }

    public void setTotalHoras( int total_horas) {
	this.totalHoras = total_horas;
    }

    public double getSalarioHora() {
	return salarioHora;
    }

    public void setSalarioHora( double salario_hora ) {
	this.salarioHora = salario_hora;
    }

    public double salario(){
	return salarioHora * totalHoras;
    }
}

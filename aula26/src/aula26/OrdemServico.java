package aula26;

/**
 * É responsável pelas ações envolvidas em reparar o buraco
 * @author Mayra D. Azevedo
 *
 */
public class OrdemServico {
	 private Buraco buraco;
	 //identifcação da equipe de reparo
	 private int IdEquipe;
	 //número de pessoa na equipe
	 private int tamanhoEquipe;
	 // equipamento atribuído
	 private String equipamento;
	 //horas aplicadas no reparo
	 private int horas;
	 // estado do buraco: trabalho em andamento, reparado, reparo temporário, não reparado
	 private String estado;
	 //quantidade de material de enchimento usado
	 private int qtdMaterial;
	 
	 /**
	 * @param buraco
	 * @param idEquipe
	 * @param tamanhoEquipe
	 * @param equipamento
	 * @param horas
	 * @param estado
	 * @param qtdMaterial
	 */
	public OrdemServico(Buraco buraco, int idEquipe, int tamanhoEquipe, String equipamento, int horas, String estado,
			int qtdMaterial) {
		this.buraco = buraco;
		IdEquipe = idEquipe;
		this.tamanhoEquipe = tamanhoEquipe;
		this.equipamento = equipamento;
		this.horas = horas;
		this.estado = estado;
		this.qtdMaterial = qtdMaterial;
	}
	 
	 
	 /**
	  * Calcula custo do reparo de acordo com horas aplicadas, quantidade de pessoas, 
	  * material e equipamento usados
	  * @return custo total do reparo
	  */
	 public int calculaCustoReparo() {
		 //stub
		 return horas * tamanhoEquipe*qtdMaterial;
	 }
}

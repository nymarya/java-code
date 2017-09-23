import java.util.ArrayList;
import java.util.Random;

public class RepositorioForma {
	
	private ArrayList<Forma> formas;

	/**
	 * Contrói o repositorio com 10 formas.
	 */
	public RepositorioForma() {
		this.formas = new ArrayList<Forma>();
		
		addFormas(10);
	}
	
	/**
	 * Contrói o repositorio com tamanho definido.
	 * @param tamanho Tamanho do repositório.
	 */
	public RepositorioForma(int tamanho) {
		this.formas = new ArrayList<Forma>();
		
		addFormas(tamanho);
	}
	
	/**
	 * Lista formas no repositório.
	 */
	public void listar() {
		for( Forma forma : formas) {
			System.out.println(forma);
			System.out.println();
		}
	}
	
	/**
	 * Cria objetos do tipo Forma aleatoriamente.
	 * @param tamanho
	 */
	private void addFormas( int tamanho ) {
		Random gerador = new Random();
		for( int i = 0; i < tamanho; ++i ) {
			int forma = gerador.nextInt(3);
			float medida = 1 + gerador.nextFloat() * (10);
			if(forma == 0 ) {
				float medida2 = 1 + gerador.nextFloat() * (10);
				Forma f = new Retangulo(medida, medida2);
				formas.add( f );
			} else if (forma == 1 ) {
				Forma f = new Circulo(medida);
				formas.add( f );
			} else {
				Forma f = new Quadrado(medida);
				formas.add( f );
			}
		}
	}
	

}

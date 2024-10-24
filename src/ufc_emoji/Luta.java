package ufc_emoji;

import java.util.Random;

public class Luta {

	
	// Atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	// Métodos
	
	public void mar(Lutador f1, Lutador f2) {
		if(f1.getCategoria() == f2.getCategoria()) {
			if(f1 != f2) {
				
			this.marcarLuta(f1, f2);	
			
			}else {
			 this.marcarLuta(f1, f2);
			}
		}
		
	}
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria() == l2.getCategoria()) {
			if(l1 != l2) {
				aprovada = true;
				desafiado = l1;
				desafiante = l2;
			}else {
				aprovada = false;
				desafiado = null;
				desafiante = null;
			}
		}
		
		
		
	}
	
	public void lutar() {
		Random random = new Random();
		if(aprovada) {
			System.out.println("### DESAFIADO ###");
			desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			desafiante.apresentar();
			int vencedor = random.nextInt(3);
			
			switch(vencedor) {
			case 0:  // Empate
				System.out.println("| RESULTADO: Empatou! |");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1:  // Ganhou Desafiado
				System.out.println("| RESULTADO: " + this.desafiado.getNome() + " ganhou! |");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2: // Ganhou Desafiante
				System.out.println("| RESULTADO: " + this.desafiante.getNome() + " ganhou! |");
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
			}
			
			
		}else {
			System.out.println("Luta não pode acontecer");
		}
		
		
		
		
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador dd) {
		this.desafiado = dd;
	}

	
	
}

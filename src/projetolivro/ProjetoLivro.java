package projetolivro;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		// Pessoas instanciadas
		p[0] = new Pessoa("Iago", 18, "M");
		p[1] = new Pessoa("Jamile", 20, "F");
		
		//Livros instaciados 
		l[0] = new Livro("Aprendendo Java", "José da Sivla", 300, p[0]);
		l[1] = new Livro("Redes de Computadores", "Tenebaum", 347, p[0]);
		l[2] = new Livro("O Poder do Hábito", "George Chwrol", 405, p[1]);
		
		
		l[1].abrir();
		l[1].folhear(230);
		l[1].avancarPag();
		System.out.println(l[1].detalhes());
		
		System.out.println("------------------------------");
		
		
		System.out.println(l[0].detalhes());
			
	}
}

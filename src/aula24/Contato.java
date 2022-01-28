package aula24;

public class Contato {

	String nome;
	String email;
	String endereco;
	String[] telefones;
	
	
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.nome = "Geovana Villafranca";
		contato.email = "geovana@gmail.com";
		contato.endereco = "Av. Paulista, 1000";
		contato.telefones = new String[5];
		contato.telefones[0] = "99999-9999";
		contato.telefones[1] = "99999-9998";
		contato.telefones[2] = "99999-9997";
		contato.telefones[3] = "99999-9996";
		System.out.println(contato.nome);
		System.out.println(contato.email);
		System.out.println(contato.endereco);
		System.out.println(contato.telefones[0]);
		System.out.println(contato.telefones[1]);
		System.out.println(contato.telefones[2]);
		
		
	}
	
	
}

package aula30;

public class Carro {

	String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    



    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() {
		
	}

	void exibirAutonomia(){
        System.out.println("A autonomia do carro: " + this.capCombustivel * this.consumoCombustivel + "Km");

    }
    
    double obterAutonomia() {
    	System.out.println("Método obeterAutonomia foi chamado.");
    	return this.capCombustivel + this.consumoCombustivel;
    }

    
    double calcularCombustivel(double km) {
    	double qtdCombustivel = km/this.consumoCombustivel;
    	return qtdCombustivel;
    	
    }
	
	
}

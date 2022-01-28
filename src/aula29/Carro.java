package aula29;

public class Carro {
	
	String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    Carro(){
    	System.out.println("Classe Carro foi instanciada.");
    	
    	numPassageiros = 4;
    	
    }
    Carro(String marca_, String modelo_, double capCombustivel_, int numPassageiros_, double consumoCombustivel_){
    	marca = marca_;
    	modelo = modelo_;
    	capCombustivel = capCombustivel_;
    	numPassageiros = numPassageiros_;
    	consumoCombustivel = consumoCombustivel_;
    }
    


    void exibirAutonomia(){
        System.out.println("A autonomia do carro: " + capCombustivel * consumoCombustivel + "Km");

    }
    
    double obterAutonomia() {
    	System.out.println("Método obeterAutonomia foi chamado.");
    	return capCombustivel + consumoCombustivel;
    }

    
    double calcularCombustivel(double km) {
    	
    	double qtdCombustivel = km/consumoCombustivel;
    	
    	return qtdCombustivel;
    	
    }


}

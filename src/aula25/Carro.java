package aula25;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;


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

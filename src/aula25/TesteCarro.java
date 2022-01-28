package aula25;

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.modelo);
        System.out.println(van.marca);
        System.out.println("####################");

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;
        fusca.exibirAutonomia();
        
        System.out.println(fusca.modelo);
        System.out.println(fusca.marca);
        System.out.println("A autonomia é : " + fusca.obterAutonomia());
        
        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel20 = van.calcularCombustivel(20);
                
        System.out.println("qtdCombustivel10 " + qtdCombustivel10);
        System.out.println("qtdCombustivel20 " + qtdCombustivel20);

    }

}

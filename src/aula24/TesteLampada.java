package aula24;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada lamp = new Lampada();
		lamp.potencia = 7;
		lamp.modelo = "A60";
		lamp.tensao = "Bivolt";
		lamp.cor = "Amarela";
		lamp.tipoLuz = "Amarela";
		lamp.garantiaMeses = 36;
		lamp.tipoAbajur = true;
		
		lamp.tipos = new String[5];
		lamp.tipos[0] = "Abajur";
		lamp.tipos[0] = "Lampeões";
		

		System.out.println(lamp.modelo);

	}
	
	
}

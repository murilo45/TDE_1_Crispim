package Calcular_ICMS;

public class Teste_da_Calculadora {

	public static void main(String[] args) {
		Calculadora_ICMS calculadora1 = Calculadora_ICMS_Factory.criarCalculadora("minas gerais");
		double resultado1 = calculadora1.calcular(100.0);
		System.out.println("ICMS Minas Gerais: " + resultado1);

		Calculadora_ICMS calculadora2 = Calculadora_ICMS_Factory.criarCalculadora("são paulo");
		double resultado2 = calculadora2.calcular(100.0);
		System.out.println("ICMS São Paulo: " + resultado2);
		
		Calculadora_ICMS calculadora3 = Calculadora_ICMS_Factory.criarCalculadora("para");
		double resultado3 = calculadora3.calcular(100.0);
		System.out.println("ICMS Para: " + resultado3);
		
		Calculadora_ICMS calculadora4 = Calculadora_ICMS_Factory.criarCalculadora("bahia");
		double resultado4 = calculadora4.calcular(100.0);
		System.out.println("ICMS Bahia: " + resultado4);
	}

}

package Calcular_ICMS;

public class Calculadora_ICMS_Factory {
	public static Calculadora_ICMS criarCalculadora(String estado) {
		if (estado.equalsIgnoreCase("minas gerais")) {
			return new Calculadora_ICMS_MG();
		} else if (estado.equalsIgnoreCase("são paulo")) {
			return new Calculadora_ICMS_SP();
		} else if (estado.equalsIgnoreCase("para")) {
			return new Calculadora_ICMS_PR();
		} else if (estado.equalsIgnoreCase("bahia")) {
			return new Calculadora_ICMS_BA();
		}else {
			return null;
		}
	}
}
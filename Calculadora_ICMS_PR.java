package Calcular_ICMS;

public class Calculadora_ICMS_PR implements Calculadora_ICMS{
	@Override
	public double calcular(double valor) {
		return valor*0.16;
	}
}

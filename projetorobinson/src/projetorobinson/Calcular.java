package projetorobinson;

public class Calcular {
	public double Capital;
	public double Juros;
	public double Resultado;
	public int Meses;
	
	public void CalcularJuroComposto() {
		Resultado = Capital * Math.pow(1+Juros/100,Meses);
	
	}
	public void CalcularJuroSimples() {
		Resultado = Capital * (1+ (Juros * Meses)/100);
	}

}


package control1;

public class somaControl {
	public somaControl() {
		super();
	}
	public int soma(int n) {
	// Condição de parada: valor de N números naturais <= 0
		if(n <= 0) {
			// quando a variável chega a 0 retorna a função recursiva 
			return 0;
		}else{
			// enquanto a variável "n" não chega a 0, continua subtraindo da variável "n" na função recursiva e somando a variável
			return n + soma(n - 1);
		}
	}	
}

package control;

public class somaControl {
	public somaControl() {
		super();
	}
	public int soma(int n) {
	// Condição de parada: valor de N números naturais <= 0
		if(n <= 0) {
			return 0;
		}else{
			return n + soma(n - 1);
		}
	}	
}

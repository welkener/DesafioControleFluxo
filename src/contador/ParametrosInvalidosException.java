package contador;

public class ParametrosInvalidosException extends Exception {
	 public ParametrosInvalidosException() {
	        super("O segundo parametro tem que ser maior que o primeiro");
	    }
}

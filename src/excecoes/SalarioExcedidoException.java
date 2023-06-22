package excecoes;

public class SalarioExcedidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public SalarioExcedidoException(String msg) {
		super(msg);
	}
}

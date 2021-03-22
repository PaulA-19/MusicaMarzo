package datos;

public class ExcepPol extends Exception {

	public String nota;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExcepPol(String n) {

		super();
		nota = n;
	}

}

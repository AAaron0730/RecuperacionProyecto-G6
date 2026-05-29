

	/**
	 * Clase que almacena una cadena y permite contar cuántas veces
	 * aparece un carácter en ella.
	 */
	public class CantidadCaracter {
	    private String cadena;

	    /**
	     * Constructor de la clase CantidadCaracter.
	     *
	     * @param cadena Cadena de texto sobre la que se realizará la búsqueda.
	     */
	    public CantidadCaracter(String cadena) {
	        this.cadena = cadena;
	    }

	    /**
	     * Cuenta cuántas veces aparece un carácter en la cadena.
	     *
	     * @param caracter Carácter que se desea buscar.
	     * @return Número de repeticiones del carácter en la cadena.
	     */
	    public int contarCaracter(char caracter) {
	        int contador = 0;
	        for (int i = 0; i < cadena.length(); i++) {
	            if (cadena.charAt(i) == caracter) {
	                contador++;
	            }
	        }
	        return contador;
	    }
	}


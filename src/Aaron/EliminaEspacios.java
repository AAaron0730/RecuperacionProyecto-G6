
package Aaron;
	 
	/**
	 * Clase que almacena una frase y permite eliminar sus espacios.
	 */
	public class EliminaEspacios {
	    private String frase;

	    /**
	     * Constructor de la clase EliminaEspacioss.
	     *
	     * @param frase Cadena de texto que se va a procesar.
	     */
	    public EliminaEspacios(String frase) {
	        this.frase = frase;
	    }

	    /**
	     * Elimina todos los espacios de la frase almacenada.
	     *
	     * @return Una nueva cadena sin espacios.
	     */
	    public String eliminarEspaciosIntermedios() {
	        String resultado = "";
	        for (int i = 0; i < frase.length(); i++) {
	            char c = frase.charAt(i);
	            if (c != ' ') {
	                resultado = resultado.concat(String.valueOf(c));
	            }
	        }
	        return resultado;
	    }
	}


/**
 * Clase que almacena una frase y permite comprobar
 * si una palabra se encuentra dentro de ella.
 */
public class BuscaPalabra {
    private String frase;

    /**
     * Constructor de la clase BuscaPalabra.
     *
     * @param frase Frase en la que se va a buscar la palabra.
     */
    public BuscaPalabra(String frase) {
        this.frase = frase;
    }

    /**
     * Busca una palabra dentro de la frase.
     *
     * @param palabra Palabra que se desea buscar.
     * @return true si la palabra se encuentra en la frase, false en caso contrario.
     */
    public boolean buscarPalabra(String palabra) {
        return frase.indexOf(palabra) != -1;
    }
}
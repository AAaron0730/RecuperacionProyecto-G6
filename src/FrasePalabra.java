/**
 * Clase que almacena una frase y permite contar el número de palabras.
 */
public class FrasePalabra {
    private String frase;

    /**
     * Constructor de la clase FrasePalabra.
     *
     * @param frase Frase que se va a analizar.
     */
    public FrasePalabra(String frase) {
        this.frase = frase.trim();
    }

    /**
     * Cuenta el número de palabras que contiene la frase.
     *
     * @return Número de palabras encontradas en la frase.
     */
    public int contarPalabras() {
        if (frase.isEmpty()) {
            return 0;
        }

        int contador = 1;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }
        return contador;
    }
}
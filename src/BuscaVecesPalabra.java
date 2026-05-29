/**
 * Clase que almacena una frase y permite contar
 * cuántas veces aparece una palabra en ella.
 */
public class BuscaVecesPalabra {
    private String frase;

    /**
     * Constructor de la clase BuscaVecesPalabra.
     *
     * @param frase Frase sobre la que se realizará la búsqueda.
     */
    public BuscaVecesPalabra(String frase) {
        this.frase = frase;
    }

    /**
     * Cuenta cuántas veces aparece una palabra dentro de la frase.
     *
     * @param palabra Palabra que se desea buscar.
     * @return Número de veces que aparece la palabra; si no aparece, devuelve 0.
     */
    public int contarVecesPalabra(String palabra) {
        int contador = 0;
        int posicion = 0;

        while (frase.indexOf(palabra, posicion) != -1) {
            contador++;
            posicion = frase.indexOf(palabra, posicion) + palabra.length();
        }

        return contador;
    }
}
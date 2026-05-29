/**
 * Clase principal del programa.
 * En esta clase se crean objetos de las demás clases
 * y se muestran varios ejemplos de ejecución.
 */
public class PrincipalApp {

    /**
     * Ejecuta distintas pruebas utilizando todas las clases del proyecto.
     */
    public void ejecutar() {
        String frase = "hola mundo hola java";

        EliminaEspacios e = new EliminaEspacios(frase);
        System.out.println("Sin espacios: " + e.eliminarEspaciosIntermedios());

        CantidadCaracter cc = new CantidadCaracter(frase);
        System.out.println("Veces que aparece 'o': " + cc.contarCaracter('o'));

        FrasePalabra fp = new FrasePalabra(frase);
        System.out.println("Número de palabras: " + fp.contarPalabras());

        BuscaPalabra bp = new BuscaPalabra(frase);
        System.out.println("¿Está 'mundo'? " + bp.buscarPalabra("mundo"));

        BuscaVecesPalabra bvp = new BuscaVecesPalabra(frase);
        System.out.println("Veces que aparece 'hola': " + bvp.contarVecesPalabra("hola"));
    }

    /**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
    	PrincipalApp p = new PrincipalApp();
        p.ejecutar();
    }
}
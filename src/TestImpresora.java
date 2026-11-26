public class TestImpresora {
    public static void main(String[] args) {
        Impresora impresora = new Impresora();

        System.out.println("--- PRUEBAS DE SOBRECARGA ---");

        impresora.imprimir(252);

        impresora.imprimir(357.78);

        impresora.imprimir("Hola, esto es una prueba");

        impresora.imprimir("Java", 25);
    }
}

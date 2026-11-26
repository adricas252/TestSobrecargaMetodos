public class Impresora {

    public void imprimir(int numero) {
        System.out.println("Entero: " + numero);
    }

    public void imprimir(double numero) {
        System.out.println("Decimal: " + numero);
    }

    public void imprimir(String texto) {
        System.out.println("Texto: " + texto);
    }

    public void imprimir(String texto, int veces) {
        System.out.println("Texto repetido: ");
        for (int i = 0; i < veces; i++) {
            System.out.print(texto + (i < veces - 1 ? ", " : ""));
        }
        System.out.println();
    }
}

public class RecebendoParamentros {

    public static void main(String[] args) {
        imprimir("*********************************************************");
        imprimir("João");
        String texto = "Pedro";

        imprimir(texto);

    }

    static void imprimirTraco() { // Sem parâmetros
        System.out.println("-------------------------------------------");
    }

    static void imprimir(String texto) { /*Com parâmetros*/
        System.out.println(texto);
    }
}

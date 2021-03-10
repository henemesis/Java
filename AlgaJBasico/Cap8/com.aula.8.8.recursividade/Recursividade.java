public class Recursividade {
    public static void main(String[] args) {
//        main(new String[] {"Thiago"});
        imprimirNumero(0);
    }

    static void imprimirNumero(Integer numero) {
        System.out.println("Número: " + numero);
        if (numero < 10 ){
            imprimirNumero( ++numero);
        }
    }
}

public class RetornandoValores {

    public static void main(String[] args) {
        Double [] premissaInicial = {50.0, 100.0};
        Double proporcao = 20.0;

        Double resultadoFinal = regraDeTres(premissaInicial, proporcao);

        System.out.println(resultadoFinal);

    }

    public static Double regraDeTres(Double[] premissa, Double proporcao) {
        Double resultado = (premissa[0] * proporcao) / premissa[1];
        return resultado;
    }
}

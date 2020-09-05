public class TiposLogicos {
    public static void main(String[] args) {
        Boolean variavelVerdadeira = true;
        System.out.println("Variável verdadeira: " + variavelVerdadeira);

        Boolean variavelFalsa = false;
        System.out.println("Variável falsa: " + variavelFalsa);

        System.out.println("---------------------------------------------");

        Integer idade = 15;

        Boolean podeTirarCarteira = idade >= 18;

        if (podeTirarCarteira) {
            System.out.println("Pode tirar");
        } else {
            System.out.println("Não Pode tirar");
        }

//        System.out.println("Pode tirar carteira: " + podeTirarCarteira);
    }
}
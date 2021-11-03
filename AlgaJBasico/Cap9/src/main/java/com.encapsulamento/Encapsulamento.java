public class Encapsulamento {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Alexandre Afonso");
        cliente.setTelefone("6133713600");

        System.out.println("Nome cliente: " + cliente.getNome());
        System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
        System.out.println("Ultimo nome: " + cliente.getUltimoNome());

    }
}

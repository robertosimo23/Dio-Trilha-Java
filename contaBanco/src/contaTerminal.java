import java.util.Scanner;

public class contaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int Numero;
        String Agencia , NomeCliente;
        Double Saldo;

        Scanner scanner =new Scanner(System.in);

        System.out.println("Por favor , digite o numero da Agencia");
        int agencia=scanner.nextInt();

        System.out.println("Por favor , digite o numero da Conta");
        int conta=scanner.nextInt();
        System.out.println("Por favor , digite o numero do Cliente");
        String nome = scanner.next();
        System.out.println("Por favor , digite o saldo da Conta: ");
        double saldo= scanner.nextDouble();

        System.out.println("olá" +" " + nome + " "+ "Obrigado por criar um conta em nosso Banco"+ " " + agencia+ ", conta "+ " " + conta + "e o seu saldo é: "+ " " + saldo +  " já esta disponivel para saque."+ " ");

    }
}

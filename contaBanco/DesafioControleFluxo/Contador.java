package contaBanco.DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal= new Scanner(System.in);
        System.out.println("Digite o 1º parametro" + " ");

        int parametroUm = terminal.nextInt();
        System.out.println("Digite o 2º paramentro" + " ");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm,parametroDois);

        }catch ( ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());

        }
    }

    static void contar (int parametroUm , int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O SEGUNDO PARAMETRO DEVE SER MAIOR QUE O PRIMEIRO");
        }
        int contagem = parametroDois - parametroUm;
        for( int i = 1 ; i<= contagem; i++){
            System.out.println("Imprimindo o numero " + i);
        }

    }
}

class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(String message){
        super(message);
    }
}
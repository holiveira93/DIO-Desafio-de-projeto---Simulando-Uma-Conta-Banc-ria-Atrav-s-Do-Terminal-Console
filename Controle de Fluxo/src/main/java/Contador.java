import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int numA, numB;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        numA = scan.nextInt();
        System.out.println("Digite o segundo parâmetro");
        numB = scan.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(numA, numB);

        }catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.err.println(exception.getMessage());
        }

    }
    static void contar(int numA, int numB ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (numA > numB) throw new ParametrosInvalidosException();

        int contagem = numB - numA;
        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i < contagem; i++){
            System.out.println("Imprimindo número " + (i+1));
        }
    }
}

class ParametrosInvalidosException extends Exception {
    @Override
    public String getMessage() {
        return "O segundo parâmetro deve ser maior que o primeiro";
    }
}
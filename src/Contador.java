import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor digite o primeiro valor: ");
        int numero1 = scanner.nextInt();
        System.out.println("por favor digite o segundo valor: ");
        int numero2 = scanner.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametroInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
    static void contar(int numero1, int numero2) throws ParametroInvalidoException{
        if (numero1 > numero2){
            throw new ParametroInvalidoException("o primeiro valor deve ser menor que o segundo.");
        }
        int contador = numero2 - numero1;
        for (int i = 1; i <= contador; i++){
            System.out.printf("imprimindo o numero: %d%n", i);
        }
    }
}

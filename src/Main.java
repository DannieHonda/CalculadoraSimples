import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Calculadora calc = new Calculadora();

        String continuar = "sim";

        while (continuar.equalsIgnoreCase("sim")) {
            ;

            System.out.println("Insira o primeiro número: ");
            int num1 = Integer.parseInt(reader.readLine());

            System.out.println("Insira o segundo número: ");
            int num2 = Integer.parseInt(reader.readLine());

            System.out.println("Escolha a operação (soma, subtração, multiplicação, divisão): ");
            String operacao = reader.readLine();

            int resultado = 0;

            switch (operacao.toLowerCase()) {
                case "soma":
                    resultado = calc.soma(num1, num2);
                    break;
                case "subtracao":
                    resultado = calc.subtracao(num1, num2);
                    break;
                case "multiplicacao":
                    resultado = calc.multiplicacao(num1, num2);
                    break;
                case "divisao":
                    resultado = calc.divisao(num1, num2);
                    break;
                default:
                    System.out.println("Operação inválida.");
                    return;
            }
            System.out.println("O resultado da operação " + operacao + " é: " + resultado);

            System.out.println("Deseja realizer outra operação? (sim/nao): ");
            continuar = reader.readLine();
        }
        System.out.println("Programa encerrado.");

    }
}
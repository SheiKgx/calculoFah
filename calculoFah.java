import java.text.DecimalFormat;
import java.util.Scanner;

public class calculoFah {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (true) {
            System.out.print("Digite a temperatura em Celsius para converter para Fahrenheit ou 'sair' para encerrar: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa...");
                break;
            }

            boolean isNumber = input.matches("-?\\d+(\\.\\d+)?");

            if (isNumber) {

                float temperatura = Float.parseFloat(input);
                double temperaturaf = (temperatura * 1.8) + 32;

                DecimalFormat temperaturaDf = new DecimalFormat("#.00");
                String temperaturaFormatada = temperaturaDf.format(temperaturaf);

                System.out.println("A temperatura de Celsius para Fahrenheit é: " + temperaturaFormatada);
            } else {

                System.out.println("Texto inválido.");
            }
        }

        scanner.close();
    }
}

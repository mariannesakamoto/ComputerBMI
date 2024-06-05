import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário o peso em libras e a altura em polegadas
        System.out.print("Informe o peso em libras: ");
        double pesoLbs = scanner.nextDouble();

        System.out.print("Informe a altura em polegadas: ");
        double alturaIn = scanner.nextDouble();

        // Converter as medidas para o sistema métrico (kg e m)
        double pesoKg = pesoLbs * 0.453592; // 1 libra = 0.453592 kg
        double alturaM = alturaIn * 0.0254; // 1 polegada = 0.0254 metros

        // Calcular o IMC
        double imc = pesoKg / (alturaM * alturaM);

        // Exibir o IMC formatado
        System.out.printf("Seu IMC é %.1f\n", imc);

        scanner.close();
    }
}
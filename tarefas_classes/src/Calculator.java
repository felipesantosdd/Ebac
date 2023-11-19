package tarefas_classes.src;

// Classe que representa uma calculadora simples
public class Calculator {
    // Variáveis para armazenar os dois números
    private int num1;
    private int num2;

    // Método principal que cria uma instância da calculadora e executa as operações
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.teste(args);
    }

    // Método de execução que recebe argumentos, converte para inteiros e realiza
    // operações
    private void teste(String[] args) {
        try {
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
            Soma();
            Subtracao();
            Multiplicacao();
            Divisao();
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Os números fornecidos não são válidos.");
        }
    }

    // Método de soma, recebe dois valores como argumentos e imprime o resultado
    public void Soma() {
        try {
            int result = num1 + num2;
            System.out.println("A soma de " + num1 + " e " + num2 + " é igual a " + result);
        } catch (Exception e) {
            System.out.println("Erro ao calcular a soma.");
        }
    }

    // Método de subtração, recebe dois valores como argumentos e imprime o
    // resultado
    public void Subtracao() {
        try {
            int result = num1 - num2;
            System.out.println("A subtração de " + num1 + " por " + num2 + " é igual a " + result);
        } catch (Exception e) {
            System.out.println("Erro ao calcular a subtração.");
        }
    }

    // Método de multiplicação, recebe dois valores como argumentos e imprime o
    // resultado
    public void Multiplicacao() {
        try {
            int result = num1 * num2;
            System.out.println("A multiplicação de " + num1 + " por " + num2 + " é igual a " + result);
        } catch (Exception e) {
            System.out.println("Erro ao calcular a multiplicação.");
        }
    }

    // Método de divisão, recebe dois valores como argumentos e imprime o resultado
    public void Divisao() {
        try {
            int result = num1 / num2;
            System.out.println("A divisão de " + num1 + " por " + num2 + " é igual a " + result);
        } catch (Exception e) {
            System.out.println("Erro ao calcular a divisão.");
        }
    }
}

package tarefa_calculo_medio.src;

public class Main {
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;

    public static void main(String[] args) {
        Main calculator = new Main();
        calculator.teste(args);
    }

    private void teste(String[] args) {
        try {
            if (args.length != 4) {
                System.out.println("Forneça exatamente 4 notas.");
                return;
            }

            nota1 = Integer.parseInt(args[0]);
            nota2 = Integer.parseInt(args[1]);
            nota3 = Integer.parseInt(args[2]);
            nota4 = Integer.parseInt(args[3]);
            calculo();
        } catch (NumberFormatException e) {
            System.out.println("Os números fornecidos não são válidos.");
        } catch (Exception e) {
            System.err.println("Erro ao calcular a média.");
        }
    }

    public void calculo() {
        try {
            int result = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.println(
                    "A média das notas " + nota1 + ", " + nota2 + ", " + nota3 + " e " + nota4 + " é " + result + ".");
        } catch (Exception e) {
            System.err.println("Erro ao calcular a média.");
        }
    
    }
}

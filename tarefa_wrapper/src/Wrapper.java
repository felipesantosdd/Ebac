package tarefa_wrapper.src;

public class Wrapper {
    public static void main(String[] args) {
        Wrapper wrapper = new Wrapper();
        wrapper.convert(args[0]);
    }

    public void convert(String args) {
        try {
            int value = Integer.parseInt(args);
            Integer newValue = Integer.valueOf(value);
            System.out.println("Valor convertido " + newValue);
        } catch (Exception e) {
            System.out.println("Erro ao converter o valor");
            System.out.println("error: " + e.getMessage());
        }
    }
}

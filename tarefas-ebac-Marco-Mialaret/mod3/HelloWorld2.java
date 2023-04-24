public class HelloWorld2 {

    public static void main(String[] args) {
        String ambiente = args[0];
        if (ambiente.equalsIgnoreCase("DEV")) {
            System.out.print("Executando em DEV");
        } else if (ambiente.equalsIgnoreCase("test")) {
            System.out.print("Executando em TEST");
        } else {
            System.out.print("Olá, " + ambiente + "!");
        }
    }
}

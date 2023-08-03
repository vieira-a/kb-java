import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        String customer = "Eddie Vedder";
        String accountType = "Corrente";
        double balance = 1999.00;
        Scanner readValue = new Scanner(System.in);

        String menu = """
                Operações
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;
        System.out.println("*************************");
        System.out.println("\nCliente: "+ customer);
        System.out.println("Tipo de conta: "+ accountType);
        System.out.println("Saldo atual: "+ balance);
        System.out.println("\n*************************");

        Scanner selectMenuOption = new Scanner(System.in);
        int menuOption = 0;

        while (menuOption != 4) {
            System.out.println(menu);
            System.out.println("Digite a opção desejada");
            menuOption = selectMenuOption.nextInt();

            if (menuOption == 1)  {
                System.out.println("O saldo atual é:" + balance);
            } else if (menuOption == 2) {
                System.out.println("Informe o valor a receber");
                double value = readValue.nextDouble();
                balance += value;
                System.out.println("Novo saldo:" + balance);
            } else if (menuOption == 3) {
                System.out.println("Informe o valor para transferência");
                double value = readValue.nextDouble();
                if (value > balance) {
                    System.out.println("Nãp há saldo suficiente.");
                    System.out.println("O saldo atual é:" + balance);
                } else {
                    balance -= value;
                    System.out.println("Novo saldo:" + balance);
                }
            } else if (menuOption != 4) {
                System.out.println("Opção inválida");
            }
        }
    }
}

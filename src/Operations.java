import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        String customer = "Eddie Vedder";
        String accountType = "Corrente";
        double initialBalance = 1999.00;
        double currentBalance = initialBalance;

        Scanner receiveValue = new Scanner(System.in);
        Scanner transferValue = new Scanner(System.in);

        int receivedAmount = 0;
        int transferedAmount = 0;

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
        System.out.println("Saldo atual: "+ currentBalance);
        System.out.println("\n*************************");

        Scanner selectMenuOption = new Scanner(System.in);
        int menuOption = 0;

        while (menuOption != 4) {
            System.out.println(menu);
            System.out.println("Digite a opção desejada");
            menuOption = selectMenuOption.nextInt();

            switch (menuOption) {
                case 1:
                    System.out.println("O saldo atual é: "+ currentBalance);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber");
                    receivedAmount = receiveValue.nextInt();
                    currentBalance = currentBalance + receivedAmount;
                    System.out.println("Saldo atualizado: "+ currentBalance);
                    break;
                case 3:
                    System.out.println("Informe o valor para transferência");
                    transferedAmount = transferValue.nextInt();
                    currentBalance = currentBalance - transferedAmount;
                    System.out.println("Saldo atualizado: "+ currentBalance);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }


    }
}

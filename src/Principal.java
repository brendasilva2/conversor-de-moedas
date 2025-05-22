import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner escolha = new Scanner(System.in);
        ServicoDeConversao servico = new ServicoDeConversao();
        RespostaDeConversao resposta = servico.getMoedas("ab92647e3706f987c06316ea");

        int escolhaUsuario = 0;

        System.out.println("**************************************");
        System.out.println("   Bem-vindo ao conversor de moedas ");
        System.out.println("**************************************");

        while (escolhaUsuario != 7) {
            System.out.println("\nEscolha uma das opções abaixo: " +
                    "\n1. USD --> BRL" +
                    "\n2. USD --> AUD" +
                    "\n3. BRL --> USD" +
                    "\n4. BRL --> EUR" +
                    "\n5. EUR --> AED" +
                    "\n6. EUR --> GBP" +
                    "\n7. Sair\n");
            escolhaUsuario = escolha.nextInt();

            switch (escolhaUsuario) {
                case 1 -> {
                    System.out.println("Escolha o valor em USD: ");
                    double valor = escolha.nextDouble();
                    double taxa = resposta.getTaxaDeConversao().get("BRL");
                    double valorConvertido = valor * taxa;
                    System.out.println("*********************************");
                    System.out.println("          Conversão");
                    System.out.printf("%.2f USD resulta em %.2f BRL.", valor, valorConvertido);
                    System.out.println("\n*********************************");
                }

                case 2 -> {
                    System.out.println("Escolha o valor em USD: ");
                    double valor = escolha.nextDouble();
                    double taxa = resposta.getTaxaDeConversao().get("AUD");
                    double valorConvertido = valor * taxa;
                    System.out.println("*********************************");
                    System.out.println("         Conversão");
                    System.out.printf("%.2f USD resulta em %.2f AUD.", valor, valorConvertido);
                    System.out.println("\n*********************************");
                }

                case 3 -> {
                    System.out.println("Escolha o valor em BRL: ");
                    double valor = escolha.nextDouble();
                    double taxa = resposta.getTaxaDeConversao().get("BRL");
                    double valorConvertido = valor / taxa;
                    System.out.println("*********************************");
                    System.out.println("         Conversão");
                    System.out.printf("%.2f BRL resulta em %.2f USD.", valor, valorConvertido);
                    System.out.println("\n*********************************");
                }

                case 4 -> {
                    System.out.println("Escolha o valor em BRL: ");
                    double valor = escolha.nextDouble();
                    double taxaBrl = resposta.getTaxaDeConversao().get("BRL");
                    double taxaEur = resposta.getTaxaDeConversao().get("EUR");
                    double valorConvertido = valor / taxaBrl * taxaEur;
                    System.out.println("*********************************");
                    System.out.println("          Conversão");
                    System.out.printf("%.2f BRL resulta em %.2f EUR.", valor, valorConvertido);
                    System.out.println("\n*********************************");
                }

                case 5 -> {
                    System.out.println("Escolha o valor em EUR: ");
                    double valor = escolha.nextDouble();
                    double taxaEur = resposta.getTaxaDeConversao().get("EUR");
                    double taxaAed = resposta.getTaxaDeConversao().get("AED");
                    double valorConvertido = valor / taxaEur * taxaAed;
                    System.out.println("*********************************");
                    System.out.println("          Conversão");
                    System.out.printf("%.2f EUR resulta em %.2f AED.", valor, valorConvertido);
                    System.out.println("\n*********************************");
                }

                case 6 -> {
                    System.out.println("Escolha o valor em EUR: ");
                    double valor = escolha.nextDouble();
                    double taxaEur = resposta.getTaxaDeConversao().get("EUR");
                    double taxaGbp = resposta.getTaxaDeConversao().get("GBP");
                    double valorConvertido = valor / taxaEur * taxaGbp;
                    System.out.println("*********************************");
                    System.out.println("           Conversão");
                    System.out.printf("%.2f EUR resulta em %.2f GBP", valor, valorConvertido);
                    System.out.println("\n*********************************");
                }

                case 7 -> System.out.println("Saindo do sistema...");

                default -> System.out.println("Opção inválida. Tente novamente!");
            }
        }
    }
}

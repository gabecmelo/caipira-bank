import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Instancia as contas: ContaPoupanca e ContaCorrente com saldo inicial 0
        ContaPoupanca contaP = new ContaPoupanca(0, TipoConta.POUPANCA);
        ContaCorrente contaC = new ContaCorrente(0, TipoConta.CORRENTE);

        // Declara variáveis para armazenar a conta atualmente ativa e a conta usada para posterior transferência
        ContaBancaria contaAtual = null;
        ContaBancaria contaExterna = null;

        int contaIn = 0; // Variável para armazenar a escolha da conta inicial
        int opcao = 0;   // Variável para armazenar a opção do menu de interação

        // Seleção de conta
        // Loop para garantir que o usuário escolha uma conta válida
        do {
            System.out.println("Escolha uma conta para usar: ");
            System.out.println("1 - Conta Poupança");
            System.out.println("2 - Conta Corrente");

            // Lê a opção da conta escolhida pelo usuário
            contaIn = sc.nextInt();

            // Define a conta atual e a conta externa com base na escolha do usuário
            contaAtual = contaIn == 1 ? contaP : contaC;
            contaExterna = contaIn == 1 ? contaC : contaP;

            System.out.println("=========================================");
            System.out.println("Você está na conta " + contaAtual.getTipoConta());
        } while (contaIn < 1 || contaIn > 2); // Validação: opção deve ser 1 ou 2

        // Menu de interação
        // Loop principal do menu que continua até o usuário escolher sair (opção 5)
        do {
            System.out.println("=========================================");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Verificar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Transferir saldo");
            System.out.println("4 - Trocar de conta");
            System.out.println("5 - Sair do app");
            System.out.println("=========================================");

            // Lê a opção do menu escolhida pelo usuário
            opcao = sc.nextInt();

            // Executa a ação correspondente à opção escolhida
            switch (opcao) {
                case 1:
                    // Opção para verificar o saldo da conta atual
                    System.out.println("=========================================");
                    System.out.println("Verificando o seu saldo...");
                    Thread.sleep(1000);  // Simula uma pequena pausa

                    // Exibe o saldo atual formatado
                    System.out.printf("Saldo atual: R$ %.2f \n", contaAtual.consultarSaldo());
                    Thread.sleep(1000);
                    break;

                case 2:
                    // Opção para realizar um depósito na conta atual
                    System.out.println("=========================================");
                    System.out.println("Quanto o cê qué depositá? ");
                    System.out.print("R$");
                    double valorDeposito = sc.nextDouble();

                    System.out.println("Efetuando o depósito...");
                    Thread.sleep(1000);

                    // Chama o método depositar para adicionar o valor ao saldo
                    contaAtual.depositar(valorDeposito);
                    break;

                case 3:
                    // Opção para transferir saldo da conta atual para a conta externa
                    System.out.println("=========================================");
                    System.out.println("Quanto o cê qué transferi pa ota conta? ");
                    System.out.print("R$");
                    double valorTransf = sc.nextDouble();

                    System.out.println("Executando transferência...");
                    Thread.sleep(1000);

                    // Chama o método transferir para realizar a transferência
                    contaAtual.transferir(contaExterna, valorTransf);
                    break;

                case 4:
                    // Opção para trocar a conta ativa
                    System.out.println("=========================================");
                    System.out.println("Trocando para a conta " + contaAtual.getTipoConta() + "...");
                    Thread.sleep(1000);

                    // Troca as referências das contas: a atual passa a ser a externa e vice-versa
                    ContaBancaria temp = contaAtual;
                    contaAtual = contaExterna;
                    contaExterna = temp;

                    System.out.println("Você está na conta " + contaAtual.getTipoConta());
                    break;

                case 5:
                    // Opção para sair do aplicativo
                    System.out.print("Saindo do app");
                    Thread.sleep(250);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(". ");
                    Thread.sleep(1000);
                    System.out.print("até a próxima!");
                    Thread.sleep(1000);
                    break;

                default:
                    // Caso o usuário escolha uma opção inválida
                    System.out.println("Opção inválida uai, tenta dinovo");
                    break;
            }
        } while (opcao != 5);

        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}

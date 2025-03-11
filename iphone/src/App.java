import java.util.Scanner;

import iphone.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        IPhone meuIphone = new IPhone("iPhone 15");
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n---------------------");
            System.out.println("***** " + meuIphone.modelo + " *****");
            System.out.println("1 - Tocar ");
            System.out.println("2 - Pausar ");
            System.out.println("3 - Selecionar Música ");
            System.out.println("4 - Ligar para: ");
            System.out.println("5 - Atender ");
            System.out.println("6 - Iniciar correio de voz");
            System.out.println("7 - Exibir página ");
            System.out.println("8 - Adicionar nova aba");
            System.out.println("9 - Atualizar página");
            System.out.println("0 - Sair");
            System.out.println("---------------------\n");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    meuIphone.tocar();
                    break;
                case 2:
                    meuIphone.pausar();
                    break;
                case 3:
                    System.out.println("Digite o nome da música: ");
                    meuIphone.selecionarMusica(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Digite o número: ");
                    meuIphone.ligar(scanner.nextLine());
                    break;
                case 5:
                    meuIphone.atender();
                    break;
                case 6:
                    meuIphone.iniciarCorreioVoz();
                    break;
                case 7:
                    System.out.println("Digite a URL: ");
                    meuIphone.exibirPagina(scanner.nextLine());
                    break;
                case 8:
                    meuIphone.adicionarNovaAba();
                    break;
                case 9:
                    meuIphone.atualizarPagina();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        // Test cases
        // meuIphone.tocar();
        // meuIphone.tocar();
        // meuIphone.pausar();
        // meuIphone.pausar();
        // meuIphone.selecionarMusica("Sabão Cracra - Mamonas Assassinas");

        // meuIphone.ligar("+55 66 9 9999-9999");
        // meuIphone.atender();
        // meuIphone.iniciarCorreioVoz();

        // meuIphone.exibirPagina("https://github.com/kelvimro");
        // meuIphone.adicionarNovaAba();
        // meuIphone.atualizarPagina();

        scanner.close();
    }
}

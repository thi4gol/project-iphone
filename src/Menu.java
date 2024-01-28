package src;

import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    private int opcao;

    public void loopPrincipal() {
        do {
            mostrarMenu();
            try {
                switch (opcao) {
                    case 1:
                        musical();
                        break;

                    case 2:
                        telefonico();
                        break;  

                    case 3:
                        navegarNaInternet();
                        break;
                
                    default:
                        limpa();
                        System.out.println("Opção inválida!");
                        voltarMenu();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                voltarMenu();
            }

        } while (opcao != 0);
    }

    public void mostrarMenu() {
        limpa();
        System.out.println("*** Menu do Iphone ***");
        System.out.println("1- Reprodutor Musical");
        System.out.println("2- Aparelho telefônico");
        System.out.println("3- Navegador na Página");
        System.out.println("0- Sair");
        System.out.print("Opção: ");
        opcao = scan.nextInt(); scan.nextLine();
    }

    public void musical() {
        limpa();
        System.out.println("*** Aparelho telefônico ***");
        System.out.println("1- Tocar");
        System.out.println("2- Pausar");
        System.out.println("3- Selecionar Música");
        System.out.print("Opção: ");
        int opcao = scan.nextInt(); scan.nextLine();

        if(opcao == 1) {
            limpa();
            System.out.println("Iphone está tocando música.");
        }

        if(opcao == 2) {
            limpa();
            System.out.println("Música pausada.");
        }

        if(opcao == 3) {
            limpa();
            System.out.println("Música selecionada.");
        }
        voltarMenu();
    }

    public void telefonico() {
        limpa();
        System.out.println("*** Aparelho telefôncio ***");
        System.out.println("1- Ligar");
        System.out.println("2- Atender");
        System.out.println("3- Iniciar correio de voz");
        System.out.print("Opção: ");
        int opcao = scan.nextInt(); scan.nextLine();

        if(opcao == 1) {
            limpa();
            System.out.println("Iphone está Ligando.");
        }

        if(opcao == 2) {
            limpa();
            System.out.println("Iphone está atendendo.");
        }

        if(opcao == 3) {
            limpa();
            System.out.println("Iphone iniciando correio de voz.");
        }
        voltarMenu();
    }

    public void navegarNaInternet() {
        limpa();
        System.out.println("*** Navegador na internet ***");
        System.out.println("1- Exibir página");
        System.out.println("2- Adicionar nova aba");
        System.out.println("3- Atualizar página");
        System.out.print("Opção: ");
        int opcao = scan.nextInt(); scan.nextLine();

        if(opcao == 1) {
            limpa();
            System.out.println("Página sendo exibida.");
        }

        if(opcao == 2) {
            limpa();
            System.out.println("Nova aba sendo adicionada.");
        }

        if(opcao == 3) {
            limpa();
            System.out.println("Página atualizando.");
        }
        voltarMenu();
    }        

    public void limpa(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void voltarMenu(){
        System.out.println("Digite [ENTER] para voltar ao menu");
        scan.nextLine();
        scan.nextLine();
    }
}

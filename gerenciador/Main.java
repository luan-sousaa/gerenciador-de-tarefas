package gerenciador;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //criacao da lista e do scanner
        ArrayList<Tarefa> lista = new ArrayList<>(); // Mudança: usar ArrayList<Tarefa> em vez de ArrayList<String>
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int proximoId = 1;

        //fazemos o percurso das opcoes enquanto a opcao for diferente de 0
        do {
            //opcoes para o usuario escolher
            System.out.println("\n=== TO-DO LIST ===");
            System.out.println("0 - Sair");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Listar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            //switch case para nao criarmos varios if else
            switch (opcao) {
                //caso for 0 saimos do programa
                case 0:
                    System.out.println("Saindo...");
                    break;

                case 1:
                    //adicionando uma tarefa e seu id
                    System.out.print("Digite a sua tarefa: ");
                    String descricao = scanner.nextLine();
                    Tarefa tarefa = new Tarefa(proximoId, descricao);
                    lista.add(tarefa); // Mudança: adicionar o objeto Tarefa diretamente
                    System.out.println("Tarefa adicionada com ID " + proximoId);
                    proximoId++;
                    break;

                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("Lista vazia! Não há tarefas para remover.");
                        break;
                    }

                    System.out.print("Digite o ID da tarefa que deseja remover: ");
                    int idRemover = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    // Buscar e remover a tarefa pelo ID
                    boolean removida = lista.removeIf(t -> t.getId() == idRemover);

                    if (removida) {
                        System.out.println("Tarefa com ID " + idRemover + " removida com sucesso!");
                    } else {
                        System.out.println("Tarefa com ID " + idRemover + " não encontrada!");
                    }
                    break;

                case 3:
                    //listar todas as tarefas
                    if (lista.isEmpty()) {
                        System.out.println("Lista vazia! Não há tarefas cadastradas.");
                    } else {
                        System.out.println("\n=== SUAS TAREFAS ===");
                        for (Tarefa t : lista) {
                            System.out.println(t);
                        }
                    }
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}
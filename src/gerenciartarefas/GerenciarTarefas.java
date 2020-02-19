package gerenciartarefas;

import static gerenciartarefas.Tarefa.nomearTarefa;
import java.util.Scanner;

public class GerenciarTarefas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String opcao = "";
        do {
            System.out.println("Digite a opção desejada");
            System.out.println("1- Adicionar tarefa");
            System.out.println("2- Alterar titulo");
            System.out.println("3- Alterar estado");
            System.out.println("0- Sair");
            opcao = scan.next();

            switch (opcao) {

                case "1":
                    break;

                case "2":
                    nomearTarefa();
                    break;

                case "3":
                    break;

                case "4":
                    break;
            }
        } while (opcao != "0");
    }
}

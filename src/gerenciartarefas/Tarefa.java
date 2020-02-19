package gerenciartarefas;
import java.util.List;
import java.util.Scanner;

public class Tarefa {
    
    static String titulo;
    static boolean estado;
            
    //nomear as tarefas
    public static String nomearTarefa(){
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual o titulo da tarefa? ");
        return titulo =  scan.next();
    } 
    
    //alterar o estado
    public static boolean alterarEstado() {
    
        Scanner scan = new Scanner(System.in);
         
        System.out.println("Qual o estado da tarefa? (1)Concluida (2)Em aberto");
        String opcao = scan.next();
        if (opcao == "1") {
        return estado == true;
        }
        else{
        return estado == false;
        }

    }
    
    //alterar titulo
    public String alterarTitulo (String novoTitulo){
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual o titulo da tarefa? ");
        titulo =  scan.next();
        if (novoTitulo.equals(titulo)){
        return "titulo igual";
        }
        
        if (novoTitulo.isEmpty()){
        return "titulo vazio";
        }
        
        return "titulo alterado";
    }
    
    
}
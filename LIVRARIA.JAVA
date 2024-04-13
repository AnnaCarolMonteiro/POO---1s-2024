package LIBRARY;

import java.util.Scanner;

public class sistema {
    
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int opcao = 0;

    while (opcao != 4) {
        System.out.println("1- Adicionar livro");
        System.out.println("2- Listar livros");
        System.out.println("3- Detalhar livro");
        System.out.println("4- Sair");
        opcao = sc.nextInt();

       switch (opcao) {

        case 1:
            System.out.println("Adicionando livro");
            int id;String titulo;
            String nomeAutor;String anoPublicacao; String editora;
            System.out.println (x: "id:");
            id = sc.nextLine();
            System.out.println (x: "titulo:");
            titulo = sc.nextLine();
            System.out.println (x: "Autor:");
            nomeAutor = sc.nextLine();
            System.out.println (x: "Ano:");
            anoPublicacao = sc.nextLine;
            System.out.println (x: "editora:");
            editora = sc.nextLine;


        break;
       
        case 2:
            System.out.println("Listando livros");
            

        break;

        case 3:
            System.out.println("Detalhando livro");
        break;
        
        case 4:
            System.out.println("Encerrando Sistema");
        break;

        default:
            System.out.println("Opção Inválida");
            break;
       }

    }
    
    sc.close();


}

}
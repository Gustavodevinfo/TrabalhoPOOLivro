import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe descrição, armazem e ano:");
        String descricaoTenis= scanner.nextLine();
        String armazemTenis = scanner.nextLine();
        int anoTenis = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe marca,modelo e tamanho");
        String marca = scanner.nextLine();
        String modelo = scanner.nextLine();
        double tamanho = scanner.nextDouble();
        scanner.nextLine();
        Tenis tenis = new Tenis(descricaoTenis,armazemTenis,anoTenis,marca,modelo,tamanho);
        tenis.exibirInfo();
        System.out.println("Informe descrição, armazem e ano:");
        String descricaoLivro = scanner.nextLine();
        String armazemLivro= scanner.nextLine();
        int anoLivro = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe nome do livro,autor e editora");
        String nome = scanner.nextLine();
        String autor = scanner.nextLine();
        String editora = scanner.nextLine();
        Livro livro = new Livro(descricaoLivro,armazemLivro,anoLivro,nome,autor,editora);
        livro.exibirInfo();
    }
}

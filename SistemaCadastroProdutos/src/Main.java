import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> p = new ArrayList<>();

        p.add(new Livro("Pinoquio",32.20, "Livros"));
        p.add(new Livro("Aventura de Pi",45.90, "Livros"));
        p.add(new Eletronico("Celular Poco X6 PRO",1980.90, "Eletronico"));
        p.add(new Alimento("Cuzcuz",4.90, "Alimento"));

        System.out.println("==== LISTA ====\n");

        for (Produto produto : p) {
            double precoFinal = produto.calcularDesconto();

            System.out.println("Produto: " + produto.getNomeProduto());
            System.out.println("Categoria: " + produto.getCategoriaProduto());
            System.out.println("Preço original: R$ " + produto.getPrecoProduto());
            System.out.printf("Preço com desconto: R$ %.2f", precoFinal);
            System.out.println("\n========================================");
        }
    }
}

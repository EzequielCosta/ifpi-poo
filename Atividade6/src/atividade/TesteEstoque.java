
package atividade;


public class TesteEstoque {
    public static void main(String[] args) {
        
        ProdutoPerecivel p1 = new ProdutoPerecivel("18/01/2021", 1, "Arroz", 50, 12);
        ProdutoPerecivel p2 = new ProdutoPerecivel("12/01/2021", 2, "Feijao", 50, 12);
        ProdutoPerecivel p3 = new ProdutoPerecivel("12/01/2025", 3, "Leite", 50, 12);
        Produto p4 = new Produto( 5, "Queijo", 50, 12);
        ProdutoPerecivel p6 = new ProdutoPerecivel("12/01/2029", 4, "Açucar", 70, 5);
        
        Estoque estoqueProdutos = new Estoque();
        estoqueProdutos.inserirProduto(p1);
        estoqueProdutos.inserirProduto(p2);
        estoqueProdutos.inserirProduto(p3);
        estoqueProdutos.inserirProduto(p4);
        estoqueProdutos.inserirProduto(p6);
        
        System.out.println(estoqueProdutos.toString());
        
        estoqueProdutos.excluirProduto(p6);
        
        System.out.println("\n");
        System.out.println(estoqueProdutos.toString());
        
        System.out.println("\n\n");
        System.out.println(p1.toString() + "\n");
        System.out.println(p4.toString() + "\n");
        
        
    }
}

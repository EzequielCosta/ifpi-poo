
package atividade3;


public class Produto {
    private String codigo;
    private String descricao;
    private double valor;
    private int quantidade;
    private int quantidadeMinima;

    public Produto(String codigo, String descricao, double valor, int quantidade, int quantidadeMinima) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
        this.quantidadeMinima = quantidadeMinima;
    }   
    
    boolean baixarQuantidade(int valorQuantidade){
        if (valorQuantidade <= this.quantidadeMinima){
        
            int resultado = this.quantidade - valorQuantidade;
            if (resultado > 0){
                this.quantidade = resultado;
                return true;
            }
            return false;
        }
        return false;
    }
    
    void reporQuantidade(int valorQuantidade){
        this.quantidade += valorQuantidade;
    }
    
    void reajusta(double taxa){
        this.valor *= 1 + (taxa / 100);
    }

    @Override
    public String toString() {
        return "Codigo: " + this.codigo + "\nDescricao: " + this.descricao +
                "\nValor: " + this.valor + "\nQuantidade: " + this.quantidade +
                "\nQantidade Minima : " + this.quantidadeMinima; 
    }
    
    public boolean equals(Produto produto) {
        return produto.codigo == this.codigo;   
    }
    
     public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}

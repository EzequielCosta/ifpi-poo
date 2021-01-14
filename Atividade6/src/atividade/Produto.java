package atividade;


public class Produto {
    
    private int id;
    private String descricao;
    private int quantidade;
    private float valor;

    public Produto(int id, String descricao, int quantidade, float valor) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    
    public void repor(int quantidade){
        if (quantidade > 0){
            this.quantidade += quantidade;
        }
    }
    
    public void darBaixa(int quantidade){
        if (quantidade <= this.quantidade){
            this.quantidade -= quantidade;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public String toString(){
        return ("ID: " + this.getId() + "\n"
                + "Descrição: " + this.getDescricao() + "\n"
                + "Quantidade: " + this.getQuantidade() + "\n"
                + "Valor: " + this.getValor() + "\n"
        );
    }
}

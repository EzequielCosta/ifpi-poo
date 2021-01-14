package atividade;

import java.util.ArrayList;

public class Estoque {
    
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    
    public void inserirProduto(Produto produto){
        int marca = 0;
        for (Produto i: produtos){
            if ((i.getId() == produto.getId()) || (i.getDescricao() == produto.getDescricao())){
                marca = 1;
                break;
            }
        }
        if (marca == 0){
            produtos.add(produto);
        }
    }
    
    public boolean consultarProduto(Produto produto){
        for (Produto i: produtos){
            if (i.getId() == produto.getId()){
                return true;
            }
        }
        return false;
    }
    
    public boolean excluirProduto(Produto produto){
        for (int indice = 0 ; indice < produtos.size(); indice++){
            if ( produtos.get(indice).getId() == produto.getId()){
                produtos.remove(indice);
                return true;
            }
        }
        return false;
    }
    
    public String toString (){
        
        String show = "";
        
        for(Produto i : produtos){
            show += i.toString() + "\n";
        }
        return show;
    }
}

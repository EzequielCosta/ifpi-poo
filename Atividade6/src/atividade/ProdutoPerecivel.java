package atividade;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.text.StyledEditorKit;



public class ProdutoPerecivel extends Produto{
    private String dataVencimento;

    public ProdutoPerecivel(String data_validade, int id, String descricao, int quantidade, float valor) {
        super(id, descricao, quantidade, valor);
        this.dataVencimento = data_validade;
    }
    
    public boolean ehValido(){
        LocalDateTime now = LocalDateTime.now(); 
        String dataAtual = (now.toString()).substring(0, 10);

        String dataVencimento =  this.dataVencimento.substring(6, 10) +
                "-" + this.dataVencimento.substring(3, 5)+"-"+
                this.dataVencimento.substring(0, 2);
        
        LocalDate dataA = LocalDate.parse(dataAtual);
        LocalDate dataV = LocalDate.parse(dataVencimento);
        
        return (dataV.isAfter(dataA));
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

   
    
    
    
    public String toString(){
        
        return (super.toString() + "Data Vencimento: " + this.getDataVencimento() + "\n");
        
    }
    
    
}

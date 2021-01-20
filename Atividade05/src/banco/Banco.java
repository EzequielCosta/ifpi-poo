package banco;

public class Banco {

    private Conta[] contas;
    private int indice = 0;
    private int tamanhoMaximo = 50; 

    public Banco() {
        contas = new Conta[tamanhoMaximo];
    }

    public Banco(int tamanho) {
        this.tamanhoMaximo = tamanho;
        contas = new Conta[tamanhoMaximo];
    }

    public void inserir(Conta c) {
        if (!this.quantidadeMaxima()){
        contas[indice] = c;
        indice++;
        }
    }

    public Conta consultar(String numero) {
        Conta c = null;
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(numero)) {
                c = contas[i];
                break;
            }
        }
        return c;
    }

    private int consultarIndice(String numero) {
        int pos = -1;
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(numero)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public void debitar(String numero, double valor) {
        Conta c;
        c = consultar(numero);
        if (c != null) {
            c.sacar(valor);
        } else {
            System.out.println("Conta inexistente.");
        }
    }

    public void alterar(Conta c) {
	int indice = consultarIndice(c.getNumero());
	if (indice != -1) {
            contas[indice] = c;
	}

    }

    public void excluir(String numero) {
        int posicao = consultarIndice(numero);
        if (posicao != -1) {
            for (int i = posicao; i < indice; i++) {
                contas[i] = contas[i + 1];
            }

            indice--;
        }
    }
    
    public boolean quantidadeMaxima(){
        return (this.indice >= this.tamanhoMaximo);
    }
    
    public boolean creditar(String  numero,double  valor){
        Conta conta = this.consultar(numero);
        if (conta != null){
            conta.depositar(valor);
            return true;
        }
        return false;
    }
    
    public void transferir(String numCredito, String numDebito, double valor) {
	Conta contaCredito = consultar(numCredito);
	Conta contaDebito = consultar(numDebito);
		
	if (contaCredito != null && contaDebito != null) {
            contaCredito.transferir(contaDebito, valor);
            System.out.println("Tranferido com sucesso.");
	} else {
            System.out.println("As duas contas devem existir.");
	}
    }
    public int retornaQuantidade() {
        return indice;
    }
    
    public double retornaValorTotal() {
	double total = 0;
	for (int i = 0; i < indice; i++) {
            total += contas[i].getSaldo();
	}
	return total;
    }
    
    public double retornaMediaValores() {
	return retornaValorTotal()/retornaQuantidade();
    }
    
}

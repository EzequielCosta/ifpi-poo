package banco;

public class TesteAuditoriaInterna {

    public static void main(String[] args) {
        
        AuditoriaInterna auditoria = new AuditoriaInterna();
        
        ContaCorrente cc1 = new ContaCorrente("123", 100);
        ContaCorrente cc2 = new ContaCorrente("123", 100);
        
        SeguroDeVida sd1 = new SeguroDeVida();
        SeguroDeVida sd2 = new SeguroDeVida();
        auditoria.inserir(cc1);
        auditoria.inserir(cc2);
        auditoria.inserir(sd1);
        auditoria.inserir(sd2);
        System.out.println("Soma de Todos: " + auditoria.calculaTributos());
    }
}

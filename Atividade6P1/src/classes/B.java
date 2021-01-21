package classes;


public class B extends A{
    
    public String metodo1() {
        return "metodo 1, classe B";
    }
    
    public String metodo2() {
        return "metodo 2, classe B";
        
    }
    
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.metodo1());
    }
}

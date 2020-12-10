
package atividade13;

public class TestaNumberUtils {
    public static void main(String[] args) {
        NumberUtils objeto = new NumberUtils();
        
        objeto.numero = 72;
        
        System.out.println(objeto.printCount());
        System.out.println(objeto.printReverseCount());
        System.out.format("O número %d é par? %b\n",objeto.numero,objeto.isPair());
        System.out.format("O número %d é primo? %b\n",objeto.numero,objeto.isPrime());
    }
}

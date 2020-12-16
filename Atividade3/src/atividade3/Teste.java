package atividade3;

public class Teste {
    int b = 1;
    int a;
    
    Teste(int a) {
        a = b + a;
        System.out.print(this.a);
    }
    public static void main(String args[]) {
        Teste t = new Teste(2);
    }
}


/*
O parametro 'a' é diferente do atribuito. Para que fosse considerado o atribuito,
era necessário usar this.a;
*/
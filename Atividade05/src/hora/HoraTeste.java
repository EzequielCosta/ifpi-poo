package hora;

import java.util.Scanner;


public class HoraTeste {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a hora: ");
        int hora = sc.nextInt();
        System.out.print("Digite o minuto: ");
        int minuto = sc.nextInt();
        System.out.print("Digite o segundo: ");
        int segundo = sc.nextInt();
        
        Hora time = new Hora(hora, minuto, segundo);
        System.out.println(time.horaFormatada());
    }
    
}

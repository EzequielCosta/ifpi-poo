
package hora;


public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    public String horaFormatada(){
        String formatada = (this.getHora() < 10 ? "0" + this.getHora() : this.getHora()+"") + ":";
        formatada += (this.getMinuto()< 10 ? "0" + this.getMinuto(): this.getMinuto()+"") + ":";
        formatada += (this.getSegundo()< 10 ? "0" + this.getSegundo(): this.getSegundo()+"") ;
        return formatada;
        
    }
}

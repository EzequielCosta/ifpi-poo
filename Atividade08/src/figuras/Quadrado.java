
package figuras;


public class Quadrado extends FiguraGeometrica implements IComparavel{
    
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double perimetro(){
        return (this.lado * 4);
    }
    
    @Override
    public double area(){
        return (this.lado * this.lado);
    }
    
    @Override
    public int comparar(FiguraGeometrica fg){
        int retorno = 0;
        if (this.area() < fg.area()){
            retorno = -1;
        }else if (this.area() > fg.area()){
            retorno =  1;
        }
        return retorno;
    }
    
}

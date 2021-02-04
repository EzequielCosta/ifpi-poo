
package figuras;


public class QuadradoInterface implements IFiguraGeometrica{
    
    private double lado;

    public QuadradoInterface(double lado) {
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
    
}

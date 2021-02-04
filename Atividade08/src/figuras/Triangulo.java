
package figuras;


public class Triangulo extends FiguraGeometrica implements IComparavel{
    
    private double lado1;
    private double lado2;
    private double base;
    private double altura;

    public Triangulo(double lado1, double lado2, double base, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }
    
    
    @Override
    public double perimetro(){
        return this.lado1 + this.lado2 + this.base;
    }
    
    @Override
    public double area(){
        return ((this.base * this.altura) / 2);
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

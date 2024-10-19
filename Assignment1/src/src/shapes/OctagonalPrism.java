package src.shapes;

public class OctagonalPrism extends Prism
{
    
    public OctagonalPrism(double height, double side) {
        super(height, side);
    }
    
    //formula to calculate base area (A)
    protected double base_area = 2 * (1 + Math.sqrt(2)) * side * side;
    
    @Override
    public double calcBaseArea(){
        return base_area;
    }
    
    @Override
    public double calcVolume(){
        return base_area * height;
    }
    
    @Override
    public String toString(){
        return "Octagonal Prism ";
    }
}

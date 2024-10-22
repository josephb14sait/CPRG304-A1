package src.shapes;

public class Cylinder extends Shape{
    private double radius;
    
    public Cylinder(double height, double radius){
        super(height);
        this.radius = radius;
    }
    
    @Override
    public double calcBaseArea(){
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calcVolume(){
        return Math.PI * radius * radius * height;
    }
    
    @Override
    public String toString(){
        return "Cylinder [height: " + getHeight() + "] ";
    }
}

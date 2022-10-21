public class Cylinder extends Circle {
    private double height;



    public  Cylinder(double radius){
        super(radius);
        height = 4;

    }

    public double getHeight(){
        return height;
    }


    @Override
    public double getArea(){
        return (2 * Math.PI * super.getArea()) + (2 * Math.PI * getHeight() * super.getRadius());
    }


}

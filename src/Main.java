public class Main {
    public static void main(String[] args){
        Circle c = new Circle(2);
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
        System.out.println("==============");
        System.out.println(c);
        System.out.println("==============");
        Cylinder c1 = new Cylinder(3);
        System.out.println(c1.getHeight());
        System.out.println(c1.getArea());

    }
}
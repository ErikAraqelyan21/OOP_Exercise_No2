public class Circle {
        private double radius;
        private String color;

        public Circle(double radius){
            this.radius = radius;
            color = "black";
        }

        public double getRadius(){
            return radius;
        }

        public double getArea(){
            return radius*radius*Math.PI;
        }

        public String toString(){
            return "The circle radius is: " + radius + "\n" + "color is: " + color;
        }

    }


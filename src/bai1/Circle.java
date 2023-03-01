package bai1;

public class Circle {
        private double radius = 1.0;

        public Circle() {
        }

        public Circle(double radius) {
            if(radius <= 0) {
                throw new RuntimeException("Error");
            }
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            if(radius <= 0){
                throw new RuntimeException("Error");
            }
            this.radius = radius;
        }
        public double getCircumference(){
            return 2*radius*3.14;
        }
        public double getArea(){
            return radius*radius*3.14;
        }

        @Override
        public String toString() {
            return String.format("Circle[radius=%f]", radius);
        }

}

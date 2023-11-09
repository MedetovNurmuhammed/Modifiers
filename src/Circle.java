public class Circle {
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        public static double area(double radius) {

            return Math.PI * radius * radius;
        }
        public static double circumference(double radius) {
            return Math.PI * 2 * radius;
        }



        }

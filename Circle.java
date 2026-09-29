class Circle {
    double radius;

    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println("Circle 1 Radius:" + c1.getRadius());
        System.out.println("Circle 1 Circumference:" + c1.calculateCircumference());

        Circle c2 = new Circle(7);
        System.out.println("Circle 2 Radius:" + c2.getRadius());
        System.out.println("Circle 2 Circumference:" + c2.calculateCircumference());

    }
}

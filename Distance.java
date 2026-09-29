 class Distance {
    int feet;
    int inches;

    public Distance() {
        this.feet = 0;
        this.inches = 0;
    }

    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches= inches;
    }
    public void display() {
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }

    public static void main(String[] args) {
        Distance d1 = new Distance();
        d1.display();

        Distance d2 = new Distance(5, 4);
        d2.display();
    }
}

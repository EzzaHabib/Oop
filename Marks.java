class Marks {
    int mark1;
    int mark2;
    int mark3;

    public Marks() {
        this.mark1 = 0;
        this.mark2 = 0;
        this.mark3 = 0;
    }

    public Marks(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public int calculateSum() {
        return mark1 + mark2 + mark3;
    }
    public static void main(String[] args) {
        Marks m1 = new Marks();
        System.out.println("Marks 1 Sum: " + m1.calculateSum());

        Marks m2 = new Marks(80, 75, 90);
        System.out.println("Marks 2 Sum: " + m2.calculateSum());
    }
}

class Time {
    int hour;
    int minute;
    int second;

    public Time() {
        hour = 0;
        minute = 0;
        second  = 0;
    }

    public Time(int h, int m, int s) {
        hour = h % 24;
        minute = m % 60;
        second = s % 60;
    }

    public void display() {
        System.out.println("Hour:" + hour);
        System.out.println("Minute:" + minute);
        System.out.println("Second:" + second);
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        t1.display();

        Time t2 = new Time(10, 45, 30);
        t2.display();

        Time t3 = new Time(25, 61, 70);
        t3.display();
    }
}

public class Time_teste {
    public static void main(String [] args){
        Time t = new Time();
        Time t1 = new Time(1);
        Time t2 = new Time(1, 60);
        Time t3 = new Time(1,60,3600);
        Time t4 = new Time(t3);

        t.printT();
        t1.printT();
        t2.printT();
        t3.printT();
        t4.printT();

        t.addTime(3600);
        t.printT();

        t1.addTime(60,3600);
        t2.printT();

        t2.addTime(1,60,3600);
        t2.printT();

        t3.addTime(t);
        t3.printT();
    }
}

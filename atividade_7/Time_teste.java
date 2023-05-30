public class Time_teste {
    public static void main(String [] args){
        Time t1 = new Time(42000);
        Time t2 = new Time(41000);
        Time t3 = new Time(50000);

        t1.printT();

        System.out.println(t1.isAm(t1));
        System.out.println(Time.isPm(t1));

        int cron = t1.cron(t2);
        System.out.println(cron);
        cron = t1.cron(t2);
        System.out.println(cron);

        t1.addSeconds(2000);
        t1.printT();

        t1.addSeconds(t1.get_value());
        t1.printT();

        Time t4 = Time.diffTime(t1,t2);
        t4.printT();

        


    }
}

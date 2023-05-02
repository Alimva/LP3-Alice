public class Time_teste {
    public static void main(String [] args){
        Time t = new Time(42000);
        Time t1 = new Time(41000);
        Time t2 = new Time(50000);

        t.printT();

        System.out.println(t.isAm());
        
        int cron = t.cron(t1);
        System.out.println(cron);
        cron = t.cron(t2);
        System.out.println(cron);

        t.addSeconds(2000);
        t.printT();

        t.addSeconds(t1.get_value());
        t.printT();
    }
}

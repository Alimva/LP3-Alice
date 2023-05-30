public class Time{
    private int value;

    Time(int value){
        this.value = (validateTime(value)) ?  value : 0;
    }

    private boolean validateTime(int timeValue){
        return ((timeValue>0) && (timeValue<86401));//SegundosEmUmDia = 24*60*60 = 86400 
    }

    private String SecondsToTime(){
        String result = "";
        int hora;
        int min;
        int sec;

        hora = value/3600;
        min = (value % 3600)/60;
        sec = (value % 3600)%60;

        result = Integer.toString(hora) + ":"
               + Integer.toString(min) + ":"
               + Integer.toString(sec);

        return result;
    }

    public String getTime(){
        String res = SecondsToTime();
        return res;
    }

    public int get_value(){
        return value;
    }

    public void printT() {
        System.out. println(getTime());
    }

    public int cron(Time h) {
        int t = h.value;

        if(t < value){
            t += 86400;
        }
        return t - value;
    }

    public void addSeconds(int s) {
        int h = s + value;

        if(h > 86400){
            h -= 86400;
        }
        value = h;
    }

    public static Time diffTime(Time t1, Time t2){
        if(t1.value > t2.value){
            Time t3 = new Time(t1.value - t2.value);
            return t3;
        }
        else{
            Time t3 = new Time(t2.value - t1.value);
            return t3;
        }
    }

    public static boolean isAm (Time t) {
        if((t.value >= 0) && (t.value <= 43201)){
            return true;
        }
        return false;
    }

    public static boolean isPm (Time t) {
        if(t.value >= 43201 && t.value <= 86400){
            return true;
        }
        return false;
    }

}

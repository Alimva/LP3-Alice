public class Time{
    private int value;

    public Time(int value){
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

    public int get_value(){
        return value;
    }

    public String getTime(){
        String res = SecondsToTime();
        return res;
    }

    public void printT() {
        System.out. println(getTime());
    }

    public boolean isAm () {
        if(value > 0 && value < 43201){
            return true;
        }
        return false;
    }

    public int cron(Time h) {
        int t = h.get_value();

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

}

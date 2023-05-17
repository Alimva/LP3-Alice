public class Time{
    private int value;

    Time(){
        this.value =  0;
    }

    Time (int h){
        int i = h*3600;
        this.value = validateTime(i) ? i : 0;
    }

    Time (int h, int m){
        int i = (h*3600)+(m*60);
        this.value = validateTime(i) ? i : 0; 
    }

    Time(int h, int m, int s){
        int i = (h*3600)+(m*60)+s;
        this.value = validateTime(i) ? i : 0; 
    }

    Time(Time t){
        this.value = t.get_value();
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
    
    public void addTime(int s) {
        int H = s + value;

        if(H > 86400){
            H -= 86400;
        }
        value = H;
    }

    public void addTime(int m, int s) {
        int H = (m * 60) + s + value;

        if(H > 86400){
            H -= 86400;
        }
        value = H;
    }

    public void addTime(int h, int m, int s) {
        int H = (h * 3600) + (m * 60)+ s + value;

        if(H > 86400){
            H -= 86400;
        }
        value = H;
    }

    public void addTime(Time t) {
        int H = t.get_value() + value;

        if(H > 86400){
            H -= 86400;
        }
        value = H;
    }

}

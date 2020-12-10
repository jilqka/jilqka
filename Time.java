public class Time {
     private int hour;
     private int minute;
     private int second;
   public Time(){
       System.currentTimeMillis();
   }
   public Time(long currentmilisecons){
       setTime(currentmilisecons);
   }
    public Time(int randomHour,int randomMinute,int randomSecond){
        this.hour=randomHour;
        this.minute=randomMinute;
        this.second=randomSecond;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public void setTime(long miliseconds){
    long milisecondsToday=miliseconds % (1000L*60*60*24);
     this.hour=(int) milisecondsToday/(1000*60*60);
     this.minute=(int) milisecondsToday%(1000*60*60)/(1000*60);
     this.second=(int) milisecondsToday%(1000*60*60)%(1000*60)/1000;
    }
    public String string(){
       return " Hour "+hour+" minute "+minute+" second "+second;
    }




}

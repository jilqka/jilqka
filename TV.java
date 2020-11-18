public class TV {
    public int channel;
    public int volume;
    public boolean condition;

    public TV(){
        channel=72;
        volume=7;
        condition=false;
    }

    public void switchedON(){
        condition=true;
    }
    public void switchedOFF(){
        condition=false;
    }

    public void setChannel(int newChannel){
        if (newChannel>120||newChannel<1||!condition){
            return;
        }
        channel=newChannel;
    }

    public void setVolume(int newVolume){
        if (newVolume<1||newVolume>7||!condition){
            return;
        }
        volume=newVolume;
    }
    public void channelUp(){
        if (channel==120||!condition){
            return;
        }
        channel++;
    }
    public void channelDown(){
        if (channel==1||!condition){
            return;
        }
        channel--;
    }
    public void volumeUp(){
        if (volume==7||!condition){
            return;
        }
        volume++;
    }
    public void volumeDown(){
        if (volume==1||!condition){
            return;
        }
        volume--;
    }


}

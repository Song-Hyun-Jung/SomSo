package ddwucom.mobile.somso;

public class Attend {
    int level;
    int stamp;

    public Attend() {}

    public Attend(int level, int stamp){
        this.level = level;
        this.stamp = stamp;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public int getLevel(){
        return level;
    }

    public void setStamp(int stamp){
        this.stamp = stamp;
    }
    public int getStamp(){
        return stamp;
    }
}

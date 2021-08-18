package ddwucom.mobile.somso;

public class Dialogue {
    long _id;
    String question1;
    String question2;
    String question3;
    String question4;
    String question5;
    String question6;
    int check;


    public Dialogue(long _id, String question1, String question2, String question3, String question4, String question5, String question6){
        this._id = _id;
        this.question1 = question1;
        this.question2 = question2;
        this.question3 = question3;
        this.question4 = question4;
        this.question5 = question5;
        this.question6 = question6;
    }

    public Dialogue(long _id, String question1, String question2, String question3, String question4, String question5, String question6, int check){
        this._id = _id;
        this.question1 = question1;
        this.question2 = question2;
        this.question3 = question3;
        this.question4 = question4;
        this.question5 = question5;
        this.question6 = question6;
        this.check = check;
    }


    public long get_id() { return _id; }
    public void set_id(long _id) { this._id = _id; }

    public String getQuestion1() { return question1; }
    public void setQuestion1(String question1) { this.question1 = question1; }

    public String getQuestion2() { return question2; }
    public void setQuestion2(String question2) { this.question2 = question2; }

    public String getQuestion3() { return question3; }
    public void setQuestion3(String question3) { this.question3 = question3; }

    public String getQuestion4() { return question4; }
    public void setQuestion4(String question4) { this.question4 = question4; }

    public String getQuestion5() { return question5; }
    public void setQuestion5(String question5) { this.question5 = question5; }

    public String getQuestion6() { return question6; }
    public void setQuestion6(String question1) { this.question6 = question6; }

    public int getCheck() { return check; }
    public void setCheck(int check) { this.check = check; }
}

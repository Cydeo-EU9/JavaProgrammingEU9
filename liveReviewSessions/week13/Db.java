package week13;

public class Db {
    private String data;
    private int yInt;

    public Db(String data,int yInt) {
        setData(data);
        setyInt(yInt);
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setyInt(int yInt) {
        this.yInt = yInt;
    }


}

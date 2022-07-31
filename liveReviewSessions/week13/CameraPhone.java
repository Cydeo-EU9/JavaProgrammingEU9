package week13;

public class CameraPhone extends Phone{

    int iSize;   // mageByte
    int memorySize; // gigaBytes

    public CameraPhone(String make, String model, double price, int iSize, int memorySize) {
       // super(); this statement redundant
        super(make,model,price);
        this.iSize = iSize;
        this.memorySize = memorySize;
    }

    public CameraPhone(){
      //  super();
    }


    public int numPictures(){
        return  memorySize*1000/iSize;
    }
}

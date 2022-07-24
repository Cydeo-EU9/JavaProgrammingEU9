package week10and11;

public class TV {
    // attributes
    public int channel;   // default value to 1   --- > Instance variables belong to OBJECTS
    public int volumeLevel; // default value to 1
    public boolean on; // default value is OFF

   public TV(){
       channel = 1;
       volumeLevel = 1;
       on= false;
   }
// action
   public void turnOn(){
       on = true;
   }

   public void anotherMethod(){

   }

}

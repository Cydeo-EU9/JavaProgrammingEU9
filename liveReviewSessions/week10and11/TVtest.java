package week10and11;

public class TVtest {
    public static void main(String[] args) {
        
        // create object or instance of TV class
        
        TV samsung = new TV();

        System.out.println("samsung.volumeLevel = " + samsung.volumeLevel);

        samsung.volumeLevel = 6;
        System.out.println("samsung.volumeLevel = " + samsung.volumeLevel);

        
        TV sony = new TV(); // creating a new object from TV class

        System.out.println("sony.volumeLevel = " + sony.volumeLevel); // 1

        System.out.println("sony.on = " + sony.on);
        sony.turnOn();
        System.out.println("sony.on = " + sony.on);
        
        
        
        
        
    }
}

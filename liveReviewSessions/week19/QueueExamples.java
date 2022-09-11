package week19;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QueueExamples {                  // F I F O
    public static void main(String[] args) {

        Queue<String> cities = new ArrayDeque<>();
        cities.addAll(Arrays.asList("Edirne","Ankara","Izmir","Kayseri","Tirana","Chisinau","Oslo"));

        while (cities.size()>0){
            System.out.println(cities.poll());
        }

        System.out.println("cities = " + cities);


    }
}

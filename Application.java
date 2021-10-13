package Lesson9.BusFactory;

import java.util.Random;

public class Application {
    public static void main (String...args){
        int start =1 ;
        int end =60;
        for(int i=0 ; i < 15 ; i++)
        //System.out.println(BusFactory.getBus((int) (start + Math.random()*end)));
        System.out.println(BusFactory.getPercentageBus((int) (start + Math.random()*end)));



    }
}

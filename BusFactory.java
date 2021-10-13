package Lesson9.BusFactory;

import java.util.Random;

public class BusFactory {

    public static BaseBus getBus(int passengerCapacity){
        if (passengerCapacity >0 && passengerCapacity <=15)return new SmallBus(passengerCapacity);
        if (passengerCapacity >=15 && passengerCapacity <= 25)return new MediumBus(passengerCapacity);
        if (passengerCapacity >=26 && passengerCapacity <=60)return new BigBus(passengerCapacity);
        throw new IllegalArgumentException("wrong passenger size ");

    }


    public static BaseBus getPercentageBus(int passengerCapacity){
        int randomNum = new Random().nextInt(101);
        if (randomNum >=0 && randomNum <=20)return new SmallBus(passengerCapacity);
        if (randomNum >=21 && randomNum <=60)return new MediumBus(passengerCapacity);
        if (randomNum >=61 && randomNum <= 100)return new BigBus(passengerCapacity);
        throw new IllegalArgumentException("unexpected random  value " + randomNum);


    }
}

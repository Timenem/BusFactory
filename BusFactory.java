package Lesson9.BusFactory;

import java.util.Random;

public class BusFactory {

    public static BaseBus getBus(int passengerCapacity){
        if (passengerCapacity >0 && passengerCapacity <=15)return new SmallBus(passengerCapacity);
        if (passengerCapacity >=15 && passengerCapacity <= 25)return new MediumBus(passengerCapacity);
        if (passengerCapacity >=26 && passengerCapacity <=60)return new BigBus(passengerCapacity);
        throw new IllegalArgumentException("wrong passenger size ");

    }
}

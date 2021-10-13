package Lesson9.BusFactory;

public class MediumBus extends BaseBus{


    public MediumBus(int passengerCapacity) {
        super(passengerCapacity);
    }
    @Override
    public String toString(){
        return String.format("you choice Medium Bus for %s  peoples ",passengerCapacity);
    }
}

package Lesson9.BusFactory;

public class SmallBus extends BaseBus{


    public SmallBus(int passengerCapacity) {
        super(passengerCapacity);
    }

    @Override
    public String toString(){
        return String.format("you choice Small Bus for %s peoples ",passengerCapacity);
    }
}

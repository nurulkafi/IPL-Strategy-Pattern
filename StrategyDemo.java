public class StrategyDemo{
    public static void main(String[] args){
        System.out.println("Car 1 : ");
        car honda = new car();
        honda.Starter(new StaterNormal());
        honda.Move(new ImpMove());
        honda.Turn(new TurnLeft());
        honda.Move(new Brake());
        honda.Turn(new TurnRight());

        System.out.println("Car 2 : ");
        car angkot = new car();
        angkot.Starter(new StaterWithNitro());
        honda.Move(new ImpMove());
        honda.Turn(new TurnLeft());
        honda.Turn(new TurnRight());
        honda.Move(new Brake());
    }
}
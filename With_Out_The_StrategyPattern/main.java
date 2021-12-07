public class main {
    public static void main(String[] args){
        System.out.println("Car 1 : ");
        car honda = new car();
        honda.Stater("normalstater");
        honda.Move("ImpMove");
        honda.Turn("Left");
        honda.Move("Brake");
        honda.Turn("Right");

        System.out.println("Car 2 : ");
        car angkot = new car();
        angkot.Stater("staterwithnitro");
        angkot.Move("ImpMove");
        angkot.Turn("Left");
        angkot.Turn("Right");
        angkot.Move("Brake");
    }
}
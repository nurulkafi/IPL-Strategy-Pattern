public class car{
	public void Stater(String mode){
		if(mode.equals("normalstater")){
			System.out.println("Start The Car");
		}
		if(mode.equals("staterwithnitro")){
			System.out.println("Start The Car With Nitro");
		}
	}
	public void Move(String mode){
		if(mode.equals("ImpMove")){
			System.out.println("Moving The Car");
		}
		if(mode.equals("Brake")){
			System.out.println("Brake The Car");
		}
	}
    public void Turn(String mode){
        if(mode.equals("Left")){
			System.out.println("Turn Left");
		}
		if(mode.equals("Right")){
			System.out.println("Turn Right");
		}
    }
}
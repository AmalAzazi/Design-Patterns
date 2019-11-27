public class AirCraft extends Vehicle 
{
  public AirCraft() 
  {
	  moveBev= new MoveByFlying();
      setMoveBehavior(new MoveByFlying());
  }
  public void display() {
	  System.out.print("I'm an AirCraft.");
  }
}

public class StreetRacer extends Vehicle 
{
  public StreetRacer() 
  {
	  moveBev= new MoveByDriving();
      setMoveBehavior(new MoveByDriving());
  }
  public void display() {
	  System.out.print("I'm a StreetRacer.");
  }
}

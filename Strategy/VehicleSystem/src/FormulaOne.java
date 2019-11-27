public class FormulaOne extends Vehicle 
{
  public FormulaOne() 
  {
	  moveBev= new MoveByDriving();
      setMoveBehavior(new MoveByDriving());
  }
  public void display() {
	  System.out.print("I'm a FormulaOne.");
  }
}

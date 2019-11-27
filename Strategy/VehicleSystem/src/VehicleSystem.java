
import java.util.InputMismatchException;
import java.util.Scanner;

public class VehicleSystem
{
  public static void main(String[] args) 
  {
    Vehicle streetRacer = new StreetRacer();
    streetRacer.display();
    streetRacer.performMove();
    Vehicle formulaOne = new FormulaOne();
    formulaOne.display();
    formulaOne.performMove();
    Vehicle aircraft = new AirCraft();
    aircraft.display();
    aircraft.performMove();
    
    System.out.print("\tI am arriving at the runway. ");
    aircraft.setMoveBehavior(new MoveByDriving());
    aircraft.performMove();
  }
}






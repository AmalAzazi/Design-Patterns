public abstract class Vehicle 
{
    MoveBehavior moveBev;

    public void setMoveBehavior(MoveBehavior ma) 
    {
      moveBev = ma;
    }
    public void performMove() 
    {
      moveBev.move();
    }
    public abstract void display();
}



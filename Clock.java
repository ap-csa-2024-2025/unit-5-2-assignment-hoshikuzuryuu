public class Clock
{
  public static void main(String[] args)
  {
    int time = 16; 
    System.out.println("According to your clock that reads " + time + ", the time of day is: ");
    timeOfDay(time);
  }

  public static void timeOfDay(int time)
  {
    if (time == 0 || time == 24) 
    {
      System.out.println("midnight");
    }
    if (time == 12) 
    {
      System.out.println("noon");
    }
    if (time == 18) 
    {
      System.out.println("dusk");
    }
    if (time > 0 & time < 12) 
    {
      System.out.println("morning");
    }
    if (time > 12 & time < 18) 
    {
      System.out.println("afternoon");
    }
    if (time > 18 & time < 24) 
    {
      System.out.println("midnight");
    }
    if (time < 0 || time > 24) 
    {
      System.out.println("Error; please input a number between 0 and 24");
    }
  }

}

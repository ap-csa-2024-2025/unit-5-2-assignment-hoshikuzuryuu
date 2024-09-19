public class Coins
{
  public static void main(String[] args)
  {
    int cents = 1234; 
    System.out.println("Based on the " + cents + " cents you have, your converted money is: ");
    coinConverter(cents);
  }

  public static void coinConverter(int cents) 
  {
    int dollars = cents/100;
    int quarters = (cents - (dollars*100))/25;
    int dimes = (cents - ((dollars*100) + (quarters*25)))/10;
    int nickels = (cents - ((dollars*100) + (quarters*25) + (dimes*10)))/5;
    int pennies = (cents - ((dollars*100) + (quarters*25) + (dimes*10) + (nickels*5)));
    System.out.println("Dollar Bills: " + (dollars));
    System.out.println("Quarters: " + quarters);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickels: " + nickels);
    System.out.println("Pennies: " + pennies);
  }
}

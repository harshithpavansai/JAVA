public class File7 
{
  private static int lcm(int a, int b)
  {
    int multiple = 1;
    for (int i = 1; i <= b; i++)
    {
      multiple = a * i;
      if (multiple % b == 0)
      {
        break;
      }
    }
    return multiple;
  }
  public static void getLCM(int ... numbers) 
  {
    if (numbers.length == 0) System.out.println(0);
    else
    {
      int l = numbers[0];
      for (int i: numbers)
      {
        l = lcm(l, i);
      }
      System.out.println(l);
    }
  }
  public static boolean isPrime(int number)
  {
    if (number < 2) return false;
    for (int i = 2; i * i <= number; i++)
    {
      if (number % 2 == 0)
      {
        return false;
      }
    }
    return true;
  }
  public static void primesInRange(int start, int stop)
  {
    for (int i = start; i <= stop; i++)
    {
      if (isPrime(i))
      {
        System.out.print(i + " ");
      }
    }
  }
  public static void main(String[] args) 
  {
    System.out.println(lcm(12, 18)); 
    getLCM(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println(isPrime(101));
    primesInRange(100, 200);
  }  
}

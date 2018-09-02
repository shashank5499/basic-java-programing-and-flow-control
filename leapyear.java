import java.util.Scanner;
public class leapyear
{
public static void main(String[] args) 
{
  Scanner reader=new Scanner(System.in);
  int year=reader.nextInt();
  if (year%4==0)
  {
    if (year%100==0)
    {
      if (year%400==0)
      {
        System.out.println("leap year is -"+" "+year);
      }
    } 
}
}
}
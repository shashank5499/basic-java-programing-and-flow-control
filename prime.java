import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        int n=reader.nextInt();
        int i,count=0;
        for (i=1;i<n/2;++i)
        {
          count++;
        }
        
        if (n%i==0)
        { System.out.println("not prime number");               }
        else {
          System.out.println("it is a prime number");
        }
        }
      }
public class Main {

    public static void main(String[] args) {
        
        int number = 121;
        int a=number;
        int d,r=0;
        while (number!=0)
        {
          d=number%10;
          r=r*10+d;
          number=number/10;
        }
        if (r==a)
        {
          System.out.println("the number is pallindrome"+ r);
        }
        else {
          System.out.println("THE NUMBER NOT pallindrome"+r);
        }
    }
}
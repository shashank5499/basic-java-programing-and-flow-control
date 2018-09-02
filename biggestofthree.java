class biggestofthree{
  public static void main(String[] x) {
    int a=2,b=1,c=1;
    if (a>b&&a>c)
    {
      System.out.println("a");
    }
    else if (b>a&&b>c)
    {
      System.out.println("b");
    }
    else if (c>a&&c>b) {
      System.out.println("c");
    }
    else if (a==b&&a==c)
    System.out.println("all are equal");

  }
}
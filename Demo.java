public class Demo {
  public static void main(String[] args) {

    int a = 0;

    if (args.length == 0){
      a = 5;
    }
    if (args.length == 1){
      a = Integer.parseInt(args[0]);
    }
    printLoop(a);
  }


  public static void printLoop(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = i; j <= n; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}

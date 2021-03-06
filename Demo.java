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
    System.out.println();

    int[] one = {1};
    int[] two = {1,2};
    int[] three = {1,2,3};
    int[] four = {1,2,3,4};
    int[] five = {1,2,3,4,5};

    int[][] w = { {1,2,3}, {4,5,6}, {2} };

    System.out.println(arrToString(one));
    System.out.println(arrToString(two));
    System.out.println(arrToString(three));
    System.out.println(arrToString(four));
    System.out.println(arrToString(five));
    System.out.println();

    System.out.println(arrayDeepToString(w));
    System.out.println();

    int[][] nArr = create2DArray(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
    int[][] RNArr = create2DArrayRandomized(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
    System.out.println(arrayDeepToString(nArr));
    System.out.println();
    System.out.println(arrayDeepToString(RNArr));
  }


  public static void printLoop(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = i; j <= n; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

public static String arrToString(int[] arr){
  String newString = "{";
  if (arr.length > 0){
    for (int i = 0; i < arr.length - 1; i++){
      newString = newString + Integer.toString(arr[i]) + ", ";
    }
    newString = newString + Integer.toString(arr[arr.length - 1]);
  }
  return newString + "}";
}

public static String arrayDeepToString(int[][] arr){
  String newString = "{ \n";
  for (int i = 0; i < arr.length; i++){
    newString = newString + "{";
    for (int j = 0; j < arr[i].length; j++){
      newString = newString + arr[i][j];
      if (j != arr[i].length - 1){
        newString = newString + ", ";
      }
    }
    newString = newString + "}";
    if (i != arr.length - 1){
      newString = newString + ",\n";
    }
  }
  return newString + "\n}";
}

public static int[][] create2DArray(int rows, int cols, int maxValue){
  int nArr[][] = new int[rows][cols];
  for (int i = 0; i < nArr.length; i++){
    for (int j = 0; j < nArr[i].length; j++){
      nArr[i][j] = (int)(Math.random() * (maxValue + 1));
    }
  }
  return nArr;
}

public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){

  int nArr[][] = new int[rows][];
  for (int i = 0; i < nArr.length; i++){
    int randCols = (int)(Math.random() * (cols + 1));
    int[] colArr = new int[randCols];
    nArr[i] = colArr;
    for (int j = 0; j < colArr.length; j++){
      nArr[i][j] = (int)(Math.random() * (maxValue + 1));
    }
  }
  return nArr;
}
}

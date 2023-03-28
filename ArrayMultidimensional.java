public class ArrayMultidimensional {
  public static void main(String[] args){
    // multidimensional array is an array of arrays.
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    System.out.println(myNumbers[1][2]); // 7
    myNumbers[1][2] = 9;
    System.out.println(myNumbers[1][2]); // 9 instead of 7
    // FOR
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]); // 1 2 3 4 5 6 7
      }
    }
  }
}

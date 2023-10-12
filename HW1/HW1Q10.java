public class HW1Q10 {
  public static void main(String[] args) {
    int[] A = { 0, 9, 8, 5, 2, 1 };
    mystery(A);
    printIt(A.length, A);
  }

  static void mystery(int[] A) {
    int n = A.length - 1; // n = size of list
    for (int i = 1; i <= n; ++i) { // loop through the list
      printIt(i, A);
      int j = i;
      while (j > 1) {
        if (A[j / 2] <= A[j]) // break if an element is larger than the element with half its index
          break;
        int temp = A[j]; // LINE A.
        A[j] = A[j / 2]; // LINE B. // swap the two elements
        A[j / 2] = temp; // LINE C.
        j = j / 2; // j is halved, loop continues or breaks
      }
    }
  }

  static void printIt(int i, int[] A) {
    System.out.print(i);
    System.out.print(": ");
    for (int e : A) {
      System.out.print(e);
      System.out.print(", ");
    }
    System.out.println();
  }
}

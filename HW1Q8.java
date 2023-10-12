class HW1Q8 {
  public static void main(String[] args) {
    int[] pots = { 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
    for (int i : pots) {
      System.out.println(fun(i));
      System.out.println(Math.pow(Math.log(Math.pow(i, 3)) / Math.log(2), 2));
    }
  }

  static int fun(int n) {
    int r = 0;
    for (int i = 1; i < n * n * n; i = i * 2)
      r++;
    return r * r;
  }
}

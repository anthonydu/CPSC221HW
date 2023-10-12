class HW1Q9 {
  public static void main(String[] args) {
    for (int n = 16; n < 100; n += 16) {
      System.out.println(fun(n) == (8 * n * (2 * n + 1)) / 2);
    }
  }

  static int fun(int n) {
    int r = 0;
    int q = 8 * n;
    for (int i = 0; i <= q; i = i + 4)
      for (int j = 0; j < i; j++)
        r++;
    return r;
  }
}
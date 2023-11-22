#include <iostream>
#include <vector>

using namespace std;

void swap(int& a, int& b) {
  int c = a;
  a = b;
  b = c;
}

int partition(vector<int>& x, int lo, int hi) {
  int p = lo + 1;
  for (int i = lo + 1; i <= hi; i++)
    if (x[i] < x[lo]) {
      swap(x[p], x[i]);
      for (int n : x) {
        cout << n << " ";
      }
      cout << "swap: " << p << " " << i << endl;
      ++p;
    }
  swap(x[lo], x[p - 1]);
  return p - 1;
}

int nSorts = 0;

void qsort(vector<int>& x, int lo, int hi) {
  nSorts += 1;
  if (lo < hi) {
    int pivot = partition(x, lo, hi);
    qsort(x, lo, pivot - 1);
    qsort(x, pivot + 1, hi);
  }
}

int main() {
  vector<int> v;

  v.push_back(14);
  v.push_back(29);
  v.push_back(31);
  v.push_back(80);
  v.push_back(92);
  v.push_back(99);
  v.push_back(97);

  for (int n : v) {
    cout << n << " ";
  }
  cout << endl;

  qsort(v, 0, v.size() - 1);

  for (int n : v) {
    cout << n << " ";
  }
  cout << endl << nSorts << endl;
}
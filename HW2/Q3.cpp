#include <iostream>
#include <vector>

using namespace std;

int getSum(const vector<double>& R, int a, int b) {
  if (a == b)
    return R[a];  // return a if the range spans one day
  else
    return R[b] + getSum(R, a, b - 1);  // the last day + the rest
}

int main(void) {
  vector<double> R;
  // initialize R to contain n daily step counts
  vector<vector<double>> S;
  for (int b = 0; b < R.size(); b++) {
    vector<double> temp;
    for (int a = 0; a <= b; a++)
      // get an array of the sums of the first 1...b days
      temp.push_back(getSum(R, a, b));
    S.push_back(temp);  // store the array in S
  }
  return 0;
}
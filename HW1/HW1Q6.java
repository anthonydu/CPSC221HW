class HW1Q6 {
	void csort(int[] A) {
		int n = A.length;

		int[] H = new int[11]; // valid indices from 0 to 10

		for (int j = 0; j < n; j++) { // loop over each element in A
			H[A[j]] += 1; // H as a frequency array
		}

		int a = 0; // the index of the first unsorted element
		for (int h = 0; h <= 10; h++) { // loop over each grade
			int c = H[h]; // c as the value stored in each index of the frequency array
			for (int k = 0; k < c; k++) { // loop c times
				A[a + k] = h; // overwriting the first k unsorted elements
			}
			a += c; // the index of the first unsorted element is moved by c
		}
	}
}
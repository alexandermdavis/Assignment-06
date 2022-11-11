import java.util.Arrays;

class Question1 {
	
	public static void main(String args[]) {
		int[] myArray = {81, 9, -1, 196, 52, 19, 59, -20};

		Main driver = new Main();
		driver.mergeSort(myArray, 0, myArray.length - 1);

		System.out.println("New Array:");
		System.out.println(Arrays.toString(myArray));
	}

	void merge(int array[], int a, int b, int c) {
		int size1 = b - a + 1;
		int size2 = c - b;

		int temp1[] = new int[size1];
		int temp2[] = new int[size2];

		for (int i = 0; i < size1; i++)
			temp1[i] = array[a + i];
		for (int j = 0; j < size2; j++)
			temp2[j] = array[b + 1 + j];

		int d = 0;
		int e = 0;
		int f = a;

		while (d < size1 && e < size2) {
			if (temp1[d] <= temp2[e]) {
				array[f] = temp1[d];
				d++;
			} else {
				array[f] = temp2[e];
				e++;
			}
			f++;
		}

		while (d < size1) {
			array[f] = temp1[d];
			d++;
			f++;
		}

		while (e < size2) {
			array[f] = temp2[e];
			e++;
			f++;
		}
	}

	void mergeSort(int array[], int L, int R) {
		if (L < R) {
			int mid = (L + R) / 2;
			mergeSort(array, L, mid);
			mergeSort(array, mid + 1, R);
			merge(array, L, mid, R);
		}
    
	}
  
}
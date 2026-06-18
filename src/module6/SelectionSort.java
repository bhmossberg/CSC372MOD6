package module6;

import java.util.Comparator;
import java.util.List;

public class SelectionSort {

    /**
     * Sorts the given list using Selection Sort and the provided comparator.
     */
	public static void sort(List<Student> list, Comparator<Student> comparator) {
        int n = list.size();

        // Outer loop controls boundary of unsorted region
        for (int i = 0; i < n - 1; i++) {
            // Inner loop finds the minimum element in the unsorted region
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // Use the comparator to decide order
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of unsorted region
            if (minIndex != i) {
                Student temp = list.get(minIndex);
                list.set(minIndex, list.get(i));
                list.set(i, temp);
            }
        }
    }
}
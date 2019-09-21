/**
 * Created by Ankit Anchan on 21/09/19.
 */
public class HeapSort {

    private int [] elements;
    private int length;
    private IHeap heap;

    HeapSort (int [] elements, int length, String sortType) {
        this.elements = elements;
        this.length = length;
        if ("DESC".equalsIgnoreCase(sortType)) {
            this.heap = new MaxHeap(length);
        } else {
            this.heap = new MinHeap(length);
        }
    }

    int [] sort () {
        int [] sortedElements = new int [length];
        for (int i = 0; i < length; i++) {
            heap.add(elements[i]);
        }
        for (int i = 0; i < length; i++) {
            sortedElements[i] = heap.delete();
        }
        return sortedElements;
    }
}

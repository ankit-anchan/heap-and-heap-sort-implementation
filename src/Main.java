/**
 * Created by Ankit Anchan on 14/09/19.
 */
public class Main {

    public static void main(String args[]) {
        int [] elements = new int [] {20,25,90,10,50};
        int length = elements.length;
        int [] sortedElements;
        HeapSort ascSort = new HeapSort(elements, length, "ASC");
        sortedElements = ascSort.sort();
        for (int i = 0; i < length; i++ ) {
            System.out.println(sortedElements[i]);
        }
        System.out.println("------------");
        HeapSort descSort = new HeapSort(elements, length, "DESC");
        sortedElements = descSort.sort();
        for (int i = 0; i < length; i++ ) {
            System.out.println(sortedElements[i]);
        }
    }
}

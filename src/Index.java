/**
 * Created by Ankit Anchan on 21/09/19.
 */
public class Index {

    public static void main(String args[]) {
        int [] elements = new int [] {20,25,90,10,50};
        int length = elements.length;
        int [] sortedElements;
        HeapSortImpl ascSort = new HeapSortImpl(elements, length, "ASC");
        sortedElements = ascSort.sort();
        for (int i = 0; i < length; i++ ) {
            System.out.println(sortedElements[i]);
        }
        System.out.println("------------");
        HeapSortImpl descSort = new HeapSortImpl(elements, length, "DESC");
        sortedElements = descSort.sort();
        for (int i = 0; i < length; i++ ) {
            System.out.println(sortedElements[i]);
        }
    }
}

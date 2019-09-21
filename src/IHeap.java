/**
 * Created by Ankit Anchan on 21/09/19.
 */
public interface IHeap {
    void add(int element);
    int delete();
    void balanceHeapAfterAdd(int lastAddedElementIndex);
    void balanceHeapAfterDelete(int deletedElementIndex);
    void display();
}

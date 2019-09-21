/**
 * Created by Ankit on 21/09/19.
 */
public abstract class Heap implements IHeap {
    int[] elements;
    int elementLength;

    Heap (int length) {
        elementLength = 0;
        elements = new int[length];
    }

    @Override
    public void add(int element) {

    }

    @Override
    public int delete() {
        return -1;
    }

    @Override
    public void balanceHeapAfterAdd(int lastAddedElementIndex) {

    }

    @Override
    public void balanceHeapAfterDelete(int deletedElementIndex) {

    }

    @Override
    public void display() {
        for (int i = 0; i < elementLength; i++) {
            System.out.println(elements[i]);
        }
    }

    void swap (int childIndex, int parentIndex) {
        int temp = elements[childIndex];
        elements[childIndex] = elements[parentIndex];
        elements[parentIndex] = temp;
    }

    boolean leftChildExists(int parentIndex) {
        return (getLeftChild(parentIndex) < elementLength);
    }

    boolean rightChildExists(int parentIndex) {
        return (getRightChild(parentIndex) < elementLength);
    }

    int getParentIndex(int childIndex) {
        return (int) Math.floor((childIndex - 1)/ 2);
    }

    int getLeftChild(int parentIndex) {
        return (parentIndex * 2) + 1;
    }

    int getRightChild(int parentIndex) {
        return (parentIndex * 2) + 2;
    }

}

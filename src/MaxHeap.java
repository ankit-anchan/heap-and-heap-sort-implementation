/**
 * Created by Ankit Anchan on 21/09/19.
 */
public class MaxHeap extends Heap {

    MaxHeap(int length) {
        super(length);
    }

    @Override
    public void add(int element) {
        elements[elementLength++] = element;
        balanceHeapAfterAdd(elementLength - 1);
    }

    @Override
    public int delete() {
        if (elementLength < 0) {
            return -1;
        }
        int deletedData = elements[0];
        elements[0] = elements[elementLength - 1];
        elementLength--;
        if (elementLength > 0) {
            balanceHeapAfterDelete(0);
        }
        return deletedData;
    }

    @Override
    public void balanceHeapAfterAdd (int lastAddedIndex) {
        if (lastAddedIndex == 0) {
            return;
        }
        int parentIndex = getParentIndex(lastAddedIndex);
        if (elements[lastAddedIndex] > elements[parentIndex]) {
            swap(lastAddedIndex, parentIndex);
        }
        lastAddedIndex = parentIndex;
        balanceHeapAfterAdd(lastAddedIndex);
    }

    @Override
    public void balanceHeapAfterDelete (int deletedIndex) {
        // Return if we reach leaf node
        if (!leftChildExists(deletedIndex)) {
            return;
        }
        int leftChildIndex = getLeftChild(deletedIndex), rightChildIndex=0;
        if (rightChildExists(deletedIndex)) {
            rightChildIndex = getRightChild(deletedIndex);
            if ((elements[leftChildIndex] > elements[rightChildIndex]) && (elements[leftChildIndex] > elements[deletedIndex])) {
                swap(leftChildIndex, deletedIndex);
                deletedIndex = leftChildIndex;
            } else if (elements[rightChildIndex] > elements[deletedIndex]) {
                swap(rightChildIndex, deletedIndex);
                deletedIndex = rightChildIndex;
            } else {
                return;
            }
        } else if (elements[leftChildIndex] > elements[deletedIndex]) {
            swap(leftChildIndex, deletedIndex);
            deletedIndex = leftChildIndex;
        } else {
            return;
        }
        balanceHeapAfterDelete(deletedIndex);
    }
}

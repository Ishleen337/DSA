import java.util.*;
class MaxHeap {
    ArrayList<Integer> heap = new ArrayList<>();
    void insert(int value) {
        heap.add(value);
        int index = heap.size() - 1;
        heapifyUp(index);
    }

    void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index) > heap.get(parent)) {
                Collections.swap(heap, index, parent);
                index = parent;
            } else {
                break;
            }
        }
    }

    int deleteMax() {
        if (heap.isEmpty()) {
            throw new NoSuchElementException("Heap is empty!");
        }
        int max = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapifyDown(0);
        }
        return max;
    }

    void heapifyDown(int index) {
        int size = heap.size();
        while (true) {
            int largest = index;
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            if (left < size && heap.get(left) > heap.get(largest)) {
                largest = left;
            }
            if (right < size && heap.get(right) > heap.get(largest)) {
                largest = right;
            }
            if (largest == index) {
                break;
            }
            Collections.swap(heap, index, largest);
            index = largest;
        }
    }

    void display() {
        System.out.println(heap);
    }

    public static void main(String[] args) {
        MaxHeap h = new MaxHeap();
        h.insert(50);
        h.insert(30);
        h.insert(40);
        h.insert(10);
        h.insert(20);
        h.insert(60);
        System.out.println("Heap after insertion:");
        h.display();
        System.out.println("Deleted item: " + h.deleteMax());
        System.out.println("Heap after deletion:");
        h.display();
    }
}

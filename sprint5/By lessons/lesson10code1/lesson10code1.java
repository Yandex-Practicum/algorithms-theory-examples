import java.util.ArrayList;

public class HeapFunctions {
    public static void heapAdd(ArrayList<Integer> heap, int key) {
        int index = heap.size() + 1;
        heap.add(index - 1, key);
        siftUp(heap, index);
    }

    public static void siftUp(ArrayList<Integer> heap, int index) {
        if (index == 1) return;

        int parentIndex = index / 2;
        if (heap.get(parentIndex - 1) < heap.get(index - 1)) {
            int temp = heap.get(parentIndex - 1);
            heap.set(parentIndex - 1, heap.get(index - 1));
            heap.set(index - 1, temp);
            siftUp(heap, parentIndex);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> heap = new ArrayList<>();
        heapAdd(heap, 5);
        heapAdd(heap, 8);
        heapAdd(heap, 3);
        System.out.println(heap); // Output: [8, 5, 3]
    }
}

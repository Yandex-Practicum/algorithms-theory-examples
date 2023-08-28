import java.util.ArrayList;

public class HeapFunctions {
    public static int popMax(ArrayList<Integer> heap) {
        int result = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        siftDown(heap, 0);
        return result;
    }

    public static void siftDown(ArrayList<Integer> heap, int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left >= heap.size()) {
            return;
        }

        int indexLargest = left;
        if (right < heap.size() && heap.get(left) < heap.get(right)) {
            indexLargest = right;
        }

        if (heap.get(index) < heap.get(indexLargest)) {
            int temp = heap.get(index);
            heap.set(index, heap.get(indexLargest));
            heap.set(indexLargest, temp);
            siftDown(heap, indexLargest);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> heap = new ArrayList<>();
        heap.add(8);
        heap.add(5);
        heap.add(3);
        int maxValue = popMax(heap);
        System.out.println(maxValue); // Output: 8
        System.out.println(heap);     // Output: [5, 3]
    }
}

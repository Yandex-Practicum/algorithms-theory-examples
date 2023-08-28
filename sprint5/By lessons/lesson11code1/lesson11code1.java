import java.util.ArrayList;
import java.util.List;

public class HeapSort {
    public static List<Integer> heapsort(List<Integer> array) {
        // Создадим пустую бинарную кучу.
        List<Integer> heap = new ArrayList<>();

        // Вставим в неё по одному все элементы массива, сохраняя свойства кучи.
        for (Integer item : array) {
            heap_add(heap, item);   // код для heap_add можно посмотреть в прошлом уроке
        }

        // Будем извлекать из неё наиболее приоритетные элементы, удаляя их из кучи.
        List<Integer> sortedArray = new ArrayList<>();
        int i = 0;
        while (!heap.isEmpty()) {
            int max = pop_max(heap);
            sortedArray.add(max);
            i += 1;
        }
        return sortedArray;
    }
}

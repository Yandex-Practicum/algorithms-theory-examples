import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSort {
    public static List<Integer>[] partition(List<Integer> array, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> center = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (Integer x : array) {
            if (x < pivot) {
                left.add(x);
            } else if (x == pivot) {
                center.add(x);
            } else {
                right.add(x);
            }
        }
        return new List[]{left, center, right};
    }

    public static List<Integer> quicksort(List<Integer> array) {
        if (array.size() < 2) {
            return array; // массивы с 0 или 1 элементами фактически отсортированы
        } else {
            Random random = new Random();
            int pivot = array.get(random.nextInt(array.size()));
            List<Integer>[] parts = partition(array, pivot);
            return concatenate(quicksort(parts[0]), parts[1], quicksort(parts[2]));
        }
    }

    public static List<Integer> concatenate(List<Integer> a, List<Integer> b, List<Integer> c) {
        List<Integer> result = new ArrayList<>(a.size() + b.size() + c.size());
        result.addAll(a);
        result.addAll(b);
        result.addAll(c);
        return result;
    }
}

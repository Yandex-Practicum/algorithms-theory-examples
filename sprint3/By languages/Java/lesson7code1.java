import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(2);
        array.add(4);
        array.add(6);
        array.add(1);
        array.add(3);
        insertionSort(array);
    }

    public static void insertionSort(List<Integer> array) {
        for (int i = 1; i < array.size(); i++) {
            int item_to_insert = array.get(i);
            int j = i;
            while (j > 0 && item_to_insert < array.get(j - 1)) {
                array.set(j, array.get(j - 1));
                j--;
            }
            array.set(j, item_to_insert);
            System.out.printf("step %d, sorted %d elements: %s\n", i, i + 1, array.subList(0, i + 1));
        }
    }
}

#include <iostream>
#include <vector>

using namespace std;

vector<int> merge_sort(vector<int>& array) {
    if (array.size() == 1) {  // базовый случай рекурсии
        return array;
    }

    // запускаем сортировку рекурсивно на левой половине
    vector<int> left(array.begin(), array.begin() + array.size() / 2);
    left = merge_sort(left);

    // запускаем сортировку рекурсивно на правой половине
    vector<int> right(array.begin() + array.size() / 2, array.end());
    right = merge_sort(right);

    // заводим массив для результата сортировки
    vector<int> result(array.size());

    // сливаем результаты
    int l = 0, r = 0, k = 0;
    while (l < left.size() && r < right.size()) { 
    // выбираем, из какого массива забрать минимальный элемент
        if (left[l] <= right[r]) { 
            result[k] = left[l];
            l++;
        }
        else {
            result[k] = right[r];
            r++;
        }
        k++;
    }

    // Если один массив закончился раньше, чем второй, то
    // переносим оставшиеся элементы второго массива в результирующий
    while (l < left.size()) { 
        result[k] = left[l];   // перенеси оставшиеся элементы left в result
        l++;
        k++;
    }  
    while (r < right.size()) { 
        result[k] = right[r];  // перенеси оставшиеся элементы right в result
        r++;
        k++;
    }

    return result;
}

int main() {
    vector<int> arr = {5, 2, 7, 1, 8, 3};
    arr = merge_sort(arr);
    for (int i = 0; i < arr.size(); i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
    return 0;
}

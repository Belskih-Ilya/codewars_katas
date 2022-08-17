package kyu5.pick_peaks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    //В этом ката вы напишете функцию, которая возвращает позиции и значения «пиков» (или локальных максимумов)
    // числового массива.
    //
    //Например, массив arr = [0, 1, 2, 5, 1, 0] имеет пик в позиции 3 со значением 5 (поскольку arr[3] равно 5).
    //
    //Вывод будет возвращен как ``Map<String, List> с двумя парами ключ-значение: "pos" и "peaks". Если в заданном
    // массиве нет пика, просто верните {"pos" => [], "peaks" => []}`.
    //
    //Пример: pickPeaks([3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3]) должен возвращать {pos: [3, 7], Peaks: [6, 3]}
    // (или эквивалент на других языках)
    //
    //Все входные массивы будут действительными целочисленными массивами (хотя они могут быть пустыми), поэтому вам
    // не нужно будет проверять ввод.
    //
    //Первый и последний элементы массива не будут считаться пиками (в контексте математической функции мы не знаем,
    // что находится после, а что до, и, следовательно, пик это или нет).
    //
    //Также остерегайтесь плато!!! [1, 2, 2, 2, 1] имеет пик, а [1, 2, 2, 2, 3] и [1, 2, 2, 2, 2] — нет. В случае
    // плато-пика, пожалуйста, верните только положение и значение начала плато. Например: pickPeaks([1, 2, 2, 2, 1])
    // возвращает {pos: [1],peaks: [2]} (или эквивалент на других языках).

    public static void main(String[] args) {

    }

    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        Map<String, List<Integer>> resultMap = new HashMap<>();
        List<Integer> positions = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();

        for (int i = 1; i < arr.length -1; i++) {
            if (arr[i-1] < arr[i]) {
                if (arr[i+1] < arr[i]) {
                    positions.add(i);
                    peaks.add(arr[i]);
                }
                if (arr[i+1] == arr[i]) {
                    for (int j = i+2; j < arr.length; j++) {
                        if (arr[j] > arr[i]) {
                            break;
                        }
                        if (arr[j] < arr[i]) {
                            positions.add(i);
                            peaks.add(arr[i]);
                            break;
                        }
                    }
                }
            }
        }

        resultMap.put("pos", positions);
        resultMap.put("peaks", peaks);

        return resultMap;
    }
}

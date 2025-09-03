import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*
Шахматная доска N×M Ввод: N, M.
Вывести: прямоугольник из символов # и . так, чтобы клетки чередовались
как на шахматной доске (левый верхний — #).
Подсказка: печатать ((i + j) % 2 == 0 ? '#' : '.').
*/
/*
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((i + j) % 2 == 0 ? '#' : '.');
            }
            System.out.println();
        }
*/

/*
**1)** Сумма и среднее массива Ввод: `n`, затем `n` целых.
Вывести: сумму и среднее (с 2 знаками после запятой).
*/
/*
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double avr = (double) sum / n;
        System.out.println(sum);
        System.out.printf("%.2f", avr);
*/

/*
**2)** Минимум, максимум и их индексы Ввод: `n`, затем `n` целых.
Вывести: значения `min` и `max`, а также наименьшие индексы их вхождений.
*/
/*
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        int minIdx = 0;
        int maxIdx = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIdx = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxIdx = i;
            }
        }

        System.out.println("min=" + min + " index=" + minIdx);
        System.out.println("max=" + max + " index=" + maxIdx);
*/

/*
**3)** Подсчёт положительных/отрицательных/нулей Ввод: `n`, затем `n` целых.
Вывести: три числа — сколько `>0`, `<0` и `==0`.
*/
/*
        int n = sc.nextInt();
        int pos = 0;
        int neg = 0;
        int zero = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            } else {
                zero++;
            }
        }

        System.out.println("positive=" + pos);
        System.out.println("negative=" + neg);
        System.out.println("zero=" + zero);
*/

    }
}
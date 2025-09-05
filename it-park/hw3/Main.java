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

/*
8.5. Напечатать полную таблицу сложения в виде:
*/
/*
        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= 9; i++) {
                System.out.print(i + " + " + j + " = " + (i + j) + "\t");
            }
            System.out.println();
        }
*/

/*
8.6. Напечатать полную таблицу сложения в виде:
*/

/*
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " + " + j + " = " + (i + j) + "\t");
            }
            System.out.println();
        }
*/

/*
8.7. Напечатать полную таблицу умножения в виде:
*/
/*
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
*/

/*
8.8. Напечатать полную таблицу умножения в виде:
*/
/*
        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= 9; i++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
*/

/*
8.9. Оценки каждого из 18 учеников по трем предметам представлены в виде таблицы (рис. 8.1).
1) ввод/вывод оценок осуществляется по строкам;
*/
/*
        Scanner sc = new Scanner(System.in);
        int[][] grades = new int[18][3];

        System.out.println("Ввод по строкам:");
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ученик " + (i+1) + ", предмет " + (j+1) + ": ");
                grades[i][j] = sc.nextInt();
            }
        }

        System.out.println("Оценки:");
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
*/

/*
8.9. Оценки каждого из 18 учеников по трем предметам представлены в виде таблицы (рис. 8.1).
2) ввод/вывод оценок осуществляется по столбцам.
*/
/*
        Scanner sc = new Scanner(System.in);
        int[][] grades = new int[18][3];

        System.out.println("Ввод по столбцам:");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 18; i++) {
                System.out.print("Предмет " + (j+1) + ", ученик " + (i+1) + ": ");
                grades[i][j] = sc.nextInt();
            }
        }

        System.out.println("Оценки:");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 18; i++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
*/

/*
8.14. Известны оценки каждого из 15 студентов, полученные в сессию на экзаменах
по трем предметам (рис. 8.6)
*/
/*
        int[][] grades = new int[15][3];

        for (int i = 0; i < 15; i++) {
            System.out.println("Студент " + (i+1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Предмет " + (j+1) + ": ");
                grades[i][j] = sc.nextInt();
            }
        }

        // а) количество студентов, сдавших сессию без двоек;
        int withoutTwoCount = 0;
        for (int i = 0; i < 15; i++) {
            boolean flagWithTwo = false;
            for (int j = 0; j < 3; j++) {
                if (grades[i][j] == 2) {
                    flagWithTwo = true;
                    break;
                }
            }
            if (!flagWithTwo) {
                withoutTwoCount++;
            }
        }

        // б) количество предметов, по которым были получены только оценки "5" и "4";
        int subjects = 0;
        for (int j = 0; j < 3; j++) {
            boolean onlyFourAndFive = true;
            for (int i = 0; i < 15; i++) {
                if (grades[i][j] != 4 && grades[i][j] != 5) {
                    onlyFourAndFive = false;
                    break;
                }
            }
            if (onlyFourAndFive) {
                subjects++;
            }
        }

        // в) количество двоек по каждому предмету.
        int[] badSubject = new int[3];
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 15; i++) {
                if (grades[i][j] == 2) {
                    badSubject[j]++;
                }
            }
        }

        System.out.println("Студенты без двоек: " + withoutTwoCount);
        System.out.println("Предметы с 4 и 5: " + subjects);
        System.out.println("Двойки по предметам: ");
        for (int j = 0; j < 3; j++) {
            System.out.println("Предмет " + (j+1) + ": " + badSubject[j]);
        }
*/


/*
8.15. Известны баллы, полученные в соревнованиях по пятиборью каждым из
восьми спортсменов по каждому виду спорта (рис. 8.7).
*/
/*
        int[][] scores = new int[8][5];

        for (int i = 0; i < 8; i++) {
            System.out.println("Спортсмен " + (i+1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Вид спорта " + (j+1) + ": ");
                scores[i][j] = sc.nextInt();
            }
        }

        // а) максимальную из оценок в таблице;
        int maxScore = scores[0][0];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                if (scores[i][j] > maxScore) {
                    maxScore = scores[i][j];
                }
            }
        }

        // б) сколько баллов набрал победитель соревнований.
        int winnerScore = 0;
        for (int i = 0; i < 8; i++) {
            int total = 0;
            for (int j = 0; j < 5; j++) {
                total += scores[i][j];
            }
            if (total > winnerScore) {
                winnerScore = total;
            }
        }

        System.out.println("Максимальная оценка: " + maxScore);
        System.out.println("Баллы победителя: " + winnerScore);
*/



    }
}

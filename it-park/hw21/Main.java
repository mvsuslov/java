import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1) Сумма от 1 до N¶
//        Задача. Считать N (N ≥ 1) и вывести сумму 1 + 2 + … + N.

/*
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
*/

//        2) Количество цифр числа¶
//        Задача. Считать целое n (|n| > 0) и посчитать количество его цифр.

/*
        int n = Math.abs(sc.nextInt());
        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }

        System.out.println(count);
    }
*/

//        3) Сумма цифр числа¶
//        Задача. Считать n (|n| ≥ 0) и вывести сумму его цифр.

/*
        int n = Math.abs(sc.nextInt());
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println(sum);
    }
*/

//        4) Есть ли в числе цифра 7?¶
//        Задача. Считать n и вывести YES, если среди цифр есть 7, иначе NO.

/*
        int n = Math.abs(sc.nextInt());
        boolean flag = false;

        while (n > 0) {
            if (n % 10 == 7) {
                flag = true;
                break;
            }
            n /= 10;
        }

        System.out.println(flag ? "YES" : "NO");
    }
*/

//        5) Таблица умножения для числа m (1..10)¶
//        Задача. Считать m и вывести m × i для i=1..10.

/*
        int m = sc.nextInt();
        int i = 1;

        while (i <= 10) {
            System.out.println(m + " x " + i + " = " + (m * i));
            i++;
        }
    }
*/

//        6) Сумма до нуля (do…while)¶
//        Задача. Читайте целые, суммируйте, пока не встретите 0. Выведите сумму.

/*
        int sum = 0;
        int num;

        do {
            num = sc.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println(sum);
    }
*/

//        7) Наименьший делитель > 1¶
//        Задача. Считать n > 1 и вывести его наименьший делитель > 1.

/*
        int n = sc.nextInt();
        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
*/

//        8) Сколько чётных и нечётных цифр?¶
//        Задача. По числу n вывести количество чётных и нечётных его цифр.

/*
        int n = Math.abs(sc.nextInt());
        int even = 0, odd = 0;

        while (n > 0) {
            if ((n % 10) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            n /= 10;
        }

        System.out.println("even=" + even + " odd=" + odd);
    }
*/

//        9) Разворот числа¶
//        Задача. Перевернуть цифры положительного числа.

/*
        int n = sc.nextInt();
        int reverse = 0;

        while (n > 0) {
            reverse = reverse * 10 + (n % 10);
            n /= 10;
        }

        System.out.println(reverse);
    }
*/

//        10) Простое число или нет¶
//        Задача. Считать n ≥ 2 и вывести YES, если n — простое, иначе NO.

/*
        int n = sc.nextInt();
        int i = 2;
        boolean flag = true;

        while (i < n) {
            if (n % i == 0) {
                flag = false;
                break;
            }
            i++;
        }

        System.out.println(flag ? "YES" : "NO");
    }
*/

//        11) Степени двойки ≤ N¶
//        Задача. Вывести все числа 2^k, не превосходящие N.

/*
        int n = sc.nextInt();
        int result = 1;

        while (result <= n) {
            System.out.print(result + " ");
            result *= 2;
        }
    }
*/

//        12) Вывести 1..N, пропуская кратные 7¶
//        Задача. Считать N и вывести числа от 1 до N, пропуская числа, где i % 7 == 0.

/*
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {
            if (i % 7 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
*/

//        13) Часы и минуты¶
//        Задача. По числу минут M вывести часы и минуты формата H M.

/*
        int m = sc.nextInt();
        int h = m / 60;
        int result = m % 60;

        System.out.println(h + " " + result);
    }
*/

//        14) Проверка “степень двойки”¶
//        Задача. Вывести YES, если n — степень 2, иначе NO.

/*
        int n = sc.nextInt();
        System.out.println(((n > 0) && ((n & (n - 1)) == 0)) ? "YES" : "NO");
*/

//        15) НОК двух чисел через НОД¶
//        Задача. Считать a, b и вывести НОК.

/*
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 1;
        int min;
        int nod = 1;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        while (i <= min) {
            if (a % i == 0 && b % i == 0) {
                nod = i;
            }
            i++;
        }

        int nok = (a * b) / nod;
        System.out.println(nok);
    }
*/

//        16) Гармонический ряд до N¶
//        Задача. Дано N. Вычислите 1 + 1/2 + ... + 1/N (double).

/*
        int n = sc.nextInt();
        double sum = 0.0;
        int i = 1;

        while (i <= n) {
            sum += 1.0 / i;
            i++;
        }

        System.out.println(sum);
    }
*/

//        17) Деление с остатком “вычитанием”¶
//        Задача. Даны A и B>0. Посчитать, сколько раз можно вычесть B из A (частное) и остаток.

/*
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = 0;
        int r = a;

        while (r >= b) {
            r -= b;
            q++;
        }

        System.out.println("q=" + q + " r=" + r);
    }
*/

//        18) Сумма нечётных 1..N¶
//        Задача. Вывести сумму всех нечётных чисел от 1 до N.

/*
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum += i;
            i += 2;
        }

        System.out.println(sum);
    }
*/

//        19) Среднее до отрицательного (do…while)¶
//        Задача. Читайте числа, пока не встретите отрицательное.
//                Выведите среднее по введённым неотрицательным. Если ни одного — вывести 0.

/*
        int sum = 0;
        int count = 0;
        int num;

        do {
            num = sc.nextInt();
            if (num >= 0) {
                sum += num;
                count++;
            }
        } while (num >= 0);

        if (count > 0) {
            System.out.println((double)sum / count);
        } else {
            System.out.println(0.0);
        }
    }
*/

//        20) Количество нулей в числе¶
//        Задача. Подсчитать количество цифр 0 в десятичной записи числа n.

/*
        int n = Math.abs(sc.nextInt());
        int count = 0;

        if (n == 0) {
            count = 1;
        } else {
            while (n > 0) {
                if (n % 10 == 0) {
                    count++;
                }
                n /= 10;
            }
        }

        System.out.println(count);
    }
*/

}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        Время прибытия
        (Время: 1 сек. Память: 16 Мб Сложность: 15%)
        Задано время отправления поезда и время в пути до конечной станции.
        Требуется написать программу, которая найдет время прибытия
        этого поезда (возможно, в другие сутки).

                Входные данные
        Входной файл INPUT.TXT содержит две строки. В первой строке задано
        время отправления, а во второй строке – время в пути. Время отправления
        задается в формате «HH:MM», где HH время в часах, которое принимает
        значение от 00 до 23, ММ – время в минутах, которое принимает значение
        от 00 до 59. Время в пути задается двумя неотрицательными целыми числами –
        количество часов и количество минут. Числа разделяются одним пробелом.
        Количество часов не превышает 120, минут – 59.
*/
/*
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();

        String depMin = "";
        String depHour = "";
        boolean isColon = false;

        for (int i = 0; i < line1.length(); i++) {
            char curChar = line1.charAt(i);
            if (curChar == ':') {
                isColon = true;
            } else if (!isColon) {
                depHour += curChar;
            } else {
                depMin += curChar;
            }
        }

        String travelMin = "";
        String travelHour = "";
        boolean isSpace = false;

        for (int i = 0; i < line2.length(); i++) {
            char curChar = line2.charAt(i);
            if (curChar == ' ') {
                isSpace = true;
            } else if (!isSpace) {
                travelHour += curChar;
            } else {
                travelMin += curChar;
            }
        }

        if ((0 <= Integer.parseInt(depHour) && Integer.parseInt(depHour) <= 23) &&
                (0 <= Integer.parseInt(depMin) && Integer.parseInt(depMin) <= 59) &&
                (0 <= Integer.parseInt(travelHour) && Integer.parseInt(travelHour) <= 120) &&
                (0 <= Integer.parseInt(travelMin) && Integer.parseInt(travelMin) <= 59)) {

            int totalMin = Integer.parseInt(depHour) * 60 +
                    Integer.parseInt(depMin) +
                    Integer.parseInt(travelHour) * 60 +
                    Integer.parseInt(travelMin);


            int arrivMin = totalMin % 60;
            int arrivHour = (totalMin / 60) % 24;

            String strHour = (arrivHour < 10) ? "0" + arrivHour : "" + arrivHour;
            String strMin = (arrivMin < 10) ? "0" + arrivMin : "" + arrivMin;

            System.out.println(strHour + ":" + strMin);
        }

    }

}
*/


/*
Нули
        (Время: 1 сек. Память: 16 Мб Сложность: 16%)
Требуется найти самую длинную непрерывную цепочку нулей в последовательности
нулей и единиц.

Входные данные
В единственной строке входного файла INPUT.TXT записана последовательность
нулей и единиц (без пробелов). Суммарное количество цифр от 1 до 100.

Выходные данные
В единственную строку выходного файла OUTPUT.TXT нужно вывести искомую длину
цепочки нулей.
*/

/*
        int maxCount = 0;
        int count = 0;
        boolean isOne = false;

        String line1 = sc.nextLine();

        for (int i = 0; i < line1.length(); i++){
            if (line1.charAt(i) == '0') {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }

        System.out.println(maxCount);

    }
}
*/


/*
Кругляши
        (Время: 1 сек. Память: 16 Мб Сложность: 16%)
Однажды в просторах рунета появился следующий ребус:

        157892 = 3
        203516 = 2
        409578 = 4
        236271 = ?
Никто так и не смог его разгадать. Позже оказалось, что число в правом
столбце равно сумме "кругляшей", которые есть в цифрах числа, расположенного слева.
Ваша задача написать программу, которая определяет, сколько кругляшей в числе.
*/

/*
        int count = 0;

        String line1 = sc.nextLine();

        for (int i = 0; i < line1.length(); i++) {
            if (line1.charAt(i) == '0' || line1.charAt(i) == '6' || line1.charAt(i) == '9'){
                count++;
            }
            if (line1.charAt(i) == '8') {
                count += 2;
            }
        }
        System.out.println(count);
    }
}
*/

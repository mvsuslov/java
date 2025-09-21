import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        01. Знак целого¶
//        Описание: По одному целому числу определите его знак.
        int inputInt = sc.nextInt();

        if (inputInt > 0){
            System.out.println("positive");
        } else if (inputInt < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

//        02. Минимум из двух¶
//        Описание: Выведите меньшее из двух целых чисел.
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
            System.out.println(b);
        } else {
            System.out.println(a);
        }

//        03. Максимум из трёх¶
//        Описание: Найдите максимальное из трёх целых.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println(max);

//        04. Квадрат или прямоугольник¶
//        Описание: По сторонам w и h определите, квадрат это или нет.
        int w = sc.nextInt();
        int h = sc.nextInt();

        if (w == h) {
            System.out.println("square");
        } else {
            System.out.println("rectangle");
        }

//        05. Принадлежность отрезку¶
//        Описание: Проверить, лежит ли x на отрезке [l; r].
        int x = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();

        if (x >= l && x <= r) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }

//        07. Регистр буквы¶
//        Описание: Определить тип символа.
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("upper");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("lower");
        } else {
            System.out.println("not a letter");
        }

//        08. Равенство строк без учёта регистра¶
//        Описание: Сравнить две строки без учёта регистра.
        String a = sc.nextLine();
        String b = sc.nextLine();

        if (a.equalsIgnoreCase(b)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

//        09. Ближайшее целое¶
//        Описание: Округлите вещественное число до ближайшего целого.
        double x = sc.nextDouble();

        System.out.println(Math.round(x));

//        10. Площадь круга¶
//        Описание: Вычислите S = π · r².
        double R = sc.nextDouble();
        double pi = Math.PI;
        double area = pi * R * R;

        System.out.printf("%.2f", area);

//        11. Гипотенуза (Пифагор)¶
//        Описание: По катетам a и b найдите c = √(a² + b²).
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = Math.sqrt(a*a + b*b);

        System.out.printf("%.3f", c);

//        Сложные задачи¶
//        01. Классификация треугольника¶
//        Описание: По трём сторонам определить вид треугольника.
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a + b <= c) {
            System.out.println("not a triangle");
            System.exit(0);
        }

        if (a == b && b == c) {
            System.out.println("equilateral");
            System.exit(0);
        }

        boolean isIsosceles = (a == b || b == c || a == c);

        double sqrA = a * a;
        double sqrB = b * b;
        double sqrC = c * c;

        String typeTriag;
        if ((sqrA + sqrB) > sqrC) {
            typeTriag = "acute";
        } else if ((sqrA + sqrB) == sqrC) {
            typeTriag = "right";
        } else {
            typeTriag = "obtuse";
        }

        if (isIsosceles){
            System.out.println(typeTriag + " isosceles");
        } else {
            System.out.println(typeTriag);
        }

//        02. Корни квадратного / линейного уравнения¶
//        Описание: Решите a x² + b x + c = 0. a может быть 0.
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("infinite solutions");
                } else {
                    System.out.println("no solutions");
                }
            } else {
                System.out.println(-c / b);
            }
            System.exit(0);
        }

        double D = b * b - 4 * a * c;
        if (D < 0) {
            System.out.println("no real roots");
        } else if (D == 0) {
            System.out.println(-b / (2 * a));
        } else {
            double sqrtD = Math.sqrt(D);
            double x1 = (-b - sqrtD) / (2 * a);
            double x2 = (-b + sqrtD) / (2 * a);
            if (x1 < x2) {
                System.out.println(x1 + " " + x2);
            } else {
                System.out.println(x2 + " " + x1);
            }
        }

//        03. Прогрессивный тариф¶
//        Описание: Стоимость электроэнергии при потреблении kwh кВт⋅ч:
        int kwh = sc.nextInt();
        double cost = 0;

        if (kwh > 300) {
            cost += (kwh - 300) * 5;
            kwh = 300;
        }
        if (kwh > 100) {
            cost += (kwh - 100) * 3;
            kwh = 100;
        }
        cost += kwh * 2;

        System.out.printf("%.2f", cost);


//        04. Такси: день/ночь¶
//        Описание: Стоимость поездки: подача 60. Далее — тарификация за километр: day → 20, night → 30.
        double cost = 60;
        double km = sc.nextDouble();
        String t = sc.next().toLowerCase();

        if (t.equals("day")) {
            cost += km * 20;
        } else if (t.equals("night")) {
            cost += km * 30;
        } else {
            System.out.println("unknown time");
            return;
        }

        System.out.println(cost);


//        05. Индекс массы тела¶
//        Описание: BMI = m / h². Категории:
//            < 18.5 → underweight;
//            [18.5, 25) → normal;
//            [25, 30) → overweight;
//            ≥ 30 → obese.
        double m = sc.nextDouble();
        double h = sc.nextDouble();
        double bmi = m / (h * h);

        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi < 25) {
            System.out.println("normal");
        } else if (bmi < 30) {
            System.out.println("overweight");
        } else {
            System.out.println("obese");
        }


//        06. Валидатор даты (Григорианский календарь)¶
//        Описание: Проверить корректность даты.
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        if (year < 1 || year > 9999 || month < 1 || month > 12 || day < 1) {
            System.out.println("invalid");
            System.exit(0);
        }

        int maxDayOfMonth;
        if (month == 2) {
            boolean isLeapYear;
            if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                isLeapYear = true;
            } else {
                isLeapYear = false;
            }
            if (isLeapYear) {
                maxDayOfMonth = 29;
            } else {
                maxDayOfMonth = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDayOfMonth = 30;
        } else {
            maxDayOfMonth = 31;
        }

        if (day <= maxDayOfMonth) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}
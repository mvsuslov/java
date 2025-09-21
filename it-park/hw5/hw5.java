package hw5;

public class Main {
    public class Task1 {
        // Задача 1: Форматирование текста
        public static String formatText(String text) {
            return text.toUpperCase();
        }

        public static String formatText(String text, boolean toUpperCase) {
            return toUpperCase ? text.toUpperCase() : text.toLowerCase();
        }

        public static String formatText(String text, int start, int end) {
            return text.substring(start, end).toUpperCase();
        }
    }

    public class Task2 {
        // Задача 2: Проверка наличия подстроки
        public static boolean containsSubstring(String text, String substring) {
            return text.contains(substring);
        }

        public static boolean containsSubstring(String text, String substring, boolean ignoreCase) {
            return ignoreCase ? text.toLowerCase().contains(substring.toLowerCase()) : text.contains(substring);
        }

        public static boolean containsSubstring(String text, char character) {
            return text.indexOf(character) != -1;
        }
    }

    public class Task3 {
        // Задача 3: Замена символов
        public static String replaceCharacter(String text, char oldChar, char newChar) {
            return text.replace(oldChar, newChar);
        }

        public static String replaceCharacter(String text, char oldChar, String newString) {
            return text.replace(String.valueOf(oldChar), newString);
        }

        public static String replaceCharacter(String text, String oldString, String newString) {
            return text.replace(oldString, newString);
        }
    }

    public class Task4 {
        // Задача 4: Поиск слова в строке
        public static int findWord(String text, String word) {
            return text.indexOf(word);
        }

        public static int findWord(String text, String word, boolean ignoreCase) {
            if (ignoreCase) {
                return text.toLowerCase().indexOf(word.toLowerCase());
            }
            return text.indexOf(word);
        }

        public static int findWord(String text, char character) {
            return text.indexOf(character);
        }
    }

    public class Task5 {
        // Задача 5: Обрезка пробелов и перевод регистра
        public static String trimAndConvertCase(String text) {
            return text.trim().toUpperCase();
        }

        public static String trimAndConvertCase(String text, boolean toUpperCase) {
            String trimmed = text.trim();
            if (toUpperCase) {
                return trimmed.toUpperCase();
            } else {
                return trimmed.toLowerCase();
            }

        }

        public static String trimAndConvertCase(String text, boolean toUpperCase, boolean removeAllSpaces) {
            String trimmed = text.trim();
            if (removeAllSpaces) {
                trimmed = trimmed.replace(" ", "");
            }
            if (toUpperCase) {
                return trimmed.toUpperCase();
            } else {
                return trimmed.toLowerCase();
            }
        }
    }

    public class Task6 {
    // Задача 6: Конструктор текста из слов
    public static String buildText(String[] words) {
        return String.join(" ", words);
    }

    public static String buildText(String[] words, String separator) {
        return String.join(separator, words);
    }
}

    public static void main(String[] args) {


    }
}

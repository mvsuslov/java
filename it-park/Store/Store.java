package Store;

import java.util.Scanner;

enum Category {
    GAME, SUBSCRIPTION, SOFTWARE
}

class Product {
    String name;
    Category category;
    double price;
    int quantity;


    public Product(String name, Category category, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }
}

class StateSales{
    private String[] salesHistory;
    private int salesCount;

    public StateSales(int maxSales) {
        this.salesHistory = new String[maxSales];
        this.salesCount = 0;
    }

    public int getSalesCount() {
        return salesCount;
    }

    public void addProduct(String productName) {
        if (salesCount < salesHistory.length) {
            salesHistory[salesCount] = productName;
            salesCount++;
        }
    }

    public String[] getSalesHistory() {
        return salesHistory;
    }
}


public class Store {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] catalog = {
                new Product("The Witcher 3", Category.GAME, 29.99, 10),
                new Product("Spotify Premium (1 month)", Category.SUBSCRIPTION, 9.99, 100),
                new Product("Adobe Photoshop", Category.SOFTWARE, 249.99, 5),
                new Product("Minecraft", Category.GAME, 19.99, 15),
                new Product("Netflix (1 month)", Category.SUBSCRIPTION, 12.99, 50),
                new Product("Microsoft Office", Category.SOFTWARE, 149.99, 8)
        };

        Product[] basket = new Product[20];
        int basketSize = 0;

        StateSales stateSales = new StateSales(200);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n=== Online Store ===");
            System.out.println("1. Режим покупателя");
            System.out.println("2. Режим администратора");
            System.out.println("0. Выход");
            System.out.print("Выберите режим: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                basketSize = userMode(sc, catalog, basket, basketSize, stateSales);
            } else if (choice == 2) {
                adminMode(sc, catalog, stateSales);
            } else if (choice == 0) {
                isRunning = false;
                System.out.println("Выход");
            } else {
                System.out.println("Ошибка! Пожалуйста, выберите 1, 2 или 3.");
            }
        }
    }

    // РЕЖИМ ПОЛЬЗОВАТЕЛЯ
    static int userMode(Scanner scanner, Product[] catalog, Product[] basket, int basketSize, StateSales stateSales) {
        boolean isUserMode = true;
        while (isUserMode) {
            System.out.println("\n--- Режим покупателя ---");
            System.out.println("1. Просмотреть каталог");
            System.out.println("2. Добавить товар в корзину");
            System.out.println("3. Просмотреть корзину");
            System.out.println("4. Оформить заказ");
            System.out.println("0. Назад в главное меню");
            System.out.print("Выберите режим: ");

            int choice = scanner.nextInt();
            if (choice == 1) {
                viewCatalog(catalog);
            } else if (choice == 2) {
                basketSize = addToBasket(scanner, catalog, basket, basketSize);
            } else if (choice == 3) {
                viewBasket(basket, basketSize);
            } else if (choice == 4) {
                checkout(scanner, basket, basketSize, stateSales);
                basketSize = 0;
            } else if (choice == 0) {
                isUserMode = false;
            } else {
                System.out.println("Ошибка! Выберите от 0 до 4.");
            }
        }
        return basketSize;
    }

    static void viewCatalog(Product[] catalog) {
        System.out.println("\n--- Каталог товаров ---");
        String inStock = "";
        for (int i = 0; i < catalog.length; i++) {
            Product product = catalog[i];
            if (product.quantity > 0) {
                inStock =  "В наличии " + product.quantity + " шт.)";
            } else {
                inStock = "Товар закончился";
            }

            System.out.printf("%d. %s [%s] - $%.2f (%s)\n",
                    i+1, product.name, product.category, product.price, inStock);
        }
    }

    static int addToBasket(Scanner scanner, Product[] catalog, Product[] basket, int basketSize) {
        System.out.print("Введите номер товара: ");
        int productIndex = scanner.nextInt() - 1;

        if (productIndex < 0 || productIndex >= catalog.length) {
            System.out.println("Неверный номер товара");
        } else if (catalog[productIndex].quantity == 0) {
            System.out.println("Товара нет в наличии");
        } else if (basketSize >= basket.length) {
            System.out.println("Корзина переполнена. Максимум " + basket.length + " шт.");
        } else {
            basket[basketSize] = catalog[productIndex];
            basketSize++;
            catalog[productIndex].quantity--;
            System.out.println("Товар '" + catalog[productIndex].name + "' в корзине");
        }
        return basketSize;
    }

    static void viewBasket(Product[] basket, int basketSize) {
        double total = 0;
        System.out.println("\n--- Ваша корзина ---");
        if (basketSize == 0) {
            System.out.println("Корзина пуста");
        } else {
            for (int i = 0; i < basketSize; i++) {
                System.out.printf("%d. %s - $%.2f\n", i+1, basket[i].name, basket[i].price);
                total += basket[i].price;
            }
            System.out.printf("Итого: $%.2f\n", total);
            System.out.println("Товаров в корзине: " + basketSize);
        }
    }

    static void checkout(Scanner scanner, Product[] basket, int basketSize, StateSales stateSales) {
        if (basketSize == 0) {
            System.out.println("Корзина пуста!");
            return;
        }

        System.out.println("\n--- Оформление заказа ---");
        double total = 0;
        for (int i = 0; i < basketSize; i++) {
            total += basket[i].price;
        }

        System.out.printf("Сумма заказа: $%.2f\n", total);
        System.out.print("Подтвердить заказ? (1 - Да, 2 - Нет): ");
        int confirm = scanner.nextInt();

        if (confirm == 1) {
            for (int i = 0; i < basketSize; i++) {
                stateSales.addProduct(basket[i].name);
            }
            System.out.println("Заказ оформлен успешно");
        } else {
            System.out.println("Заказ отменен");
        }
    }

    // РЕЖИМ АДМИНА
    static void adminMode(Scanner scanner, Product[] catalog, StateSales stateSales) {
        System.out.print("Введите пароль: ");
        String enterPassword = scanner.next();
        if (!enterPassword.equals("qwerty")) {
            System.out.println("Неверный пароль");
            return;
        }

        boolean isAdminMode = true;
        while (isAdminMode) {
            System.out.println("\n--- Панель администратора ---");
            System.out.println("1. Просмотреть статистику продаж");
            System.out.println("2. Просмотреть текущий каталог");
            System.out.println("0. Выход");
            System.out.print("Выберите режим: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                viewSalesStatistics(catalog, stateSales);
            } else if (choice == 2) {
                viewCatalog(catalog);
            } else if (choice == 0) {
                isAdminMode = false;
                System.out.println("Выход из админа.");
            } else {
                System.out.println("Ошибка! Выберите от 0 до 2.");
            }
        }
    }

    static void viewSalesStatistics(Product[] catalog, StateSales stateSales) {
        if (stateSales.getSalesCount() == 0) {
            System.out.println("Нет продаж");
            return;
        }

        System.out.println("\n--- Статистика продаж ---");
        System.out.println("Всего продаж: " + stateSales.getSalesCount());

        String[] salesHistory = stateSales.getSalesHistory();

        for (int i = 0; i < catalog.length; i++) {
            String productName = catalog[i].name;
            int productSales = 0;

            for (int j = 0; j < stateSales.getSalesCount(); j++) {
                if (salesHistory[j].equals(productName)) {
                    productSales++;
                }
            }

            double revenue = productSales * catalog[i].price;
            System.out.printf("%s: %d продано, общая стоимость: $%.2f\n",
                    productName, productSales, revenue);
        }

        double totalRevenue = 0;
        for (int i = 0; i < catalog.length; i++) {
            int productSales = 0;
            for (int j = 0; j < stateSales.getSalesCount(); j++) {
                if (salesHistory[j].equals(catalog[i].name)) {
                    productSales++;
                }
            }
            totalRevenue += productSales * catalog[i].price;
        }
        System.out.printf("Выручка составляет: $%.2f\n", totalRevenue);
    }
}
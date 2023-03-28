package Task;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Xiaomi RedmiBook 15", "Xiaomi",
                "Windows 11 Home", false, "black",
                "Full HD (1920x1080)", 15.6, "Intel",
                2, 8, 256, 40_000));

        laptops.add(new Laptop("ASUS VivoBook PRO 15 M6500QC-HN058", "ASUS",
                "Windows 11 Home", true, "black",
                "Full HD (1920x1080)", 15.6, "AMD",
                6, 16, 512, 65_000));
        laptops.add(new Laptop("DEXP Aquilon", "DEXP", "Windows 11 Pro",
                false, "Silver", "Full HD (1920x1080)", 14.0,
                "Intel", 2, 4, 128, 15_000));
        laptops.add(new Laptop("Lenovo IdeaPad 3 15IGL05", "Lenovo", "без ОС",
                false, "Silver", "Full HD (1920x1080)", 15.6,
                "Intel", 4, 8, 256, 30_000));

        String color = inputColor();
        printSorted(filterLaptopColor(laptops, color));

        Integer sizeRAM = inputSizeRAM();
        printSorted(filterLaptopRAM(laptops, sizeRAM));

        Integer price = inpurPrice();
        printSorted(filterLaptopPrice(laptops, price));

    }

    private static List<Laptop> filterLaptopPrice(List<Laptop> laptopList, Integer price) {
        LinkedList<Laptop> newLaptopList = new LinkedList<>();
        for (Laptop item : laptopList) {
            if (item.getPrice() >= price) {
                newLaptopList.add(item);
            }
        }
        return newLaptopList;
    }

    private static List<Laptop> filterLaptopRAM(List<Laptop> laptopList, Integer sizeRAM) {
        LinkedList<Laptop> newLaptopList = new LinkedList<>();
        for (Laptop item : laptopList) {
            if (item.getRam() >= sizeRAM) {
                newLaptopList.add(item);
            }
        }
        return newLaptopList;
    }

    private static List<Laptop> filterLaptopColor(List<Laptop> laptopList, String color) {
        LinkedList<Laptop> newLaptopList = new LinkedList<>();
        for (Laptop item : laptopList) {
            if (item.equalsIgnoreCase(item.getColor(), color)) {
                newLaptopList.add(item);
            }
        }
        return newLaptopList;
    }


    private static int inputSizeRAM() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            System.out.print("Какой минимальный размер оперативной памяти нужен: ");
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Введите, пожалуйста, число! ");
        }
        return number;
    }


    private static int inpurPrice() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            System.out.print("От какой цены Вас интересует ноутбук: ");
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Введите, пожалуйста, число! ");
        }
        return number;
    }

    private static String inputColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Какого цвета ноутбук Вас интересует: ");
        return scanner.nextLine();
    }

    private static void printSorted(List<Laptop> laptopList) {
        if (laptopList.isEmpty()) {
            System.out.println("По Вашему запросу ничего не найдено!");
        }
        for (int i = 0; i < laptopList.size(); i++) {
            laptopList.get(i).printInfo();
        }
    }
}

package Task;

import lombok.Getter;

import java.util.List;
import java.util.Objects;

import static java.lang.String.format;

@Getter
public class Laptop {
    Object model;
    String brand;
    String operatingSystem;
    Boolean gamingLaptop;
    String color;
    String resolutionScreen;
    Double diagonalScreen;
    String modelProcessor;
    Integer numberCores;
    Integer ram;
    Integer totalSSD;
    Integer price;


    public Laptop(String model, String brand, String operatingSystem, Boolean gamingLaptop,
                  String color, String resolutionScreen, Double diagonalScreen, String modelProcessor,
                  Integer numberCores, Integer ram, Integer totalSSD, Integer price) {
        this.model = model;
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.gamingLaptop = gamingLaptop;
        this.color = color;
        this.resolutionScreen = resolutionScreen;
        this.diagonalScreen = diagonalScreen;
        this.modelProcessor = modelProcessor;
        this.numberCores = numberCores;
        this.ram = ram;
        this.totalSSD = totalSSD;
        this.price = price;
    }

    public Laptop(Object model) {
        this.model = model;
    }

    public Object getModel() {
        return model;
    }

    public void setModel(Object model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format ("%s - \n %s, ОС: %s, Цвет: %s, Разрешение экрана: %s, " +
                        "Диагональ экрана: %s, Процессор: %s, Количество ядер: %s, " +
                        "Объем оперативной памяти:%s, Объем памяти:%s, Цена:%s",
                model, brand, operatingSystem, color, resolutionScreen, diagonalScreen,
                modelProcessor, numberCores, ram, totalSSD, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(model, laptop.model) && Objects.equals(brand, laptop.brand)
                && Objects.equals(operatingSystem, laptop.operatingSystem)
                && Objects.equals(gamingLaptop, laptop.gamingLaptop) && Objects.equals(color, laptop.color)
                && Objects.equals(resolutionScreen, laptop.resolutionScreen)
                && Objects.equals(diagonalScreen, laptop.diagonalScreen)
                && Objects.equals(modelProcessor, laptop.modelProcessor)
                && Objects.equals(numberCores, laptop.numberCores) && Objects.equals(ram, laptop.ram)
                && Objects.equals(totalSSD, laptop.totalSSD)
                && Objects.equals(price, laptop.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, brand, operatingSystem, gamingLaptop, color, resolutionScreen,
                diagonalScreen, modelProcessor, numberCores, ram, totalSSD, price);
    }

    public void printInfo() {
        System.out.println(this);
    }
    public boolean equalsIgnoreCase(String key, String color) {
        return Objects.equals(color.toLowerCase(), key.toLowerCase());

    }

}

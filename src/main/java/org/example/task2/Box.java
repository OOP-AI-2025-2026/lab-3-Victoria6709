package org.example.task2;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        if (length <= 0) {
            this.length = 1;
            System.out.println("Неправильне значення для довжини (встановлено 1)");
        } else {
            this.length = length;
        }
    }

    private void setWidth(double width) {
        if (width <= 0) {
            this.width = 1;
            System.out.println("Неправильне значення для ширини (встановлено 1)");
        } else {
            this.width = width;
        }
    }

    private void setHeight(double height) {
        if (height <= 0) {
            this.height = 1;
            System.out.println("Неправильне значення для висоти (встановлено 1)");
        } else {
            this.height = height;
        }
    }

    public double volume() {
        return length * width * height;
    }

    public double lateralSurfaceArea() {
        return 2 * length * height + 2 * width * height;
    }

    public double surfaceArea() {
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }

    public static void main(String[] args) {
        Box box = new Box(3, -4, 5);
        System.out.println("Об'єм коробки: " + box.volume());
        System.out.println("Площа бічної поверхні: " + box.lateralSurfaceArea());
        System.out.println("Площа поверхні коробки: " + box.surfaceArea());
    }
}

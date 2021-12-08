package com.sviatukhov;
/*
1)  Автомобили. Создать класс Car в пакете vehicles , Engine в пакете details и Driver в пакете professions.
Класс Driver содержит поля - ФИО, стаж вождения.
Класс Engine содержит поля - мощность, производитель.
Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали", "Останавливаемся",
"Поворот направо" или "Поворот налево". А также метод toString(), который выводит полную информацию об автомобиле,
ее водителе и моторе.
Создать производный от Car класс - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью.
Пусть класс Driver расширяет класс Person.

2*) В класс Person вместо поля возраст добавить поле дата рождения как строка типа "18.12.1985"
- добавить метод который выводит количество полных лет на данным момент.
 */

import com.sviatukhov.details.Engine;
import com.sviatukhov.professions.Driver;
import com.sviatukhov.vehicles.Car;
import com.sviatukhov.vehicles.Lorry;
import com.sviatukhov.vehicles.SportCar;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver("Святухов Дмитрий Олегович", "08.08.1991", 5);
        Engine engine = new Engine("Toyota", 300);
        Car car = new Car("super", engine, driver, "toyota");
        Lorry lorry = new Lorry("Track", engine, driver, "Man");
        SportCar sportCar = new SportCar("Speed", engine, driver, "Mazda", 200.00);
        System.out.println("Водитель:" + driver.getFullName() + ", Возраст: " + driver.ageDriver());
        System.out.println();
        System.out.println(car);
        System.out.println(lorry);
        System.out.println(sportCar);
    }
}

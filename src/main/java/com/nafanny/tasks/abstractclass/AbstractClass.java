package com.nafanny.tasks.abstractclass;

public abstract class AbstractClass {   //При определении абстрактных классов используется ключевое слово abstract.

    private String name;                // В абстрактном классе мы можем создавать поля.

    public String getName() {           // Мы можем создать setter для поля String name.
        return name;
    }

    public void setName(String name) {  // Мы можем создать getter для поля String name
        this.name = name;
    }

    public AbstractClass(String name) { // Конструктор тоже можно создать для поля String name.
        this.name = name;
    }

    // AbstractClass abstractClass = new AbstractClass(); А вот объект абстрактного класса мы создать не можем!!!

    /**
    Также в абстрактном классе мы можем создавать как обычные методы, так и абстрактные.
     */

    public void printNewName() {        // Метод без параметров который выводит в консоль Create new name!
        System.out.println("Create new name!");
    }

    public void sayName(String name) {  // Метод с параметром String name в который мы передаём какое-то имя.
        this.name = name;
        System.out.println(name);
    }

    public abstract void abstractName();    // Абстрактный метод, как видите в нём нет {фигурных скобок} - тела метода.

    /**
        У абстрактных методов нет тела метода, то есть у методов нет никакой реализации. Производный класс обязан
    переопределить и реализовать все абстрактные методы, которые имеются в базовом абстрактном классе.
        Также следует учитывать, что если класс имеет хотя бы один абстрактный метод, то данный класс должен быть
    определен как абстрактный.
     */

}

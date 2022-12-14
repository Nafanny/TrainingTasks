package com.nafanny.tasks.reference;
/*
    При создании любого объекта в Java, всегда создаётся конструктор класса.
 */
public class TypeСonstructors {

    String str = "Hello";
    int number = 100;

    // При создании любого объекта класса, создаётся конструктор по умолчанию.
    public TypeСonstructors() {
    }

    // В конструкторе может быть один параметр, он передаётся в (круглых скобках).
    public void TypeConstructors(String str){
        this.str = str;
    }

    // В конструкторе может быть и два параметра, они могут быть разных типов.
    public void TypeConstructors(String str, int number){
        this.str = str;
        this.number = number;
    }

    /*
            Вообще в конструктор можно передать любое количество параметров, всё зависит от поставленной задачи. Если
        вам поступают данные с разными параметрами, то и количество конструкторов должно соответствовать вашим параметрам.
        Компилятор Java сам понимает к какому конструктору нужно обратиться при его вызове.
     */
}

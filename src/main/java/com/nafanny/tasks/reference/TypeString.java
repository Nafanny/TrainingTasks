package com.nafanny.tasks.reference;
/*
    Как мы уже говорили, класс String самый используемый класс в Java.
 */
public class TypeString {

    String string;      // Создаём переменную string, которая ссылается на "null" (значение по умолчанию).
    String string1 = "Hello World!";    // Создаём переменную string1, и инициализируем её значением "Hello World!".
    String string2 = new String();    // Создаём новый объект типа String, и копируем ссылку на него в переменную string2.

    // У класса String много полезных функций, одна из них это конкатенация (сложение строк).
    String s1 = "Hello";
    String s2 = "My";
    String s3 = "Friend!";

    String s4 = s1 + s2 + s3;   // Результат будет HelloMyFriend!
    String s5 = "Hello" + "My" + "Friend!"; // Результат будет HelloMyFriend!

    // Упс...... так читать текст неудобно, мы забыли поставить пробел.
    String space = " ";     // В кавычках указываем только "пробел"
    String s6 = s1 + space + s2 + space + s3;   // Результат будет Hello My Friend!
    String s7 = "Hello" + " My " + "Friends!";// Результат будет Hello My Friend!
}

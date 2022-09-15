package com.nafanny.tasks.access;

/**
 *  В Java существует 4 модификатора доступа (public, protected, default, private). Эти модификаторы указывают
 *  на область видимости объекта, метода или класса.
 */
public class AccessModifier {   // Основной класс обязательно должен быть с модификатором public.

    public int a;   // Модификатор public указывает на то что мы сделаем его доступным для всего проекта,
                    // то есть все другие классы во всех пакетах смогут его использовать.

    protected int b;
    /**
    Переменные, методы и конструкторы, которые объявляются как protected в родительском классе, могут быть доступны
    только для подклассов в другом пакете или для любого класса в пакете класса protected. Модификатор доступа protected
    в Java не может быть применен к классу и интерфейсам.
    */

    int c;
    /*
    Когда мы явно не используем какое-либо ключевое слово, Java установит доступ по умолчанию к данному классу, методу
    или свойству. Также называется package-private, что означает, что все члены видны в одном пакете,
    но недоступны из других пакетов.
    */

    private int d;
    /**
    Модификатор private может быть только у поля, метода или конструктора и доступ к ним может быть только из того же
    класса. Это самый ограничительный модификатор доступа, который лежит в основе концепции инкапсуляции.
    */

}
class InnerClass{}    // Вложенный класс не может иметь модификатор public, он имеет модификатор доступа default.

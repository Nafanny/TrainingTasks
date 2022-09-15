package com.nafanny.tasks.primitive;

public class TypeCharacter {

    // Начнём с объявления переменных и их инициализации.
    char ch;    // Объявляем переменную ch, но не инициализируем её, по умолчанию она хранит значение \u0000
    char ch1 = '\u7463';    // Символ Unicode, где 7463 цифровой код символа Unicode в шестнадцатеричной форме.
    char ch2 = '\377';  // Символ кодовой таблицы Latin-1, где xxx восьмеричный код символа Latin-1.
    char ch3 = 34512;   // Код символа Unicode в десятичном исчислении.
    char ch4 = 0x2456;  // Код символа Unicode в шестнадцатеричном формате.
}

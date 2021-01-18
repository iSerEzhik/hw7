package Strings;

import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
        giveMeString("I like Java");
        System.out.println("-------------------------------------------");
        giveMeString("I like java, but my father doesn't!!!");
    }

    public static void giveMeString(String first) {
        System.out.println("Строка: " + first);
        System.out.println("Последний символ: " + first.charAt(first.length() - 1));
        System.out.println("Заканчивается ли строка '!!!': " + first.endsWith("!!!"));
        System.out.println("Начинается ли строка с 'I like': " + first.startsWith("I like"));
        System.out.print("Содержит ли строка подстроку 'Java': ");
        if (first.indexOf("Java") != -1) {
            System.out.println(first.contains("Java"));
            System.out.println("Позиция подстроки 'Java' в строке: " + first.indexOf("Java"));
        } else {
            System.out.println("Строка не содержит подстроки 'Java'");
        }
        System.out.print("Содержит ли строка подстроку 'java': ");
        if (first.indexOf("java") != -1) {
            System.out.println(first.contains("java"));
            System.out.println("Позиция подстроки 'java' в строке: " + first.indexOf("java"));
        } else {
            System.out.println("Строка не содержит подстроки 'java'");
        }
        System.out.println("Замена всех 'a' на 'o': " + first.replace('a', 'o'));
        System.out.println("Строка в верхнем регистре: " + first.toUpperCase());
        System.out.println("Строка в нижнем регистре: " + first.toLowerCase());
        if (first.indexOf("Java") != -1) {
            System.out.println("Вырезание строки 'Java':  " + first.substring(first.indexOf("Java"), first.indexOf('a', first.indexOf("Java") + 2) + 1));
        } else {
            System.out.println("Строка не содержит подстроки 'Java'");
        }
    }

}

package com.company;

public class Strings {
    public static void main(String[] args) {
        //Сравнение строк. Последовательно убирайте комментарии.
        String s1 = "first", s2 = "second";
        System.out.println(s1.compareTo(s2));//сравнение
        System.out.println(s1.equals(s1));//равенство

        char c1 = '2', c2 = '❤'-121, c3 = '\u03C0', c4 = '=', c5 = '1',
                c6 = '8', c7 = '0', c8 = '\u00B0';
        String s4 = ""+c1+c2+c3+c4+c5+c6+c7+c8;
        System.out.println(s4);

        System.out.printf("Symbol:%c, number:%d%n", c2, (int) c2);

        StringBuilder sb = new StringBuilder(s4);
        System.out.println(sb);

        //содержит ли строка только цифры
        System.out.println(isOnlyDigits("13453"));
        String s8 = "  word   ";
        s8 = s8.trim();
        System.out.println(s8);
    }

    static boolean isOnlyDigits(String s){
        for(int i = 0; i<s.length(); i++)
            if (!Character.isDigit(s.charAt(i)))
                return false;
            return true;
    }
}

package com.company;

public class MexicanWawe {
    public static void main(String[] args) throws InterruptedException {
        String s = "ХаХаХаХаХаХаХаХа";
        while (true)
            for (int i = 0; i < s.length(); i++) {
                System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b");//хуй знает что это
                Character c = s.charAt(i);
                StringBuilder sb = new StringBuilder(s);
                Character c1 = c.toString().toUpperCase().charAt(0);//вверхний регистр
                sb.setCharAt(i, c1);
                System.out.print(sb);
                Thread.sleep(1000);
            }
    }
}

package com.company;
/*
Задано слово и набор строк.
Проверить, содержит ли этот набор все ротации данной строки.
 */
public class Rotations {
    public static void main(String[] args) {
            String word = "abc";
            String[] rots = {"abc","bca", "cab"};
            int length = word.length();
            for(int i = 0; i < length; i++){
                boolean flag = true;
                for (int j = 0; j < rots.length; i++){
                    if(word.equals(rots[i]))
                        flag = true;
                }
            }
        }
}

package com.zhenia.learning.homework1;

public class Task6 {

    public static void main(String[] args) {

        String[] array = new String[]{"l", "o", "l"};
        String resultAsk = "";
        String resultDesk = "";
        Boolean finalResult;
        for (int i = 0; i < array.length; i++) {
            resultAsk = resultAsk.concat(array[i]);// добавляет в конец строки
        }
        for (int i = array.length-1; i >= 0; i--) {
            resultDesk = resultDesk.concat(array[i]);
        }
        finalResult = resultAsk.equals(resultDesk)  ? true : false;
        System.out.println(finalResult);
    }
}

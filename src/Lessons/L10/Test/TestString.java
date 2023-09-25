package Lessons.L10.Test;

public class TestString {
    public static void main(String[] args) {
//Task1.1
        String s1="Hello";
        String s2="Java";
        String s3=s1+s2;
        String s4=s1.concat(s2).concat(s3);
        String s5=String.join(" ", s1, s2);
        System.out.println(s5);

        //TestMethods
        //String.length(), String.charAt(), String.toCharArray()
        System.out.println(s1.length());
        System.out.println(s1.charAt(4));
        System.out.println(s1.toCharArray());
        char[] toCharArrayS1 =s1.toCharArray();
        for (int i=0; i<toCharArrayS1.length; i++){
            System.out.print(toCharArrayS1[i]);
        }
        System.out.println();

        //String.valueOf(double/etc.) - используем со String

        //indexOf(), lastIndexOf() ?????
        System.out.println(s1.indexOf("l"));
        System.out.println(s1.lastIndexOf("l"));

        //String.replace("a", "b")
        String s6="Banana";
        System.out.println(s6.replace("a", "o"));

        //String.trim() - Обрезка строки(пробелы вконце и вначале)
        String s7="   Geeks 4 geeks   ";
        System.out.println(s7.trim());

        //String.toLowerCase(), String.toUpperCase();
        System.out.println(s5.toLowerCase());
        System.out.println(s5.toUpperCase());

        //String.split(" ") - Разбиение строки на подстроки
        String s8="Cat dog  bird";
        System.out.println(s8);
        String[] s8Split=s8.split(" ");
        System.out.println(s8Split[0]+s8Split[1]+s8Split[2]+s8Split[3]);

        //String.isEmpty - true\false
        String s9="";
        System.out.println(s1.isEmpty());
        System.out.println(s9.isEmpty());

        //String.substring(int начало, int конец) - Получение подстроки
        System.out.println(s5.substring(0, 4));

        //String.equals() - Проверка строк на равенство
        //String.equalsIgnoreCase() - Проверка на равенство без учёта регистра
        String s10="Something Like That";
        String s11="something like that";
        System.out.println(s10.equals(s11));
        System.out.println(s10.equalsIgnoreCase(s11));


        //String1.compareTo(String2) - Сравнение строк

        //---------- Сравнение части строки с подстрокой (Методы) --------------

        //String1.regionMatches(int1(индекс начала сравнения String1), String2, int2(индекс начала сравнения String2), int3(Длина сравниваемых частей))

        //String1.contains(String2) - Содержит ли строка другую строку (True\False)

        //String1.startsWith(String2, int(индекс начала поиска))

        //String1.endsWith(String2) - заканчивается ли другой строкой


    }
}

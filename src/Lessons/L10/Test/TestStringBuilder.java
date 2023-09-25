package Lessons.L10.Test;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("ABCDE");
        System.out.println(sb1);
        System.out.println((sb1.charAt(1)));
        sb1.setCharAt(1,'A');
        System.out.println(sb1);

        int a=42;
        String s= sb1.append(", a=").append(a).append("!").toString();
        System.out.println(s);

        sb1.insert(1, "KKKK");
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);


    }

}

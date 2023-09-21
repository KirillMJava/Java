package Lessons.L10;

public class Test {
    public static void main(String[] args) {
        String s1="s1";
        String s2=s1+"s2";
        s1=s1.join("-",s2).join("--", s2);
        s1=s1+5;
        s1=s1+'e';
        s1=s1+"     "+new Test2();
        System.out.println(s1);
        char[] charArray=s1.toCharArray();
        for (int i=0; i<s1.length(); i++){
            System.out.println(charArray[i]);
        }


    }
}

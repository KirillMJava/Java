package HW.L10;

public class HW_L10_Task5 {
    public static void main(String[] args) {

        String str1="  ABCDE ";
        String str2="";
        str1=str1.trim();
        int a=str1.length();
        System.out.println(str1);
        char[] chars=new char[a];
        for(int i=0, j=0; i<str1.length(); i++, j++)
        {
            chars[i]=str1.charAt(i);
            str2=str2+chars[i]+chars[i];
        }
        System.out.println(str2);
    }
}

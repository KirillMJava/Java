package Lessons.L14.Tasks.Task4;

public class L14_Task4 {
    public static void main(String[] args) {
        Inter_ab comparator_ab;
        comparator_ab=(a,b) -> {
            if (a<b) return a;
            else if (a>b) return b;
            else return 0;
        };

        int result= comparator_ab.comp_ab(10,20);
        System.out.println(result);

    }
}

package Lessons.L13_Collections.Generic.Robot;

public class Robot<T extends Head> {
    private Body body;
    private T head;

    public Robot(Body body, T head) {
        this.body = body;
        this.head = head;
    }

    public <T1, T2 extends Head> T2 foo(T1 a, T2 b){
        return b;
    }

    public void foo2(Robot<?> a){

    }


    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }
}

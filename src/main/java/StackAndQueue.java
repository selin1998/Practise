import java.util.*;

public class StackAndQueue {

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(12);
        s.push(24);
        s.push(36);
        s.push("lola");

        System.out.println(s);
        s.pop();
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.search(12));




    }
}

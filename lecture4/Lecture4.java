package Lectures.lecture4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * Lecture4
 */
public class Lecture4 {

    public static void main(String[] args) {
        var s = System.currentTimeMillis();

        // LinkedList<Integer> ll = new LinkedList<Integer>();

        // for (int i = 0; i < 10000000; i++) {
        //     ll.add(i);
        // }

        // PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        // pq.add(123);
        // pq.add(3);
        // pq.add(13);
        // pq.add(1);
        // System.out.println(pq);
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());

        // Deque<Integer> deque = new ArrayDeque<>();
        // Deque<Integer> deque2 = new ArrayDeque<>();
        // deque.addFirst(1);
        // deque.addLast(2);
        // deque.removeLast();
        // deque.removeLast();
        // deque.offerFirst(1);
        // deque.offerLast(2);
        // deque.pollFirst();
        // deque.pollLast();
        // deque.peekFirst();
        // deque.peekLast();
        // System.out.println(deque);

        var exp = "1 2 3 * +".split(" ");
        int res = 0;
        System.out.println(exp);

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            if (isDigit(exp[i])){
                st.push(Integer.parseInt(exp[i]));
            }
            else{
                switch (exp[i]){
                    case "+":
                            res = st.pop() + st.pop();
                            st.push(res);
                            break;
                    case "-":
                            res = st.pop() - st.pop();
                            st.push(res);
                            break;
                    case "*":
                            res = st.pop() * st.pop();
                            st.push(res);
                            break;
                    case "/":
                            res = st.pop() / st.pop();
                            st.push(res);
                            break;
                    default:
                            break;                                
                }
            }
        }
    
        System.out.printf("%d\n", st.pop());
        System.out.println(System.currentTimeMillis() - s);

    }

    private static boolean isDigit(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
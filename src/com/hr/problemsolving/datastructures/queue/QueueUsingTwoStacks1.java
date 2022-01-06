package com.hr.problemsolving.datastructures.queue;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks1 {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        Scanner sc = new Scanner(System.in);
        int query = Integer.parseInt(sc.nextLine());

        while (query > 0) {
            String[] q = sc.nextLine().split(" ");
            int queryType = Integer.parseInt(q[0]);
            if (queryType == 1) {
                queue.enqueue(Integer.parseInt(q[1]));
            } else if (queryType == 2) {
                queue.dequeue();
            } else {
                System.out.println(queue.peek());
            }
            query--;
        }
    }

    static class CustomQueue {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        public int dequeue() {
            if (stack1.isEmpty()) {
//                System.out.println("Q is Empty");
                System.exit(0);
            }

            return stack1.pop();
        }

        public void enqueue(int item) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            stack1.push(item);

            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }

        public int peek() {
            return stack1.peek();
        }
    }
}

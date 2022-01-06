package com.hr.problemsolving.datastructures.queue;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks2 {

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
            }
            query--;
        }
    }

    static class CustomQueue {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        private void push(Stack<Integer> stack1, int item) {
            stack1.push(item);
        }

        private int pop(Stack<Integer> stack1) {
            if (stack1.isEmpty()) {
                System.exit(0);
            }

            return stack1.pop();
        }

        public void enqueue(int item) {
            push(stack1, item);
        }

        public int dequeue() {
            int x;

            if (stack1.isEmpty() && stack2.isEmpty()) {
                System.exit(0);
            }

            /* Move elements from stack1 to stack 2 only if stack2 is empty */
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    x = pop(stack1);
                    push(stack2, x);
                }
            }

            x = pop(stack2);
            return x;
        }
    }
}

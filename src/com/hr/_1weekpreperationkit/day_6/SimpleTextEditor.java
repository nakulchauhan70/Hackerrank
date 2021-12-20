package com.hr._1weekpreperationkit.day_6;

import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();

        Operation operation = new Operation();
        operation.setString("");
        operation.setLastOperation(0);
        operation.setToPerformLastOperation(false);
        operation.setLastOperationData("");

        Scanner sc = new Scanner(System.in);
        int noOfOperations = Integer.parseInt(sc.nextLine());
        while (noOfOperations > 0) {
            String[] opsArr = sc.nextLine().split(" ");
            int action = Integer.parseInt(opsArr[0]);
            operation.setAction(action);

            if (opsArr.length == 2) {
                operation.setData(opsArr[1]);
            }

            simpleTextEditor(operation);

            noOfOperations--;
        }
    }

    private static void simpleTextEditor(Operation operation) {
//        System.out.println("before::" + string.toString());
        switch (operation.getAction()) {
            case 1:
                if (operation.isToPerformLastOperation() && 1 == operation.getAction()) {
                    operation.setString(operation.getString().replace(operation.getLastOperationData(), ""));
                    operation.setToPerformLastOperation(false);
                } else {
                    operation.setString(operation.getString() + operation.getData());
                    operation.setLastOperationData(operation.getData());
                }
                operation.setLastOperation(1);
                break;
            case 2:
                if (operation.isToPerformLastOperation() && 2 == operation.getAction()) {
                    operation.setString(operation.getString() + operation.getData());
                    operation.setToPerformLastOperation(false);
                } else {
                    operation.setString(operation.getString().substring(0, operation.getString().length() - Integer.parseInt(operation.getData())));
                    operation.setLastOperationData(operation.getData());
                }
                operation.setLastOperation(2);
                break;
            case 3:
                if (operation.isToPerformLastOperation() && 3 == operation.getAction()) {
                    operation.setString("");
                    operation.setToPerformLastOperation(false);
                } else {
                    System.out.println(operation.getString().charAt(Integer.parseInt(operation.getData()) - 1));
                    operation.setLastOperationData(operation.getData());
                }
                operation.setLastOperation(3);
                break;
            case 4:
                operation.setToPerformLastOperation(true);
                break;
            default:
                break;
        }
//        System.out.println("after::" + string.toString());

    }

    static class Operation {
        private String string;
        private int action;
        private int lastOperation;
        private boolean toPerformLastOperation;
        private String lastOperationData;
        private String data;

        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }

        public int getAction() {
            return action;
        }

        public void setAction(int action) {
            this.action = action;
        }

        public int getLastOperation() {
            return lastOperation;
        }

        public void setLastOperation(int lastOperation) {
            this.lastOperation = lastOperation;
        }

        public boolean isToPerformLastOperation() {
            return toPerformLastOperation;
        }

        public void setToPerformLastOperation(boolean toPerformLastOperation) {
            this.toPerformLastOperation = toPerformLastOperation;
        }

        public String getLastOperationData() {
            return lastOperationData;
        }

        public void setLastOperationData(String lastOperationData) {
            this.lastOperationData = lastOperationData;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }
}

//    public static void main(String[] args) {
//        var stack = new Stack<String>();
//        var result = "";
//        var sc = new Scanner(System.in).useDelimiter("\n");
//        int queries = sc.nextInt();
//        while (queries-- > 0) {
//            var query = sc.next().split(" ");
//            int operation = Integer.parseInt(query[0]);
//            if (operation == 1 || operation == 2) stack.push(result);
//            if (operation == 1) result = result.concat(query[1]);
//            else {
//                if (operation == 4) result = stack.pop();
//                else {
//                    int intData = Integer.parseInt(query[1]);
//                    if (operation == 2) result = result.substring(0, result.length() - intData);
//                    if (operation == 3) System.out.println(result.charAt(intData - 1));
//                }
//            }
//        }
//    }
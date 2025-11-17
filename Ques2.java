package com.esp;

public class ExceptionHandling {

    public static void checkNumber(int value) throws Exception {
        if (value < 0) {
            throw new Exception("Number cannot be negative");
        }
        System.out.println("Number passed the check");
    }

    public static void main(String[] args) {

        try {
            checkNumber(-5);
            System.out.println("This line will not run");
        }
        catch (Exception ex) {
            System.out.println("Error: invalid number received");
        }
        finally {
            System.out.println("Execution completed");
        }
    }
}

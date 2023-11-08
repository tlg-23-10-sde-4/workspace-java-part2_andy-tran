package com.javatunes.personnel;

class EmployeeClient {
    public static void main(String[] args) {
        Employee emp = new Employee();

        long begin = System.nanoTime();
        emp.work();
        emp.pay();


        long end = System.nanoTime();

        double elapsed = (end - begin) / 1000000.0;
        System.out.println(elapsed + "ms");
    }
}
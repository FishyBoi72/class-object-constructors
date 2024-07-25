package org.example;


public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Fish", 500);
        BankAccount account2 = new BankAccount("Dewey", 5000);
        BankAccount account3 = new BankAccount("Tyler", 300);

        Product product = new Product("Laptop", 999.99, 2);

        account1.deposit(100);
        account2.withdraw(100);
        account3.deposit(100);

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);

        product.printProduct();
        product.totalCost();
    }
}
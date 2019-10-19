package com.jetbrains;

public class SavingsAccount
{
    static double annualInterestRate = 0;
    private double savingsBalance = 0;

    public SavingsAccount(double savings)
    {
        this.savingsBalance = savings;
    }

    public static void rateSet(double newRate)
    {
        annualInterestRate = newRate;
    }


    public void calculateMonthlyInterest()
    {
        double monthlyInterest = (this.savingsBalance * annualInterestRate) / 12;
        this.savingsBalance = this.savingsBalance + monthlyInterest;
    }

    public static void main(String[] args)
    {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        int i = 0;

        SavingsAccount.rateSet(0.04);

        System.out.println("Balance for Saver 1.");
        for(i=0; i < 12; i++)
        {
            System.out.print("Month " + (i+1) + ": ");
            saver1.calculateMonthlyInterest();
            System.out.print("$");
            System.out.printf("%.2f",saver1.savingsBalance);
            System.out.print("\n");
        }

        System.out.println("Balance for Saver 2.");
        for(i=0; i < 12; i++)
        {
            System.out.print("Month " + (i+1) + ": ");
            saver2.calculateMonthlyInterest();
            System.out.print("$");
            System.out.printf("%.2f",saver2.savingsBalance);
            System.out.print("\n");
        }

        SavingsAccount.rateSet(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Balance for Saver 1.");
        System.out.print("$");
        System.out.printf("%.2f",saver1.savingsBalance);
        System.out.print("\n");

        System.out.println("Balance for Saver 2.");
        System.out.print("$");
        System.out.printf("%.2f",saver2.savingsBalance);
        System.out.print("\n");




    }
}

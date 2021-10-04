package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String employeeName = input.nextLine();
        System.out.print("Enter how many hours this employee has worked: ");
        int employeeHours = input.nextInt();
        System.out.print("Enter this employee's hourly wage: ");
        double hourlyWage = input.nextDouble();

        double weeklyWage;
        if(employeeHours>45){
            weeklyWage = Math.round( (hourlyWage*45 + hourlyWage*1.5*(employeeHours-45)) * 100.0) / 100.0;
        }else{
            weeklyWage = Math.round(hourlyWage*employeeHours * 100.0) / 100.0;
        }
        double wageAfterTax = Math.round(weeklyWage*0.80 * 100) / 100;

        System.out.println(employeeName + "'s weeks pay before tax is " + weeklyWage + " and after tax is " + wageAfterTax);
    }
}

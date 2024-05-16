package com.chatgpt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class M {
    public static void main(String[] args) {
        // Step 1: Create a list of employees
        List<Emp1> emp = new ArrayList<>();
        emp.add(new Emp1("AMAN", 5000));
        emp.add(new Emp1("zohan", 3000));
        emp.add(new Emp1("NABI", 1500));
        emp.add(new Emp1("Vinod", 2000));
        emp.add(new Emp1("Aditya", 1000));

        // Step 2: Find the third highest salary
        Optional<Emp1> thirdHighest = emp.stream()
                .sorted(Comparator.comparingDouble(Emp1::getSalary).reversed())
                .skip(2) // Skip first two highest salaries
                .findFirst(); // Get the third highest salary

        // Step 3: Print the result
        if (thirdHighest.isPresent()) {
            Emp1 empThirdHighest = thirdHighest.get();
            System.out.println("Name: " + empThirdHighest.getName() + ", Salary: " + empThirdHighest.getSalary());
        } else {
            System.out.println("There are less than 3 employees.");
        }
    }
}


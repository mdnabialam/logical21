package com.chatgpt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Emp {
    private String name;
    private int salary;

    public Emp(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Emp> emp = new ArrayList<>();
        emp.add(new Emp("AMAN", 5000));
        emp.add(new Emp("zohan", 3000));
        emp.add(new Emp("NABI", 1500));
        emp.add(new Emp("Vinod", 2000));
        emp.add(new Emp("Aditya", 1000));

        Optional<Emp> thirdHighest = emp.stream()
                .sorted(Comparator.comparingInt(Emp::getSalary).reversed())
                .skip(2) // Skip first two highest salaries
                .findFirst(); // Get the third highest salary

        if (thirdHighest.isPresent()) {
            Emp empThirdHighest = thirdHighest.get();
            System.out.println("Third Highest Salary: " + empThirdHighest.getSalary());
        } else {
            System.out.println("There are less than 3 employees.");
        }
    }
}

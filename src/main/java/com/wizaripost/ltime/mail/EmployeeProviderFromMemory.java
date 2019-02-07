package com.wizaripost.ltime.mail;

import com.wizaripost.ltime.logic.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeProviderFromMemory implements IEmployeeProvider {
    @Override
    public List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(true, "Симагин", "104"),
                new Employee(false, "Антонов", "104"),
                new Employee(true, "Федоренко", "105"),
                new Employee(true, "Рысин", "105"),
                new Employee(true, "Иванов", "104"));
    }

    @Override
    public List<Employee> getEmployees(String groupId) {
        return null;
    }
}

package com.wizaripost.ltime.mail;

import com.wizaripost.ltime.logic.Employee;

import java.util.List;

public interface IEmployeeProvider {

    List<Employee> getEmployees();

    List<Employee> getEmployees(String groupId);
}

package com.wizaripost.ltime.mail;

import com.wizaripost.ltime.logic.Employee;

import java.util.List;

public interface IContentCreator {
    String createContent(List<Employee> employeeList);
}

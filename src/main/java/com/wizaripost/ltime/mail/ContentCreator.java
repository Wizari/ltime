package com.wizaripost.ltime.mail;

import com.wizaripost.ltime.logic.Employee;

import java.util.List;

public class ContentCreator implements IContentCreator {
    @Override
    public String createContent(List<Employee> employeeList) {
        StringBuilder sb = new StringBuilder();
        sb
                .append("<font color=\"black\">")
                .append("<h3>")
                .append("Hello, Larisa")
                .append("</h3>")
                .append("\n")
                .append("<ul>")
                .append("\n")
        ;
        for (Employee employee : employeeList) {
            sb
                    .append("<li>")

                    .append(employee.getName())
                    .append("\t\t\t")
                    .append(this.createStatus(employee.getStatus()))
                    .append("</li>")
                    .append("\n");

        }
        sb
                .append("</ul>")
                .append("</font>");
        return sb.toString();
    }

    private String createStatus(boolean status) {
        return status ? "<font color=\"green\">" + "на месте" + "</font>": "<font color=\"red\">" + "отсутствует" + "</font>";
    }
}

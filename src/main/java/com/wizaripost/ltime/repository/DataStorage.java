package com.wizaripost.ltime.repository;

import com.wizaripost.ltime.logic.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlRootElement(name = "workers")
@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@NoArgsConstructor
public class DataStorage {

    @XmlElement(name = "descriptor")
    private List<Employee> employeeDescriptors;
}

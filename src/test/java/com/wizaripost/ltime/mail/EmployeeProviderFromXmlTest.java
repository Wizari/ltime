package com.wizaripost.ltime.mail;

import com.wizaripost.ltime.logic.Employee;
import com.wizaripost.ltime.repository.DataStorage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EmployeeProviderFromXmlTest {

    static final File FILE = new File("test.xml");
    IEmployeeProvider employeeProvider = new EmployeeProviderFromXml(FILE);

   @Before
    public void init() throws JAXBException {
        List<Employee> employees = Arrays.asList(
                new Employee(true, "Test_Симагин", "104"),
                new Employee(false, "Test_Антонов", "104"),
                new Employee(true, "Test_Федоренко", "105"),
                new Employee(true, "Test_Рысин", "105"),
                new Employee(true, "Test_Иванов", "104"));
        DataStorage dataStorage = new DataStorage(employees);
        JAXBContext context = JAXBContext.newInstance(DataStorage.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(dataStorage, FILE);

    }

    @After
    public void destroy() {
        FILE.delete();
    }

    @Test
    public void getEmployees() {
        List<Employee> actual = employeeProvider.getEmployees("104");

        assertEquals("Test_Симагин", actual.get(0).getName());
        assertEquals("Test_Антонов", actual.get(1).getName());
        assertEquals("Test_Иванов", actual.get(2).getName());

    }


}
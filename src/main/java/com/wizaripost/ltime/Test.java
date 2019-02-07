package com.wizaripost.ltime;

import com.wizaripost.ltime.logic.Employee;
import com.wizaripost.ltime.repository.DataStorage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Test {

//    public ArrayList<Employee> workers;
//public void main(String[] args) {
//
//    System.out.println("123");
//    System.out.println(Wor());
//
////        this.workers = workers;
//
//}

    public static void main(String[] args) throws JAXBException {
        long x = 0;
        JAXBContext context = JAXBContext.newInstance(DataStorage.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 100; i++) {
            DataStorage result = (DataStorage) unmarshaller.unmarshal(new File("employees.xml"));
            List<Employee> temp = result.getEmployeeDescriptors();
            List<Employee> res = new ArrayList<>();
            for (int j = 0; j < temp.size(); j++) {
                if (temp.get(j).getGroupId().equals("104")) {
                    res.add(temp.get(j));
                }
            }

        }
        System.out.println(System.currentTimeMillis());

    }

    public static ArrayList<Employee> Wor() {
//        ArrayList<Employee> workers = new ArrayList<>();
//        workers.add(new Employee(true, "Бивис"));
//        workers.add(new Employee(false, "Баттхед"));
//        workers.add(new Employee(true, "Аьберт Эйнштейн"));
//        workers.add(new Employee(true, "Аьберт Эйнштейн"));
//        workers.add(new Employee(true, "Аьберт Эйнштейн"));
//        workers.add(new Employee(true, "Аьберт Эйнштейн"));
//        workers.add(new Employee(false, "Кукуруза"));
        return null;
    }

}


//        workers.add(new Employee("Пришел вовремя", "Аьберт Эйнштейн"));
//                workers.add(new Employee("Опоздал       ", "Не Аьберт Эйнштейн"));
//                workers.add(new Employee("Пришел вовремя", "Аьберт Эйнштейн"));
//                workers.add(new Employee("Пришел вовремя", "Аьберт Эйнштейн"));
//                workers.add(new Employee("Пришел вовремя", "Аьберт Эйнштейн"));
//                workers.add(new Employee("Пришел вовремя", "Аьберт Эйнштейн"));
//                workers.add(new Employee("Пришел вовремя", "Аьберт Эйнштейн"));
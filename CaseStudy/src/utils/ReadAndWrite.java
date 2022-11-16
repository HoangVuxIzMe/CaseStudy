package utils;

import models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void writeFile(List<Employee> employeeList, String addressFile) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(addressFile,false))) {
            for (Employee employee : employeeList){
                bufferedWriter.write(employee.getInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> readFile(String addressFile) {
        List<Employee> employeeList = new ArrayList<>();
        try (BufferedReader stream = new BufferedReader(new FileReader(addressFile))) {
            String line = null;
            while ((line = stream.readLine()) != null){
                if (line.trim().equals(" ")){
                    continue;
                }
                employeeList.add(new Employee(line));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}

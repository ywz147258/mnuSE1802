package com.ywz.controller;

import com.ywz.entity.Employee;
import com.ywz.service.EmployeeService;
import com.ywz.service.impl.EmployeeServiceImpl;

import java.math.BigDecimal;
import java.util.Scanner;

public class EmployeeController {
    public static void main(String[] args) {
        EmployeeController employeeController =new EmployeeController();
        employeeController.addEmployee();
    }
    private EmployeeService employeeService =new EmployeeServiceImpl();
    public void addEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用超市erp管理系统");

        boolean isContinue=true;
        while(isContinue){
            System.out.println("输入员工的姓名");
            String name =scanner.next();
            System.out.println("输入员工的编号");
            String workerNo=scanner.next();
            long start= System.currentTimeMillis();
            Employee employee = new Employee();
            employee.setName(name);
            employee.setWorkerNo(workerNo);
            employeeService.add(employee);
            long end =System.currentTimeMillis();
            System.out.println("本次执行添加所用毫秒数："+(end-start));
            System.out.println("继续按 1，其他停止");
            String result=scanner.next();
            isContinue=result.equals("1")?true:false;
        }
    }
}

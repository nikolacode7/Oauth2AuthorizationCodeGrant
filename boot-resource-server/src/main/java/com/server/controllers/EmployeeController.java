package com.server.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.server.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping(value = "/user/getEmployeesList", produces = "application/json")
	@ResponseBody
	public List<Employee> getEmployeesList() {
		List<Employee> employees = new ArrayList<>();
		Employee emp1 = new Employee();
		emp1.setEmpId("1");
		emp1.setEmpName("Maria");
		employees.add(emp1);
		Employee emp2 = new Employee();
		emp2.setEmpId("2");
		emp2.setEmpName("Marko");
		employees.add(emp2);
		return employees;

	}

}

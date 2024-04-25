package com.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.DAO.EmployeeDAO;
import com.jsp.DTO.Employee;

import antlr.collections.List;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeDAO dao;
	
	//API to insert employee object to DB:===
	@RequestMapping("/insert")
	public ModelAndView getEmployee()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",new Employee());
		mv.setViewName("create.jsp");
		return mv;
	}
	@RequestMapping("/save")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee)
	{
		dao.saveEmployee(employee);
		ModelAndView v=new ModelAndView();
		v.setViewName("index.jsp");
		return v;
	}
	@RequestMapping("/search")
	public ModelAndView searchEmployee()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",new Employee());
		mv.setViewName("get.jsp");
		return mv;
	}
	@RequestMapping("/display")
	public ModelAndView displayEmployee(@ModelAttribute Employee employee)
	{
		ModelAndView mv=new ModelAndView();
		Employee emp=dao.getEmployeeId(employee.getId());
		mv.addObject("employee",emp);
		mv.setViewName("display.jsp");
		return mv;
	}
	@RequestMapping("/delete")
	public ModelAndView deleteEmployee()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",new Employee());
		mv.setViewName("delete.jsp");
		return mv;
	}
	@RequestMapping("/remove")
	public String removeEmployee(@ModelAttribute Employee employee)
	{
		dao.deleteEmployee(employee.getId());
		return "Employee details removed successfully";
	}
	@RequestMapping("/displayall")
	public ModelAndView getAllEmployee()
	{
		ModelAndView mv=new ModelAndView();
		java.util.List<Employee> employees=dao.getAllEmployee();
		mv.addObject("employeelist",employees);
		mv.setViewName("displayAll.jsp");
		return mv;
	}
	@RequestMapping("/update")
	public ModelAndView updateEmployee()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",new Employee());
		mv.setViewName("update.jsp");
		return mv;
	}
	
	@RequestMapping("/modify")
	public String modifyEmployeeDetails(@ModelAttribute Employee employee)
	{
		dao.updateEmployee(employee);
		return "Employee details updated successfully.";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package com.abd.controller;

import java.sql.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.abd.dao.EmpDao;
import com.abd.model.Emp;






@Controller
public class MyController {
	
	
	
	@Autowired
    EmpDao empdao;
	
	
	@RequestMapping("/")
    public ModelAndView homeMethod() {
        System.out.println("Hello World");
        String Mess = "Another Abstract Controller Test"; 
  	  ModelAndView modelAndView = new ModelAndView("index");
  	  modelAndView.addObject("message", Mess); 
  	  
  	
  	  
  	  
  	  
  	  
  	  
  	  
  	 
  	     
  	
  	 return modelAndView;
  	
    }
 
 @RequestMapping("/welcome")
    public ModelAndView Next(@ModelAttribute("employee1") Emp employee1) {
	 
	 
    	System.out.println("jfjgjfgj==============fgkljkgjk");
         ModelAndView model = new ModelAndView("hellopage");
         empdao.saveEmpObj(employee1);
         
        
         
         
         return model;    
        
        
    }
 
      
 @RequestMapping("/view")
 public ModelAndView ViewMethod() {
	 String Mess = "Employee List"; 
	 ModelAndView modelAndView = new ModelAndView("view");
 	  
 	  
 	  
 	 System.out.println("------Listing Multiple Records--------" );
     List<Emp> emp = empdao.listEmployee();
     modelAndView.addObject("result",emp);
     for (Emp record : emp) {
        System.out.print("ID : " + record.getEid() );
        System.out.print("Name : " + record.getEname() );
        System.out.println("Mobile : " + record.getMobile());
        System.out.println("Email : " + record.getEmail());
     }

    modelAndView.addObject("Lists", emp); 
   	  
	 return modelAndView;
 }
 
 
 
 
 @RequestMapping("/update")
 @ResponseBody
 public ModelAndView UpdateMethod(@RequestParam("id") int id) {
	 String Mess = "Record Successfully updated with id"+id; 
	 
	 ModelAndView modelAndView = new ModelAndView("update");
 	  

 	 Emp emp = empdao.getEmployee(id);
 	modelAndView.addObject("message", emp); 
 	 System.out.println(Mess);
 	 
 	 System.out.println("ID : " + emp.getEid() );
     System.out.println("Name : " + emp.getEname() );
     System.out.println("Mobile : " + emp.getMobile());
     System.out.println("Email : " + emp.getEmail());
 	  
	 return modelAndView;
 }
 
 @RequestMapping("/delete")
 public ModelAndView DeleteMethod() {
	 String Mess = "Record Successfully Deleted"; 
	 ModelAndView modelAndView = new ModelAndView("view");
 	  modelAndView.addObject("message", Mess); 

 	 System.out.println("----Updating Record with ID = 2 -----" );
 	  empdao.delete(100);
 	  
 	  
	 return modelAndView;
 }

 
 @RequestMapping("/updateres")
 public ModelAndView UpdateData(@ModelAttribute("employee1") Emp employee1) {
	 
	 
	 
	 empdao.update(employee1);


	 ModelAndView modelAndView = new ModelAndView("view");

 	  
 	  
	 return modelAndView;
 }

	
}

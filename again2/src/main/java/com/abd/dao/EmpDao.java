/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abd.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.abd.model.Emp;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;



@Component
public class EmpDao {
     
    
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    public DataSource getDataSource() {
        return dataSource;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    
    
    public void saveEmpObj(Emp emp) {
        System.out.println(emp.getEname());
		      System.out.println("===============>Emp Dao Called<==================");
                      String sql = "insert into Emp (Eid,Ename,Mobile,Email) values(?,?,?,?)";
        jdbcTemplate.update(sql, new Object[] {emp.getEid(),emp.getEname(),emp.getMobile(),emp.getEmail()});
        
                      
                      
	}
    
    
    public List<Emp> listEmployee() {
        String SQL = "select * from emp order by eid";
        List <Emp> students = jdbcTemplate.query(SQL, new StudentMapper());
        return students;
     }
    
    public class StudentMapper implements RowMapper<Emp> {
    	   public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
    		   Emp emp = new Emp();
    		   emp.setEid(rs.getInt("eid"));
    		   emp.setEname(rs.getString("ename"));
    		   emp.setMobile(rs.getString("mobile"));
    		   emp.setEmail(rs.getString("email"));
    	      
    	      return emp;
    	   }
    
    }
    
    public void delete(Integer id) {
	     String SQL = "delete from emp where eid = ?";
	     jdbcTemplate.update(SQL, id);
	     System.out.println("Deleted Record with ID = " + id );
	     return;
	  }
  
  
	  public void update(Emp employee){
		  
		  
	     String SQL = "update emp set ename = ?,mobile = ?,email = ? where eid = ?";
	     jdbcTemplate.update(SQL,employee.getEname() ,employee.getMobile(),employee.getEmail(), employee.getEid());
	     System.out.println("Updated Record with ID = " + employee.getEid() );
	     return;
	  }
    
	  public Emp getEmployee(Integer id) {
	      String SQL = "select * from emp where eid = ?";
	      Emp emp = jdbcTemplate.queryForObject(SQL, 
	         new Object[]{id}, new StudentMapper());
	      
	      return emp;
	   }
    
    }

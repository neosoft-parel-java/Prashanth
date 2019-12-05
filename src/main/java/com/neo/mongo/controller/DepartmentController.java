package com.neo.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.mongo.model.Department;
import com.neo.mongo.repository.DepartmentRepository;
import com.neo.mongo.repository.DepartmentRepositoryImpl;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Autowired
	DepartmentRepositoryImpl departmentRepositoryImpl;
	
	@PostMapping
	public Department createDept(@RequestBody Department department) {
		departmentRepositoryImpl.save(department);
		return department;
	}
	
	
	@PutMapping("/{deptId}")
    public Department updateDept(@RequestBody Department department, @PathVariable String deptId) {
        department.setId(deptId);
        departmentRepositoryImpl.save(department);
        return department;
    }

	@GetMapping
	public List listDepts(){
	    return departmentRepositoryImpl.findAll();
	 }
	
	@DeleteMapping("/{deptId}")
    public String deleteDept(@PathVariable String deptId) {
		departmentRepositoryImpl.deleteById(deptId);
        return deptId;
    }
	
	@GetMapping("{name}/emp")
    public Department listDept(@PathVariable String name){
        return departmentRepository.findDepartmentByEmployeeName(name);
    }
}

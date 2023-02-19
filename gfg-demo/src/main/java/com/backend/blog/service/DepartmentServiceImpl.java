package com.backend.blog.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.backend.blog.entities.Department;
import com.backend.blog.repository.DepartmentRepo;

public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	// Save operation
    public Department saveDepartment(Department department)
    {
        return departmentRepo.save(department);
    }
  
    // Read operation
    @Override public List<Department> fetchDepartmentList()
    {
        return (List<Department>)
            departmentRepo.findAll();
    }
  
    // Update operation
    @Override
    public Department
    updateDepartment(Department department,
                     Long departmentId)
    {
        Department depDB
            = departmentRepo.findById(departmentId)
                  .get();
  
        if (Objects.nonNull(department.getDepartmentName())
            && !"".equalsIgnoreCase(
                department.getDepartmentName())) {
            depDB.setDepartmentName(
                department.getDepartmentName());
        }
  
        if (Objects.nonNull(
                department.getDepartmentAddress())
            && !"".equalsIgnoreCase(
                department.getDepartmentAddress())) {
            depDB.setDepartmentAddress(
                department.getDepartmentAddress());
        }
  
        if (Objects.nonNull(department.getDepartmentCode())
            && !"".equalsIgnoreCase(
                department.getDepartmentCode())) {
            depDB.setDepartmentCode(
                department.getDepartmentCode());
        }
  
        return departmentRepo.save(depDB);
    }
  
    // Delete operation
    @Override
    public void deleteDepartmentById(Long departmentId)
    {
        departmentRepo.deleteById(departmentId);
    }
}

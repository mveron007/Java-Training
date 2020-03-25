package com.cdainfo;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdainfo.dominio.Employee;
import com.cdainfo.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
 @Autowired
 private EmployeeRepository employeeRepository;
 @GetMapping("/employees")
 public List <Employee> getAllEmployees() {
  return employeeRepository.findAll();
 }
 @GetMapping("/employees/{id}")
 public Optional<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId) {
  return employeeRepository.findById(employeeId);
 }
 @PostMapping("/employees")
 public Employee createEmployee(@Valid @RequestBody Employee employee) {
  return employeeRepository.save(employee);
 }
//  @PutMapping("/employees/{id}")
//  public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
//    @Valid @RequestBody Employee employeeDetails){
//   Employee employee = employeeRepository.findByEmployee(employeeId);
//   employee.setEmailId(employeeDetails.getEmailId());
//   employee.setLastName(employeeDetails.getLastName());
//   employee.setFirstName(employeeDetails.getFirstName());
//   final Employee updatedEmployee = employeeRepository.save(employee);
//   return ResponseEntity.ok(updatedEmployee);
//  }
 @PutMapping("/employees/{id}") 
  public Employee update(@PathVariable(value = "id") Long employeeId, @RequestBody Employee em){
    if (em.getId() == employeeId) {
      return employeeRepository.save(em);
    }
    return em;
  }

 @DeleteMapping("/employees/{id}")
 public Employee deleteEmployee(@PathVariable(value = "id") Long employeeId) {
  Optional<Employee> em = employeeRepository.findById(employeeId);
  if ( em.isPresent() ) {
    employeeRepository.delete(em.get());
    return em.get();
  } else {
    return null;
  }
 }
}
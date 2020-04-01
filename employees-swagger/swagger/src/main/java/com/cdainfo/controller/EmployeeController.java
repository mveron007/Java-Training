package com.cdainfo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cdainfo.dominio.Employee;
import com.cdainfo.repository.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
@Api(value = "Sistema de manejo de empleados", description = "Operaciones pertenecientes a empleados")

public class EmployeeController {
 @Autowired
 private EmployeeRepository employeeRepository;

    @ApiOperation(value = "Lista de empleados", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Lista exitosa"),
            @ApiResponse(code = 401, message = "No estas autorizado para ver este recurso"),
            @ApiResponse(code = 403, message = "El acceso al recurso está prohibido"),
            @ApiResponse(code = 404, message = "No se encuentra el recurso")
    })

 //@ApiOperation(value = "Brinda la lista de empleados")
 @GetMapping("/employees")
 public List <Employee> getAllEmployees() {
  return employeeRepository.findAll();
 }

 //@ApiOperation(value = "Brinda un empleado por el ID")
 @GetMapping("/employees/{id}")
 public Optional<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId) {
  return employeeRepository.findById(employeeId);
 }

 //@ApiOperation(value = "Crea un nuevo empleado")
 @PostMapping("/employees/add")
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

 //@ApiOperation(value = "Actualiza un empleado")
 @PutMapping("/employees/{id}")
  public Employee update(@PathVariable(value = "id") Long employeeId, @RequestBody Employee em){
    if (em.getId() == employeeId) {
      return employeeRepository.save(em);
    }
    return em;
  }

 //@ApiOperation(value = "Borra un empleado")
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
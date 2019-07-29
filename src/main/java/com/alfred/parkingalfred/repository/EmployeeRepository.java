package com.alfred.parkingalfred.repository;

import com.alfred.parkingalfred.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByMailAndPassword(String name, String password);
}

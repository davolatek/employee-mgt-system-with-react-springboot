package com.knowledgetekhub.EMPLOYEE.repository;

import com.knowledgetekhub.EMPLOYEE.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}

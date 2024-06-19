package edu.icet.pos.bo.custom;

import edu.icet.pos.model.Employee;

public interface EmployeeBo {

    boolean addEmployee(Employee dto);

    boolean updateEmployee(String id);
}

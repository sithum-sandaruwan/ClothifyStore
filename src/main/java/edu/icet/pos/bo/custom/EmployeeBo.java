package edu.icet.pos.bo.custom;

import edu.icet.pos.bo.SuperBo;
import edu.icet.pos.model.Employee;

public interface EmployeeBo extends SuperBo {

    boolean addEmployee(Employee dto);

    boolean updateEmployee(String id);
}

package com.example.service;

import com.example.domain.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * 従業員一覧.
     *
     * @return すべての従業員一覧
     */
    public List<Employee> showList(){
        return employeeRepository.findAll();
    }

    /**
     * 従業員情報を取得する.
     *
     * @param id id
     * @return idで指定された従業員情報
     */
    public Employee showDetail(Integer id){

        return employeeRepository.findById(id);
    }
}

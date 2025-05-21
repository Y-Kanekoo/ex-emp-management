package com.example.controller;

import com.example.domain.Employee;
import com.example.form.UpdateEmployeeForm;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 管理者関連機能.
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 従業員一覧を表示します.
     *
     * @param model モデル
     * @return 従業員一覧画面
     */
    @GetMapping("/showList")
    public String showList(Model model){

        model.addAttribute("employeeList", employeeService.showList());

        return "employee/list";
    }

    /**
     * 従業員詳細画面を表示します.
     *
     * @param id id
     * @param model モデル
     * @param form フォーム
     * @return 従業員詳細画面
     */
    @GetMapping("/showDetail")
    public String showDetail(String id, Model model, UpdateEmployeeForm form){

        Employee employee = employeeService.showDetail(Integer.valueOf(id));
        model.addAttribute("employee", employee);
        return "employee/detail";
    }

//    @PostMapping("/update")
//    public String update(){
//
//        Employee employee = employeeService.showDetail(id);
//    }

}

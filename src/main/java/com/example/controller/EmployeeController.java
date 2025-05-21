package com.example.controller;

import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
     * 従業員一覧を.表示します.
     * @param model モデル
     * @return 従業員一覧画面
     */
    @GetMapping("/showList")
    public String showList(Model model){

        model.addAttribute("employeeList", employeeService.showList());

        return "employee/list";
    }

    @GetMapping

}

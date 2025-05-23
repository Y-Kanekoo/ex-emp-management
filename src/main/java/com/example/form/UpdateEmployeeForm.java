package com.example.form;

import jakarta.validation.constraints.Pattern;

public class UpdateEmployeeForm {
    /**従業員ID*/
    private String id;
    /**扶養人数*/
    //0から9までの２桁まで入力可能
    @Pattern(regexp = "^[0-9]{2}$", message = "扶養人数を数字で入力してください")
    private String dependentsCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDependentsCount() {
        return dependentsCount;
    }

    public void setDependentsCount(String dependentsCount) {
        this.dependentsCount = dependentsCount;
    }

    @Override
    public String toString() {
        return "UpdateEmployeeForm{" +
                "id='" + id + '\'' +
                ", dependentsCount='" + dependentsCount + '\'' +
                '}';
    }
}

package com.javacourse.studentorder.validator;

import com.javacourse.studentorder.domain.AnswerCityRegister;
import com.javacourse.studentorder.domain.StudentOrder;

public class CityRegisterValidator {

    public String hostName;

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("CityRegister is running... " + hostName);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.isSuccess = false;
        return ans;
    }
}

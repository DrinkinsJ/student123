package com.javacourse.studentorder.validator;


import com.javacourse.studentorder.domain.AnswerChildren;
import com.javacourse.studentorder.domain.StudentOrder;

public class ChildrenValidator {
    public AnswerChildren checkChildren(StudentOrder so){
        System.out.println("Children Check is running...");
        AnswerChildren ans = new AnswerChildren();
        ans.isSuccess = false;
        return ans;
    }
}

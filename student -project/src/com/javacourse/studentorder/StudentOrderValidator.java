package com.javacourse.studentorder;

import com.javacourse.studentorder.domain.*;
import com.javacourse.studentorder.mail.MailSender;
import com.javacourse.studentorder.validator.ChildrenValidator;
import com.javacourse.studentorder.validator.CityRegisterValidator;
import com.javacourse.studentorder.validator.StudentValidator;
import com.javacourse.studentorder.validator.WeddingValidator;

public class StudentOrderValidator {
    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderValidator(){
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSender = new MailSender();

    }
    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();

    }
    public void checkAll() {
        StudentOrder so = readStudentOrder();

            AnswerCityRegister cityAnswer = checkCityRegister(so);
            AnswerWedding weddingAnswer = checkWedding(so);
            AnswerChildren childrenAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);

            sendMail(so);

    }

    public StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return null;
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so){
        return cityRegisterVal.checkCityRegister(so);
    }

    public AnswerWedding checkWedding(StudentOrder so){
        return weddingVal.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrder so){
        return childrenVal.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so){
        return studentVal.checkStudent(so);
    }

    public void sendMail(StudentOrder so){
         mailSender.sendMail(so);
    }
}

package com.javacourse.studentorder;

import com.javacourse.studentorder.domain.other.Adult;
import com.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder s0 = new StudentOrder();
        saveStudentOrder(s0);
        buildStudentOrder();

    }
    static long saveStudentOrder(StudentOrder studentOrder){
        long answer;
        answer = 199;
        System.out.println("Муж: " + " ");
        System.out.println("Жена: " + " ");
        return answer;
    }
    static  StudentOrder buildStudentOrder(){
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult();

//        husband.setGivenName("Вася ");
//        husband.setSurName("Иванов");
//        husband.setPassportNumber("333333");
//        so.setHusband(husband);

        String ans = husband.getPersonId();
        System.out.println(ans);
        return so;
    }
}

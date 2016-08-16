/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.binita.arraymarksheet;

import java.util.Scanner;

/**
 *
 * @author Bini
 */
public class Marksheet {

    Scanner input = new Scanner(System.in);
    int subjectNum;
    String[] subjects;
    int[] marks;
    int total = 0;
    double percentage = 0;
    private boolean isfail;

    public Marksheet(int subNum, String[] subject) {
        subject = new String[subNum];
        marks = new int[subject.length];
        this.subjectNum = subNum;
        this.subjects = subject;

    }

    public void getSubject() {

        for (int i = 0; i < subjectNum; i++) {
            System.out.println("enter subject name");
            subjects[i] = input.next();
        }

        System.out.println("================");

    }

    public void getMarks() {
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("Enter marks of " + subjects[i]);
            marks[i] = input.nextInt();
           while(!(marks[i]>=0 && marks[i]<=100)){
                System.out.println("invalid input");
            
            marks[i]=input.nextInt();
           }
            total = total + marks[i];

        }
        System.out.println("================");
    }

    public void getTotal() {
        System.out.println("total of marks is" + total);
    }

    public boolean isFail() {
        for (int i = 0; i < subjectNum; i++) {
            if (marks[i] < 32) {
                return true;
            }
        }
        return false;
    }

    public void getPercentage() {
        percentage = (total / subjectNum);
        System.out.println("percentage is" + percentage);
    }

    public void getDivision() {
        if (isFail() == true) {
            System.out.println("you have failed");
        } else {
            getPercentage();
            
             if (percentage>= 80  && percentage< 100 ) {
                System.out.println("distinction");
            }
            else if (percentage >60 && percentage < 80) {
                System.out.println("first division");
            }
            else if (percentage >40 && percentage< 60) {
                System.out.println("second division");
            }
            else if (percentage >32 && percentage <40) {
                System.out.println("third division");
            }
        }
    }
}

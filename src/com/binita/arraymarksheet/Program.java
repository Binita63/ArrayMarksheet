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
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int subNum = 0;
        String[] subject = new String[subNum];
        System.out.println("enter the number of subject");
        subNum = input.nextInt();

        Marksheet ms = new Marksheet(subNum, subject);
        ms.getSubject();

        ms.getMarks();
        ms.getTotal();
        ms.isFail();
        
        ms.getDivision();
        
    }

}

package com.company;
import com.utils.*;


public class Main {

    public static void main(String[] args) {
        for(int i = 0; i<800; i++)
        {
            System.out.println(i + " = " + DigestToChar.make(i));
        }
    }
}

package com.company;
import com.utils.*;

import java.util.Date;


public class Main {
    public static void main(String[] args) {
        for(int i = 0; i<800; i++) {
            System.out.println(i + " = " + DigestToChar.makeFrom0(i));
        }


        //FilenameUtils.getExtension("/path/to/file/foo.txt"); /
        long  start = new Date().getTime();
        for(int i=0; i<1_000_000; i++) {
            //FilesNameTools.getFileExtension("\\fs\\123.4.5r.fi\\fsfs.txt");
            FilesNameTools.addNameFile("\\fs\\123.4.5r.fi\\fsfs.txt", "LALA_"+i);
            FilesNameTools.addNameFile("\\fs\\12345rfi\\fsfstxt", "LALA2_"+i);
            FilesNameTools.addNameFile("", "LALA3_"+i);
        }
        System.out.println("Первый алгоритм отработал за " + (new Date().getTime()- start)+"мс");
    }
}

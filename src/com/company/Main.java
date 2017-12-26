package com.company;
import com.utils.*;

import java.util.Date;


public class Main {
    public static void main(String[] args)
    {
        StringBuilder[] testString = new StringBuilder[10];
        for(int i = 0; i < testString.length; i++)
        {
            testString[i] = new StringBuilder("");
            int l = Main.getRandom(4, 11);
            for(int j = 0; j < l; j++)
            {
                StringBuilder str = new StringBuilder("");
                int l2 = Main.getRandom(3, 10);
                for(int k = 0; k < l2; k++)
                {
                    int r = Main.getRandom(0, 100);
                    if(r > 70) str.append((char)Main.getRandom(65, 91));
                    else if(r > 5) str.append((char)Main.getRandom(97, 121));
                    else str.append((char)46);
                }
                if(j == l - 1) testString[i].append("name_file." + str);
                else testString[i].append(str + "/");
            }
            //System.out.println(testString[i]);
        }
        long start = System.currentTimeMillis();
        for(int i = 0; i < testString.length; i++) System.out.println(FilesNameTools.getFileNameAndExtension(testString[i].toString(), "_fuck"));
        System.out.println("---" + (System.currentTimeMillis() - start) + "---");
        start = System.currentTimeMillis();
        for(int i = 0; i < testString.length; i++) System.out.println(FilesNameTools.getFileExtension(testString[i].toString(), "_fuck"));
        System.out.println("---" + (System.currentTimeMillis() - start) + "---");
        start = System.currentTimeMillis();
        for(int i = 0; i < testString.length; i++) System.out.println(FilesNameTools.addNameFile(testString[i].toString(), "_fuck"));
        System.out.println("---" + (System.currentTimeMillis() - start) + "---");
    }
    private static int getRandom(int a, int b)
    {
        return (int) (Math.random() * (b - a) + a);
    }
}

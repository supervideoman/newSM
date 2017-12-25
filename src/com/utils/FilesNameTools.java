package com.utils;

public class FilesNameTools {
    public static String getLastName(String path){
        StringBuilder result = new StringBuilder();
        result.append(path);

        System.out.println(result.reverse().indexOf("."));

        return result.toString();

    }
}

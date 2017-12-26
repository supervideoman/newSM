package com.utils;

public class FilesNameTools {
    public static String getFileExtension(String path) {
        StringBuilder preResult = new StringBuilder();
        preResult.append(path);
        // Имя полное(путь) без расширения
        //System.out.println(preResult.substring(0,preResult.lastIndexOf(".") + 1));
        return preResult.substring(preResult.lastIndexOf(".") + 1);
    }
}

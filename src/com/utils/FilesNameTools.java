package com.utils;

public class FilesNameTools {
    public static String getFileExtension(String path, String add) {
        StringBuilder preResult = new StringBuilder();
        preResult.append(path);
        // Имя полное(путь) без расширения
        //System.out.println(preResult.substring(0,preResult.lastIndexOf(".") + 1));
        int end = preResult.lastIndexOf(".");
        return preResult.substring(0, end) + add + preResult.substring(end);
    }
    public static String getFileNameAndExtension(String path, String add)
    {
        StringBuilder preResult = new StringBuilder();
        String[] timeStr = path.split("\\.");
        for (int i = 0; i < timeStr.length - 1; i++)
            if(i == timeStr.length - 2)
                preResult.append(timeStr[i] + add + "." + timeStr[i + 1]);
            else preResult.append(timeStr[i] + ".");
        if(timeStr.length == 1) preResult.append(timeStr[0] + add);
        return preResult.toString();
    }
}

package com.utils;

public class DigestToChar {
    public static String make(int digest) {
        String result;
        StringBuilder str = new StringBuilder("");
        int systemDigets = 26;
        while((digest != 0) || (digest > systemDigets)) {
            if(digest% systemDigets == 0) {
                str.append((char) (systemDigets + 64));
                digest--;
            }
            else
            str.append((char) (digest % systemDigets + 64));
            digest = digest / systemDigets;
        }
        result = str.reverse().toString();
        return result;
    }
}

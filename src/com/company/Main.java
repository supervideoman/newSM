package com.company;
import com.utils.*;

public class Main {
    public static void main(String[] args)
    {
        StringBuilder[] testString = new StringBuilder[10000]; // Массив с тестовыми путями
        for(int i = 0; i < testString.length; i++)
        {
            testString[i] = new StringBuilder(""); // Случайный путь
            int l = Main.getRandom(4, 11); // Случайное кол-во папок в пути
            for(int j = 0; j < l; j++)
            {
                StringBuilder str = new StringBuilder(""); // Генерация имени папки
                int l2 = Main.getRandom(3, 10); // Кол-во символов в имени
                for(int k = 0; k < l2; k++)
                {
                    int r = Main.getRandom(0, 100);
                    if(r > 70) str.append((char)Main.getRandom(65, 91)); // Вставляем заглавную букву
                    else if(r > 5) str.append((char)Main.getRandom(97, 121)); // Вставляем маленькую букву
                    else str.append((char)46); // Вставляем точку
                }
                if(j == l - 1) testString[i].append("name_file." + str); // Добавляем имя файла
                else testString[i].append(str + "/");
            }
        }
        long start = System.currentTimeMillis();
        for(int i = 0; i < testString.length; i++) FilesNameTools.getFileNameAndExtension(testString[i].toString(), "_fuck");
        System.out.println("---" + (System.currentTimeMillis() - start) + "---");
        start = System.currentTimeMillis();
        for(int i = 0; i < testString.length; i++) FilesNameTools.getFileExtension(testString[i].toString(), "_fuck");
        System.out.println("---" + (System.currentTimeMillis() - start) + "---");
        start = System.currentTimeMillis();
        for(int i = 0; i < testString.length; i++) FilesNameTools.addNameFile(testString[i].toString(), "_fuck");
        System.out.println("---" + (System.currentTimeMillis() - start) + "---");
    }
    private static int getRandom(int a, int b)
    {
        return (int) (Math.random() * (b - a) + a);
    }
}

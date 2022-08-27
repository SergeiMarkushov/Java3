package com.example.lesson3;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws IOException {


//        File dir = new File("dirs");
//        System.out.println(dir.mkdir()); создать директорию


//        File file = new File("dir/somefile.txt"); //-создать файл
//        try {
//            System.out.println(file.createNewFile());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        File file = new File("dir"); //- вывесли все файлы
//        String[] list = file.list();
//        for (String s : list) {
//            System.out.println(s);
//        }

//        File file = new File("dir/somefile.txt");
//        System.out.println(file.renameTo(new File("dir/abc.txt"))); // переименовать файл\


        InputStream inputStream =new FileInputStream("dir/abc.txt");

        InputStream url = new URL("http://google.com").openStream();

        InputStream array = new ByteArrayInputStream(new byte[]{90, 52, 73, 75, 81,90});

        while (true){
            int read = inputStream.read();
            if (read != -1){
                System.out.println((char) read);
            }else break;
        }



    }
}

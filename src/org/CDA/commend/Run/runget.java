package org.CDA.commend.Run;

import org.CDA.commend.commendCheck;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class runget {

    static String web = "127.0.0.1";

    public static void HelpShow(String[] args){
        System.out.println("you can use it to get Run in web or anyway");
        System.out.println("runget \"Name\" to get run");
        System.out.println("\"-webset\" can set get web");
    }
    public static void Runtime(String[] args){
        if (args.length>1){
            switch (args[1]) {
                case "-webset":
                    if (args.length<3){
                        System.out.println(web);
                    }else {
                        web = args[2];
                    }
                    break;
                default:
                    download(args[1]);
            }
        }
    }

    protected static void download(String name) {
        String fileName = name+".class";
        String url = web + "/"+ fileName;
        System.out.println("start download:"+name);
        System.out.println(url);
        downloadByNIO2(url,commendCheck.pathName,fileName);
    }

    public static void downloadByNIO2(String url, String saveDir, String fileName) {
        try (InputStream ins = new URL(url).openStream()) {
            Path target = Paths.get(saveDir, fileName);
            Files.createDirectories(target.getParent());
            Files.copy(ins, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

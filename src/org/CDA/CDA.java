package org.CDA;

import java.util.Scanner;
import org.CDA.commend.commendCheck;
public class CDA {
    static boolean isExit= false;
    Scanner scanner = new Scanner(System.in);
    public CDA(){
        init();
        Startloop();
    }
    private void init(){
        commendCheck.setCommends();
    }
    private void Startloop(){
        System.out.println("hello :)");
      while (!isExit){
          String[] args = scanner.nextLine().split(" ");
          commendCheck.toRun(args);
      }
    }
    public static void CDAbreak(){
        isExit = true;
    }
    public static void CDAstart(){
        isExit = false;
    }
}

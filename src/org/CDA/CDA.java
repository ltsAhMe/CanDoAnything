package org.CDA;

import java.util.Scanner;
import org.CDA.commend.commendCheck;
public class CDA {
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
      while (true){
          String[] args = scanner.nextLine().split(" ");
          commendCheck.toRun(args);
      }
    }
}

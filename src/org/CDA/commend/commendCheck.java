package org.CDA.commend;

import java.util.List;

public class commendCheck {
   public static String packName = "org.CDA.commend.Run";
    public static String pathName = "org/CDA/commend/Run";
   public static List<Class<?>> Commends;

    public static void toRun(String func,String[] args){
        for (Class<?> clazz : Commends) {
            if (clazz.getName().substring(packName.length()+1,clazz.getName().length()).equals(args[0])){
                ClassFinder.executeMethod(clazz,func,args);
            }
        }
    }

    public static void toRun(String func,String name){
        String[] temp = {name};
        toRun(func,temp);
    }

    public static void toRun(String[] args){
        toRun("Runtime",args);
    }

    public static void setCommends() {
          Commends = ClassFinder.getClasses(packName);
    }
}

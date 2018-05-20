package thread;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/20.
 */
public class MyList {

    private static List list = new ArrayList();

    public static void add(){
        list.add("string");
    }

    public static int getSize(){
        return list.size();
    }
}

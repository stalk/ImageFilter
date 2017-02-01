package org.rinmakh.byteshift;

import java.util.*;

/**
 * @author Rinat_Makhmutov
 */
public class ByteMaskRun {

    public static void main(String[] args) throws CloneNotSupportedException {
        int a = 39;


        System.out.println(Integer.toBinaryString((a)));
        System.out.println(Integer.toBinaryString( (a>>3) ));
        System.out.println(Integer.toBinaryString( (a<<3) ));
        System.out.println((39 % 4) );

        HashMap<String,String> map = new HashMap<String, String>();
        Set<String> set = new HashSet<String>();
        map.put(null,"asdfsadf");
        map.put(null,"1234");
        set.add("34565436");
        System.out.println(map.get(null));






    }




}

class A  implements Cloneable{
    Integer c;
    Integer b;

    public Object clone() throws CloneNotSupportedException {
        A t = (A) super.clone();
        return t;
    }


}

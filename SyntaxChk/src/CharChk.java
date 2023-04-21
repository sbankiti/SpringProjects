import java.util.HashMap;

import java.util.*;
public class CharChk {

    public void CharMth() {

        String S = "santhosh";

        System.out.println(S.length());

        Map<Character, Integer> chmp = new HashMap<>();

        for(int i =0; i< S.length(); i++)
        {

            if(chmp.containsKey(S.charAt(i)))
            {
                chmp.put(S.charAt(i), chmp.get(S.charAt(i)) + 1);
            }else {
                chmp.put(S.charAt(i),1);
            }
        }

        String str = "";

        for(Map.Entry<Character, Integer> mapval : chmp.entrySet())
        {
         System.out.println(mapval.getKey() + " : " + mapval.getValue());

         str = str + mapval.getKey();
        }

        System.out.println(str);
    }

    public void corporateflight(){

     Queue<Integer> queueval = new LinkedList<>();


    }

    public boolean interleaving(String s1, String s2, String s3){

        if(s3.length() == )

    }
}

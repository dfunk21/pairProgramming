package com.company;

/**
 * Created by df377 on 10/19/16.
 */
public class spamBot {
    public String name;
    public String s;

    public spamBot (String n, String w)
    {
        name = n;
        s = w;
    }

    public void repeatSpam (int x)
    {
        for (int i = 0; i < x; i++)
        {
            System.out.println(s);
        }
    }

    public void randomSpam ()
    {
        //33-126
        int random = (int)(Math.random() * 8) + 8;
        for(int w = 0; w < random; w++)
        {
            int random2 = (int)(Math.random() * 8) + 8;
            for(int y = 0; y < random2; y++)
            {
                System.out.print((char)((Math.random() * 94) + 33));
            }
            System.out.println();
        }
    }

}

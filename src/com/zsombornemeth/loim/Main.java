package com.zsombornemeth.loim;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;

public class Main
{
    public static Random rnd = new Random();

    public static void main(String[] args)
    {
        SorKerdesek sk = new SorKerdesek("sorkerdes.txt");

        Kerdesek k = new Kerdesek("kerdes.txt");
        System.out.println();
        for (int i = 1; i <= 15; i++)
        {
            System.out.printf("\n%d;%d",i,k.getKerdesekSzama(i));
        }

        Jatekos zsombor=new Jatekos("Zsombor");

        try
        {
            System.in.read();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        System.out.println(zsombor.getJatekIdo(LocalDateTime.now()));
    }
}

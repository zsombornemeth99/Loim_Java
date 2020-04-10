package com.zsombornemeth.loim;

import java.util.Random;

public class Main
{
    public static Random rnd = new Random();

    public static void main(String[] args)
    {
        SorKerdesek sk = new SorKerdesek("sorkerdes.txt");

        Kerdesek k = new Kerdesek("kerdes.txt");
        System.out.println(k);


    }
}

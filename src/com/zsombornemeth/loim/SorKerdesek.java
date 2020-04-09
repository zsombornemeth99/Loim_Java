package com.zsombornemeth.loim;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class SorKerdesek
{
    private List<SorKerdes> sorKerdesLista;

    public SorKerdesek(String fajl)
    {
        this.sorKerdesLista = new LinkedList<>();
        try
        {
            FileReader r = new FileReader(fajl);
            BufferedReader br = new BufferedReader(r);
            br.readLine();
            String sor = br.readLine();
            while (sor != null)
            {
                String[] adatok = sor.split(";");

                SorKerdes sk = new SorKerdes(adatok[0], adatok[1], adatok[2], adatok[3], adatok[4],
                        adatok[5], adatok[6]);

                this.sorKerdesLista.add(sk);
                sor=br.readLine();
            }
            br.close();
            r.close();
            for (SorKerdes sk : sorKerdesLista)
            {
                System.out.println(sk);
            }
        }
        catch (Exception e)
        {
            e.getMessage();
        }
    }
}

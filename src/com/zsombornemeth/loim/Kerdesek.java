package com.zsombornemeth.loim;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class Kerdesek
{
    private List<Kerdes>[] kerdesLista;

    public Kerdesek(String fajl)
    {
        this.kerdesLista = new List[15];

        for (int i = 0; i < 15; i++)
        {
            this.kerdesLista[i] = new LinkedList<>();
        }

        try
        {
            FileReader r = new FileReader(fajl);
            BufferedReader br = new BufferedReader(r);

            br.readLine();
            String sor = br.readLine();
            while (sor != null)
            {
                String[] adatok = sor.split(";");

                int nehezseg = Integer.parseInt(adatok[0]);

                Kerdes k = new Kerdes(adatok[1], adatok[2], adatok[3], adatok[4], adatok[5],
                        (adatok[6]).charAt(0), adatok[7]);

                this.kerdesLista[nehezseg - 1].add(k);
                sor = br.readLine();
            }
            br.close();
            r.close();
        }
        catch (FileNotFoundException e)
        {
            e.getMessage();
        }
        catch (Exception e)
        {
            e.getMessage();
        }
    }

    public int getKerdesekSzama(int nehezsegSzintje)
    {
        return this.kerdesLista[nehezsegSzintje - 1].size();
    }

    public Kerdes getVeletlenKerdes(int nehezsegSzintje)
    {
        int veletlenIndex = Main.rnd.nextInt(this.kerdesLista[nehezsegSzintje - 1].size());

        return this.kerdesLista[nehezsegSzintje - 1].get(veletlenIndex);
    }
}

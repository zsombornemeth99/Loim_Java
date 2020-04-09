package com.zsombornemeth.loim;

public class Kerdes extends AltalanosKerdes
{
    private char helyesValasz;
    private String nehezsegiSzint;

    public Kerdes(String kerdes, String valaszA, String valaszB, String valaszC, String valaszD, char helyesValasz, String kategoria)
    {
        super(kerdes, valaszA, valaszB, valaszC, valaszD, kategoria);
        this.helyesValasz = helyesValasz;
    }

    public Kerdes(String nehezsegiSzint, String kerdes, String valaszA, String valaszB, String valaszC, String valaszD, char helyesValasz, String kategoria)
    {
        super(kerdes, valaszA, valaszB, valaszC, valaszD, kategoria);
        this.helyesValasz = helyesValasz;
        this.nehezsegiSzint = nehezsegiSzint;
    }

    public char getHelyesValasz()
    {
        return helyesValasz;
    }

    public void setHelyesValasz(char helyesValasz)
    {
        this.helyesValasz = helyesValasz;
    }

    public String getNehezsegiSzint()
    {
        return nehezsegiSzint;
    }

    public void setNehezsegiSzint(String nehezsegiSzint)
    {
        this.nehezsegiSzint = nehezsegiSzint;
    }

    /*public boolean helyesE(char tipp)
    {
        return;
    }*/

    public String getKerdes()
    {
        return this.getKerdes();
    }

    public String getKerdesKategoria()
    {
        return this.getKategoria();
    }

    public String getKerdesValaszok()
    {

        String s = "\tA - " + this.getValaszA() + "\n";
        s += "\tB - " + this.getValaszB() + "\n";
        s += "\tC - " + this.getValaszC() + "\n";
        s += "\tD - " + this.getValaszD() + "\n";
        //if (new Beallitasok().Cheat)
        //    s += "\n\tHelyes válasz: " + this.helyesValasz + "\n";

        return s;
    }
}

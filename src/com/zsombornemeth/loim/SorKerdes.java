package com.zsombornemeth.loim;

public class SorKerdes extends AltalanosKerdes
{
    private String helyesSorrend;

    public SorKerdes(String kerdes, String valaszA, String valaszB, String valaszC, String valaszD, String helyesSorrend, String kategoria)
    {
        super(kerdes, valaszA, valaszB, valaszC, valaszD, kategoria);
        this.helyesSorrend = helyesSorrend;
    }

    public String getHelyesSorrend()
    {
        return helyesSorrend;
    }

    public void setHelyesSorrend(String helyesSorrend)
    {
        this.helyesSorrend = helyesSorrend;
    }

    @Override
    public String toString()
    {
        String s = "A - " + this.getValaszA();
        s += "B - " + this.getValaszB();
        s += "C - " + this.getValaszC();
        s += "D - " + this.getValaszD();
        s += "Helyes sorrend: " + this.helyesSorrend;
        s += this.getKerdes();
        return s;
    }
}

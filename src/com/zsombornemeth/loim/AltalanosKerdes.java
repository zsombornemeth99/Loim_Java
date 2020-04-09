package com.zsombornemeth.loim;

public class AltalanosKerdes
{
    private String kerdes;
    private String valaszA;
    private String valaszC;
    private String valaszB;
    private String kategoria;
    private String valaszD;

    public AltalanosKerdes(String kerdes, String valaszA, String valaszB, String valaszC, String valaszD, String kategoria )
    {
        this.kerdes = kerdes;
        this.valaszA = valaszA;
        this.valaszB = valaszB;
        this.valaszC = valaszC;
        this.valaszD = valaszD;
        this.kategoria = kategoria;
    }

    public String getKerdes()
    {
        return kerdes;
    }

    public void setKerdes(String kerdes)
    {
        this.kerdes = kerdes;
    }

    public String getValaszA()
    {
        return valaszA;
    }

    public void setValaszA(String valaszA)
    {
        this.valaszA = valaszA;
    }

    public String getValaszC()
    {
        return valaszC;
    }

    public void setValaszC(String valaszC)
    {
        this.valaszC = valaszC;
    }

    public String getValaszB()
    {
        return valaszB;
    }

    public void setValaszB(String valaszB)
    {
        this.valaszB = valaszB;
    }

    public String getKategoria()
    {
        return kategoria;
    }

    public void setKategoria(String kategoria)
    {
        this.kategoria = kategoria;
    }

    public String getValaszD()
    {
        return valaszD;
    }

    public void setValaszD(String valaszD)
    {
        this.valaszD = valaszD;
    }

}

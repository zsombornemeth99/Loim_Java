package com.zsombornemeth.loim;

import java.time.Duration;
import java.time.LocalDateTime;

public class Jatekos
{
    private String nev;
    private Boolean telefonosSegitseg;
    private Boolean felezoSegitseg;
    private Boolean kozonsegSegitseg;
    private LocalDateTime jatekKezdete;

    public Jatekos(String nev)
    {
        this.nev = nev;

        this.telefonosSegitseg = false;
        this.felezoSegitseg = false;
        this.kozonsegSegitseg = false;
        this.jatekKezdete = LocalDateTime.now();
    }

    public Jatekos(String nev, Boolean telefonosSegitseg, Boolean felezoSegitseg, Boolean kozonsegSegitseg, LocalDateTime jatekKezdete)
    {
        this.nev = nev;
        this.telefonosSegitseg = telefonosSegitseg;
        this.felezoSegitseg = felezoSegitseg;
        this.kozonsegSegitseg = kozonsegSegitseg;
        this.jatekKezdete = jatekKezdete;
    }

    public String getNev()
    {
        return nev;
    }

    public void setNev(String nev)
    {
        this.nev = nev;
    }

    public Boolean getTelefonosSegitseg()
    {
        return telefonosSegitseg;
    }

    public void setTelefonosSegitseg(Boolean telefonosSegitseg)
    {
        this.telefonosSegitseg = telefonosSegitseg;
    }

    public Boolean getFelezoSegitseg()
    {
        return felezoSegitseg;
    }

    public void setFelezoSegitseg(Boolean felezoSegitseg)
    {
        this.felezoSegitseg = felezoSegitseg;
    }

    public Boolean getKozonsegSegitseg()
    {
        return kozonsegSegitseg;
    }

    public void setKozonsegSegitseg(Boolean kozonsegSegitseg)
    {
        this.kozonsegSegitseg = kozonsegSegitseg;
    }

    public LocalDateTime getJatekKezdete()
    {
        return jatekKezdete;
    }

    public void setJatekKezdete(LocalDateTime jatekKezdete)
    {
        this.jatekKezdete = jatekKezdete;
    }

    public void telefonosSegitsegetHasznal()
    {
        this.telefonosSegitseg = true;
    }

    public void felezoSegitsegetHasznal()
    {
        this.felezoSegitseg = true;
    }

    public void kozonsegSegitsegetHasznal()
    {
        this.kozonsegSegitseg = true;
    }

    public long getJatekIdo(LocalDateTime jatekVege)
    {
        return Duration.between(this.jatekKezdete, jatekVege).toSeconds();
    }
}

package com.github.saulocalixto.mf2018.lonic.negocio;

/**
 * Created by Saulo Calixto on 26/11/18.
 */
public class Loinc {
    private String loincNum;
    private String shortname;
    private String longName;

    public String getLoincNum() {
        return loincNum;
    }

    public String getShortname() {
        return shortname;
    }

    public String getLongName() {
        return longName;
    }

    public void setLoincNum(String loincNum) {
        this.loincNum = loincNum;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }
}

package com.github.saulocalixto.mf2018.lonic.negocio;

/**
 * Created by Saulo Calixto on 26/11/18.
 */
public class Loinc {

    /**
     * Define o número loinc.
     */
    private String loincNum;

    /**
     * Define o shortname.
     */
    private String shortname;

    /**
     * Define o longName.
     */
    private String longName;

    /**
     * Setta o valor de loincNum.
     * @param loincNum O número do Loinc.
     */
    public void setLoincNum(String loincNum) {
        this.loincNum = loincNum;
    }

    /**
     * Setta o valor de shortName.
     * @param shortName O número do shortName.
     */
    public void setShortname(String shortName) {
        this.shortname = shortName;
    }

    /**
     * Setta o valor de longName.
     * @param longName O número do longName.
     */
    public void setLongName(String longName) {
        this.longName = longName;
    }
}

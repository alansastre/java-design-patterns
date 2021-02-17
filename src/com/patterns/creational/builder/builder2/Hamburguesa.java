package com.patterns.creational.builder.builder2;

/**
 * Producto
 */
public class Hamburguesa {

    private String pan;
    private String carne;
    private String salsas;
    private String patatas;

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getSalsas() {
        return salsas;
    }

    public void setSalsas(String salsas) {
        this.salsas = salsas;
    }

    public String getPatatas() {
        return patatas;
    }

    public void setPatatas(String patatas) {
        this.patatas = patatas;
    }

    @Override
    public String toString() {
        return "Hamburguesa{" +
                "pan='" + pan + '\'' +
                ", carne='" + carne + '\'' +
                ", salsas='" + salsas + '\'' +
                ", patatas='" + patatas + '\'' +
                '}';
    }
}

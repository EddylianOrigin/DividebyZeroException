package com.company;

public class Kalkul {
    private long nenner;
    private long zaehler;


    public Kalkul(long z, long n) throws DividebyZeroException {
        if (n == 0) {
            throw new DividebyZeroException("Error Division by Zero is undefined");
        } else {
            nenner = n;
            zaehler = z;
        }


    }

    @Override
    public String toString() {
        return "Kalkul{" +
                "nenner=" + nenner +
                ", zaehler=" + zaehler +
                '}';
    }


    public void setNenner(long nenner) {
        this.nenner = nenner;
    }


    public void setZaehler(long zaehler) {
        this.zaehler = zaehler;
    }
}

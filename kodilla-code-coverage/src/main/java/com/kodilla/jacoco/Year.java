package com.kodilla.jacoco;

public class Year {
    int rok;

    public Year(int rok) {
        this.rok = rok;
    }

    public boolean isLeap() {
        return this.rok % 4 == 0 && (this.rok % 100 != 0 || this.rok % 400 == 0);
    }

}


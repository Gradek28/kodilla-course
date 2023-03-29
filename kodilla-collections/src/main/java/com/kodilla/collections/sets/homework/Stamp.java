package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private int size;
    private boolean isStamped;

    public Stamp(String stampName, int size, boolean isStamped) {
        this.stampName = stampName;
        this.size = size;
        this.isStamped = isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return size == stamp.size &&
                isStamped == stamp.isStamped &&
                Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, size, isStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", size=" + size +
                ", isStamped=" + isStamped +
                '}';
    }
}

package com.pluralsight.finance;

public interface Valuable extends Comparable<Valuable> {
    double getValue();
    //contract agreement
    @Override
    default int compareTo(Valuable other) {
        return Double.compare(this.getValue(), other.getValue());
    }
}



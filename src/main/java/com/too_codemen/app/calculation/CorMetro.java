package com.too_codemen.app.calculation;

public class CorMetro {

    int ODistance;
    int ADistance;

    public int DistanceCompare(int ODistance, int ADistance) {
        int CorDistance;

        if (ODistance < 5 && ADistance < 5) {
            CorDistance = 0;
        } else if (ODistance >= 5 && ODistance < 10 && ADistance >= 5 && ADistance < 10) {
            CorDistance = 0;
        } else if (ODistance >= 10 && ODistance < 15 && ADistance >= 10 && ADistance < 15) {
            CorDistance = 0;
        } else if (ODistance >= 15 && ODistance < 30 && ADistance >= 15 && ADistance < 30) {
            CorDistance = 0;
        } else if (ODistance >= 30 && ODistance < 60 && ADistance >= 30 && ADistance < 60) {
            CorDistance = 0;
        } else if (ODistance >= 60 && ODistance <= 90 && ADistance >= 60 && ADistance <= 90) {
            CorDistance = 0;
        }
        // выше - это реализация 0 значений, последующее - реализация действующих ненулевых значений

        else if (ODistance < 5 && ADistance >= 5 && ADistance < 10) {
            CorDistance = 7;
        } else if (ODistance < 5 && ADistance >= 10 && ADistance < 15) {
            CorDistance = 12;
        } else if (ODistance >= 5 && ODistance < 10 && ADistance < 5) {
            CorDistance = -7;
        } else if (ODistance >= 5 && ODistance < 10 && ADistance >= 10 && ADistance < 15) {
            CorDistance = 4;
        } else if (ODistance >= 5 && ODistance < 10 && ADistance >= 15 && ADistance < 30) {
            CorDistance = 9;
        } else if (ODistance >= 10 && ODistance < 15 && ADistance < 5) {
            CorDistance = -11;
        } else if (ODistance >= 10 && ODistance < 15 && ADistance < 5) {
            CorDistance = -11;
        } else if (ODistance >= 10 && ODistance < 15 && ADistance >= 5 && ADistance < 10) {
            CorDistance = -4;
        } else if (ODistance >= 10 && ODistance < 15 && ADistance >= 15 && ADistance < 30) {
            CorDistance = 5;
        } else if (ODistance >= 10 && ODistance < 15 && ADistance >= 30 && ADistance < 60) {
            CorDistance = 11;
        } else if (ODistance >= 15 && ODistance < 30 && ADistance >= 5 && ADistance < 10) {
            CorDistance = -8;
        } else if (ODistance >= 15 && ODistance < 30 && ADistance >= 10 && ADistance < 15) {
            CorDistance = -5;
        } else if (ODistance >= 15 && ODistance < 30 && ADistance >= 30 && ADistance < 60) {
            CorDistance = 6;
        } else if (ODistance >= 15 && ODistance < 30 && ADistance >= 60 && ADistance < 90) {
            CorDistance = 10;
        } else if (ODistance >= 30 && ODistance < 60 && ADistance >= 10 && ADistance < 15) {
            CorDistance = -10;
        } else if (ODistance >= 30 && ODistance < 60 && ADistance >= 15 && ADistance < 30) {
            CorDistance = -6;
        } else if (ODistance >= 30 && ODistance < 60 && ADistance >= 60 && ADistance < 90) {
            CorDistance = 4;
        } else if (ODistance >= 60 && ODistance < 90 && ADistance >= 15 && ADistance < 30) {
            CorDistance = -9;
        } else if (ODistance >= 60 && ODistance < 90 && ADistance >= 30 && ADistance < 60) {
            CorDistance = -4;
        } else {
            CorDistance = 0;
        }

        return CorDistance;
    }

    double DistanceValue = DistanceCompare(ODistance, ADistance);

}

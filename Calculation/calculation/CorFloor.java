package com.too_codemen.app.calculation;

public class CorFloor {

    int HouseFloor;

    int OFlatFloor;
    int AFlatFloor;


    public double FloorCompare(int OFlatFloor, int AFlatFloor, int HouseFloor) {
        double CorFloor;
        if (OFlatFloor == AFlatFloor) {
            CorFloor = 0;
        } else if (OFlatFloor == 1 && AFlatFloor == HouseFloor) {
            CorFloor = -3.1;
        } else if (OFlatFloor == 1 && AFlatFloor != HouseFloor) {
            CorFloor = -7;
        } else if (OFlatFloor == HouseFloor && AFlatFloor == 1) {
            CorFloor = 3.2;
        } else if (OFlatFloor == HouseFloor && AFlatFloor != 1) {
            CorFloor = -4;
        } else if (AFlatFloor == 1 && OFlatFloor != HouseFloor) {
            CorFloor = 7.5;
        } else if (AFlatFloor == HouseFloor && OFlatFloor != HouseFloor) {
            CorFloor = 4.2;
        } else {
            CorFloor = 0;
        }
        return CorFloor;
    }

    double Corvalue = FloorCompare(OFlatFloor, AFlatFloor, HouseFloor);

}

package com.too_codemen.app.calculation;

public class Correction {




    CorFloor corFloor = new CorFloor();
    CorSquareFlat corSquareFlat = new CorSquareFlat();
    CorSquareKitchen corSquareKitchen = new CorSquareKitchen();
    CorBalcony corBalcony = new CorBalcony();
    CorMetro corMetro = new CorMetro();
    CorRepair corRepair = new CorRepair();
    CorTrade corTrade = new CorTrade();

    double cor = corFloor.Corvalue + corSquareFlat.FlatValue + corSquareKitchen.KitchenValue + corBalcony.BalconyValue + corMetro.DistanceValue + corTrade.TradeValue;

    int CoA = 1;
    double CoO = CoA * (1 + cor) / 100;


}

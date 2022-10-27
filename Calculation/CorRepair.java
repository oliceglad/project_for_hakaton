package Calculation;

public class CorRepair {

    String ORepair;
    String ARepair;

    public int RepairCompare(String ORepair, String ARepair)
    {
        int OValue = 0;
        int AValue = 0;

        int ExtraCost;

        if (ORepair == "Без отделки" && ORepair == "без отделки")
        {
            OValue = 0;
        }
        else if (ORepair == "Эконом" && ORepair == "эконом" && ORepair == "Муниципальный ремонт" && ORepair == "муниципальный ремонт")
        {
            OValue = 1;
        }
        else if (ORepair == "Улучшенный" && ORepair == "улучшенный" && ORepair == "Современная отделка" && ORepair == "современная отделка")
        {
            OValue = 2;
        }
        else
        {
            System.out.println("Ошибка ввода");
        }

        if (OValue == AValue)
        {
            ExtraCost = 0;
        }
        else if (OValue == 1 && AValue == 0 )
        {
            ExtraCost = 13400;
        }
        else if (OValue == 2 && AValue == 0 )
        {
            ExtraCost = 20100;
        }
        else if (OValue == 2 && AValue == 1 )
        {
            ExtraCost = 6700;
        }
        else if (OValue == 0 && AValue == 1)
        {
            ExtraCost = -13400;
        }
        else if(OValue == 0 && AValue == 2)
        {
            ExtraCost = -20100;
        }
        else if (OValue == 1 && AValue == 2 )
        {
            ExtraCost = -6700;
        }
        else
        {
            ExtraCost = 0;
        }

        return ExtraCost;

    }

    double RepairValue = RepairCompare(ORepair, ARepair);

}

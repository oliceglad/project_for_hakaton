import javax.swing.plaf.IconUIResource;

public class CorSquareKitchen {

    int OSquareKitchen;
    int ASquareKitchen;

    public double KitchenCompare(int OSquareKitchen, int ASquareKitchen) {
        double CorSquareKitchen;

        if (OSquareKitchen < 7 && ASquareKitchen < 7) {
            CorSquareKitchen = 0;
        } else if (OSquareKitchen >= 7 && OSquareKitchen < 10 && ASquareKitchen >= 7 && ASquareKitchen < 10) {
            CorSquareKitchen = 0;
        } else if (OSquareKitchen >= 10 && OSquareKitchen <= 15 && ASquareKitchen >= 10 && ASquareKitchen <= 15) {
            CorSquareKitchen = 0;
        } else if (OSquareKitchen >= 10 && OSquareKitchen <= 15 && ASquareKitchen >= 10 && ASquareKitchen <= 15) {
            CorSquareKitchen = 0;
        } else if (OSquareKitchen < 7 && ASquareKitchen >= 7 && ASquareKitchen <= 10) {
            CorSquareKitchen = -2.9;
        } else if (OSquareKitchen < 7 && ASquareKitchen >= 10 && ASquareKitchen <= 15) {
            CorSquareKitchen = -8.3;
        } else if (OSquareKitchen >= 7 && OSquareKitchen < 10 && ASquareKitchen < 7) {
            CorSquareKitchen = 3;
        } else if (OSquareKitchen >= 7 && OSquareKitchen < 10 && ASquareKitchen >= 10 && ASquareKitchen <= 15) {
            CorSquareKitchen = -5.5;
        } else if (OSquareKitchen >= 10 && OSquareKitchen <= 15 && ASquareKitchen < 7) {
            CorSquareKitchen = 9;
        } else if (OSquareKitchen >= 10 && OSquareKitchen <= 15 && ASquareKitchen >= 7 && ASquareKitchen < 10) {
            CorSquareKitchen = 5.8;
        } else {
            CorSquareKitchen = 0;
        }

        return CorSquareKitchen;
    }

    double KitchenValue = KitchenCompare(OSquareKitchen, ASquareKitchen);

}

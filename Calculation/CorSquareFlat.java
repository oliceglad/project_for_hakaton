import java.security.cert.CertPath;

public class CorSquareFlat {
    int OSquare;
    int ASquare;

    public int SquareCompare(int OSquare, int ASquare) {
        int CorSquareFlatValue;
        if (OSquare < 30 && ASquare < 30) {
            CorSquareFlatValue = 0;
        } else if (OSquare >= 30 && OSquare < 50 && ASquare >= 30 && ASquare < 50) {
            CorSquareFlatValue = 0;
        } else if (OSquare >= 50 && OSquare < 65 && ASquare >= 50 && ASquare < 65) {
            CorSquareFlatValue = 0;
        } else if (OSquare >= 65 && OSquare < 90 && ASquare >= 65 && ASquare < 90) {
            CorSquareFlatValue = 0;
        } else if (OSquare >= 90 && OSquare <= 120 && ASquare >= 90 && ASquare <= 120) {
            CorSquareFlatValue = 0;
        } else if (OSquare > 120 && ASquare > 120) {
            CorSquareFlatValue = 0;
        }
        // Это всё реализация нулей, далее пойдут реализаци ненулевых действующих значений

        else if (OSquare < 30 && ASquare >= 30 && ASquare < 50) {
            CorSquareFlatValue = 6;
        } else if (OSquare < 30 && ASquare >= 50 && ASquare < 65) {
            CorSquareFlatValue = 14;
        } else if (OSquare >= 30 && OSquare < 50 && ASquare < 30) {
            CorSquareFlatValue = -6;
        } else if (OSquare >= 30 && OSquare < 50 && ASquare >= 50 && ASquare < 65) {
            CorSquareFlatValue = 7;
        } else if (OSquare >= 30 && OSquare >= 65 && ASquare < 90) {
            CorSquareFlatValue = 14;
        } else if (OSquare >= 50 && OSquare < 65 && ASquare < 30) {
            CorSquareFlatValue = -12;
        } else if (OSquare >= 50 && OSquare < 65 && ASquare >= 30 && ASquare < 50) {
            CorSquareFlatValue = -7;
        } else if (OSquare >= 50 && OSquare < 65 && ASquare >= 65 && ASquare < 90) {
            CorSquareFlatValue = 6;
        } else if (OSquare >= 50 && OSquare < 65 && ASquare >= 90 && ASquare < 120) {
            CorSquareFlatValue = 13;
        } else if (OSquare >= 65 && OSquare < 90 && ASquare >= 30 && ASquare < 50) {
            CorSquareFlatValue = -12;
        } else if (OSquare >= 65 && OSquare < 90 && ASquare >= 50 && ASquare < 65) {
            CorSquareFlatValue = -6;
        } else if (OSquare >= 65 && OSquare < 90 && ASquare >= 90 && ASquare <= 120) {
            CorSquareFlatValue = 6;
        } else if (OSquare >= 65 && OSquare < 90 && ASquare > 120) {
            CorSquareFlatValue = 9;
        } else if (OSquare >= 90 && OSquare <= 120 && ASquare >= 50 && ASquare < 65) {
            CorSquareFlatValue = -11;
        } else if (OSquare >= 90 && OSquare <= 120 && ASquare >= 65 && ASquare < 90) {
            CorSquareFlatValue = -6;
        } else if (OSquare >= 90 && OSquare <= 120 && ASquare > 120) {
            CorSquareFlatValue = 3;
        } else if (OSquare > 120 && ASquare >= 65 && ASquare < 90) {
            CorSquareFlatValue = -8;
        } else if (OSquare > 120 && ASquare >= 90 && ASquare <= 120) {
            CorSquareFlatValue = -3;
        } else {
            CorSquareFlatValue = 0;
        }

        return CorSquareFlatValue;
    }

    double FlatValue = SquareCompare(OSquare, ASquare);

}

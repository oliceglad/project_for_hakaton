public class CorBalcony {

    boolean OBalcony;
    boolean ABalcony;

    public double IsBalcony(boolean OBalcony, boolean ABalcony) {
        double CorBalcony;

        int Oflag;
        int Aflag;

        if (OBalcony == true) {
            Oflag = 1;
        } else {
            Oflag = 0;
        }

        if (ABalcony == true) {
            Aflag = 1;
        } else {
            Aflag = 0;
        }

        if (Oflag == Aflag) {
            CorBalcony = 0;
        } else if (Oflag == 1) {
            CorBalcony = 5.3;
        } else if (Aflag == 1) {
            CorBalcony = -5;
        } else {
            CorBalcony = 0;
        }
        return CorBalcony;

    }

    double BalconyValue = IsBalcony(OBalcony, ABalcony);

}

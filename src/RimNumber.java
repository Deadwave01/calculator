import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum RimNumber {
    I(1,"I"),
    II(2,"II"),
    III(3,"III"),
    IV(4,"IV"),
    V(5,"V"),
    VI(6,"VI"),
    VII(7,"VII"),
    VIII(8,"VIII"),
    IX(9,"IX"),
    X(10,"X");

    private int number;
    private String rimnumber;

    private static List<RimNumber> rimNumbers = new ArrayList<>(Arrays.asList(I,II,III,IV,V,VI,VII,VIII,IX,X));

    RimNumber(int number, String rimnumber) {
        this.number = number;
        this.rimnumber = rimnumber;
    }
    public int getNumber() {
        return number;
    }

    public String getRimnumber() {
        return rimnumber;
    }

    public static List<RimNumber> getRimNumbers() {
        return rimNumbers;
    }
}

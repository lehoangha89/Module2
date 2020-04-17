package AdvanceedObjectOrientedDesign.ThucHanh.InterfaceComparator;

import java.util.Comparator;

public class SquareComparetor implements Comparator<Square> {
    @Override
    public int compare(Square o1, Square o2) {
        if (o1.getSide()>o1.getSide())return 1;
        else if (o1.getSide()<o1.getSide())return -1;
        return 0;
    }
}

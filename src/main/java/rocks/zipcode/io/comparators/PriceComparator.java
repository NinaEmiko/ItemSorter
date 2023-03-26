package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {

    @Override
    public int compare(Item a, Item b) {
        if (a.getPrice() > b.getPrice()) {
            return 1;
        } else if (a.getPrice() < b.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}
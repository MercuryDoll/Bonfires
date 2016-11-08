package uk.co.wehavecookies56.bonfires;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Toby on 05/11/2016.
 */
public class TabBonfires extends CreativeTabs {

    public TabBonfires(String label) {
        super(getNextID(), label);
    }

    @Override
    public Item getTabIconItem() {
        return Bonfires.estusFlask;
    }
}
package mchetvorkata.theoutcastsland;

import mchetvorkata.theoutcastsland.init.TOCItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TOLTab extends CreativeTabs {

	public TOLTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return TOCItems.weak_health_orb;
	}

}

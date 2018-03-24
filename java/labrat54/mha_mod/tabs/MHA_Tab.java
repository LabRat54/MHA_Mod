package labrat54.mha_mod.tabs;

import labrat54.mha_mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MHA_Tab extends CreativeTabs {

	public MHA_Tab(String name) {
		super("myheroacadamiatab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.INGOT_DEKU);
	}

}

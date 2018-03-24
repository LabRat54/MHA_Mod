package labrat54.mha_mod.init;

import java.util.ArrayList;
import java.util.List;

import labrat54.mha_mod.objects.amour.ArmorBase;
import labrat54.mha_mod.objects.items.ItemBase;
import labrat54.mha_mod.objects.tools.ToolAxe;
import labrat54.mha_mod.objects.tools.ToolHoe;
import labrat54.mha_mod.objects.tools.ToolPickaxe;
import labrat54.mha_mod.objects.tools.ToolShovel;
import labrat54.mha_mod.objects.tools.ToolSword;
import labrat54.mha_mod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial TOOL_DEKU = EnumHelper.addToolMaterial("tool_deku", 2, 40, 5f, 1.5f, 6);
	public static final ToolMaterial TOOL_GAMMA = EnumHelper.addToolMaterial("tool_gamma", 2, 40, 5f, 1.5f, 6);
	public static final ArmorMaterial ARMOR_DEKU = EnumHelper.addArmorMaterial("armor_deku", Reference.MOD_ID + ":deku", 50, new int[] {1, 4, 4, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);
	public static final ArmorMaterial ARMOR_GAMMA = EnumHelper.addArmorMaterial("armor_gamma", Reference.MOD_ID + ":gamma", 50, new int[] {1, 4, 4, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);
	
	//Items
	public static final Item INGOT_DEKU = new ItemBase("ingot_deku");
	public static final Item INGOT_GAMMA = new ItemBase("ingot_gamma");

	//Tools
	public static final Item AXE_DEKU = new ToolAxe("axe_deku", TOOL_DEKU);
	public static final Item HOE_DEKU = new ToolHoe("hoe_deku", TOOL_DEKU);
	public static final Item SHOVEL_DEKU = new ToolShovel("shovel_deku", TOOL_DEKU);
	public static final Item PICKAXE_DEKU = new ToolPickaxe("pickaxe_deku", TOOL_DEKU);
	public static final Item SWORD_DEKU = new ToolSword("sword_deku", TOOL_DEKU);
	
	public static final Item AXE_GAMMA = new ToolAxe("axe_gamma", TOOL_GAMMA);
	public static final Item HOE_GAMMA = new ToolHoe("hoe_gamma", TOOL_GAMMA);
	public static final Item SHOVEL_GAMMA = new ToolShovel("shovel_gamma", TOOL_GAMMA);
	public static final Item PICKAXE_GAMMA = new ToolPickaxe("pickaxe_gamma", TOOL_GAMMA);
	public static final Item SWORD_GAMMA = new ToolSword("sword_gamma", TOOL_GAMMA);
	
	//Armor
	public static final Item HELMET_DEKU = new ArmorBase("helmet_deku", ARMOR_DEKU, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_DEKU = new ArmorBase("chestplate_deku", ARMOR_DEKU, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_DEKU = new ArmorBase("leggings_deku", ARMOR_DEKU, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_DEKU = new ArmorBase("boots_deku", ARMOR_DEKU, 1, EntityEquipmentSlot.FEET);
	
	public static final Item HELMET_GAMMA = new ArmorBase("helmet_gamma", ARMOR_GAMMA, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_GAMMA = new ArmorBase("chestplate_gamma", ARMOR_GAMMA, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_GAMMA = new ArmorBase("leggings_gamma", ARMOR_GAMMA, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_GAMMA = new ArmorBase("boots_gamma", ARMOR_GAMMA, 1, EntityEquipmentSlot.FEET);
}

package labrat54.mha_mod.util.handlers;

import labrat54.mha_mod.init.BlockInit;
import labrat54.mha_mod.init.ItemInit;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {
	
	public static void registerCrafting() {
		
		//Shaped
		GameRegistry.addShapedRecipe(new ResourceLocation("mha_mod:block_deku"), new ResourceLocation("mha_mod:mha_blocks"), new ItemStack(BlockInit.BLOCK_DEKU), new Object[] {"III","III","III", 'I', ItemInit.INGOT_DEKU});
		GameRegistry.addShapedRecipe(new ResourceLocation("mha_mod:block_gamma"), new ResourceLocation("mha_mod:mha_blocks"), new ItemStack(BlockInit.BLOCK_GAMMA), new Object[] {"III","III","III", 'I', ItemInit.INGOT_GAMMA});
		
		//Shapeless
		GameRegistry.addShapelessRecipe(new ResourceLocation("mha_mod:ingot_deku"), new ResourceLocation("mha_mod:mha_items"), new ItemStack(ItemInit.INGOT_DEKU, 9), new Ingredient[] {Ingredient.fromItem(Item.getItemFromBlock(BlockInit.BLOCK_DEKU))});
		GameRegistry.addShapelessRecipe(new ResourceLocation("mha_mod:ingot_gamma"), new ResourceLocation("mha_mod:mha_items"), new ItemStack(ItemInit.INGOT_GAMMA, 9), new Ingredient[] {Ingredient.fromItem(Item.getItemFromBlock(BlockInit.BLOCK_GAMMA))});
		
		//Tools
		registerToolCrafting(ItemInit.AXE_DEKU, ItemInit.HOE_DEKU, ItemInit.SHOVEL_DEKU, ItemInit.SWORD_DEKU, ItemInit.PICKAXE_DEKU, ItemInit.INGOT_DEKU);
		registerToolCrafting(ItemInit.AXE_GAMMA, ItemInit.HOE_GAMMA, ItemInit.SHOVEL_GAMMA, ItemInit.SWORD_GAMMA, ItemInit.PICKAXE_GAMMA, ItemInit.INGOT_GAMMA);
		
		//Armor
		registerArmorCrafting(ItemInit.HELMET_DEKU, ItemInit.HELMET_DEKU, ItemInit.HELMET_DEKU, ItemInit.HELMET_DEKU, ItemInit.INGOT_DEKU);
	}
	
	public static void registerSmelting() {
		GameRegistry.addSmelting(BlockInit.ORE_DEKU, new ItemStack(ItemInit.INGOT_DEKU), 10.5f);
		GameRegistry.addSmelting(BlockInit.ORE_GAMMA, new ItemStack(ItemInit.INGOT_GAMMA), 15f);
	}
	
	public static void registerToolCrafting(Item axe, Item hoe, Item shovel, Item sword, Item pickaxe, Item ingot) {
		GameRegistry.addShapedRecipe(new ResourceLocation("" + axe.getRegistryName()), new ResourceLocation("mha_mod:tools"), new ItemStack(axe), new Object[] {" II"," SI"," S ", 'I', ingot, 'S', Items.STICK});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + hoe.getRegistryName()), new ResourceLocation("mha_mod:tools"), new ItemStack(hoe), new Object[] {" II"," S "," S ", 'I', ingot, 'S', Items.STICK});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + shovel.getRegistryName()), new ResourceLocation("mha_mod:tools"), new ItemStack(shovel), new Object[] {" I "," S "," S ", 'I', ingot, 'S', Items.STICK});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + shovel.getRegistryName()), new ResourceLocation("mha_mod:tools"), new ItemStack(shovel), new Object[] {"I  ","S  ","S  ", 'I', ingot, 'S', Items.STICK});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + shovel.getRegistryName()), new ResourceLocation("mha_mod:tools"), new ItemStack(shovel), new Object[] {"  I","  S","  S", 'I', ingot, 'S', Items.STICK});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + sword.getRegistryName()), new ResourceLocation("mha_mod:tools"), new ItemStack(sword), new Object[] {" I "," I "," S ", 'I', ingot, 'S', Items.STICK});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + sword.getRegistryName()), new ResourceLocation("mha_mod:tools"), new ItemStack(sword), new Object[] {"I  ","I  ","S  ", 'I', ingot, 'S', Items.STICK});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + sword.getRegistryName()), new ResourceLocation("mha_mod:tools"), new ItemStack(sword), new Object[] {"  I","  I","  S", 'I', ingot, 'S', Items.STICK});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + pickaxe.getRegistryName()), new ResourceLocation("mha_mod:tools"), new ItemStack(pickaxe), new Object[]{"III"," S "," S ", 'I', ingot, 'S', Items.STICK});
	}
	
	public static void registerArmorCrafting(Item helmet, Item chestplate, Item leggings, Item boots, Item ingot) {
		GameRegistry.addShapedRecipe(new ResourceLocation("" + helmet.getRegistryName()), new ResourceLocation("mha_mod:armor"), new ItemStack(helmet), new Object[] {"III","I I", 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + chestplate.getRegistryName()), new ResourceLocation("mha_mod:armor"), new ItemStack(chestplate), new Object[] {"I I","III","III", 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + leggings.getRegistryName()), new ResourceLocation("mha_mod:armor"), new ItemStack(leggings), new Object[] {"III","I I","I I", 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + boots.getRegistryName()), new ResourceLocation("mha_mod:armor"), new ItemStack(boots), new Object[] {"I I","I I", 'I', ingot});
	}
}

package labrat54.mha_mod.init;

import java.util.ArrayList;
import java.util.List;

import labrat54.mha_mod.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Ores
	public static final Block ORE_DEKU = new BlockBase("ore_deku", Material.ROCK, 10f);
	public static final Block ORE_GAMMA = new BlockBase("ore_gamma", Material.ROCK, 15f);
	
	//Blocks
	public static final Block BLOCK_DEKU = new BlockBase("block_deku", Material.IRON, 12f);
	public static final Block BLOCK_GAMMA = new BlockBase("block_gamma", Material.IRON, 16f);
}

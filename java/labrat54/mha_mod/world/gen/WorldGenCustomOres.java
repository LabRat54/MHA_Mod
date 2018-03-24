package labrat54.mha_mod.world.gen;

import java.util.Random;

import com.ibm.icu.impl.IllegalIcuArgumentException;

import labrat54.mha_mod.init.BlockInit;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator {
	
	private WorldGenerator ore_deku;
	private WorldGenerator ore_gamma;
	
	public WorldGenCustomOres() {
		ore_deku = new WorldGenMinable(BlockInit.ORE_DEKU.getDefaultState(), 7);
		ore_gamma = new WorldGenMinable(BlockInit.ORE_GAMMA.getDefaultState(), 5);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
		case -1/*Nether*/:
			break;
		case 0/*Overworld*/:
			runGenerater(ore_deku, world, random, chunkX, chunkZ, 12, 1, 70);
			runGenerater(ore_gamma, world, random, chunkX, chunkZ, 8, 1, 20);
			break;
		case 1/*End*/:
			break;
		}
	}
	
	private void runGenerater(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHight, int maxHight) {
		if(minHight > maxHight || minHight < 0 || maxHight > 256) {
			throw new IllegalIcuArgumentException("Ore Generated Out of Bounds");
		}
		
		int hightDiff = maxHight - minHight + 1;
		for(int i = 0; i < chance; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHight + rand.nextInt(hightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x, y, z));
		}
	}
}

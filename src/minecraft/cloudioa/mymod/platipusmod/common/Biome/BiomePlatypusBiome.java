package cloudioa.mymod.platipusmod.common.Biome;

import cloudioa.mymod.platipusmod.common.Platipusmod;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomePlatypusBiome extends BiomeGenBase{

	public BiomePlatypusBiome(int par1) {
		super(par1);
		this.topBlock = (byte)Platipusmod.BlueGrass.blockID;
		this.fillerBlock = (byte)Block.dirt.blockID;
				
	}

}

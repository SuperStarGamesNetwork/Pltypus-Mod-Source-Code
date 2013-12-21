package cloudioa.mymod.platipusmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockPlatypusGrass extends Block{

	public BlockPlatypusGrass(int par1, Material par2Material) {
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
	}
	public Icon field_94392_a;
	public Icon field_94393_b;
	public void registerIcons(IconRegister par1IconRegister) {
		blockIcon = par1IconRegister.registerIcon("Platypusmod:PlatypusGrass_side");
    field_94392_a = par1IconRegister.registerIcon("Platypusmod:PlatypusGrass_top");
    field_94393_b = par1IconRegister.registerIcon("platypusmod:platypusgrass_bottom");

	
	
	
	
	
	
}
}

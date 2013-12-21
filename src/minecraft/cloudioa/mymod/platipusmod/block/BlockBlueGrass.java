package cloudioa.mymod.platipusmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockBlueGrass extends Block{

	public BlockBlueGrass(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setStepSound(Block.soundGrassFootstep);
	}
	public Icon field_94393_a;
	public Icon field_94392_b;
	public void registerIcons(IconRegister par1IconRegister) {
		blockIcon = par1IconRegister.registerIcon("Platypusmod:BlueGrass_side");
    field_94393_a = par1IconRegister.registerIcon("Platypusmod:BlueGrass_top");
    field_94392_b = par1IconRegister.registerIcon("Platypusmod:dirt");
}
public Icon getIcon(int par1, int par2) {
	return par1 == 0 ? this.field_94392_b : (par1 == 1 ? this.field_94393_a : this.blockIcon);
}
}

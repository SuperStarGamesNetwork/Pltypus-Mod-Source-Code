package cloudioa.mymod.platipusmod.Armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;

public class PlatypusBoots extends ItemArmor{

	public PlatypusBoots(int par1, 
			EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	public void updateIcons(IconRegister iconRegister)  {
		 itemIcon = iconRegister.registerIcon("Platipusmod:PlatypusChestplate");
		}

}

package cloudioa.mymod.platipusmod.Armor;

import cloudioa.mymod.platipusmod.common.Platipusmod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class PlatypusChestplate extends ItemArmor{

	public PlatypusChestplate(int par1,
			EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	
		public void updateIcons(IconRegister iconRegister)  {
			 itemIcon = iconRegister.registerIcon("Platipusmod:PlatypusChestplate");
			}
		@Override
		public void onArmorTickUpdate(World world, EntityPlayer player, ItemStack itemstack)
		{
		if (itemstack.itemID == Platipusmod.PlatypusChestplate.itemID)
		{
			player.capabilities.allowFlying = true;
		}
		else 
		{
			player.capabilities.allowFlying = false;
		}
	}
}


	
	
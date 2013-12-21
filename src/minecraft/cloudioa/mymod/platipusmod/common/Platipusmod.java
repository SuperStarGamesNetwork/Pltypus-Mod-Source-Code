package cloudioa.mymod.platipusmod.common;

import cloudioa.mymod.platipusmod.Armor.PlatypusBoots;
import cloudioa.mymod.platipusmod.Armor.PlatypusChestplate;
import cloudioa.mymod.platipusmod.Armor.PlatypusHelmit;
import cloudioa.mymod.platipusmod.block.BlockBlueGrass;
import cloudioa.mymod.platipusmod.common.Biome.BiomePlatypusBiome;
import cloudioa.mymod.platipusmod.entity.EntityPlatypus;
import cloudioa.mymod.platipusmod.item.ItemPlatypusbeek;
import cloudioa.mymod.platipusmod.model.platypusmodel;
import cloudioa.mymod.platipusmod.render.RenderPlatypus;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.common.EnumHelper;
import cloudioa.mymod.platipusmod.Armor.PlatypusChestplate;


@Mod(modid = "Platypus Mod", name = "Platypus Mod", version = "1.7.4_2 beta")
public class Platipusmod {

public static Item PlatypusBoots;
public static Item Platypusbeek;
public static Item PlatypusHelmit;
public static Item PlatypusChestplate;
static int startEntityId = 300;
public static final Block BlueGrass = (new BlockBlueGrass(160, Material.grass).setUnlocalizedName("BlueGrass").setHardness(0.5F).setResistance(0.5F).setCreativeTab(CreativeTabs.tabBlock));
public static BiomeGenBase PlatypusBiome;

public static EnumArmorMaterial ArmorPlatypus = EnumHelper.addArmorMaterial("PLATYPUS", 33, new int[]{3, 8, 6, 3}, 10);

public static int getUniqueEntityId() {
	do {
		startEntityId++;
	}
	while (EntityList.getStringFromID(startEntityId) != null);
	return startEntityId++;
}


public static void registerEntityEgg( Class<? extends Entity> entity, int primaryColor, int secondaryColor) {
	int id = getUniqueEntityId();
	EntityList.IDtoClassMapping.put(id, entity);
	EntityList.entityEggs.put(id,  new EntityEggInfo(id, primaryColor, secondaryColor));
}



public Platipusmod() {
	
	
	
	
	Platypusbeek =  new ItemPlatypusbeek(1000).setUnlocalizedName("Platypus Beak").setCreativeTab(CreativeTabs.tabMaterials);
	PlatypusBoots = new PlatypusBoots(1003, ArmorPlatypus, ModLoader.addArmor("PLATYPUS"), 3).setUnlocalizedName("Platypus Boots").setCreativeTab(CreativeTabs.tabCombat);
	PlatypusHelmit = new PlatypusHelmit(1001, ArmorPlatypus, ModLoader.addArmor("PLATYPUS"), 0).setUnlocalizedName("Platypus Helmit").setCreativeTab(CreativeTabs.tabCombat);
	PlatypusChestplate = new PlatypusChestplate(1002, ArmorPlatypus, ModLoader.addArmor("PLATYPUS"), 1).setUnlocalizedName("Platypus Chestplate").setCreativeTab(CreativeTabs.tabCombat);
    PlatypusBiome = new BiomePlatypusBiome(150).setBiomeName("Platypus").setMinMaxHeight(0.23F, 0.22F);
    
    EntityRegistry.registerGlobalEntityID(EntityPlatypus.class, "Playtpus", 2);
    EntityRegistry.addSpawn(EntityPlatypus.class, 10, 2, 4, EnumCreatureType.creature);
    EntityRegistry.findGlobalUniqueEntityId();
    registerEntityEgg(EntityPlatypus.class, 0xfffffff, 0x0000000);
    RenderingRegistry.registerEntityRenderingHandler(EntityPlatypus.class, new RenderPlatypus(new platypusmodel(), 0.3F));
    
    
    
    
GameRegistry.registerBlock(BlueGrass, "BlueGrass");
GameRegistry.addBiome(PlatypusBiome);
LanguageRegistry.addName(Platypusbeek, "Platypus Beak");
LanguageRegistry.addName(PlatypusHelmit, "Platypus Helmit");
LanguageRegistry.addName(PlatypusChestplate,  "Platypus Chestplate");
LanguageRegistry.addName(BlueGrass, "Blue Grass");






GameRegistry.addRecipe(new ItemStack(PlatypusHelmit, 1), new Object [] {
	"XXX", "X X", 'X', Platipusmod.Platypusbeek
});
GameRegistry.addRecipe(new ItemStack(PlatypusChestplate, 1), new Object [] {
	"X X", "XXX", "XXX", 'X', Platipusmod.Platypusbeek
});
}


}







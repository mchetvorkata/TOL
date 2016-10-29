package mchetvorkata.theoutcastsland.init;

import mchetvorkata.theoutcastsland.Reference;
import mchetvorkata.theoutcastsland.TheOutcastsLand;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TOCBlock3 {
	
	public static Block cracked_darkstone_brick;
	
	public static void init()
	{
		cracked_darkstone_brick = new Block(Material.ROCK).setUnlocalizedName("cracked_darkstone_brick").setCreativeTab(TheOutcastsLand.tabTOL);;
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(cracked_darkstone_brick, cracked_darkstone_brick.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(cracked_darkstone_brick);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
				Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}

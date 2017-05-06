package mchetvorkata.theoutcastsland.init;

import mchetvorkata.theoutcastsland.Reference;
import mchetvorkata.theoutcastsland.TheOutcastsLand;
import mchetvorkata.theoutcastsland.init.blocks.lily;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TOCBlocks {
	
	public static Block mossy_darkstone_brick;
	public static Block cracked_darkstone_brick;
	public static Block darkstone_brick;
	
	public static Block lily;
	
	public static void init()
	{
		mossy_darkstone_brick = new Block(Material.ROCK).setUnlocalizedName("mossy_darkstone_brick").setCreativeTab(TheOutcastsLand.tabTOL);;
		cracked_darkstone_brick = new Block(Material.ROCK).setUnlocalizedName("cracked_darkstone_brick").setCreativeTab(TheOutcastsLand.tabTOL);;
		darkstone_brick = new Block(Material.ROCK).setUnlocalizedName("darkstone_brick").setCreativeTab(TheOutcastsLand.tabTOL);;
		lily = new lily();
		lily.setUnlocalizedName("lily");
	}
	
	private static void registerBlock (Block block) {
		GameRegistry.register(block);
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(mossy_darkstone_brick, mossy_darkstone_brick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(cracked_darkstone_brick, cracked_darkstone_brick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkstone_brick, darkstone_brick.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(mossy_darkstone_brick);
		registerRender(cracked_darkstone_brick);
		registerRender(darkstone_brick);
		registerRender(lily);
		
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
				Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}

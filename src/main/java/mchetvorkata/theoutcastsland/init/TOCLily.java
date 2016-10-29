package mchetvorkata.theoutcastsland.init;

import mchetvorkata.theoutcastsland.Reference;
import mchetvorkata.theoutcastsland.blocks.BlockLily;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TOCLily {
	
	public static Block Lily;
	
	public static void init()
	{
		Lily = new BlockLily("lily", "BlockLily");
	}
	
	public static void register() {
		registerBlock(Lily);
	}
	
	private static void registerBlock (Block block) {
		GameRegistry.register(Lily);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(Lily);
		
	}
	
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
				Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}



}

package mchetvorkata.theoutcastsland.init;

import mchetvorkata.theoutcastsland.Reference;
import mchetvorkata.theoutcastsland.TheOutcastsLand;
import mchetvorkata.theoutcastsland.item.ItemWeakHealthOrb;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TOCItems {
	
	public static Item weak_health_orb;

	
	public static void init() {
		weak_health_orb = new ItemWeakHealthOrb("weak_health_orb");
	}
	
	public static void register()
	{
		registerItem(weak_health_orb);
}

	private static void registerItem(Item item) {
		GameRegistry.register(item);
	}

	public static void registerRenders() {
		registerRender(weak_health_orb);
}
	
	
		public static void registerRender(Item item)
		{
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
}



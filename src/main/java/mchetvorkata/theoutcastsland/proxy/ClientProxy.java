package mchetvorkata.theoutcastsland.proxy;


import mchetvorkata.theoutcastsland.client.entity.RenderXurah;
import mchetvorkata.theoutcastsland.client.model.XurahModel;
import mchetvorkata.theoutcastsland.entity.hostile.EntityXurah;
import mchetvorkata.theoutcastsland.init.TOCBlocks;
import mchetvorkata.theoutcastsland.init.TOCItems;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	public void registerRenders() {
		TOCBlocks.registerRenders();
		TOCItems.registerRenders();
	
	}
	
	public void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityXurah.class, new RenderXurah(Minecraft.getMinecraft().getRenderManager(), new XurahModel(), 0.7f));
			
		
	}

	public void init() {
		
	}
	
}

package mchetvorkata.theoutcastsland.client.entity;

import mchetvorkata.theoutcastsland.Reference;
import mchetvorkata.theoutcastsland.client.model.XurahModel;
import mchetvorkata.theoutcastsland.entity.hostile.EntityXurah;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderXurah extends RenderLiving {

private static final ResourceLocation xurahTexture = new ResourceLocation(Reference.MOD_ID + ":textures/entities/xurah.png");
	
	public RenderXurah(RenderManager rendermanagerIn, XurahModel model, float shadowSize) {
		super(rendermanagerIn, model, shadowSize);
	}
	
		
	public ResourceLocation getXurahtexture() {
		return xurahTexture;
	}
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getXurahtexture() == null ? new ResourceLocation(Reference.MOD_ID + ":textures/entities/xurah.png") : this.getXurahtexture();
	}

}
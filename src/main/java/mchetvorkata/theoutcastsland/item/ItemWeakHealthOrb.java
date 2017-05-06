package mchetvorkata.theoutcastsland.item;

import java.util.Set;

import com.google.common.collect.Sets;

import mchetvorkata.theoutcastsland.Reference;
import mchetvorkata.theoutcastsland.TheOutcastsLand;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class ItemWeakHealthOrb extends Item {
		

	private static final Set<Block> EFFECTIVE_BLOCKS = Sets.newHashSet(new Block[] {});

	public ItemWeakHealthOrb(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
		this.maxStackSize = 1;
		this.setMaxDamage(4);
		this.setCreativeTab(TheOutcastsLand.tabTOL);
	}

		@Override
		public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand) {
			if(player.getHealth() < player.getMaxHealth()) {
				player.heal(3);
				player.getHeldItem(hand).damageItem(getDamage(stack), player);
			}
			return super.onItemRightClick(stack, world, player, hand);
		}
	}


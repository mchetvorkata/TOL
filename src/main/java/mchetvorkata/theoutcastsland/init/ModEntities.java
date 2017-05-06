package mchetvorkata.theoutcastsland.init;

import mchetvorkata.theoutcastsland.TheOutcastsLand;
import mchetvorkata.theoutcastsland.entity.hostile.EntityXurah;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
	
	public static void registerEntities() {
		registerEntity(EntityXurah.class, "xurah", 32, 20, true);
	}
	
	public static void generateSpawnEgg() {
		EntityRegistry.registerEgg(EntityXurah.class, 136, 145);
	}
	
	public static int entityID = 0;
	
	
	
	/**
	 * Register an entity with the specified tracking values.
	 *
	 * @param entityClass          The entity's class
	 * @param entityName           The entity's unique name
	 * @param trackingRange        The range at which MC will send tracking updates
	 * @param updateFrequency      The frequency of tracking updates
	 * @param sendsVelocityUpdates Whether to send velocity information packets as well
	 */
	private static void registerEntity(Class<? extends Entity> entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
		EntityRegistry.registerModEntity(entityClass, entityName, entityID++, TheOutcastsLand.instance, trackingRange, updateFrequency, sendsVelocityUpdates);

	}
}

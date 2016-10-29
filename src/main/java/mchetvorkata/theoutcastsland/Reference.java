package mchetvorkata.theoutcastsland;

public class Reference {
	public static final String MOD_ID = "tol";
	public static final String MOD_NAME = "The Outcasts Land";
	public static final String VERSION = "0.1";
	public static final String CLIENT_PROXY_CLASS = "mchetvorkata.theoutcastsland.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "mchetvorkata.theoutcastsland.proxy.CommonProxy";
	public static final String TOCBlocks = null;
	
	public static enum TOCBlocks {
		LILY("lily", "BlockLily");
		
		private String unlocalizedName;
		private String registryName;
		
		TOCBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}

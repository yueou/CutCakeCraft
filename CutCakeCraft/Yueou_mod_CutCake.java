package net.minecraft.src;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod( modid = "233", name="CutCake Craft", version="v0.1 by yueou")
@NetworkMod
(
clientSideRequired = true,
serverSideRequired = false,
channels = {"cutcake"}
//connectionHandler = ConnectionHandler.class,//TODO
)

public class Yueou_mod_CutCake {
	
	//@SidedProxy(clientSide = "net.minecraft.src.Yueou_CCClientProxy", serverSide = "net.minecraft.src.Yueou_CCCommonProxy")
	//public static Yueou_CCCommonProxy proxy; //This object will be populated with the class that you choose for the environment
	@Instance
	public static Yueou_mod_CutCake instance; //The instance of the mod that will be defined, populated, and callable

	public static Block cutcake;
	@Init
	public void load(FMLInitializationEvent evt)
	{
		cutcake = (new Yueou_BlockCutcake(1002,121)).setHardness(0.9F).setStepSound(Block.soundWoodFootstep).setBlockName("cutCake").disableStats().setRequiresSelfNotify();
		
		ModLoader.registerBlock(cutcake);
		ModLoader.addName(cutcake, "ÇÐ¸â");
		
		ModLoader.addRecipe(new ItemStack(cutcake), new Object[]
				{
					"ABA",
					"ACA",
					"ABA",
					'A',Block.obsidian,
					'B',Block.blockDiamond,
					'C',Item.cake
				});
	}

}

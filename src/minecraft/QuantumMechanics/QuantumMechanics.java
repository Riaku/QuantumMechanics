package QuantumMechanics;


import QuantumMechanics.blocks.Quantainium;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="QMech", name="Quantum Mechanics", version="0.0.1 Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class QuantumMechanics {
	
	public static Block Quantainium;
	
        @Instance(value = "QMech")
        public static QuantumMechanics instance;
        
        @SidedProxy(clientSide="QuantumMechanics.client.ClientProxy", serverSide="QuantumMechanics.CommonProxy")
        public static CommonProxy proxy;
 
        @EventHandler        
        public void preInit(FMLPreInitializationEvent event) {
                Block Quantainium = new Quantainium(500);
                GameRegistry.registerBlock(Quantainium, "Quantainium");
                LanguageRegistry.addName(Quantainium, "Quantainium");
                
                MinecraftForge.setBlockHarvestLevel(Quantainium, "pickaxe", 1);
                
                1234567890
        }
        
        @EventHandler
        public void load(FMLInitializationEvent event) {
        	proxy.registerRenderers();
        }
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}
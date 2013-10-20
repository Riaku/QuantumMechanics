package QuantumMechanics;


import QuantumMechanics.blocks.*;
import QuantumMechanics.items.*;
import QuantumMechanics.util.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
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
@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels = { "QMech" }, packetHandler = PacketHandler.class)
public class QuantumMechanics {
        
        public static Block Quantainium;
        
        @Instance(value = "QMech")
        public static QuantumMechanics instance;
        
        @SidedProxy(clientSide="QuantumMechanics.client.ClientProxy", serverSide="QuantumMechanics.CommonProxy")
        public static CommonProxy proxy;
        private int QuantainiumID, ForceGravitationalID, ForceElectromagneticID, ForceStrongNuclearID, ForceWeakNuclearID;
 
        @EventHandler        
        public void preInit(FMLPreInitializationEvent event) {
                    Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
                    cfg.load();
                    ForceGravitationalID = cfg.getBlock("ForceGravitational", 976).getInt(976);
                    ForceElectromagneticID = cfg.getBlock("ForceElectromagnetic", 977).getInt(977);
                    ForceStrongNuclearID = cfg.getBlock("ForceStrongNuclear", 978).getInt(978);
                    ForceWeakNuclearID = cfg.getBlock("ForceWeakNuclear", 979).getInt(979);
                    QuantainiumID = cfg.getBlock("Quantainium", 975).getInt(975);
                    
                    cfg.save();
                Block Quantainium = new Quantainium(QuantainiumID);
                GameRegistry.registerBlock(Quantainium, "Quantainium");
                LanguageRegistry.addName(Quantainium, "Quantainium");
                
                MinecraftForge.setBlockHarvestLevel(Quantainium, "pickaxe", 3);
                
                Item ForceGravitational = new ForceGravitational(ForceGravitationalID);
                GameRegistry.registerItem(ForceGravitational, "Gravitational Force");
                LanguageRegistry.addName(ForceGravitational, "Gravitational Force");
                
                Item ForceElectromagnetic = new ForceGravitational(ForceElectromagneticID);
                GameRegistry.registerItem(ForceGravitational, "Electromagnetic Force");
                LanguageRegistry.addName(ForceGravitational, "Electromagnetic Force");
                
                Item ForceStrongNuclear = new ForceGravitational(ForceStrongNuclearID);
                GameRegistry.registerItem(ForceGravitational, "Strong Nuclear Force");
                LanguageRegistry.addName(ForceGravitational, "Strong Nuclear Force");
                
                Item ForceWeakNuclear = new ForceGravitational(ForceWeakNuclearID);
                GameRegistry.registerItem(ForceGravitational, "Weak Nuclear Force");
                LanguageRegistry.addName(ForceGravitational, "Weak Nuclear Force");
                
                
        }
        
        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
        }
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                
                
        }
       
}
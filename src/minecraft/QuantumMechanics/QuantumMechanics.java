package QuantumMechanics;


import QuantumMechanics.blocks.*;
import QuantumMechanics.items.*;
import QuantumMechanics.util.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
        static int QuantainiumID;

		private int ForceQuantumID;

		private int ForceGravitationalID;

		private int ForceElectromagneticID;

		private int ForceStrongNuclearID;

		private int ForceWeakNuclearID;
 
		EventManager eventmanager = new EventManager();
		
        @EventHandler        
        public void preInit(FMLPreInitializationEvent event) {
        	GameRegistry.registerWorldGenerator(eventmanager);
        	
        	oreRegistration();
            addOreRecipes();
            
            Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
            cfg.load();
            ForceGravitationalID = cfg.getBlock("ForceGravitational", 976).getInt(976);
            ForceElectromagneticID = cfg.getBlock("ForceElectromagnetic", 977).getInt(977);
            ForceStrongNuclearID = cfg.getBlock("ForceStrongNuclear", 978).getInt(978);
            ForceWeakNuclearID = cfg.getBlock("ForceWeakNuclear", 979).getInt(979);
            ForceQuantumID = cfg.getBlock("ForceQuantum", 980).getInt(980);
            QuantainiumID = cfg.getBlock("Quantainium", 975).getInt(975);
                    
                    cfg.save();
                Block Quantainium = new Quantainium(QuantainiumID);
                GameRegistry.registerBlock(Quantainium, "Quantainium");
                LanguageRegistry.addName(Quantainium, "Quantainium");
                //
                //OreDictionary.registerOre("Quantinium", new ItemStack(ingotCopper));
                
                MinecraftForge.setBlockHarvestLevel(Quantainium, "pickaxe", 3);
                
                Item ForceGravitational = new ForceGravitational(ForceGravitationalID);
                GameRegistry.registerItem(ForceGravitational, "Gravitational Force");
                LanguageRegistry.addName(ForceGravitational, "Gravitational Force");
                
                Item ForceElectromagnetic = new ForceElectromagnetic(ForceElectromagneticID);
                GameRegistry.registerItem(ForceElectromagnetic, "Electromagnetic Force");
                LanguageRegistry.addName(ForceElectromagnetic, "Electromagnetic Force");
                
                Item ForceStrongNuclear = new ForceStrongNuclear(ForceStrongNuclearID);
                GameRegistry.registerItem(ForceStrongNuclear, "Strong Nuclear Force");
                LanguageRegistry.addName(ForceStrongNuclear, "Strong Nuclear Force");
                
                Item ForceWeakNuclear = new ForceWeakNuclear(ForceWeakNuclearID);
                GameRegistry.registerItem(ForceWeakNuclear, "Weak Nuclear Force");
                LanguageRegistry.addName(ForceWeakNuclear, "Weak Nuclear Force");
                
                Item ForceQuantum = new ForceQuantum(ForceQuantumID);
                GameRegistry.registerItem(ForceQuantum, "Quantum Force");
                LanguageRegistry.addName(ForceQuantum, "Quantum Force");
                GameRegistry.addShapelessRecipe(new ItemStack(ForceQuantum), new ItemStack(ForceWeakNuclear), 
                		new ItemStack(ForceStrongNuclear), new ItemStack(ForceGravitational), new ItemStack(ForceElectromagnetic));
                
                
        }
        
        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
        }
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                
                
        }
        
        public static void oreRegistration()
        {
                
        }
        
        public static void addOreRecipes()
        {
                
        }
       
}
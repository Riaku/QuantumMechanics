package QuantumMechanics.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ForceStrongNuclear extends Item {

	@SideOnly(Side.CLIENT)
	private Icon chargedIcon;
	
	public ForceStrongNuclear(int id) {
		super(id);
		setCreativeTab(CreativeTabs.tabMaterials);
		setMaxStackSize(1);
		setUnlocalizedName("QUANTAINIUM_INGOT");
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon("qmech:ForceStrongNuclear");
	}
	
	
}
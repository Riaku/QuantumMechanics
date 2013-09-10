package QuantumMechanics.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class Quantainium extends BlockOre{

	public Quantainium(int i){
		super(i);
		setHardness(0.5f);
		setStepSound(Block.soundStoneFootstep);
		setCreativeTab(CreativeTabs.tabBlock);
		setUnlocalizedName("Quantainium");
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon)
	{
	this.blockIcon = icon.registerIcon("qmech:Quantainium");
	}
}

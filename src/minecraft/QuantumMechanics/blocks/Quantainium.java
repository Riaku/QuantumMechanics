package QuantumMechanics.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class Quantainium extends Block{

	public Quantainium(int i){
		super(i, Material.rock);
		setHardness(0.5f);
		setStepSound(Block.soundStoneFootstep);
		setCreativeTab(CreativeTabs.tabBlock);
		func_111022_d("Quantainium");
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister ir)
	{
	this.blockIcon = ir.registerIcon("qmech:quantainium");
	}
}

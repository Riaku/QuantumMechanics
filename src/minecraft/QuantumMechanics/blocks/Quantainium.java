package QuantumMechanics.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class Quantainium extends Block{

	public Quantainium(int i){
		super(i, Material.rock);
		setHardness(0.5f);
		setUnlocalizedName("Quantainium");
		setStepSound(Block.soundStoneFootstep);
		setCreativeTab(CreativeTabs.tabBlock);
	}
	public void registerIcons(IconRegister iconRegister)
    {
                     blockIcon = iconRegister.registerIcon("QMech:Titanium");
    }
}

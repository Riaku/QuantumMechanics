package QuantumMechanics.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class QMechTab extends CreativeTabs {

	public static final CreativeTabs tabQMech = new QMechTab();

	  public QMechTab() {
	    super("QMech");
	  }

	  /**
	   * the itemID for the item to be displayed on the tab
	   */
	  @Override
	  @SideOnly(Side.CLIENT)
	  public String getTabLabel() {
	    return "QMech";
	  }

	  @Override
	  @SideOnly(Side.CLIENT)
	  public String getTranslatedTabLabel() {
	    return "QMech";
	  }

	
}

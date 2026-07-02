package net.junedev.viridium.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BaseFullLog extends BlockLog {

    public IIcon[] sides;
    public IIcon[] tops;
    public String[] texNames = new String[] { "american_sycamore_log", "bald_cypress_log", "baobab_log" };

    public BaseFullLog() {
        super();
        this.setHardness(1.0F); // Hardness of vanilla logs?
        // this.setCreativeTab TODO: Creative tab
        this.setStepSound(soundTypeWood);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        this.sides = new IIcon[texNames.length];
        this.tops = new IIcon[texNames.length];

        for (int i = 0; i < texNames.length; ++i) {
            this.sides[i] = register.registerIcon("viridium:" + texNames[i] + "_side");
            this.tops[i] = register.registerIcon("viridium:" + texNames[i] + "_top");
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        int orientation = meta & 12;
        int logName = meta & 3;

        return orientation == 0 && (side == 1 || side == 0) ? this.tops[findLogName(texNames)]
            : (orientation == 4 && (side == 5 || side == 4) ? this.tops[findLogName(texNames)]
                : (orientation == 8 && (side == 2 || side == 3) ? this.tops[findLogName(texNames)] : this.sides[findLogName(texNames)]));
    }

    public int findLogName(String[] names) {
        for (int i = 0; i < names.length; ++i) {
            if (names[i].equals(getUnlocalizedName().substring(5))) {
                return i;
            }
        }
        return 0;
    }
}





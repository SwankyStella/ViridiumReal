package net.junedev.viridium.blocks;

import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import org.apache.commons.lang3.ArrayUtils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseFullLog extends BlockLog {

    public IIcon[] sides;
    public IIcon[] tops;
    public String[] texNames = new String[] { "american_sycamore_log", "american_sycamore_stripped", "bald_cypress_log",
        "bald_cypress_stripped", "baobab_log", "baobab_stripped", "black_pine_log", "black_pine_stripped",
        "dragons_blood_log", "dragons_blood_stripped", "royal_palm_log", "royal_palm_crown", "sierra_juniper_log",
        "sierra_juniper_stripped", "sweetgum_log", "sweetgum_stripped", "weeping_willow_log", "weeping_willow_stripped",
        "driftwood_log" };

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

        switch (orientation) {
            case 0:
                if (side == 1 || side == 0) return this.tops[findLogName(texNames)];
                break;
            case 4:
                if (side == 5 || side == 4) return this.tops[findLogName(texNames)];
                break;
            case 8:
                if (side == 2 || side == 3) return this.tops[findLogName(texNames)];
                break;
        }
        return this.sides[findLogName(texNames)];
    }

    public int findLogName(String[] names) {
        return ArrayUtils.indexOf(names, getUnlocalizedName().substring(5));
    }
}

package net.junedev.viridium.blocks;

import net.junedev.viridium.Viridium;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import org.apache.commons.lang3.ArrayUtils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BasePlanks extends Block {

    public IIcon[] textures;
    public String[] texNames = new String[] { "american_sycamore_planks", "bald_cypress_planks", "baobab_planks",
        "black_pine_planks", "dragons_blood_planks", "royal_palm_planks", "sierra_juniper_planks", "sweetgum_planks",
        "weeping_willow_planks", "driftwood_planks" };

    public BasePlanks() {
        super(Material.wood);
        this.setHardness(2.0F);
        this.setCreativeTab(Viridium.VTab);
        this.setStepSound(soundTypeWood);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        this.textures = new IIcon[texNames.length];

        for (int i = 0; i < texNames.length; ++i) {
            this.textures[i] = register.registerIcon(Viridium.MOD_ID + ":" + texNames[i]);
        }
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        return this.textures[findPlankName(texNames)];
    }

    public int findPlankName(String[] names) {
        return ArrayUtils.indexOf(names, getUnlocalizedName().substring(5));
    }
}

package net.gibbongoop.swordfish.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SWORDFISH_TAB = new CreativeModeTab("swordfishtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NIGHTCRAWLER.get());
        }
    };
}

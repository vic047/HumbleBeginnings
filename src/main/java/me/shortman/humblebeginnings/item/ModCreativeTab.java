package me.shortman.humblebeginnings.item;

import me.shortman.humblebeginnings.HumbleBeginnings;
import me.shortman.humblebeginnings.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;

public class ModCreativeTab {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HumbleBeginnings.MOD_ID);

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> LEATHER_WORKS = CREATIVE_MODE_TABS.register("leather_works_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack((ModItems.SKIN_COW.get())))
                    .title(Component.translatable("creativetab.leather_works_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // Items
                        pOutput.accept(ModItems.TANNIN_COMPOUND.get());
                        pOutput.accept(ModBlocks.TANNIN_COMPOUND_BLOCK.get());
                        pOutput.accept(ModItems.RAW_HIDE.get());
                        pOutput.accept(ModItems.SOAKED_HIDE.get());
                        pOutput.accept(ModItems.SKIN_COW.get());
                        pOutput.accept(ModItems.SKIN_DONKEY.get());
                        pOutput.accept(ModItems.SKIN_HORSE.get());
                        pOutput.accept(ModItems.SKIN_LLAMA.get());
                        pOutput.accept(ModItems.SKIN_PIG.get());
                        pOutput.accept(ModItems.SKIN_POLAR_BEAR.get());
                        pOutput.accept(ModItems.SKIN_WOLF.get());


                    })
                    .build());

}

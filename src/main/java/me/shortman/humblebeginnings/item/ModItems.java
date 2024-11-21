package me.shortman.humblebeginnings.item;

import me.shortman.humblebeginnings.HumbleBeginnings;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HumbleBeginnings.MOD_ID);

    /* MOD ITEMS */
    // -- LEATHER WORKS --
    // Tannin
    public static final RegistryObject<Item> TANNIN_COMPOUND = ITEMS.register("tannin_compound",
            () -> new Item(new Item.Properties()));

    // Bark
    public static final RegistryObject<Item> SMALL_BARK = ITEMS.register("bark_small",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BARK_MEDIUM = ITEMS.register("bark_medium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BARK_BIG = ITEMS.register("bark_big",
            () -> new Item(new Item.Properties()));

    // Skin
    public static final RegistryObject<Item> SKIN_COW = ITEMS.register("skin_cow",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKIN_PIG = ITEMS.register("skin_pig",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKIN_HORSE = ITEMS.register("skin_horse",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKIN_DONKEY = ITEMS.register("skin_donkey",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKIN_LLAMA = ITEMS.register("skin_llama",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKIN_POLAR_BEAR = ITEMS.register("skin_polar_bear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKIN_WOLF = ITEMS.register("skin_wolf",
            () -> new Item(new Item.Properties()));

    // Hide
    public static final RegistryObject<Item> RAW_HIDE = ITEMS.register("hide_raw",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOAKED_HIDE = ITEMS.register("hide_soaked",
            () -> new Item(new Item.Properties()));

    /* END OF MOD ITEMS */

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

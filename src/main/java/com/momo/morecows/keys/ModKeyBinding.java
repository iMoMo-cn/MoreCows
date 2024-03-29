package com.momo.morecows.keys;

import com.momo.morecows.IdlFramework;
import com.momo.morecows.proxy.ClientProxy;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.settings.IKeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;

//@SideOnly(Side.CLIENT)
public class ModKeyBinding extends KeyBinding {
    public ModKeyBinding(String description, IKeyConflictContext keyConflictContext, KeyModifier keyModifier, int keyCode, String category) {
        super(String.format("key.%s.%s", IdlFramework.MODID, description), keyConflictContext, keyModifier, keyCode, category);
        ClientProxy.KEY_BINDINGS.add(this);
    }
}

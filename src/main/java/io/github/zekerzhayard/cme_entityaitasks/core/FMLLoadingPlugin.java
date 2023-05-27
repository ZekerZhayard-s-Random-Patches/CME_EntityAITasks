package io.github.zekerzhayard.cme_entityaitasks.core;

import java.util.Map;
import javax.annotation.Nullable;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin.Name("CME_EntityAITasks")
@IFMLLoadingPlugin.TransformerExclusions("io.github.zekerzhayard.cme_entityaitasks.core.")
public class FMLLoadingPlugin implements IFMLLoadingPlugin {
    @Override
    public String[] getASMTransformerClass() {
        return new String[] { "io.github.zekerzhayard.cme_entityaitasks.core.ClassTransformer" };
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Nullable
    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
        RemapUtils.isDevelopmentEnvironment = !(boolean) data.get("runtimeDeobfuscationEnabled");
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}

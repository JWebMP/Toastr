package com.jwebmp.plugins.toastr.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;
import com.guicedee.client.services.config.IGuiceScanJarExclusions;
import java.util.LinkedHashSet;
import java.util.Set;

/** SPI services and direct resource access do not require scanning this library. */
public class ToastrExclusionsModule implements IGuiceScanModuleExclusions<ToastrExclusionsModule>, IGuiceScanJarExclusions<ToastrExclusionsModule> {
    @Override public Set<String> excludeModules() { return Set.of("com.jwebmp.plugins.toastr"); }
    @Override public Set<String> excludeJars() {
        Set<String> jars = new LinkedHashSet<>();
        jars.add("toastr.jar");
        for (int digit = 0; digit <= 9; digit++) jars.add("toastr-" + digit + "*.jar");
        return jars;
    }
}

package com.jwebmp.plugins.toastr.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class ToastrInclusionsModule
        implements IGuiceScanModuleInclusions<ToastrInclusionsModule>
{
    @Override
    public @NotNull Set<String> includeModules()
    {
        Set<String> strings = new HashSet<>();
        strings.add("com.jwebmp.plugins.toastr");
        return strings;
    }
}

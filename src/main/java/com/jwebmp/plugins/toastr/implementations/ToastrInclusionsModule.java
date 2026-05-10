package com.jwebmp.plugins.toastr.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleInclusions;

import java.util.HashSet;
import java.util.Set;

public class ToastrInclusionsModule
        implements IGuiceScanModuleInclusions<ToastrInclusionsModule>
{
    @Override
    public Set<String> includeModules()
    {
        Set<String> strings = new HashSet<>();
        strings.add("com.jwebmp.plugins.toastr");
        return strings;
    }
}

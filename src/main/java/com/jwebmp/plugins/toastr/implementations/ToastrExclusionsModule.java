package com.jwebmp.plugins.toastr.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class ToastrExclusionsModule
		implements IGuiceScanModuleExclusions<ToastrExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.toastr");
		return strings;
	}
}

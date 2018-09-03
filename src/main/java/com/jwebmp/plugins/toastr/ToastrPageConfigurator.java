/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.toastr;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Toastr",
		pluginDescription = "toastr is a Javascript library for non-blocking notifications. jQuery is required. The goal is to create a simple core library that can be customized and extended.",
		pluginUniqueName = "jwebswing-toastr",
		pluginVersion = "2.1.3",
		pluginCategories = "popups, dialogs, ui,web ui, framework",
		pluginSubtitle = "toastr is a Javascript library for non-blocking notifications. jQuery is required. The goal is to create a simple core library that can be customized and extended.",
		pluginSourceUrl = "https://github.com/CodeSeven/toastr",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Toastr/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Toastr",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "http://codeseven.github.io/toastr/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/Toastr.jar/download"
)
public class ToastrPageConfigurator
		implements IPageConfigurator
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new ToastrPageConfigurator
	 */
	public ToastrPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return ToastrPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		ToastrPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);

			page.getBody()
			    .addJavaScriptReference(ToastrReferencePool.Toastr.getJavaScriptReference());
			page.getBody()
			    .addCssReference(ToastrReferencePool.Toastr.getCssReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return ToastrPageConfigurator.enabled;
	}
}

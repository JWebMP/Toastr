package za.co.mmagon.jwebswing.plugins.toastr;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

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
) class ToastrPageConfigurator extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new ToastrPageConfigurator
	 */
	public ToastrPageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(page.getBody(), true);

			page.getBody().addJavaScriptReference(ToastrReferencePool.Toastr.getJavaScriptReference());
			page.getBody().addCssReference(ToastrReferencePool.Toastr.getCssReference());

			//page.getAngular().getControllerInsertions().add("toastr");
		}
		return page;
	}
}

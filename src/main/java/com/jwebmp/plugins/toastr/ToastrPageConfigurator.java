package com.jwebmp.plugins.toastr;

import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgScript;
import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgStyleSheet;
import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;

/**
 * @author GedMarc
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Toastr",
        pluginDescription = "toastr is a Javascript library for non-blocking notifications. jQuery is required. The goal is to create a simple core library that can be customized and extended.",
        pluginUniqueName = "toastr",
        pluginVersion = "2.1.3",
        pluginCategories = "popups, dialogs, ui,web ui, framework",
        pluginSubtitle = "toastr is a Javascript library for non-blocking notifications.",
        pluginSourceUrl = "https://github.com/CodeSeven/toastr",
        pluginWikiUrl = "https://github.com/JWebMP/Toastr/wiki",
        pluginGitUrl = "https://github.com/JWebMP/Toastr",
        pluginIconUrl = "",
        pluginIconImageUrl = "",
        pluginOriginalHomepage = "http://codeseven.github.io/toastr/",
        pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins/toastr",
        pluginGroupId = "com.jwebmp.plugins",
        pluginArtifactId = "toastr",
        pluginModuleName = "com.jwebmp.plugins.toastr",
        pluginStatus = PluginStatus.Released
)
@TsDependency(value = "toastr", version = "^2.1.4")
@NgScript(name = "Toastr", value = "node_modules/toastr/toastr.js")
@NgStyleSheet(name = "Toastr", value = "node_modules/toastr/build/toastr.min.css")
public class ToastrPageConfigurator
        implements IPageConfigurator<ToastrPageConfigurator>
{
    /*
     * Constructs a new ToastrPageConfigurator
     */
    public ToastrPageConfigurator()
    {
        //Nothing needed
    }

    @Override
    public IPage<?> configure(IPage<?> page)
    {
        return page;
    }

    @Override
    public boolean enabled()
    {
        return true;
    }
}

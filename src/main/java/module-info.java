module com.jwebmp.plugins.toastr {

    exports com.jwebmp.plugins.toastr;

    requires com.jwebmp.core;
    requires com.jwebmp.client;
    requires com.jwebmp.core.base.angular.client;

    requires com.jwebmp.plugins.easingeffects;

    requires com.guicedee.client;
    requires tools.jackson.databind;
    requires com.guicedee.jsonrepresentation;

    provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.toastr.ToastrPageConfigurator;

    opens com.jwebmp.plugins.toastr to tools.jackson.databind, com.jwebmp.core, com.google.guice;
    opens com.jwebmp.plugins.toastr.implementations to com.google.guice;

    provides com.guicedee.client.services.config.IGuiceScanModuleExclusions with com.jwebmp.plugins.toastr.implementations.ToastrExclusionsModule;

    provides com.guicedee.client.services.config.IGuiceScanJarExclusions with com.jwebmp.plugins.toastr.implementations.ToastrExclusionsModule;
}

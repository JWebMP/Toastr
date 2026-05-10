import com.guicedee.client.services.config.IGuiceScanModuleInclusions;
import com.jwebmp.plugins.toastr.implementations.ToastrInclusionsModule;

module com.jwebmp.plugins.toastr {

    exports com.jwebmp.plugins.toastr;

    requires com.jwebmp.core;
    requires com.jwebmp.client;
    requires com.jwebmp.core.base.angular.client;

    requires com.jwebmp.plugins.easingeffects;

    requires com.guicedee.client;
    requires com.fasterxml.jackson.databind;
    requires com.guicedee.jsonrepresentation;

    provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.toastr.ToastrPageConfigurator;
    provides IGuiceScanModuleInclusions with ToastrInclusionsModule;

    opens com.jwebmp.plugins.toastr to com.fasterxml.jackson.databind, com.jwebmp.core, com.google.guice;
    opens com.jwebmp.plugins.toastr.implementations to com.google.guice;
}

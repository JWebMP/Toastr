import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import com.jwebmp.plugins.toastr.implementations.ToastrInclusionsModule;

module com.jwebmp.plugins.toastr {

    exports com.jwebmp.plugins.toastr;

    requires com.jwebmp.core;
    requires com.jwebmp.client;

    requires com.jwebmp.plugins.easingeffects;
    requires com.jwebmp.plugins.jquery;

    requires jakarta.validation;
    requires java.logging;

    requires com.guicedee.client;
    requires com.fasterxml.jackson.databind;
    requires com.guicedee.jsonrepresentation;

    provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.toastr.ToastrPageConfigurator;
    provides IGuiceScanModuleInclusions with ToastrInclusionsModule;

    opens com.jwebmp.plugins.toastr to com.fasterxml.jackson.databind, com.jwebmp.core;
}

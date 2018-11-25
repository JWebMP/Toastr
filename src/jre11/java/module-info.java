import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.toastr.ToastrPageConfigurator;
import com.jwebmp.plugins.toastr.implementations.ToastrExclusionsModule;

module com.jwebmp.plugins.toastr {

	exports com.jwebmp.plugins.toastr;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.plugins.easingeffects;
	requires com.jwebmp.guicedinjection;
	requires com.fasterxml.jackson.databind;

	provides IPageConfigurator with ToastrPageConfigurator;
	provides IGuiceScanJarExclusions with ToastrExclusionsModule;
	provides IGuiceScanModuleExclusions with ToastrExclusionsModule;

	opens com.jwebmp.plugins.toastr to com.fasterxml.jackson.databind, com.jwebmp.core;
}

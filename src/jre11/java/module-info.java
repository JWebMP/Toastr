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

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.toastr.ToastrPageConfigurator;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.toastr.implementations.ToastrExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.toastr.implementations.ToastrExclusionsModule;

	opens com.jwebmp.plugins.toastr to com.fasterxml.jackson.databind, com.jwebmp.core;
}

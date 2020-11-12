module com.jwebmp.plugins.toastr {

	exports com.jwebmp.plugins.toastr;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;

	requires jakarta.validation;
	requires java.logging;
	requires com.jwebmp.plugins.easingeffects;
	requires com.guicedee.guicedinjection;
	requires com.fasterxml.jackson.databind;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.toastr.ToastrPageConfigurator;

	opens com.jwebmp.plugins.toastr to com.fasterxml.jackson.databind, com.jwebmp.core;
}

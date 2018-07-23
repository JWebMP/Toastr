import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.toastr.ToastrPageConfigurator;

module com.jwebmp.plugins.toastr {

	exports com.jwebmp.plugins.toastr;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.fasterxml.jackson.databind;
	requires com.jwebmp.plugins.easingeffects;

	provides IPageConfigurator with ToastrPageConfigurator;

}

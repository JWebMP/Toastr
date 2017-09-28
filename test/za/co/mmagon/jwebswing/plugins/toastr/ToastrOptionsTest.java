package za.co.mmagon.jwebswing.plugins.toastr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.co.mmagon.BaseTestClass;
import za.co.mmagon.jwebswing.plugins.easingeffects.JQEasingEffects;

/**
 * @author Marc Magon
 */
public class ToastrOptionsTest extends BaseTestClass
{
	
	public ToastrOptionsTest()
	{
	}
	
	@Test
	public void testSomeMethod()
	{
		ToastrOptions to = new ToastrOptions();
		System.out.println(to.toString());
	}
	
	@Test
	public void testSomeMethod2()
	{
		//ToastrFeature to = new ToastrFeature(ToastrType.Info, "message", null);
		ToastrFeature to = new ToastrFeature("Message");
		to.getOptions().setDebug(true);
		to.getOptions().setShowMethod(JQEasingEffects.fadeIn);
		System.out.println(to.renderJavascript());
		
		Assertions.assertEquals("toastr.options = {\n"
				                    + "  \"closeButton\" : false,\n"
				                    + "  \"debug\" : true,\n"
				                    + "  \"newestOnTop\" : true,\n"
				                    + "  \"progressBar\" : false,\n"
				                    + "  \"positionClass\" : \"toast-top-right\",\n"
				                    + "  \"preventDuplicates\" : false,\n"
				                    + "  \"showDuration\" : \"300\",\n"
				                    + "  \"hideDuration\" : \"1000\",\n"
				                    + "  \"timeOut\" : \"5000\",\n"
				                    + "  \"extendedTimeOut\" : \"1000\",\n"
				                    + "  \"showEasing\" : \"swing\",\n"
				                    + "  \"hideEasing\" : \"linear\",\n"
				                    + "  \"showMethod\" : \"fadeIn\",\n"
				                    + "  \"hideMethod\" : \"fadeOut\",\n"
				                    + "  \"escapeHtml\" : false\n"
				                    + "};toastr['info']('Message');", to.renderJavascript().toString());
	}
	
	@Test
	public void testTitleMessage()
	{
		//ToastrFeature to = new ToastrFeature(ToastrType.Info, "message", null);
		ToastrFeature to = new ToastrFeature(ToastrType.Error, "Title Test", "Message");
		to.getOptions().setDebug(true);
		to.getOptions().setShowMethod(JQEasingEffects.easeOutSine);
		System.out.println(to.renderJavascript());
		
		Assertions.assertEquals("toastr.options = {\n"
				                    + "  \"closeButton\" : false,\n"
				                    + "  \"debug\" : true,\n"
				                    + "  \"newestOnTop\" : true,\n"
				                    + "  \"progressBar\" : false,\n"
				                    + "  \"positionClass\" : \"toast-top-right\",\n"
				                    + "  \"preventDuplicates\" : false,\n"
				                    + "  \"showDuration\" : \"300\",\n"
				                    + "  \"hideDuration\" : \"1000\",\n"
				                    + "  \"timeOut\" : \"5000\",\n"
				                    + "  \"extendedTimeOut\" : \"1000\",\n"
				                    + "  \"showEasing\" : \"swing\",\n"
				                    + "  \"hideEasing\" : \"linear\",\n"
				                    + "  \"showMethod\" : \"easeOutSine\",\n"
				                    + "  \"hideMethod\" : \"fadeOut\",\n"
				                    + "  \"escapeHtml\" : false\n"
				                    + "};toastr['error']('Message','Title Test');", to.renderJavascript().toString());
	}
	
	@Test
	public void testSomeMethod3()
	{
		ToastrFeature to = new ToastrFeature();
		System.out.println(to.renderJavascript());
		
		Assertions.assertEquals("toastr.options = {\n"
				                    + "  \"closeButton\" : false,\n"
				                    + "  \"debug\" : false,\n"
				                    + "  \"newestOnTop\" : true,\n"
				                    + "  \"progressBar\" : false,\n"
				                    + "  \"positionClass\" : \"toast-top-right\",\n"
				                    + "  \"preventDuplicates\" : false,\n"
				                    + "  \"showDuration\" : \"300\",\n"
				                    + "  \"hideDuration\" : \"1000\",\n"
				                    + "  \"timeOut\" : \"5000\",\n"
				                    + "  \"extendedTimeOut\" : \"1000\",\n"
				                    + "  \"showEasing\" : \"swing\",\n"
				                    + "  \"hideEasing\" : \"linear\",\n"
				                    + "  \"showMethod\" : \"fadeIn\",\n"
				                    + "  \"hideMethod\" : \"fadeOut\",\n"
				                    + "  \"escapeHtml\" : false\n"
				                    + "};toastr['info']('');", to.renderJavascript().toString());
	}
}

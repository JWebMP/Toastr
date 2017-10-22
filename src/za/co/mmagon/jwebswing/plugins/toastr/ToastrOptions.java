package za.co.mmagon.jwebswing.plugins.toastr;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;
import za.co.mmagon.jwebswing.plugins.easingeffects.JQEasingEffects;

/**
 * All the options available for Toastr
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
public class ToastrOptions extends JavaScriptPart
{

	private static final long serialVersionUID = 1L;
	/**
	 * Show close button or not
	 */
	private Boolean closeButton = false;
	/**
	 * Enable debug
	 */
	private Boolean debug = false;
	/**
	 * Newest on top
	 */
	private Boolean newestOnTop = true;
	/**
	 * Progress Bar
	 */
	private Boolean progressBar = false;
	/**
	 * Position of the toast
	 */
	private ToastrPosition positionClass = ToastrPosition.Toast_Top_Right;
	/**
	 * Prevents duplicate posts
	 */
	private Boolean preventDuplicates = false;
	/**
	 * The duration for the show
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	private Integer showDuration = 300;
	/**
	 * The duration for the hide
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	private Integer hideDuration = 1000;
	/**
	 * The timeout duration
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	private Integer timeOut = 5000;
	/**
	 * The extended timeout duration
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	private Integer extendedTimeOut = 1000;
	/**
	 * The easing effect to show
	 */
	private JQEasingEffects showEasing = JQEasingEffects.swing;
	/**
	 * The hide easing effect to show
	 */
	private JQEasingEffects hideEasing = JQEasingEffects.linear;
	/**
	 * Whether or not to show the method
	 */
	private JQEasingEffects showMethod = JQEasingEffects.fadeIn;
	/**
	 * Hide method animation effect
	 */
	private JQEasingEffects hideMethod = JQEasingEffects.fadeOut;
	/**
	 * Should the toast escape HTML
	 */
	private Boolean escapeHtml = false;

	/**
	 * Constructs a new toastr options object
	 */
	public ToastrOptions()
	{
		//Nothing needed
	}

	/**
	 * If the close button is being used
	 *
	 * @return
	 */
	public Boolean getCloseButton()
	{
		return closeButton;
	}

	public ToastrOptions setCloseButton(Boolean closeButton)
	{
		this.closeButton = closeButton;
		return this;
	}

	/**
	 * Returns if is in debug mode
	 *
	 * @return
	 */
	public Boolean getDebug()
	{
		return debug;
	}

	/**
	 * Sets debug mode
	 *
	 * @param debug
	 *
	 * @return
	 */
	public ToastrOptions setDebug(Boolean debug)
	{
		this.debug = debug;
		return this;
	}

	/**
	 * If newest is on top
	 *
	 * @return
	 */
	public Boolean getNewestOnTop()
	{
		return newestOnTop;
	}

	/**
	 * Sets if newest is on top
	 *
	 * @param newestOnTop
	 *
	 * @return
	 */
	public ToastrOptions setNewestOnTop(Boolean newestOnTop)
	{
		this.newestOnTop = newestOnTop;
		return this;
	}

	/**
	 * Sets the progress bar
	 *
	 * @return
	 */
	public Boolean getProgressBar()
	{
		return progressBar;
	}

	/**
	 * Sets the progress bar
	 *
	 * @param progressBar
	 *
	 * @return
	 */
	public ToastrOptions setProgressBar(Boolean progressBar)
	{
		this.progressBar = progressBar;
		return this;
	}

	/**
	 * Gets the position class
	 *
	 * @return
	 */
	public ToastrPosition getPositionClass()
	{
		return positionClass;
	}

	/**
	 * Sets the position class
	 *
	 * @param positionClass
	 *
	 * @return
	 */
	public ToastrOptions setPositionClass(ToastrPosition positionClass)
	{
		this.positionClass = positionClass;
		return this;
	}

	/**
	 * Prevents duplicates
	 *
	 * @return
	 */
	public Boolean getPreventDuplicates()
	{
		return preventDuplicates;
	}

	/**
	 * Sets prevents duplicates
	 *
	 * @param preventDuplicates
	 *
	 * @return
	 */
	public ToastrOptions setPreventDuplicates(Boolean preventDuplicates)
	{
		this.preventDuplicates = preventDuplicates;
		return this;
	}

	/**
	 * Sets show duration
	 *
	 * @return
	 */
	public Integer getShowDuration()
	{
		return showDuration;
	}

	/**
	 * Sets show duration
	 *
	 * @param showDuration
	 *
	 * @return
	 */
	public ToastrOptions setShowDuration(Integer showDuration)
	{
		this.showDuration = showDuration;
		return this;
	}

	/**
	 * Sets hide duration
	 *
	 * @return
	 */
	public Integer getHideDuration()
	{
		return hideDuration;
	}

	/**
	 * Sets hide duration
	 *
	 * @param hideDuration
	 *
	 * @return
	 */
	public ToastrOptions setHideDuration(Integer hideDuration)
	{
		this.hideDuration = hideDuration;
		return this;
	}

	/**
	 * Gets the timeout
	 *
	 * @return
	 */
	public Integer getTimeOut()
	{
		return timeOut;
	}

	/**
	 * Sets the timeout
	 *
	 * @param timeOut
	 *
	 * @return
	 */
	public ToastrOptions setTimeOut(Integer timeOut)
	{
		this.timeOut = timeOut;
		return this;
	}

	/**
	 * Gets the extended timeout
	 *
	 * @return
	 */
	public Integer getExtendedTimeOut()
	{
		return extendedTimeOut;
	}

	/**
	 * Sets the extended time out
	 *
	 * @param extendedTimeOut
	 *
	 * @return
	 */
	public ToastrOptions setExtendedTimeOut(Integer extendedTimeOut)
	{
		this.extendedTimeOut = extendedTimeOut;
		return this;
	}

	/**
	 * Sets the easing effect
	 *
	 * @return
	 */
	public JQEasingEffects getShowEasing()
	{
		return showEasing;
	}

	/**
	 * Sets the easing effect
	 *
	 * @param showEasing
	 *
	 * @return
	 */
	public ToastrOptions setShowEasing(JQEasingEffects showEasing)
	{
		this.showEasing = showEasing;
		return this;
	}

	/**
	 * Hides the easing effect
	 *
	 * @return
	 */
	public JQEasingEffects getHideEasing()
	{
		return hideEasing;
	}

	/**
	 * Sets the hiding effect
	 *
	 * @param hideEasing
	 *
	 * @return
	 */
	public ToastrOptions setHideEasing(JQEasingEffects hideEasing)
	{
		this.hideEasing = hideEasing;
		return this;
	}

	/**
	 * Sets the show effect
	 *
	 * @return
	 */
	public JQEasingEffects getShowMethod()
	{
		return showMethod;
	}

	/**
	 * Sets the show effect
	 *
	 * @param showMethod
	 *
	 * @return
	 */
	public ToastrOptions setShowMethod(JQEasingEffects showMethod)
	{
		this.showMethod = showMethod;
		return this;
	}

	/**
	 * Sets the hide effect
	 *
	 * @return
	 */
	public JQEasingEffects getHideMethod()
	{
		return hideMethod;
	}

	/**
	 * Sets the hide effect
	 *
	 * @param hideMethod
	 *
	 * @return
	 */
	public ToastrOptions setHideMethod(JQEasingEffects hideMethod)
	{
		this.hideMethod = hideMethod;
		return this;
	}

	/**
	 * If the message and title should escape HTML
	 *
	 * @return
	 */
	public Boolean getEscapeHtml()
	{
		return escapeHtml;
	}

	/**
	 * If the message and title should escape HTML
	 *
	 * @param escapeHtml
	 *
	 * @return
	 */
	public ToastrOptions setEscapeHtml(Boolean escapeHtml)
	{
		this.escapeHtml = escapeHtml;
		return this;
	}

}

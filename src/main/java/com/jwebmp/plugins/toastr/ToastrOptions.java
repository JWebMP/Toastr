package com.jwebmp.plugins.toastr;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.easingeffects.JQEasingEffects;

import javax.validation.constraints.NotNull;

/**
 * All the options available for Toastr
 *
 * @author GedMarc
 * @since 09 Jun 2017
 */
public class ToastrOptions<J extends ToastrOptions<J>>
		extends JavaScriptPart<J>
{


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

	@SuppressWarnings("unchecked")
	@NotNull
	public J setCloseButton(Boolean closeButton)
	{
		this.closeButton = closeButton;
		return (J) this;
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
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDebug(Boolean debug)
	{
		this.debug = debug;
		return (J) this;
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
	@SuppressWarnings("unchecked")
	@NotNull
	public J setNewestOnTop(Boolean newestOnTop)
	{
		this.newestOnTop = newestOnTop;
		return (J) this;
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
	@SuppressWarnings("unchecked")
	@NotNull
	public J setProgressBar(Boolean progressBar)
	{
		this.progressBar = progressBar;
		return (J) this;
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
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPositionClass(ToastrPosition positionClass)
	{
		this.positionClass = positionClass;
		return (J) this;
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
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPreventDuplicates(Boolean preventDuplicates)
	{
		this.preventDuplicates = preventDuplicates;
		return (J) this;
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
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowDuration(Integer showDuration)
	{
		this.showDuration = showDuration;
		return (J) this;
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
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHideDuration(Integer hideDuration)
	{
		this.hideDuration = hideDuration;
		return (J) this;
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
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTimeOut(Integer timeOut)
	{
		this.timeOut = timeOut;
		return (J) this;
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
	@SuppressWarnings("unchecked")
	@NotNull
	public J setExtendedTimeOut(Integer extendedTimeOut)
	{
		this.extendedTimeOut = extendedTimeOut;
		return (J) this;
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
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowEasing(JQEasingEffects showEasing)
	{
		this.showEasing = showEasing;
		return (J) this;
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
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHideEasing(JQEasingEffects hideEasing)
	{
		this.hideEasing = hideEasing;
		return (J) this;
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
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowMethod(JQEasingEffects showMethod)
	{
		this.showMethod = showMethod;
		return (J) this;
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
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHideMethod(JQEasingEffects hideMethod)
	{
		this.hideMethod = hideMethod;
		return (J) this;
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
	@SuppressWarnings("unchecked")
	@NotNull
	public J setEscapeHtml(Boolean escapeHtml)
	{
		this.escapeHtml = escapeHtml;
		return (J) this;
	}

}

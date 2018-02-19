package za.co.mmagon.jwebswing.plugins.toastr;

import za.co.mmagon.jwebswing.Feature;

import javax.validation.constraints.NotNull;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;
import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_SINGLE_QUOTES;

/**
 * Creates toast messages
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
public class ToastrFeature<J extends ToastrFeature<J>> extends Feature<ToastrOptions, J>
{

	private static final long serialVersionUID = 1L;
	/**
	 * The type of the toastr
	 */
	private ToastrType type;
	/**
	 * The title of the toast
	 */
	private String title;
	/**
	 * The message of the toast
	 */
	private String message;

	/*
	 * Constructs a new ToastrFeature
	 */
	ToastrFeature()
	{
		super("ToastrFeature");
		//Nothing needed
	}

	/**
	 * Constructs with a given message
	 *
	 * @param message
	 */
	public ToastrFeature(String message)
	{
		this();
		this.message = message;
	}

	/**
	 * Constructs a new feature with title and message
	 *
	 * @param title
	 * @param message
	 */
	public ToastrFeature(String title, String message)
	{
		this();
		this.title = title;
		this.message = message;
	}

	/**
	 * Constructs a complete feature
	 *
	 * @param type
	 * @param title
	 * @param message
	 */
	public ToastrFeature(ToastrType type, String title, String message)
	{
		this();
		this.type = type;
		this.title = title;
		this.message = message;
	}

	/**
	 * Sets the title of the toastr
	 *
	 * @param title
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTitle(String title)
	{
		this.title = title;
		return (J) this;
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery("toastr.options = " + getOptions() + ";");
		addQuery("toastr['" + getType() + "']('" + getMessage() + STRING_SINGLE_QUOTES + (getTitle() == null
		                                                                                  ? ""
		                                                                                  : ",'" + getTitle() + STRING_SINGLE_QUOTES) +
				         STRING_CLOSING_BRACKET_SEMICOLON);
	}

	/**
	 * Sets the message of the toaster
	 *
	 * @param message
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMessage(String message)
	{
		this.message = message;
		return (J) this;
	}	/**
 * Returns the options
 *
 * @return
 */
@Override
@NotNull
public ToastrOptions getOptions()
{
	if (super.getOptions() == null)
	{
		setOptions(new ToastrOptions());
	}
	return super.getOptions();
}

	/**
	 * Returns the type for the toastr
	 *
	 * @return
	 */
	@NotNull
	public ToastrType getType()
	{
		if (type == null)
		{
			return ToastrType.Info;
		}
		return type;
	}

	/**
	 * Sets the type for the toastr
	 *
	 * @param type
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setType(ToastrType type)
	{
		this.type = type;
		return (J) this;
	}

	/**
	 * Returns the title of the toastr
	 *
	 * @return
	 */
	public String getTitle()
	{
		return title;
	}



	/**
	 * Returns the message of the toaster
	 *
	 * @return
	 */
	public String getMessage()
	{
		if (message == null)
		{
			message = "";
		}
		return message;
	}


	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		return false;
	}

}

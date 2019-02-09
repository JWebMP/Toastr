/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.toastr;

import com.jwebmp.core.Feature;

import javax.validation.constraints.NotNull;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * Creates toast messages
 *
 * @author GedMarc
 * @since 09 Jun 2017
 */
public class ToastrFeature<J extends ToastrFeature<J>>
		extends Feature<J, ToastrOptions, J>
{


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

	/*
	 * Constructs a new ToastrFeature
	 */
	public ToastrFeature()
	{
		super("ToastrFeature");
		//Nothing needed
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

	/**
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

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery("toastr.options = " + getOptions() + ";");
		addQuery("toastr['" +
		         getType() +
		         "']('" +
		         getMessage().replaceAll("'", "\\'") +
		         STRING_SINGLE_QUOTES +
		         (getTitle() == null
		          ? ""
		          : ",'" + getTitle().replaceAll("'", "\\'") + STRING_SINGLE_QUOTES) +
		         STRING_CLOSING_BRACKET_SEMICOLON);
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
	}

}

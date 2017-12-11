package za.co.mmagon.jwebswing.plugins.toastr;

import za.co.mmagon.jwebswing.utilities.StaticStrings;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.CHAR_DASH;

/**
 * The available positions for a toast
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
public enum ToastrPosition
{
	Toast_Top_Right,
	Toast_Top_Left,
	Toast_Top_Full_Width,
	Toast_Top_Center,
	Toast_Bottom_Right,
	Toast_Bottom_Left,
	Toast_Bottom_Full_Width,
	Toast_Bottom_Center,;
	/**
	 * Any sub data
	 */
	private String data;

	/**
	 * A new ToastrPosition
	 */
	ToastrPosition()
	{

	}

	/**
	 * Returns the name or the data contained within
	 *
	 * @return
	 */
	@Override
	public String toString()
	{
		if (data != null && !data.isEmpty())
		{
			return data;
		}
		else
		{
			return name().toLowerCase().replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
		}
	}
}

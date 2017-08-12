package za.co.mmagon.jwebswing.plugins.toastr;

/**
 * The types of toasts that are available
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
public enum ToastrType
{
	/**
	 * A success toastr type
	 */
	Success,
	/**
	 * An info toastr type
	 */
	Info,
	/**
	 * A warning toastr type
	 */
	Warning,
	/**
	 * An error toastr type
	 */
	Error;
	/**
	 * Any sub data
	 */
	private String data;
	
	/**
	 * A new ToastrType
	 */
	private ToastrType()
	{
	
	}
	
	/**
	 * A new ToastrType with data
	 */
	private ToastrType(String data)
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
			return name().toLowerCase();
		}
	}
}

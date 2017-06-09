package za.co.mmagon.jwebswing.plugins.toastr;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * Implements the Slim Scroll option via JavaScript instead of angular
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Toastr JS", description = "toastr is a Javascript library for non-blocking notifications. jQuery is required. The goal is to create a simple core library that can be customized and extended.",
        url = "https://github.com/GedMarc/JWebSwing-Toastr")
public class ToastrFeature extends Feature<ToastrOptions, ToastrFeature>
{

    private static final long serialVersionUID = 1L;
    /**
     * The type of toaster
     */
    private ToastrType type;
    /**
     * THe message for the toaster
     */
    private String message;
    /**
     * The title for the toastr
     */
    private String title;

    /*
     * Constructs a new ToastrFeature
     */
    public ToastrFeature()
    {
        super("ToastrFeature");
    }

    /**
     * Constructs with a given message and title
     *
     * @param message
     * @param title
     */
    public ToastrFeature(String message, String title)
    {
        this();
        this.message = message;
        this.title = title;
    }

    /**
     * Constructs with a given message and title and type
     *
     * @param type
     * @param message
     * @param title
     */
    public ToastrFeature(ToastrType type, String message, String title)
    {
        this(message, title);
        this.type = type;
    }

    @Override
    protected void assignFunctionsToComponent()
    {
        addQuery("toastr.options = " + getOptions() + ";");
        addQuery("toastr['" + getType() + "']('" + getMessage() + "'" + (getTitle() == null ? "" : "," + getTitle()) + ");");

    }

    @Override
    public ToastrOptions getOptions()
    {
        if (super.getOptions() == null)
        {
            setOptions(new ToastrOptions());
        }
        return super.getOptions();
    }

    /**
     * Returns the type of toastr, default info
     *
     * @return
     */
    public ToastrType getType()
    {
        if (this.type == null)
        {
            this.type = ToastrType.Info;
        }
        return type;
    }

    /**
     * Sets the type or info if null
     *
     * @param type
     */
    public void setType(ToastrType type)
    {
        this.type = type;

    }

    /**
     * Gets the message
     *
     * @return
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * Sets the message
     *
     * @param message
     */
    public void setMessage(String message)
    {
        this.message = message;
    }

    /**
     * Gets the title
     *
     * @return
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Sets the title
     *
     * @param title
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

}

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

import static com.guicedee.services.jsonrepresentation.json.StaticStrings.CHAR_DASH;
import static com.guicedee.services.jsonrepresentation.json.StaticStrings.CHAR_UNDERSCORE;

/**
 * The available positions for a toast
 *
 * @author GedMarc
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
    Toast_Bottom_Center,
    ;
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
            return name().toLowerCase()
                         .replace(CHAR_UNDERSCORE, CHAR_DASH);
        }
    }
}

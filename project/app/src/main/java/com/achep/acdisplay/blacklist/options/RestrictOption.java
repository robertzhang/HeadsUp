/*
 * Copyright (C) 2014 AChep@xda <artemchep@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
package com.achep.acdisplay.blacklist.options;

import android.content.Context;
import android.widget.CompoundButton;

import com.achep.headsup.R;
import com.achep.acdisplay.blacklist.AppConfig;
import com.achep.acdisplay.blacklist.Blacklist;
import com.achep.acdisplay.blacklist.BlacklistEnabler;

/**
 * Created by Artem on 28.02.14.
 */
public class RestrictOption extends Option {

    public RestrictOption(Context context, CompoundButton cb,
                          Blacklist blacklist, BlacklistEnabler enabler) {
        super(context, cb, blacklist, enabler,
                context.getResources().getDrawable(R.drawable.ic_settings_sleep_mode),
                context.getResources().getString(R.string.blacklist_app_restricted_title),
                context.getResources().getString(R.string.blacklist_app_restricted_summary));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean[] getValue(AppConfig config) {
        return config.restricted;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDiffMask() {
        return AppConfig.DIFF_RESTRICTED;
    }
}

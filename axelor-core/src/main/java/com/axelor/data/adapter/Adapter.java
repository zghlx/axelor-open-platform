/*
 * Axelor Business Solutions
 *
 * Copyright (C) 2005-2025 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.axelor.data.adapter;

import java.util.Map;
import java.util.Properties;

public abstract class Adapter {

  private Properties options;

  public void setOptions(Properties options) {
    this.options = options;
  }

  public String get(String option, String defaultValue) {
    if (options == null) {
      return defaultValue;
    }
    return options.getProperty(option, defaultValue);
  }

  public abstract Object adapt(Object value, Map<String, Object> context);
}

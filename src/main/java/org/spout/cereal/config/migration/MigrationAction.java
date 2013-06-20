/*
 * This file is part of Cerealization.
 *
 * Copyright (c) 2013 Spout LLC <http://www.spout.org/>
 * Cerealization is licensed under the Spout License Version 1.
 *
 * Cerealization is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the Spout License Version 1.
 *
 * Cerealization is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for
 * more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the Spout License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://spout.in/licensev1> for the full license, including
 * the MIT license.
 */
package org.spout.cereal.config.migration;

/**
 * Represents the two sides of migrating an existing configuration key:
 * Converting the key and converting the value
 */
public interface MigrationAction {
	/**
	 * This method converts the old configuration key to its migrated value.
	 *
	 * @param key The existing configuration key
	 * @return The key modified to its new value
	 */
	public String[] convertKey(String[] key);
	/**
	 * This method converts the old configuration value to its migrated value.
	 *
	 * @param value The existing configuration value
	 * @return The value modified to its new value
	 */
	public Object convertValue(Object value);
}

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
package org.spout.cereal.config.commented;

import org.spout.cereal.config.Configuration;

/**
 * A configuration that accepts comments. <br/>
 * All ConfigurationNodes passed to this configuration must be CommentedConfigurationNode.<br/>
 * The node getters for this configuration all return CommentedConfigurationNodes for convenience.<br/>
 *
 */
public interface CommentedConfiguration extends Configuration {
	public CommentedConfigurationNode createConfigurationNode(String[] path, Object value);
	@Override
	public CommentedConfigurationNode getNode(String... node);
	@Override
	public CommentedConfigurationNode getNode(String path);
}

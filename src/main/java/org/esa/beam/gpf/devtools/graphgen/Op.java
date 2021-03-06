/*
 * Copyright (C) 2011 Brockmann Consult GmbH (info@brockmann-consult.de)
 * 
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or (at your option)
 * any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 * 
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, see http://www.gnu.org/licenses/
 */

package org.esa.beam.gpf.devtools.graphgen;

import org.esa.beam.framework.datamodel.Product;

/**
 * Abstraction of various op node types used by {@link GraphGen}.
 *
 * @author Thomas Storm
 * @author Norman Fomferra
 */
public interface Op {

    String getName();

    boolean isJAI();

    Op[] getSourceOps();

    Product[] getSourceProducts();

    boolean isTargetProduct(Product product);
}

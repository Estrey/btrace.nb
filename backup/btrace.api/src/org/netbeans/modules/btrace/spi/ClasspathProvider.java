/*
 * Copyright (c) 2010, 2016, Jaroslav Bachorik <j.bachorik@btrace.io>.
 * All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Copyright owner designates this
 * particular file as subject to the "Classpath" exception as provided
 * by the owner in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package org.netbeans.modules.btrace.spi;

import java.util.Collection;
import java.util.Collections;
import static java.util.Collections.EMPTY_LIST;
import org.netbeans.modules.btrace.api.BTraceTask;

/**
 *
 * @author Jaroslav Bachorik 
 */
public interface ClasspathProvider {
    public static final ClasspathProvider EMPTY = new ClasspathProvider() {

        @Override
        public Collection<String> getClasspath(BTraceTask task) {
            return EMPTY_LIST;
        }
    };

    Collection<String> getClasspath(BTraceTask task);
}

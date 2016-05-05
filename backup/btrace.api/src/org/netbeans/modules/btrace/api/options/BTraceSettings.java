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

package org.netbeans.modules.btrace.api.options;

import org.netbeans.modules.btrace.api.options.impl.BTraceSettingsImpl;

/**
 *
 * @author Jaroslav Bachorik 
 */
final public class BTraceSettings extends com.sun.btrace.api.BTraceSettings {
    final private static class Singleton {
        final private static BTraceSettings INSTANCE = new BTraceSettings();
    }

    final static private BTraceSettingsImpl delegate = new BTraceSettingsImpl();

    final static public BTraceSettings sharedInstance() {
        return Singleton.INSTANCE;
    }

    public boolean isDebugMode() {
        return delegate.isDebugMode();
    }

    public void setDebugMode(boolean debugMode) {
        delegate.setDebugMode(debugMode);
    }

    public String getDumpClassPath() {
        return delegate.getDumpClassPath();
    }

    public void setDumpClassPath(String dumpClassPath) {
        delegate.setDumpClassPath(dumpClassPath);
    }

    public boolean isDumpClasses() {
        return delegate.isDumpClasses();
    }

    public void setDumpClasses(boolean dumpClasses) {
        delegate.setDumpClasses(dumpClasses);
    }
}
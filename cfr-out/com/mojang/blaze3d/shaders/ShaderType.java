/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package com.mojang.blaze3d.shaders;

import org.jspecify.annotations.Nullable;

@fwa
public enum ShaderType {
    VERTEX("vertex", ".vsh"),
    FRAGMENT("fragment", ".fsh");

    private static final ShaderType[] TYPES;
    private final String name;
    private final String extension;

    private ShaderType(String $$0, String $$1) {
        this.name = $$0;
        this.extension = $$1;
    }

    public static @Nullable ShaderType byLocation(amo $$0) {
        for (ShaderType $$1 : TYPES) {
            if (!$$0.a().endsWith($$1.extension)) continue;
            return $$1;
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    public amm idConverter() {
        return new amm("shaders", this.extension);
    }

    static {
        TYPES = ShaderType.values();
    }
}


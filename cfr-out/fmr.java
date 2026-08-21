/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class fmr
extends Record {
    private final amo d;
    private final boolean e;
    private final int f;
    private final boolean g;
    private final boolean h;
    public static final int a = -1;
    public static final Codec<jd<fmr>> b = mi.aq.r();
    public static final aao<xq, jd<fmr>> c = aam.b(mj.Z);

    public fmr(amo $$0, boolean $$1, int $$2, boolean $$3, boolean $$4) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
    }

    public boolean a() {
        return this.f != -1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fmr.class, "assetId;showOnItemFrame;mapColor;explorationMapElement;trackCount", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fmr.class, "assetId;showOnItemFrame;mapColor;explorationMapElement;trackCount", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fmr.class, "assetId;showOnItemFrame;mapColor;explorationMapElement;trackCount", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public amo b() {
        return this.d;
    }

    public boolean c() {
        return this.e;
    }

    public int d() {
        return this.f;
    }

    public boolean e() {
        return this.g;
    }

    public boolean f() {
        return this.h;
    }
}


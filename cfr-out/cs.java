/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class cs
extends Record {
    private final cq.b b;
    private final cq.b c;
    private final cq.b d;
    private final cq.b e;
    private final cq.b f;
    private final cq.b g;
    private final cq.b h;
    public static final Codec<cs> a = RecordCodecBuilder.create($$0 -> $$0.group((App)cq.b.d.optionalFieldOf("x", (Object)cq.b.c).forGetter(cs::a), (App)cq.b.d.optionalFieldOf("y", (Object)cq.b.c).forGetter(cs::b), (App)cq.b.d.optionalFieldOf("z", (Object)cq.b.c).forGetter(cs::c), (App)cq.b.d.optionalFieldOf("speed", (Object)cq.b.c).forGetter(cs::d), (App)cq.b.d.optionalFieldOf("horizontal_speed", (Object)cq.b.c).forGetter(cs::e), (App)cq.b.d.optionalFieldOf("vertical_speed", (Object)cq.b.c).forGetter(cs::f), (App)cq.b.d.optionalFieldOf("fall_distance", (Object)cq.b.c).forGetter(cs::g)).apply((Applicative)$$0, cs::new));

    public cs(cq.b $$0, cq.b $$1, cq.b $$2, cq.b $$3, cq.b $$4, cq.b $$5, cq.b $$6) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
    }

    public static cs a(cq.b $$0) {
        return new cs(cq.b.c, cq.b.c, cq.b.c, $$0, cq.b.c, cq.b.c, cq.b.c);
    }

    public static cs b(cq.b $$0) {
        return new cs(cq.b.c, cq.b.c, cq.b.c, cq.b.c, $$0, cq.b.c, cq.b.c);
    }

    public static cs c(cq.b $$0) {
        return new cs(cq.b.c, cq.b.c, cq.b.c, cq.b.c, cq.b.c, $$0, cq.b.c);
    }

    public static cs d(cq.b $$0) {
        return new cs(cq.b.c, cq.b.c, cq.b.c, cq.b.c, cq.b.c, cq.b.c, $$0);
    }

    public boolean a(double $$0, double $$1, double $$2, double $$3) {
        if (!(this.b.d($$0) && this.c.d($$1) && this.d.d($$2))) {
            return false;
        }
        double $$4 = bgj.f($$0, $$1, $$2);
        if (!this.e.e($$4)) {
            return false;
        }
        double $$5 = bgj.e($$0, $$2);
        if (!this.f.e($$5)) {
            return false;
        }
        double $$6 = Math.abs($$1);
        if (!this.g.d($$6)) {
            return false;
        }
        return this.h.d($$3);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cs.class, "x;y;z;speed;horizontalSpeed;verticalSpeed;fallDistance", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cs.class, "x;y;z;speed;horizontalSpeed;verticalSpeed;fallDistance", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cs.class, "x;y;z;speed;horizontalSpeed;verticalSpeed;fallDistance", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public cq.b a() {
        return this.b;
    }

    public cq.b b() {
        return this.c;
    }

    public cq.b c() {
        return this.d;
    }

    public cq.b d() {
        return this.e;
    }

    public cq.b e() {
        return this.f;
    }

    public cq.b f() {
        return this.g;
    }

    public cq.b g() {
        return this.h;
    }
}


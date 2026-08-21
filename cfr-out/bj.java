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

public final class bj
extends Record {
    private final cq.b b;
    private final cq.b c;
    private final cq.b d;
    private final cq.b e;
    private final cq.b f;
    public static final Codec<bj> a = RecordCodecBuilder.create($$0 -> $$0.group((App)cq.b.d.optionalFieldOf("x", (Object)cq.b.c).forGetter(bj::a), (App)cq.b.d.optionalFieldOf("y", (Object)cq.b.c).forGetter(bj::b), (App)cq.b.d.optionalFieldOf("z", (Object)cq.b.c).forGetter(bj::c), (App)cq.b.d.optionalFieldOf("horizontal", (Object)cq.b.c).forGetter(bj::d), (App)cq.b.d.optionalFieldOf("absolute", (Object)cq.b.c).forGetter(bj::e)).apply((Applicative)$$0, bj::new));

    public bj(cq.b $$0, cq.b $$1, cq.b $$2, cq.b $$3, cq.b $$4) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }

    public static bj a(cq.b $$0) {
        return new bj(cq.b.c, cq.b.c, cq.b.c, $$0, cq.b.c);
    }

    public static bj b(cq.b $$0) {
        return new bj(cq.b.c, $$0, cq.b.c, cq.b.c, cq.b.c);
    }

    public static bj c(cq.b $$0) {
        return new bj(cq.b.c, cq.b.c, cq.b.c, cq.b.c, $$0);
    }

    public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
        float $$6 = (float)($$0 - $$3);
        float $$7 = (float)($$1 - $$4);
        float $$8 = (float)($$2 - $$5);
        if (!(this.b.d(bgj.c($$6)) && this.c.d(bgj.c($$7)) && this.d.d(bgj.c($$8)))) {
            return false;
        }
        if (!this.e.e($$6 * $$6 + $$8 * $$8)) {
            return false;
        }
        return this.f.e($$6 * $$6 + $$7 * $$7 + $$8 * $$8);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bj.class, "x;y;z;horizontal;absolute", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bj.class, "x;y;z;horizontal;absolute", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bj.class, "x;y;z;horizontal;absolute", "b", "c", "d", "e", "f"}, this, $$0);
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
}


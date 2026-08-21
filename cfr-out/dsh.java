/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dsh
extends Record
implements dry {
    private final dse f;
    private final dse g;
    private final dse h;
    private final dse i;
    private final dse j;
    public static final MapCodec<dsh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dse.a.fieldOf("template").forGetter(dsh::b), (App)dse.a.fieldOf("base").forGetter(dsh::c), (App)dse.a.fieldOf("addition").forGetter(dsh::f), (App)dse.a.fieldOf("result").forGetter(dsh::d), (App)dse.a.fieldOf("crafting_station").forGetter(dsh::e)).apply((Applicative)$$0, dsh::new));
    public static final aao<xq, dsh> b = aao.a(dse.b, dsh::b, dse.b, dsh::c, dse.b, dsh::f, dse.b, dsh::d, dse.b, dsh::e, dsh::new);
    public static final dry.a<dsh> c = new dry.a<dsh>(a, b);

    public dsh(dse $$0, dse $$1, dse $$2, dse $$3, dse $$4) {
        this.f = $$0;
        this.g = $$1;
        this.h = $$2;
        this.i = $$3;
        this.j = $$4;
    }

    public dry.a<dsh> a() {
        return c;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dsh.class, "template;base;addition;result;craftingStation", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dsh.class, "template;base;addition;result;craftingStation", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dsh.class, "template;base;addition;result;craftingStation", "f", "g", "h", "i", "j"}, this, $$0);
    }

    public dse b() {
        return this.f;
    }

    public dse c() {
        return this.g;
    }

    public dse f() {
        return this.h;
    }

    @Override
    public dse d() {
        return this.i;
    }

    @Override
    public dse e() {
        return this.j;
    }
}


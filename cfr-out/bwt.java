/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;

public final class bwt
extends Record {
    private final Optional<is> b;
    private final Optional<is> c;
    private final int d;
    private final List<is> e;
    public static final aao<ByteBuf, bwt> a = aao.a(is.b.a(aam::a), bwt::a, is.b.a(aam::a), bwt::b, aam.h, bwt::c, is.b.a(aam.a()), bwt::d, bwt::new);

    public bwt(Optional<is> $$0, Optional<is> $$1, int $$2, List<is> $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public boolean a(is $$0) {
        return this.b.isPresent() && $$0.equals(this.b.get());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bwt.class, "hivePos;flowerPos;travelTicks;blacklistedHives", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bwt.class, "hivePos;flowerPos;travelTicks;blacklistedHives", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bwt.class, "hivePos;flowerPos;travelTicks;blacklistedHives", "b", "c", "d", "e"}, this, $$0);
    }

    public Optional<is> a() {
        return this.b;
    }

    public Optional<is> b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public List<is> d() {
        return this.e;
    }
}


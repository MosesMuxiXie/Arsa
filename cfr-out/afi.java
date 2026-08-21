/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public final class afi
extends Record
implements aay<adb> {
    private final int b;
    private final UUID c;
    private final int d;
    private final @Nullable yu e;
    private final zb.a f;
    private final @Nullable yh g;
    private final yl h;
    private final yd.a i;
    public static final aao<xq, afi> a = aay.a(afi::a, afi::new);

    private afi(xq $$0) {
        this($$0.l(), $$0.n(), $$0.l(), $$0.c(yu::a), new zb.a($$0), wx.a($$0, yj.d), yl.a($$0), (yd.a)yd.a.a.decode($$0));
    }

    public afi(int $$0, UUID $$1, int $$2, @Nullable yu $$3, zb.a $$4, @Nullable yh $$5, yl $$6, yd.a $$7) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
    }

    @Override
    private void a(xq $$0) {
        $$0.c(this.b);
        $$0.a(this.c);
        $$0.c(this.d);
        $$0.a(this.e, yu::a);
        this.f.a($$0);
        wx.a($$0, this.g, yj.d);
        yl.a($$0, this.h);
        yd.a.a.encode($$0, this.i);
    }

    @Override
    public aba<afi> a() {
        return ahz.ag;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{afi.class, "globalIndex;sender;index;signature;body;unsignedContent;filterMask;chatType", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{afi.class, "globalIndex;sender;index;signature;body;unsignedContent;filterMask;chatType", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{afi.class, "globalIndex;sender;index;signature;body;unsignedContent;filterMask;chatType", "b", "c", "d", "e", "f", "g", "h", "i"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public UUID e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public @Nullable yu g() {
        return this.e;
    }

    public zb.a h() {
        return this.f;
    }

    public @Nullable yh i() {
        return this.g;
    }

    public yl j() {
        return this.h;
    }

    public yd.a k() {
        return this.i;
    }
}


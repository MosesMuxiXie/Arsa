/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class aaj
extends Record
implements aag {
    private final zf e;
    public static final aah<aaj> a = new aah<aaj>(){
        private static final MapCodec<aaj> a = zf.b.a.xmap(aaj::new, aaj::b);
        private static final aao<xq, aaj> b = aao.a(zf.b.c, aaj::b, aaj::new);

        @Override
        public MapCodec<aaj> a() {
            return a;
        }

        @Override
        public aao<xq, aaj> b() {
            return b;
        }
    };
    public static final aaj b = new aaj(zf.a);
    public static final aaj c = new aaj(zf.a.a(l.m));
    public static final aaj d = new aaj(zf.a.a(l.o));

    public aaj(zf $$0) {
        this.e = $$0;
    }

    @Override
    public yw a(int $$0) {
        return yh.b(Integer.toString($$0)).c(this.e);
    }

    public aah<aaj> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aaj.class, "style", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aaj.class, "style", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aaj.class, "style", "e"}, this, $$0);
    }

    public zf b() {
        return this.e;
    }
}


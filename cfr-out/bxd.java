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

public final class bxd
extends Record {
    private final ffg b;
    private final List<a> c;
    public static final aao<ByteBuf, bxd> a = aao.a(ffg.b, bxd::a, bxd$a.a.a(aam.a()), bxd::b, bxd::new);

    public bxd(ffg $$0, List<a> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bxd.class, "boundingBox;pieces", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bxd.class, "boundingBox;pieces", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bxd.class, "boundingBox;pieces", "b", "c"}, this, $$0);
    }

    public ffg a() {
        return this.b;
    }

    public List<a> b() {
        return this.c;
    }

    public static final class a
    extends Record {
        private final ffg b;
        private final boolean c;
        public static final aao<ByteBuf, a> a = aao.a(ffg.b, a::a, aam.b, a::b, a::new);

        public a(ffg $$0, boolean $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "boundingBox;isStart", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "boundingBox;isStart", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "boundingBox;isStart", "b", "c"}, this, $$0);
        }

        public ffg a() {
            return this.b;
        }

        public boolean b() {
            return this.c;
        }
    }
}


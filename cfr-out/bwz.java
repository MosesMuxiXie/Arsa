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

public final class bwz
extends Record {
    private final List<a> b;
    public static final aao<ByteBuf, bwz> a = aao.a(bwz$a.a.a(aam.a()), bwz::a, bwz::new);

    public bwz(List<a> $$0) {
        this.b = $$0;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bwz.class, "goals", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bwz.class, "goals", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bwz.class, "goals", "b"}, this, $$0);
    }

    public List<a> a() {
        return this.b;
    }

    public static final class a
    extends Record {
        private final int b;
        private final boolean c;
        private final String d;
        public static final aao<ByteBuf, a> a = aao.a(aam.h, a::a, aam.b, a::b, aam.b(255), a::c, a::new);

        public a(int $$0, boolean $$1, String $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "priority;isRunning;name", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "priority;isRunning;name", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "priority;isRunning;name", "b", "c", "d"}, this, $$0);
        }

        public int a() {
            return this.b;
        }

        public boolean b() {
            return this.c;
        }

        public String c() {
            return this.d;
        }
    }
}


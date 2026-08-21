/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class afs
extends Record
implements aay<adb> {
    private final List<a> b;
    private final boolean c;
    public static final aao<xq, afs> a = aao.a(afs$a.c.a(aam.a()), afs::b, aam.b, afs::e, afs::new);

    public afs(List<a> $$0, boolean $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<afs> a() {
        return ahz.ap;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{afs.class, "entries;replace", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{afs.class, "entries;replace", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{afs.class, "entries;replace", "b", "c"}, this, $$0);
    }

    public List<a> b() {
        return this.b;
    }

    public boolean e() {
        return this.c;
    }

    public static final class a
    extends Record {
        private final drz d;
        private final byte e;
        public static final byte a = 1;
        public static final byte b = 2;
        public static final aao<xq, a> c = aao.a(drz.a, a::c, aam.c, a::d, a::new);

        public a(drz $$0, boolean $$1, boolean $$2) {
            this($$0, (byte)(($$1 ? 1 : 0) | ($$2 ? 2 : 0)));
        }

        public a(drz $$0, byte $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        public boolean a() {
            return (this.e & 1) != 0;
        }

        public boolean b() {
            return (this.e & 2) != 0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "contents;flags", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "contents;flags", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "contents;flags", "d", "e"}, this, $$0);
        }

        public drz c() {
            return this.d;
        }

        public byte d() {
            return this.e;
        }
    }
}


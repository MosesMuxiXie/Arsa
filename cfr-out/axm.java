/*
 * Decompiled with CFR 0.152.
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class axm
extends Record {
    private final long p;
    @a
    private final int q;
    public static final long a = 0L;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = 8;
    public static final int f = 16;
    public static final axm g = axm.a("player_spawn", 20L, 2);
    public static final axm h = axm.a("spawn_search", 1L, 2);
    public static final axm i = axm.a("dragon", 0L, 6);
    public static final axm j = axm.a("player_loading", 0L, 2);
    public static final axm k = axm.a("player_simulation", 0L, 12);
    public static final axm l = axm.a("forced", 0L, 15);
    public static final axm m = axm.a("portal", 300L, 15);
    public static final axm n = axm.a("ender_pearl", 40L, 14);
    public static final axm o = axm.a("unknown", 1L, 18);

    public axm(long $$0, @a int $$1) {
        this.p = $$0;
        this.q = $$1;
    }

    private static axm a(String $$0, long $$1, @a int $$2) {
        return jq.a(mi.aB, $$0, new axm($$1, $$2));
    }

    public boolean a() {
        return (this.q & 1) != 0;
    }

    public boolean b() {
        return (this.q & 2) != 0;
    }

    public boolean c() {
        return (this.q & 4) != 0;
    }

    public boolean d() {
        return (this.q & 8) != 0;
    }

    public boolean e() {
        return (this.q & 0x10) != 0;
    }

    public boolean f() {
        return this.p != 0L;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{axm.class, "timeout;flags", "p", "q"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{axm.class, "timeout;flags", "p", "q"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{axm.class, "timeout;flags", "p", "q"}, this, $$0);
    }

    public long g() {
        return this.p;
    }

    @a
    public int h() {
        return this.q;
    }

    @Retention(value=RetentionPolicy.CLASS)
    @Target(value={ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.TYPE_USE})
    public static @interface a {
    }
}


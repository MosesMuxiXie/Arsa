/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class bdh<T>
extends fuu {
    public static final aao<xq, bdh<?>> a = aam.a(mj.ay).b(bdh::a, bdj::a);
    private final bdi p;
    private final T q;
    private final bdj<T> r;

    protected bdh(bdj<T> $$0, T $$1, bdi $$2) {
        super(bdh.a($$0, $$1));
        this.r = $$0;
        this.p = $$2;
        this.q = $$1;
    }

    public static <T> String a(bdj<T> $$0, T $$1) {
        return bdh.a(mi.w.b($$0)) + ":" + bdh.a($$0.b().b($$1));
    }

    private static String a(@Nullable amo $$0) {
        return $$0.toString().replace(':', '.');
    }

    public bdj<T> a() {
        return this.r;
    }

    public T b() {
        return this.q;
    }

    public String a(int $$0) {
        return this.p.format($$0);
    }

    public boolean equals(Object $$0) {
        return this == $$0 || $$0 instanceof bdh && Objects.equals(this.d(), ((bdh)$$0).d());
    }

    public int hashCode() {
        return this.d().hashCode();
    }

    public String toString() {
        return "Stat{name=" + this.d() + ", formatter=" + String.valueOf(this.p) + "}";
    }
}


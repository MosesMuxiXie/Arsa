/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public final class drz
extends Record {
    private final dsa b;
    private final dry c;
    private final OptionalInt d;
    private final dqv e;
    private final Optional<List<dqo>> f;
    public static final aao<xq, drz> a = aao.a(dsa.a, drz::a, dry.e, drz::b, aam.i, drz::c, aam.a(mj.an), drz::d, dqo.a.a(aam.a()).a(aam::a), drz::e, drz::new);

    public drz(dsa $$0, dry $$1, OptionalInt $$2, dqv $$3, Optional<List<dqo>> $$4) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }

    public List<dlt> a(bhx $$0) {
        return this.c.d().a($$0);
    }

    public boolean a(ddu $$0) {
        if (this.f.isEmpty()) {
            return false;
        }
        return $$0.a(this.f.get(), null);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{drz.class, "id;display;group;category;craftingRequirements", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{drz.class, "id;display;group;category;craftingRequirements", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{drz.class, "id;display;group;category;craftingRequirements", "b", "c", "d", "e", "f"}, this, $$0);
    }

    public dsa a() {
        return this.b;
    }

    public dry b() {
        return this.c;
    }

    public OptionalInt c() {
        return this.d;
    }

    public dqv d() {
        return this.e;
    }

    public Optional<List<dqo>> e() {
        return this.f;
    }
}


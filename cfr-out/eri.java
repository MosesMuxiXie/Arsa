/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public final class eri
extends Record {
    private final ImmutableList<erm> c;
    public static final eri a = new a().a(erj.c, $$0 -> $$0).a(erj.d, $$0 -> $$0.a(erl::b)).a(erj.e, $$0 -> $$0.a(erj.d, 8).a(erl::d)).a(erj.f, $$0 -> $$0.a(erj.d, 8).a(erl::e)).a(erj.g, $$0 -> $$0.a(erj.d, 8).a(erj.f, 1).a(0).a(erl::f)).a(erj.h, $$0 -> $$0.a(erj.d, 8).a(erj.f, 1).a(0).a(erl::g)).a(erj.i, $$0 -> $$0.a(erj.d, 8).a(0).a(erl::h)).a(erj.j, $$0 -> $$0.a(erj.d, 8).a(erj.i, 1).a(1).a(erl::i)).a(erj.k, $$0 -> $$0.a(erl::j)).a(erj.l, $$0 -> $$0.a(erj.k, 1).a(erl::k)).a(erj.m, $$0 -> $$0.a(erj.f, 1).a(erl::l)).a(erj.n, $$0 -> $$0.a(erl::m)).a();
    public static final eri b = new a().a(erj.c, $$0 -> $$0).a(erj.d, $$0 -> $$0.a(erl::c)).a(erj.e, $$0 -> $$0).a(erj.f, $$0 -> $$0).a(erj.g, $$0 -> $$0).a(erj.h, $$0 -> $$0).a(erj.i, $$0 -> $$0).a(erj.j, $$0 -> $$0).a(erj.k, $$0 -> $$0.a(erl::j)).a(erj.l, $$0 -> $$0.a(erj.k, 1).a(erl::k)).a(erj.m, $$0 -> $$0).a(erj.n, $$0 -> $$0.a(erl::m)).a();

    public eri(ImmutableList<erm> $$0) {
        this.c = $$0;
    }

    public erm a(erj $$0) {
        return (erm)this.c.get($$0.b());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{eri.class, "steps", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{eri.class, "steps", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{eri.class, "steps", "c"}, this, $$0);
    }

    public ImmutableList<erm> a() {
        return this.c;
    }

    public static class a {
        private final List<erm> a = new ArrayList<erm>();

        public eri a() {
            return new eri((ImmutableList<erm>)ImmutableList.copyOf(this.a));
        }

        public a a(erj $$0, UnaryOperator<erm.a> $$1) {
            erm.a $$3;
            if (this.a.isEmpty()) {
                erm.a $$2 = new erm.a($$0);
            } else {
                $$3 = new erm.a($$0, this.a.getLast());
            }
            this.a.add(((erm.a)$$1.apply($$3)).a());
            return this;
        }
    }
}


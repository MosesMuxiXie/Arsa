/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import java.util.function.Predicate;

public final class cta
extends Record {
    private final Set<eoh> b;
    private final int c;
    private final int d;
    public static final Predicate<jd<cta>> a = $$0 -> false;

    public cta(Set<eoh> $$0, int $$1, int $$2) {
        $$0 = Set.copyOf($$0);
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public boolean a(eoh $$0) {
        return this.b.contains($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cta.class, "matchingStates;maxTickets;validRange", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cta.class, "matchingStates;maxTickets;validRange", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cta.class, "matchingStates;maxTickets;validRange", "b", "c", "d"}, this, $$0);
    }

    public Set<eoh> a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;

public final class gzl
extends Record
implements hdp {
    private final boolean b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final Set<String> h;

    public gzl(Set<String> $$0) {
        this(false, 5.0f, 2.0f, $$0);
    }

    public gzl(boolean $$0, float $$1, float $$2, Set<String> $$3) {
        this($$0, $$1, $$2, 2.0f, 2.0f, 24.0f, $$3);
    }

    public gzl(boolean $$0, float $$1, float $$2, float $$3, float $$4, float $$5, Set<String> $$6) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
    }

    @Override
    public hdo apply(hdo $$0) {
        float $$12 = this.b ? 1.5f / this.e : 1.0f;
        float $$2 = 1.0f / this.f;
        UnaryOperator $$3 = $$1 -> $$1.c(0.0f, this.c, this.d).b($$12);
        UnaryOperator $$4 = $$1 -> $$1.c(0.0f, this.g, 0.0f).b($$2);
        hdo $$5 = new hdo();
        for (Map.Entry<String, hdq> $$6 : $$0.a().b()) {
            String $$7 = $$6.getKey();
            hdq $$8 = $$6.getValue();
            $$5.a().a($$7, $$8.a(this.h.contains($$7) ? $$3 : $$4));
        }
        return $$5;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gzl.class, "scaleHead;babyYHeadOffset;babyZHeadOffset;babyHeadScale;babyBodyScale;bodyYOffset;headParts", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gzl.class, "scaleHead;babyYHeadOffset;babyZHeadOffset;babyHeadScale;babyBodyScale;bodyYOffset;headParts", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gzl.class, "scaleHead;babyYHeadOffset;babyZHeadOffset;babyHeadScale;babyBodyScale;bodyYOffset;headParts", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public boolean a() {
        return this.b;
    }

    public float b() {
        return this.c;
    }

    public float c() {
        return this.d;
    }

    public float d() {
        return this.e;
    }

    public float e() {
        return this.f;
    }

    public float f() {
        return this.g;
    }

    public Set<String> g() {
        return this.h;
    }
}


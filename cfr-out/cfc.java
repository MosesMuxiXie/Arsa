/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public final class cfc
extends Record {
    private final String i;
    public static final cfc a = new cfc("generic");
    public static final cfc b = new cfc("ladder");
    public static final cfc c = new cfc("vines");
    public static final cfc d = new cfc("weeping_vines");
    public static final cfc e = new cfc("twisting_vines");
    public static final cfc f = new cfc("scaffolding");
    public static final cfc g = new cfc("other_climbable");
    public static final cfc h = new cfc("water");

    public cfc(String $$0) {
        this.i = $$0;
    }

    public static cfc a(eoh $$0) {
        if ($$0.a(dzs.dm) || $$0.a(bdp.O)) {
            return b;
        }
        if ($$0.a(dzs.fN)) {
            return c;
        }
        if ($$0.a(dzs.px) || $$0.a(dzs.py)) {
            return d;
        }
        if ($$0.a(dzs.pz) || $$0.a(dzs.pA)) {
            return e;
        }
        if ($$0.a(dzs.oP)) {
            return f;
        }
        return g;
    }

    public static @Nullable cfc a(chl $$0) {
        Optional<is> $$1 = $$0.fk();
        if ($$1.isPresent()) {
            eoh $$2 = $$0.ao().a_($$1.get());
            return cfc.a($$2);
        }
        if ($$0.by()) {
            return h;
        }
        return null;
    }

    public String a() {
        return "death.fell.accident." + this.i;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cfc.class, "id", "i"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cfc.class, "id", "i"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cfc.class, "id", "i"}, this, $$0);
    }

    public String b() {
        return this.i;
    }
}


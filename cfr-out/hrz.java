/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  org.joml.Quaternionfc
 */
import com.google.common.collect.ImmutableMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import org.joml.Quaternionfc;

public class hrz
extends hrc {
    public static final float a = 0.6666667f;
    private static final ftm b = new ftm(0.0, 0.3333333432674408, 0.046666666865348816);
    private final Map<epw, a> c = (Map)epw.a().collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$1 -> new a(hrz.a($$02.f(), $$1, true), hrz.a($$02.f(), $$1, false))));

    public hrz(hrj.a $$02) {
        super($$02);
    }

    @Override
    protected gzp.a a(eoh $$0, epw $$1) {
        a $$2 = this.c.get($$1);
        return $$0.b() instanceof eia ? $$2.a() : $$2.b();
    }

    @Override
    protected ins a(epw $$0) {
        return hpj.a($$0);
    }

    @Override
    protected float a() {
        return 0.6666667f;
    }

    @Override
    protected float b() {
        return 0.6666667f;
    }

    private static void a(fzm $$0, float $$1) {
        $$0.a(0.5f, 0.5f, 0.5f);
        $$0.a((Quaternionfc)a.d.rotationDegrees($$1));
    }

    @Override
    protected void a(fzm $$0, float $$1, eoh $$2) {
        hrz.a($$0, $$1);
        if (!($$2.b() instanceof eia)) {
            $$0.a(0.0f, -0.3125f, -0.4375f);
        }
    }

    @Override
    protected ftm c() {
        return b;
    }

    public static void a(inu $$0, fzm $$1, hpo $$2, int $$3, int $$4, gzp.a $$5, ins $$6) {
        $$1.a();
        hrz.a($$1);
        $$2.a($$5, bhr.a, $$1, $$6.a($$5::a), $$3, $$4, -1, $$0.a($$6), 0, null);
        $$1.b();
    }

    public static void a(fzm $$0) {
        hrz.a($$0, 0.0f);
        $$0.b(0.6666667f, -0.6666667f, -0.6666667f);
    }

    public static gzp.a a(hdc $$0, epw $$1, boolean $$2) {
        hde $$3 = $$2 ? hdf.a($$1) : hdf.b($$1);
        return new gzp.a($$0.a($$3), ijt::g);
    }

    public static hdm a(boolean $$0) {
        hdo $$1 = new hdo();
        hdq $$2 = $$1.a();
        $$2.a("sign", hdl.c().a(0, 0).a(-12.0f, -14.0f, -1.0f, 24.0f, 12.0f, 2.0f), hdi.a);
        if ($$0) {
            $$2.a("stick", hdl.c().a(0, 14).a(-1.0f, -2.0f, -1.0f, 2.0f, 14.0f, 2.0f), hdi.a);
        }
        return hdm.a($$1, 64, 32);
    }

    record a(gzp.a a, gzp.a b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "standing;wall", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "standing;wall", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "standing;wall", "a", "b"}, this, $$0);
        }
    }
}


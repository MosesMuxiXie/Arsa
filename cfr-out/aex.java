/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public final class aex
extends Record
implements aay<adb> {
    private final fmu b;
    private final byte c;
    private final boolean d;
    private final Optional<List<fmq>> e;
    private final Optional<fmw.c> f;
    public static final aao<xq, aex> a = aao.a(fmu.b, aex::b, aam.c, aex::e, aam.b, aex::f, fmq.a.a(aam.a()).a(aam::a), aex::g, fmw.c.a, aex::h, aex::new);

    public aex(fmu $$0, byte $$1, boolean $$2, @Nullable Collection<fmq> $$3, @Nullable fmw.c $$4) {
        this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
    }

    public aex(fmu $$0, byte $$1, boolean $$2, Optional<List<fmq>> $$3, Optional<fmw.c> $$4) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }

    @Override
    public aba<aex> a() {
        return ahz.U;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public void a(fmw $$0) {
        this.e.ifPresent($$0::a);
        this.f.ifPresent($$1 -> $$1.a($$0));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aex.class, "mapId;scale;locked;decorations;colorPatch", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aex.class, "mapId;scale;locked;decorations;colorPatch", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aex.class, "mapId;scale;locked;decorations;colorPatch", "b", "c", "d", "e", "f"}, this, $$0);
    }

    public fmu b() {
        return this.b;
    }

    public byte e() {
        return this.c;
    }

    public boolean f() {
        return this.d;
    }

    public Optional<List<fmq>> g() {
        return this.e;
    }

    public Optional<fmw.c> h() {
        return this.f;
    }
}


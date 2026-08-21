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

public record ahx(jd<esh> a, amt<dwo> b, long c, dwl d, @Nullable dwl e, boolean f, boolean g, Optional<jc> h, int i, int j) {
    public ahx(xq $$0) {
        this((jd)esh.j.decode($$0), $$0.a(mj.bE), $$0.readLong(), dwl.a($$0.readByte()), dwl.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(wx::g), $$0.l(), $$0.l());
    }

    public void a(xq $$0) {
        esh.j.encode($$0, this.a);
        $$0.b(this.b);
        $$0.b(this.c);
        $$0.l(this.d.a());
        $$0.l(dwl.a(this.e));
        $$0.a(this.f);
        $$0.a(this.g);
        $$0.a(this.h, wx::a);
        $$0.c(this.i);
        $$0.c(this.j);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ahx.class, "dimensionType;dimension;seed;gameType;previousGameType;isDebug;isFlat;lastDeathLocation;portalCooldown;seaLevel", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ahx.class, "dimensionType;dimension;seed;gameType;previousGameType;isDebug;isFlat;lastDeathLocation;portalCooldown;seaLevel", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ahx.class, "dimensionType;dimension;seed;gameType;previousGameType;isDebug;isFlat;lastDeathLocation;portalCooldown;seaLevel", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this, $$0);
    }
}


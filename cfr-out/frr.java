/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class frr
extends Record
implements frm {
    private final fsi b;
    public static final MapCodec<frr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)fsj.a.fieldOf("chance").forGetter(frr::c)).apply((Applicative)$$0, frr::new));

    public frr(fsi $$0) {
        this.b = $$0;
    }

    @Override
    public frn a() {
        return fro.d;
    }

    public boolean a(fnz $$0) {
        float $$1 = this.b.b($$0);
        return $$0.b().i() < $$1;
    }

    public static frm.a a(float $$0) {
        return () -> new frr(fsf.a($$0));
    }

    public static frm.a a(fsi $$0) {
        return () -> new frr($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{frr.class, "chance", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{frr.class, "chance", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{frr.class, "chance", "b"}, this, $$0);
    }

    public fsi c() {
        return this.b;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((fnz)object);
    }
}


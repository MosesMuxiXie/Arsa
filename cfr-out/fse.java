/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;

public record fse(fsi b, fsi c) implements fsi
{
    private final fsi b;
    private final fsi c;
    public static final MapCodec<fse> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)fsj.a.fieldOf("n").forGetter(fse::c), (App)fsj.a.fieldOf("p").forGetter(fse::d)).apply((Applicative)$$0, fse::new));

    @Override
    public fsh a() {
        return fsj.d;
    }

    @Override
    public int a(fnz $$0) {
        int $$1 = this.b.a($$0);
        float $$2 = this.c.b($$0);
        bgr $$3 = $$0.b();
        int $$4 = 0;
        for (int $$5 = 0; $$5 < $$1; ++$$5) {
            if (!($$3.i() < $$2)) continue;
            ++$$4;
        }
        return $$4;
    }

    @Override
    public float b(fnz $$0) {
        return this.a($$0);
    }

    public static fse a(int $$0, float $$1) {
        return new fse(fsf.a($$0), fsf.a($$1));
    }

    @Override
    public Set<bhv<?>> b() {
        return Sets.union(this.b.b(), this.c.b());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fse.class, "n;p", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fse.class, "n;p", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fse.class, "n;p", "b", "c"}, this, $$0);
    }

    public fsi c() {
        return this.b;
    }

    public fsi d() {
        return this.c;
    }
}


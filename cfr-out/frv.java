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

public record frv(fsi b, fny c) implements frm
{
    private final fsi b;
    private final fny c;
    public static final MapCodec<frv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)fsj.a.fieldOf("value").forGetter(frv::c), (App)fny.a.fieldOf("range").forGetter(frv::d)).apply((Applicative)$$0, frv::new));

    @Override
    public frn a() {
        return fro.r;
    }

    @Override
    public Set<bhv<?>> b() {
        return Sets.union(this.b.b(), this.c.a());
    }

    public boolean a(fnz $$0) {
        return this.c.b($$0, this.b.a($$0));
    }

    public static frm.a a(fsi $$0, fny $$1) {
        return () -> new frv($$0, $$1);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{frv.class, "provider;range", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{frv.class, "provider;range", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{frv.class, "provider;range", "b", "c"}, this, $$0);
    }

    public fsi c() {
        return this.b;
    }

    public fny d() {
        return this.c;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((fnz)object);
    }
}


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
import java.util.Set;

public record frj(frm b) implements frm
{
    private final frm b;
    public static final MapCodec<frj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)frm.e.fieldOf("term").forGetter(frj::c)).apply((Applicative)$$0, frj::new));

    @Override
    public frn a() {
        return fro.a;
    }

    public boolean a(fnz $$0) {
        return !this.b.test($$0);
    }

    @Override
    public Set<bhv<?>> b() {
        return this.b.b();
    }

    @Override
    public void a(fog $$0) {
        frm.super.a($$0);
        this.b.a($$0);
    }

    public static frm.a a(frm.a $$0) {
        frj $$1 = new frj($$0.build());
        return () -> $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{frj.class, "term", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{frj.class, "term", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{frj.class, "term", "b"}, this, $$0);
    }

    public frm c() {
        return this.b;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((fnz)object);
    }
}


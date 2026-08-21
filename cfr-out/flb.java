/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public final class flb
extends eoj<fla, flb> {
    public static final Codec<flb> a = flb.a(mi.c.q(), fla::g).stable();
    public static final int f = 9;
    public static final int g = 8;

    public flb(fla $$0, Reference2ObjectArrayMap<epk<?>, Comparable<?>> $$1, MapCodec<flb> $$2) {
        super($$0, $$1, $$2);
    }

    public fla a() {
        return (fla)this.d;
    }

    public boolean b() {
        return this.a().c(this);
    }

    public boolean a(fla $$0) {
        return this.d == $$0 && ((fla)this.d).c(this);
    }

    public boolean c() {
        return this.a().b();
    }

    public float a(dvt $$0, is $$1) {
        return this.a().a(this, $$0, $$1);
    }

    public float d() {
        return this.a().a(this);
    }

    public int e() {
        return this.a().d(this);
    }

    public boolean b(dvt $$0, is $$1) {
        for (int $$2 = -1; $$2 <= 1; ++$$2) {
            for (int $$3 = -1; $$3 <= 1; ++$$3) {
                is $$4 = $$1.b($$2, 0, $$3);
                flb $$5 = $$0.b_($$4);
                if ($$5.a().a(this.a()) || $$0.a_($$4).s()) continue;
                return true;
            }
        }
        return false;
    }

    public void a(axf $$0, is $$1, eoh $$2) {
        this.a().b($$0, $$1, $$2, this);
    }

    public void a(dwo $$0, is $$1, bgr $$2) {
        this.a().a($$0, $$1, this, $$2);
    }

    public boolean f() {
        return this.a().i();
    }

    public void a(axf $$0, is $$1, bgr $$2) {
        this.a().a($$0, $$1, this, $$2);
    }

    public ftm c(dvt $$0, is $$1) {
        return this.a().a($$0, $$1, this);
    }

    public eoh g() {
        return this.a().b(this);
    }

    public @Nullable lw h() {
        return this.a().h();
    }

    @Override
    public boolean a(bef<fla> $$0) {
        return this.a().k().a($$0);
    }

    @Override
    public boolean a(jh<fla> $$0) {
        return $$0.a(this.a().k());
    }

    public boolean b(fla $$0) {
        return this.a() == $$0;
    }

    public float i() {
        return this.a().c();
    }

    public boolean a(dvt $$0, is $$1, fla $$2, iz $$3) {
        return this.a().a(this, $$0, $$1, $$2, $$3);
    }

    public fug d(dvt $$0, is $$1) {
        return this.a().b(this, $$0, $$1);
    }

    public @Nullable fth e(dvt $$0, is $$1) {
        return this.a().c(this, $$0, $$1);
    }

    public jd<fla> j() {
        return ((fla)this.d).k();
    }

    public Stream<bef<fla>> k() {
        return ((fla)this.d).k().c();
    }

    public void a(dwo $$0, is $$1, cgk $$2, chc $$3) {
        this.a().a($$0, $$1, $$2, $$3);
    }
}


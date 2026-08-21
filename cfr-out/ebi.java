/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.jspecify.annotations.Nullable;

public class ebi
extends dzq {
    public static final MapCodec<dzq> a = mi.e.q().fieldOf("dead");
    public static final MapCodec<ebi> b = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)a.forGetter($$0 -> $$0.c), ebi.x()).apply((Applicative)$$02, ebi::new));
    private final dzq c;

    public ebi(dzq $$0, eog.d $$1) {
        super($$1);
        this.c = $$0;
    }

    public MapCodec<ebi> a() {
        return b;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!this.a((dvt)$$1, $$2)) {
            $$1.a($$2, this.c.m(), 2);
        }
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if (!this.a((dvt)$$1, $$3)) {
            $$2.a($$3, this, 60 + $$7.a(40));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    protected boolean a(dvt $$0, is $$1) {
        for (iz $$2 : iz.values()) {
            flb $$3 = $$0.b_($$1.a($$2));
            if (!$$3.a(bdv.a)) continue;
            return true;
        }
        return false;
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        if (!this.a((dvt)$$0.q(), $$0.a())) {
            $$0.q().a($$0.a(), (dzq)this, 60 + $$0.q().G_().a(40));
        }
        return this.m();
    }
}


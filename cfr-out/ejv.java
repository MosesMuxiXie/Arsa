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

public class ejv
extends ebg
implements ejq {
    public static final MapCodec<ejv> h = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ejq.a.f.fieldOf("weathering_state").forGetter(ebg::t), (App)mi.b.q().fieldOf("open_sound").forGetter(eau::r), (App)mi.b.q().fieldOf("close_sound").forGetter(eau::s), ejv.x()).apply((Applicative)$$0, ejv::new));

    @Override
    public MapCodec<ejv> a() {
        return h;
    }

    public ejv(ejq.a $$0, bcz $$1, bcz $$2, eog.d $$3) {
        super($$0, $$1, $$2, $$3);
    }

    @Override
    protected boolean f(eoh $$0) {
        return ejq.c($$0.b()).isPresent();
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        elj $$4;
        elb elb2;
        if (!$$0.c(eau.d).equals(eoz.c) && (elb2 = $$1.c_($$2)) instanceof elj && ($$4 = (elj)elb2).am_().isEmpty()) {
            this.a_($$0, $$1, $$2, $$3);
        }
    }

    public ejq.a v() {
        return this.t();
    }

    @Override
    public boolean u() {
        return false;
    }

    @Override
    public /* synthetic */ Enum c() {
        return this.v();
    }
}


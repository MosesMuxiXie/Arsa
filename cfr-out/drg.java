/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class drg
implements dqh {
    final drh d;
    final dlt e;
    final String f;
    final dqf g;
    final boolean h;
    private @Nullable dqr i;

    public drg(String $$0, dqf $$1, drh $$2, dlt $$3, boolean $$4) {
        this.f = $$0;
        this.g = $$1;
        this.d = $$2;
        this.e = $$3;
        this.h = $$4;
    }

    public drg(String $$0, dqf $$1, drh $$2, dlt $$3) {
        this($$0, $$1, $$2, $$3, true);
    }

    @Override
    public drc<? extends drg> a() {
        return drc.a;
    }

    @Override
    public String j() {
        return this.f;
    }

    @Override
    public dqf c() {
        return this.g;
    }

    @VisibleForTesting
    public List<Optional<dqo>> f() {
        return this.d.c();
    }

    @Override
    public dqr aq_() {
        if (this.i == null) {
            this.i = dqr.a(this.d.c());
        }
        return this.i;
    }

    @Override
    public boolean i() {
        return this.h;
    }

    @Override
    public boolean a(dqg $$0, dwo $$1) {
        return this.d.a($$0);
    }

    @Override
    public dlt a(dqg $$0, jf.a $$1) {
        return this.e.v();
    }

    public int k() {
        return this.d.a();
    }

    public int l() {
        return this.d.b();
    }

    @Override
    public List<dry> g() {
        return List.of(new dsc(this.d.a(), this.d.b(), this.d.c().stream().map($$0 -> $$0.map(dqo::c).orElse(dse.c.c)).toList(), new dse.f(this.e), new dse.d(dlx.fu)));
    }

    public static class a
    implements drc<drg> {
        public static final MapCodec<drg> w = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.STRING.optionalFieldOf("group", (Object)"").forGetter($$0 -> $$0.f), (App)dqf.e.fieldOf("category").orElse((Object)dqf.d).forGetter($$0 -> $$0.g), (App)drh.b.forGetter($$0 -> $$0.d), (App)dlt.d.fieldOf("result").forGetter($$0 -> $$0.e), (App)Codec.BOOL.optionalFieldOf("show_notification", (Object)true).forGetter($$0 -> $$0.h)).apply((Applicative)$$02, drg::new));
        public static final aao<xq, drg> x = aao.a(a::a, a::a);

        @Override
        public MapCodec<drg> a() {
            return w;
        }

        @Override
        public aao<xq, drg> b() {
            return x;
        }

        private static drg a(xq $$0) {
            String $$1 = $$0.p();
            dqf $$2 = $$0.b(dqf.class);
            drh $$3 = (drh)drh.c.decode($$0);
            dlt $$4 = (dlt)dlt.j.decode($$0);
            boolean $$5 = $$0.readBoolean();
            return new drg($$1, $$2, $$3, $$4, $$5);
        }

        private static void a(xq $$0, drg $$1) {
            $$0.a($$1.f);
            $$0.a($$1.g);
            drh.c.encode($$0, $$1.d);
            dlt.j.encode($$0, $$1.e);
            $$0.a($$1.h);
        }
    }
}


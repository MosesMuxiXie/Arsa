/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fpj
extends fpq {
    public static final bef<ffo> a = beb.l;
    public static final jd<fmr> b = fms.i;
    public static final byte c = 2;
    public static final int d = 50;
    public static final boolean e = true;
    public static final MapCodec<fpj> f = RecordCodecBuilder.mapCodec($$02 -> fpj.a($$02).and($$02.group((App)bef.a(mj.bs).optionalFieldOf("destination", a).forGetter($$0 -> $$0.h), (App)fmr.b.optionalFieldOf("decoration", b).forGetter($$0 -> $$0.i), (App)Codec.BYTE.optionalFieldOf("zoom", (Object)2).forGetter($$0 -> $$0.j), (App)Codec.INT.optionalFieldOf("search_radius", (Object)50).forGetter($$0 -> $$0.k), (App)Codec.BOOL.optionalFieldOf("skip_existing_chunks", (Object)true).forGetter($$0 -> $$0.l))).apply((Applicative)$$02, fpj::new));
    private final bef<ffo> h;
    private final jd<fmr> i;
    private final byte j;
    private final int k;
    private final boolean l;

    fpj(List<frm> $$0, bef<ffo> $$1, jd<fmr> $$2, byte $$3, int $$4, boolean $$5) {
        super($$0);
        this.h = $$1;
        this.i = $$2;
        this.j = $$3;
        this.k = $$4;
        this.l = $$5;
    }

    public fps<fpj> a() {
        return fpt.q;
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of(fqx.h);
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        axf $$3;
        is $$4;
        if (!$$0.a(dlx.wv)) {
            return $$0;
        }
        ftm $$2 = $$1.c(fqx.h);
        if ($$2 != null && ($$4 = ($$3 = $$1.d()).a(this.h, is.a($$2), this.k, this.l)) != null) {
            dlt $$5 = dmg.a($$3, $$4.u(), $$4.w(), this.j, true, true);
            dmg.a($$3, $$5);
            fmw.a($$5, $$4, "+", this.i);
            return $$5;
        }
        return $$0;
    }

    public static a c() {
        return new a();
    }

    public static class a
    extends fpq.a<a> {
        private bef<ffo> a = a;
        private jd<fmr> b = b;
        private byte c = (byte)2;
        private int d = 50;
        private boolean e = true;

        protected a a() {
            return this;
        }

        public a a(bef<ffo> $$0) {
            this.a = $$0;
            return this;
        }

        public a a(jd<fmr> $$0) {
            this.b = $$0;
            return this;
        }

        public a a(byte $$0) {
            this.c = $$0;
            return this;
        }

        public a a(int $$0) {
            this.d = $$0;
            return this;
        }

        public a a(boolean $$0) {
            this.e = $$0;
            return this;
        }

        @Override
        public fpr b() {
            return new fpj(this.g(), this.a, this.b, this.c, this.d, this.e);
        }

        @Override
        protected /* synthetic */ fpq.a c() {
            return this.a();
        }
    }
}


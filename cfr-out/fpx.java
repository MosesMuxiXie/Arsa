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

public class fpx
extends fpq {
    public static final MapCodec<fpx> a = RecordCodecBuilder.mapCodec($$02 -> fpx.a($$02).and($$02.group((App)ekr.b.fieldOf("patterns").forGetter($$0 -> $$0.b), (App)Codec.BOOL.fieldOf("append").forGetter($$0 -> $$0.c))).apply((Applicative)$$02, fpx::new));
    private final ekr b;
    private final boolean c;

    fpx(List<frm> $$0, ekr $$1, boolean $$2) {
        super($$0);
        this.b = $$1;
        this.c = $$2;
    }

    @Override
    protected dlt a(dlt $$02, fnz $$12) {
        if (this.c) {
            $$02.a(ki.at, ekr.a, this.b, ($$0, $$1) -> new ekr.a().a((ekr)$$0).a((ekr)$$1).a());
        } else {
            $$02.b(ki.at, this.b);
        }
        return $$02;
    }

    public fps<fpx> a() {
        return fpt.E;
    }

    public static a a(boolean $$0) {
        return new a($$0);
    }

    public static class a
    extends fpq.a<a> {
        private final ekr.a a = new ekr.a();
        private final boolean b;

        a(boolean $$0) {
            this.b = $$0;
        }

        protected a a() {
            return this;
        }

        @Override
        public fpr b() {
            return new fpx(this.g(), this.a.a(), this.b);
        }

        public a a(jd<ekq> $$0, dkr $$1) {
            this.a.a($$0, $$1);
            return this;
        }

        @Override
        protected /* synthetic */ fpq.a c() {
            return this.a();
        }
    }
}


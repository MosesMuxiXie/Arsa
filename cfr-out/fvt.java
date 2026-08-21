/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public interface fvt {
    public static final int b_ = 60000000;
    public static final ciq c_ = new ciq(amo.b("waypoint_transmit_range_hide"), -1.0, ciq.a.c);

    public static dlp.a a(dlp.a $$0) {
        return $$0.a(ki.r, don.a().a(cis.I, c_, cgw.h, don.b.b()).a());
    }

    public static class a {
        public static final Codec<a> a = RecordCodecBuilder.create($$02 -> $$02.group((App)amt.a(fvw.a).fieldOf("style").forGetter($$0 -> $$0.d), (App)bfm.l.optionalFieldOf("color").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, a::new));
        public static final aao<ByteBuf, a> b = aao.a(amt.b(fvw.a), $$0 -> $$0.d, aam.a(aam.B), $$0 -> $$0.e, a::new);
        public static final a c = new a();
        public amt<fvv> d = fvw.b;
        public Optional<Integer> e = Optional.empty();

        public a() {
        }

        private a(amt<fvv> $$0, Optional<Integer> $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        public boolean a() {
            return this.d != fvw.b || this.e.isPresent();
        }

        public a a(chl $$0) {
            amt<fvv> $$1 = this.b();
            Optional<Integer> $$2 = this.e.or(() -> Optional.ofNullable($$0.cI()).map($$0 -> $$0.o().f()).map($$0 -> $$0 == 0 ? -13619152 : $$0));
            if ($$1 == this.d && $$2.isEmpty()) {
                return this;
            }
            return new a($$1, $$2);
        }

        public void a(a $$0) {
            this.e = $$0.e;
            this.d = $$0.d;
        }

        private amt<fvv> b() {
            return this.d != fvw.b ? this.d : fvw.b;
        }
    }
}


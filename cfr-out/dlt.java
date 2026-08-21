/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$Error
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  org.apache.commons.lang3.function.TriConsumer
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import org.apache.commons.lang3.function.TriConsumer;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class dlt
implements ke {
    private static final List<yh> m = List.of(yh.c("item.op_warning.line1").a(l.m, l.r), yh.c("item.op_warning.line2").a(l.m), yh.c("item.op_warning.line3").a(l.m));
    private static final yh n = yh.c("item.unbreakable").a(l.j);
    private static final yh o = yh.c("item.intangible").a(l.h);
    public static final MapCodec<dlt> a = MapCodec.recursive((String)"ItemStack", $$0 -> RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)dlp.e.fieldOf("id").forGetter(dlt::i), (App)bfm.a(1, 99).fieldOf("count").orElse((Object)1).forGetter(dlt::N), (App)kg.b.optionalFieldOf("components", (Object)kg.a).forGetter($$0 -> $$0.u.g())).apply((Applicative)$$02, dlt::new)));
    public static final Codec<dlt> b = Codec.lazyInitialized(() -> a.codec());
    public static final Codec<dlt> c = Codec.lazyInitialized(() -> RecordCodecBuilder.create($$02 -> $$02.group((App)dlp.e.fieldOf("id").forGetter(dlt::i), (App)kg.b.optionalFieldOf("components", (Object)kg.a).forGetter($$0 -> $$0.u.g())).apply((Applicative)$$02, ($$0, $$1) -> new dlt((jd<dlp>)$$0, 1, (kg)$$1))));
    public static final Codec<dlt> d = b.validate(dlt::a);
    public static final Codec<dlt> e = c.validate(dlt::a);
    public static final Codec<dlt> f = bfm.g(b).xmap($$0 -> $$0.orElse(l), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
    public static final Codec<dlt> g = dlp.e.xmap(dlt::new, dlt::i);
    public static final aao<xq, dlt> h = dlt.b(kg.c);
    public static final aao<xq, dlt> i = dlt.b(kg.d);
    public static final aao<xq, dlt> j = new aao<xq, dlt>(){

        public dlt a(xq $$0) {
            dlt $$1 = (dlt)h.decode($$0);
            if ($$1.f()) {
                throw new DecoderException("Empty ItemStack not allowed");
            }
            return $$1;
        }

        public void a(xq $$0, dlt $$1) {
            if ($$1.f()) {
                throw new EncoderException("Empty ItemStack not allowed");
            }
            h.encode($$0, $$1);
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((xq)((Object)object), (dlt)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((xq)((Object)object));
        }
    };
    public static final aao<xq, List<dlt>> k = h.a(aam.a(jm::a));
    private static final Logger p = LogUtils.getLogger();
    public static final dlt l = new dlt((Void)null);
    private static final yh q = yh.c("item.disabled").a(l.m);
    private int r;
    private int s;
    @Deprecated
    private final @Nullable dlp t;
    final kj u;
    private @Nullable cgk v;

    public static DataResult<dlt> a(dlt $$0) {
        DataResult<bhr> $$12 = dlt.a($$0.a());
        if ($$12.isError()) {
            return $$12.map($$1 -> $$0);
        }
        if ($$0.N() > $$0.k()) {
            return DataResult.error(() -> "Item stack with stack size of " + $$0.N() + " was larger than maximum: " + $$0.k());
        }
        return DataResult.success((Object)$$0);
    }

    private static aao<xq, dlt> b(final aao<xq, kg> $$0) {
        return new aao<xq, dlt>(){

            public dlt a(xq $$02) {
                int $$1 = $$02.l();
                if ($$1 <= 0) {
                    return l;
                }
                jd $$2 = (jd)dlp.f.decode($$02);
                kg $$3 = (kg)$$0.decode($$02);
                return new dlt($$2, $$1, $$3);
            }

            public void a(xq $$02, dlt $$1) {
                if ($$1.f()) {
                    $$02.c(0);
                    return;
                }
                $$02.c($$1.N());
                dlp.f.encode($$02, $$1.i());
                $$0.encode($$02, $$1.u.g());
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((xq)((Object)object), (dlt)object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((xq)((Object)object));
            }
        };
    }

    public static aao<xq, dlt> a(final aao<xq, dlt> $$0) {
        return new aao<xq, dlt>(){

            public dlt a(xq $$02) {
                dlt $$1 = (dlt)$$0.decode($$02);
                if (!$$1.f()) {
                    ams<bhr> $$2 = $$02.G().a(bgl.a);
                    b.encodeStart($$2, (Object)$$1).getOrThrow(DecoderException::new);
                }
                return $$1;
            }

            public void a(xq $$02, dlt $$1) {
                $$0.encode($$02, $$1);
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((xq)((Object)object), (dlt)object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((xq)((Object)object));
            }
        };
    }

    public Optional<djs> b() {
        return this.h().k(this);
    }

    @Override
    public kf a() {
        return !this.f() ? this.u : kf.a;
    }

    public kf c() {
        return !this.f() ? this.h().f() : kf.a;
    }

    public kg d() {
        return !this.f() ? this.u.g() : kg.a;
    }

    public kf e() {
        return !this.f() ? this.u.i() : kf.a;
    }

    public boolean d(kh<?> $$0) {
        return !this.f() && this.u.d($$0);
    }

    public dlt(dwn $$0) {
        this($$0, 1);
    }

    public dlt(jd<dlp> $$0) {
        this($$0.a(), 1);
    }

    public dlt(jd<dlp> $$0, int $$1, kg $$2) {
        this($$0.a(), $$1, kj.a($$0.a().f(), $$2));
    }

    public dlt(jd<dlp> $$0, int $$1) {
        this($$0.a(), $$1);
    }

    public dlt(dwn $$0, int $$1) {
        this($$0, $$1, new kj($$0.h().f()));
    }

    private dlt(dwn $$0, int $$1, kj $$2) {
        this.t = $$0.h();
        this.r = $$1;
        this.u = $$2;
    }

    private dlt(@Nullable Void $$0) {
        this.t = null;
        this.u = new kj(kf.a);
    }

    public static DataResult<bhr> a(kf $$0) {
        if ($$0.c(ki.d) && $$0.a(ki.c, 1) > 1) {
            return DataResult.error(() -> "Item cannot be both damageable and stackable");
        }
        doo $$1 = $$0.a(ki.aw, doo.a);
        for (dlt $$2 : $$1.d()) {
            int $$4;
            int $$3 = $$2.N();
            if ($$3 <= ($$4 = $$2.k())) continue;
            return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
        }
        return DataResult.success((Object)((Object)bhr.a));
    }

    public boolean f() {
        return this == l || this.t == dlx.a || this.r <= 0;
    }

    public boolean a(dgz $$0) {
        return this.f() || this.h().a($$0);
    }

    public dlt a(int $$0) {
        int $$1 = Math.min($$0, this.N());
        dlt $$2 = this.c($$1);
        this.h($$1);
        return $$2;
    }

    public dlt g() {
        if (this.f()) {
            return l;
        }
        dlt $$0 = this.v();
        this.e(0);
        return $$0;
    }

    public dlp h() {
        return this.f() ? dlx.a : this.t;
    }

    public jd<dlp> i() {
        return this.h().e();
    }

    public boolean a(bef<dlp> $$0) {
        return this.h().e().a($$0);
    }

    public boolean a(dlp $$0) {
        return this.h() == $$0;
    }

    public boolean a(Predicate<jd<dlp>> $$0) {
        return $$0.test(this.h().e());
    }

    public boolean a(jd<dlp> $$0) {
        return this.h().e() == $$0;
    }

    public boolean a(jh<dlp> $$0) {
        return $$0.a(this.i());
    }

    public Stream<bef<dlp>> j() {
        return this.h().e().c();
    }

    public cdc a(dpw $$0) {
        cdc.d $$5;
        ddm $$1 = $$0.o();
        is $$2 = $$0.a();
        if ($$1 != null && !$$1.gL().e && !this.a(new eol($$0.q(), $$2, false))) {
            return cdc.e;
        }
        dlp $$3 = this.h();
        cdc $$4 = $$3.a($$0);
        if ($$1 != null && $$4 instanceof cdc.d && ($$5 = (cdc.d)$$4).c()) {
            $$1.b(bdk.c.b($$3));
        }
        return $$4;
    }

    public float a(eoh $$0) {
        return this.h().a(this, $$0);
    }

    public cdc a(dwo $$0, ddm $$1, cdb $$2) {
        dlt $$3 = this.v();
        boolean $$4 = this.a($$1) <= 0;
        cdc $$5 = this.h().a($$0, $$1, $$2);
        if ($$4 && $$5 instanceof cdc.d) {
            cdc.d $$6;
            return $$6.a(($$6 = (cdc.d)$$5).d() == null ? this.a((chl)$$1, $$3) : $$6.d().a((chl)$$1, $$3));
        }
        return $$5;
    }

    public dlt a(dwo $$0, chl $$1) {
        dlt $$2 = this.v();
        dlt $$3 = this.h().a(this, $$0, $$1);
        return $$3.a($$1, $$2);
    }

    private dlt a(chl $$0, dlt $$1) {
        dpi $$2 = $$1.a(ki.A);
        dpg $$3 = $$1.a(ki.B);
        int $$4 = $$1.N();
        dlt $$5 = this;
        if ($$2 != null) {
            $$5 = $$2.a($$5, $$4, $$0.gv(), $$0::b);
        }
        if ($$3 != null) {
            $$3.a($$1, $$0);
        }
        return $$5;
    }

    public int k() {
        return this.a(ki.c, Integer.valueOf(1));
    }

    public boolean l() {
        return this.k() > 1 && (!this.m() || !this.n());
    }

    public boolean m() {
        return this.c(ki.d) && !this.c(ki.f) && this.c(ki.e);
    }

    public boolean n() {
        return this.m() && this.o() > 0;
    }

    public int o() {
        return bgj.a((int)this.a(ki.e, Integer.valueOf(0)), 0, this.p());
    }

    public void b(int $$0) {
        this.b(ki.e, Integer.valueOf(bgj.a($$0, 0, this.p())));
    }

    public int p() {
        return this.a(ki.d, Integer.valueOf(0));
    }

    public boolean q() {
        return this.m() && this.o() >= this.p();
    }

    public boolean r() {
        return this.m() && this.o() >= this.p() - 1;
    }

    public void a(int $$0, axf $$1, @Nullable axg $$2, Consumer<dlp> $$3) {
        int $$4 = this.a($$0, $$1, $$2);
        if ($$4 != 0) {
            this.a(this.o() + $$4, $$2, $$3);
        }
    }

    private int a(int $$0, axf $$1, @Nullable axg $$2) {
        if (!this.m()) {
            return 0;
        }
        if ($$2 != null && $$2.gv()) {
            return 0;
        }
        if ($$0 > 0) {
            return dsq.a($$1, this, $$0);
        }
        return $$0;
    }

    private void a(int $$0, @Nullable axg $$1, Consumer<dlp> $$2) {
        if ($$1 != null) {
            aj.u.a($$1, this, $$0);
        }
        this.b($$0);
        if (this.q()) {
            dlp $$3 = this.h();
            this.h(1);
            $$2.accept($$3);
        }
    }

    public void a(int $$02, ddm $$1) {
        if ($$1 instanceof axg) {
            axg $$2 = (axg)$$1;
            int $$3 = this.a($$02, $$2.A(), $$2);
            if ($$3 == 0) {
                return;
            }
            int $$4 = Math.min(this.o() + $$3, this.p() - 1);
            this.a($$4, $$2, (dlp $$0) -> {});
        }
    }

    public void a(int $$0, chl $$1, cdb $$2) {
        this.a($$0, $$1, $$2.a());
    }

    public void a(int $$0, chl $$1, cgv $$22) {
        dwo dwo2 = $$1.ao();
        if (dwo2 instanceof axf) {
            axg $$4;
            axf $$3 = (axf)dwo2;
            this.a($$0, $$3, $$1 instanceof axg ? ($$4 = (axg)$$1) : null, (dlp $$2) -> $$1.a((dlp)$$2, $$22));
        }
    }

    public dlt a(int $$0, dwn $$1, chl $$2, cgv $$3) {
        this.a($$0, $$2, $$3);
        if (this.f()) {
            dlt $$4 = this.b($$1, 1);
            if ($$4.m()) {
                $$4.b(0);
            }
            return $$4;
        }
        return this;
    }

    public boolean s() {
        return this.h().d(this);
    }

    public int t() {
        return this.h().e(this);
    }

    public int u() {
        return this.h().f(this);
    }

    public boolean a(dji $$0, dht $$1, ddm $$2) {
        return this.h().a(this, $$0, $$1, $$2);
    }

    public boolean a(dlt $$0, dji $$1, dht $$2, ddm $$3, cic $$4) {
        return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
    }

    public boolean a(chl $$0, chl $$1) {
        dlp $$2 = this.h();
        $$2.a(this, $$0, $$1);
        if (this.c(ki.E)) {
            if ($$1 instanceof ddm) {
                ddm $$3 = (ddm)$$1;
                $$3.b(bdk.c.b($$2));
            }
            return true;
        }
        return false;
    }

    public void b(chl $$0, chl $$1) {
        this.h().b(this, $$0, $$1);
        dpj $$2 = this.a(ki.E);
        if ($$2 != null) {
            this.a($$2.a(), $$1, cgv.a);
        }
    }

    public void a(dwo $$0, eoh $$1, is $$2, ddm $$3) {
        dlp $$4 = this.h();
        if ($$4.a(this, $$0, $$1, $$2, (chl)$$3)) {
            $$3.b(bdk.c.b($$4));
        }
    }

    public boolean b(eoh $$0) {
        return this.h().b(this, $$0);
    }

    public cdc a(ddm $$0, chl $$1, cdb $$2) {
        cdc $$4;
        dun $$3 = this.a(ki.H);
        if ($$3 != null && $$3.j() && ($$4 = $$3.a($$0, $$1, this)) != cdc.e) {
            return $$4;
        }
        return this.h().a(this, $$0, $$1, $$2);
    }

    public dlt v() {
        if (this.f()) {
            return l;
        }
        dlt $$0 = new dlt(this.h(), this.r, this.u.h());
        $$0.d(this.M());
        return $$0;
    }

    public dlt c(int $$0) {
        if (this.f()) {
            return l;
        }
        dlt $$1 = this.v();
        $$1.e($$0);
        return $$1;
    }

    public dlt a(dwn $$0) {
        return this.a($$0, this.N());
    }

    public dlt a(dwn $$0, int $$1) {
        if (this.f()) {
            return l;
        }
        return this.b($$0, $$1);
    }

    private dlt b(dwn $$0, int $$1) {
        return new dlt($$0.h().e(), $$1, this.u.g());
    }

    public static boolean a(dlt $$0, dlt $$1) {
        if ($$0 == $$1) {
            return true;
        }
        if ($$0.N() != $$1.N()) {
            return false;
        }
        return dlt.c($$0, $$1);
    }

    @Deprecated
    public static boolean a(List<dlt> $$0, List<dlt> $$1) {
        if ($$0.size() != $$1.size()) {
            return false;
        }
        for (int $$2 = 0; $$2 < $$0.size(); ++$$2) {
            if (dlt.a($$0.get($$2), $$1.get($$2))) continue;
            return false;
        }
        return true;
    }

    public static boolean b(dlt $$0, dlt $$1) {
        return $$0.a($$1.h());
    }

    public static boolean c(dlt $$0, dlt $$1) {
        if (!$$0.a($$1.h())) {
            return false;
        }
        if ($$0.f() && $$1.f()) {
            return true;
        }
        return Objects.equals($$0.u, $$1.u);
    }

    public static boolean a(dlt $$0, dlt $$1, Predicate<kh<?>> $$2) {
        if ($$0 == $$1) {
            return true;
        }
        if ($$0.N() != $$1.N()) {
            return false;
        }
        if (!$$0.a($$1.h())) {
            return false;
        }
        if ($$0.f() && $$1.f()) {
            return true;
        }
        if ($$0.u.d() != $$1.u.d()) {
            return false;
        }
        for (kh<?> $$3 : $$0.u.b()) {
            Object $$4 = $$0.u.a($$3);
            Object $$5 = $$1.u.a($$3);
            if ($$4 == null || $$5 == null) {
                return false;
            }
            if (Objects.equals($$4, $$5) || $$2.test($$3)) continue;
            return false;
        }
        return true;
    }

    public static MapCodec<dlt> a(String $$02) {
        return b.lenientOptionalFieldOf($$02).xmap($$0 -> $$0.orElse(l), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
    }

    public static int b(@Nullable dlt $$0) {
        if ($$0 != null) {
            int $$1 = 31 + $$0.h().hashCode();
            return 31 * $$1 + $$0.a().hashCode();
        }
        return 0;
    }

    @Deprecated
    public static int a(List<dlt> $$0) {
        int $$1 = 0;
        for (dlt $$2 : $$0) {
            $$1 = $$1 * 31 + dlt.b($$2);
        }
        return $$1;
    }

    public String toString() {
        return this.N() + " " + String.valueOf(this.h());
    }

    public void a(dwo $$0, cgk $$1, @Nullable cgv $$2) {
        if (this.s > 0) {
            --this.s;
        }
        if ($$0 instanceof axf) {
            axf $$3 = (axf)$$0;
            this.h().a(this, $$3, $$1, $$2);
        }
    }

    public void a(ddm $$0, int $$1) {
        $$0.a(bdk.b.b(this.h()), $$1);
        this.h().c(this, $$0);
    }

    public void a(dwo $$0) {
        this.h().a(this, $$0);
    }

    public int a(chl $$0) {
        return this.h().a(this, $$0);
    }

    public dlv w() {
        return this.h().b(this);
    }

    public void a(dwo $$0, chl $$1, int $$2) {
        dlt $$4;
        dlt $$3 = this.v();
        if (this.h().a(this, $$0, $$1, $$2) && ($$4 = this.a($$1, $$3)) != this) {
            $$1.a($$1.ga(), $$4);
        }
    }

    public void a(cgk $$0, jd.c<etk> $$1) {
        dph $$2 = this.a(ki.g);
        if ($$2 != null && $$2.b()) {
            $$0.c($$1);
        }
    }

    public boolean x() {
        return this.h().e_(this);
    }

    public <T> @Nullable T b(kh<T> $$0, @Nullable T $$1) {
        return this.u.b($$0, $$1);
    }

    public <T> @Nullable T a(kk<T> $$0) {
        return this.u.a($$0);
    }

    public <T> void a(kh<T> $$0, kd $$1) {
        this.b($$0, $$1.a($$0));
    }

    public <T, U> @Nullable T a(kh<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
        return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
    }

    public <T> @Nullable T a(kh<T> $$0, T $$1, UnaryOperator<T> $$2) {
        T $$3 = this.a($$0, $$1);
        return this.b($$0, $$2.apply($$3));
    }

    public <T> @Nullable T e(kh<? extends T> $$0) {
        return this.u.e($$0);
    }

    public void a(kg $$0) {
        kg $$1 = this.u.g();
        this.u.a($$0);
        Optional $$2 = dlt.a(this).error();
        if ($$2.isPresent()) {
            p.error("Failed to apply component patch '{}' to item: '{}'", (Object)$$0, (Object)((DataResult.Error)$$2.get()).message());
            this.u.b($$1);
        }
    }

    public void b(kg $$0) {
        this.u.a($$0);
    }

    public void b(kf $$0) {
        this.u.a($$0);
    }

    public yh y() {
        yh $$0 = this.z();
        if ($$0 != null) {
            return $$0;
        }
        return this.A();
    }

    public @Nullable yh z() {
        String $$2;
        yh $$0 = this.a(ki.h);
        if ($$0 != null) {
            return $$0;
        }
        dpl $$1 = this.a(ki.ac);
        if ($$1 != null && !bhi.h($$2 = $$1.d().a())) {
            return yh.b($$2);
        }
        return null;
    }

    public yh A() {
        return this.h().a(this);
    }

    public yh B() {
        yw $$0 = yh.i().b(this.y()).a(this.D().a());
        if (this.c(ki.h)) {
            $$0.a(l.u);
        }
        return $$0;
    }

    public <T extends dpe> void a(kh<T> $$0, dlp.b $$1, dpd $$2, Consumer<yh> $$3, dnj $$4) {
        dpe $$5 = (dpe)this.a($$0);
        if ($$5 != null && $$2.a($$0)) {
            $$5.a($$1, $$3, $$4, this.u);
        }
    }

    public List<yh> a(dlp.b $$0, @Nullable ddm $$1, dnj $$2) {
        dpd $$3 = this.a(ki.t, dpd.c);
        if (!$$2.b() && $$3.a()) {
            boolean $$4 = this.h().a(this, $$1);
            return $$4 ? m : List.of();
        }
        ArrayList $$5 = Lists.newArrayList();
        $$5.add(this.B());
        this.a($$0, $$3, $$1, $$2, $$5::add);
        return $$5;
    }

    public void a(dlp.b $$0, dpd $$1, @Nullable ddm $$2, dnj $$3, Consumer<yh> $$4) {
        boolean $$9;
        dju $$7;
        dju $$6;
        this.h().a(this, $$0, $$1, $$4, $$3);
        this.a(ki.aJ, $$0, $$1, $$4, $$3);
        this.a(ki.ai, $$0, $$1, $$4, $$3);
        this.a(ki.T, $$0, $$1, $$4, $$3);
        this.a(ki.ay, $$0, $$1, $$4, $$3);
        this.a(ki.aA, $$0, $$1, $$4, $$3);
        this.a(ki.aw, $$0, $$1, $$4, $$3);
        this.a(ki.at, $$0, $$1, $$4, $$3);
        this.a(ki.av, $$0, $$1, $$4, $$3);
        this.a(ki.ac, $$0, $$1, $$4, $$3);
        this.a(ki.W, $$0, $$1, $$4, $$3);
        this.a(ki.aq, $$0, $$1, $$4, $$3);
        this.a(ki.ap, $$0, $$1, $$4, $$3);
        this.a(ki.Y, $$0, $$1, $$4, $$3);
        this.a(ki.al, $$0, $$1, $$4, $$3);
        this.a(ki.ad, $$0, $$1, $$4, $$3);
        this.a(ki.Q, $$0, $$1, $$4, $$3);
        this.a(ki.o, $$0, $$1, $$4, $$3);
        this.a(ki.R, $$0, $$1, $$4, $$3);
        this.a(ki.ar, $$0, $$1, $$4, $$3);
        this.a(ki.m, $$0, $$1, $$4, $$3);
        this.a($$4, $$1, $$2);
        this.a(ki.x, o, $$1, $$4);
        this.a(ki.f, n, $$1, $$4);
        this.a(ki.ak, $$0, $$1, $$4, $$3);
        this.a(ki.aa, $$0, $$1, $$4, $$3);
        this.a(ki.ax, $$0, $$1, $$4, $$3);
        this.a(ki.af, $$0, $$1, $$4, $$3);
        if ((this.a(dlx.fr) || this.a(dlx.Bx)) && $$1.a(ki.ah)) {
            dpf<eld<?>> $$5 = this.a(ki.ah);
            dxj.a($$5, $$4, "SpawnData");
        }
        if (($$6 = this.a(ki.q)) != null && $$1.a(ki.q)) {
            $$4.accept(yg.a);
            $$4.accept(dju.c);
            $$6.a($$4);
        }
        if (($$7 = this.a(ki.p)) != null && $$1.a(ki.p)) {
            $$4.accept(yg.a);
            $$4.accept(dju.d);
            $$7.a($$4);
        }
        if ($$3.a()) {
            if (this.n() && $$1.a(ki.e)) {
                $$4.accept(yh.a("item.durability", this.p() - this.o(), this.p()));
            }
            $$4.accept(yh.b(mi.h.b(this.h()).toString()).a(l.i));
            int $$8 = this.u.d();
            if ($$8 > 0) {
                $$4.accept(yh.a("item.components", $$8).a(l.i));
            }
        }
        if ($$2 != null && !this.h().a($$2.ao().Q())) {
            $$4.accept(q);
        }
        if ($$9 = this.h().a(this, $$2)) {
            m.forEach($$4);
        }
    }

    private void a(kh<?> $$0, yh $$1, dpd $$2, Consumer<yh> $$3) {
        if (this.c($$0) && $$2.a($$0)) {
            $$3.accept($$1);
        }
    }

    private void a(Consumer<yh> $$0, dpd $$1, @Nullable ddm $$2) {
        if (!$$1.a(ki.r)) {
            return;
        }
        for (cgw $$3 : cgw.values()) {
            MutableBoolean $$42 = new MutableBoolean(true);
            this.a($$3, (TriConsumer<jd<cin>, ciq, don.b>)((TriConsumer)($$4, $$5, $$6) -> {
                if ($$6 == don.b.b()) {
                    return;
                }
                if ($$42.isTrue()) {
                    $$0.accept(yg.a);
                    $$0.accept(yh.c("item.modifiers." + $$3.c()).a(l.h));
                    $$42.setFalse();
                }
                $$6.a($$0, $$2, (jd<cin>)$$4, (ciq)$$5);
            }));
        }
    }

    public boolean C() {
        Boolean $$0 = this.a(ki.w);
        if ($$0 != null) {
            return $$0;
        }
        return this.h().d_(this);
    }

    public dmp D() {
        dmp $$0 = this.a(ki.n, dmp.a);
        if (!this.F()) {
            return $$0;
        }
        return switch ($$0) {
            case dmp.a, dmp.b -> dmp.c;
            case dmp.c -> dmp.d;
            default -> $$0;
        };
    }

    public boolean E() {
        if (!this.c(ki.G)) {
            return false;
        }
        dsu $$0 = this.a(ki.o);
        return $$0 != null && $$0.d();
    }

    public void a(jd<dso> $$0, int $$1) {
        dsq.a(this, (dsu.a $$2) -> $$2.b($$0, $$1));
    }

    public boolean F() {
        return !this.a(ki.o, dsu.a).d();
    }

    public dsu G() {
        return this.a(ki.o, dsu.a);
    }

    public boolean H() {
        return this.v instanceof czc;
    }

    public void a(@Nullable cgk $$0) {
        if (!this.f()) {
            this.v = $$0;
        }
    }

    public @Nullable czc I() {
        return this.v instanceof czc ? (czc)this.J() : null;
    }

    public @Nullable cgk J() {
        return !this.f() ? this.v : null;
    }

    public void a(cgw $$0, TriConsumer<jd<cin>, ciq, don.b> $$12) {
        don $$22 = this.a(ki.r, don.a);
        $$22.a($$0, $$12);
        dsq.a(this, $$0, (jd<cin> $$1, ciq $$2) -> $$12.accept($$1, $$2, (Object)don.b.a()));
    }

    public void a(cgv $$0, BiConsumer<jd<cin>, ciq> $$1) {
        don $$2 = this.a(ki.r, don.a);
        $$2.a($$0, $$1);
        dsq.a(this, $$0, $$1);
    }

    public yh K() {
        yw $$02 = yh.i().b(this.y());
        if (this.c(ki.h)) {
            $$02.a(l.u);
        }
        yw $$1 = yk.a($$02);
        if (!this.f()) {
            $$1.a(this.D().a()).a($$0 -> $$0.a(new yo.d(this)));
        }
        return $$1;
    }

    public dpb L() {
        return this.a(ki.P, dpb.a);
    }

    public boolean a(eol $$0) {
        dju $$1 = this.a(ki.p);
        return $$1 != null && $$1.a($$0);
    }

    public boolean b(eol $$0) {
        dju $$1 = this.a(ki.q);
        return $$1 != null && $$1.a($$0);
    }

    public int M() {
        return this.s;
    }

    public void d(int $$0) {
        this.s = $$0;
    }

    public int N() {
        return this.f() ? 0 : this.r;
    }

    public void e(int $$0) {
        this.r = $$0;
    }

    public void f(int $$0) {
        if (!this.f() && this.N() > $$0) {
            this.e($$0);
        }
    }

    public void g(int $$0) {
        this.e(this.N() + $$0);
    }

    public void h(int $$0) {
        this.g(-$$0);
    }

    public void a(int $$0, @Nullable chl $$1) {
        if ($$1 == null || !$$1.gv()) {
            this.h($$0);
        }
    }

    public dlt b(int $$0, @Nullable chl $$1) {
        dlt $$2 = this.c($$0);
        this.a($$0, $$1);
        return $$2;
    }

    public void b(dwo $$0, chl $$1, int $$2) {
        doq $$4;
        dob $$3 = this.a(ki.z);
        if ($$3 != null && $$3.a($$2)) {
            $$3.a($$1.ep(), $$1, this, 5);
        }
        if (($$4 = this.a(ki.O)) != null && !$$0.B_()) {
            $$4.a(this, $$2, $$1, $$1.ga().a());
            return;
        }
        this.h().a($$0, $$1, this, $$2);
    }

    public void a(czl $$0) {
        this.h().a($$0);
    }

    public boolean a(cex $$0) {
        dog $$1 = this.a(ki.C);
        return $$1 == null || !$$1.a($$0);
    }

    public boolean c(dlt $$0) {
        dsw $$1 = this.a(ki.I);
        return $$1 != null && $$1.a($$0);
    }

    public boolean a(eoh $$0, dwo $$1, is $$2, ddm $$3) {
        return this.h().a(this, $$0, $$1, $$2, (chl)$$3);
    }

    public cex a(chl $$0, Supplier<cex> $$12) {
        return Optional.ofNullable(this.a(ki.j)).flatMap($$1 -> $$1.a($$0.eo())).map($$1 -> new cex((jd<cez>)$$1, $$0)).or(() -> Optional.ofNullable(this.h().a($$0))).orElseGet($$12);
    }
}

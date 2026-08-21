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
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class emz
extends elb
implements ekv,
ele {
    private static final yh a = yh.c("test_instance_block.invalid_test");
    private static final List<ekv.a> b = List.of();
    private static final List<ekv.a> c = List.of(new ekv.a(bel.a(128, 128, 128)));
    private static final List<ekv.a> d = List.of(new ekv.a(bel.a(0, 255, 0)));
    private static final List<ekv.a> e = List.of(new ekv.a(bel.a(255, 0, 0)));
    private static final List<ekv.a> f = List.of(new ekv.a(bel.a(255, 128, 0)));
    private static final jy g = new jy(0, 1, 1);
    private a h;
    private final List<b> i = new ArrayList<b>();

    public emz(is $$0, eoh $$1) {
        super(eld.V, $$0, $$1);
        this.h = new a(Optional.empty(), jy.i, egm.a, false, emz$c.a, Optional.empty());
    }

    public void a(a $$0) {
        this.h = $$0;
        this.e();
    }

    public static Optional<jy> a(axf $$0, amt<tb> $$1) {
        return emz.b($$0, $$1).map(fjq::a);
    }

    public ffg d() {
        is $$0 = this.B();
        is $$1 = $$0.a(this.J()).b(-1, -1, -1);
        return ffg.a((jy)$$0, (jy)$$1);
    }

    public fth f() {
        return fth.a(this.d());
    }

    private static Optional<fjq> b(axf $$02, amt<tb> $$12) {
        return $$02.J_().c($$12).map($$0 -> ((tb)$$0.a()).e()).flatMap($$1 -> $$02.u().b((amo)$$1));
    }

    public Optional<amt<tb>> h() {
        return this.h.a();
    }

    public yh k() {
        return this.h().map($$0 -> yh.b($$0.a().toString())).orElse(a);
    }

    private Optional<jd.c<tb>> I() {
        return this.h().flatMap(this.n.J_()::c);
    }

    public boolean l() {
        return this.h.d();
    }

    public jy m() {
        return this.h.b();
    }

    public egm w() {
        return this.I().map(jd::a).map(tb::m).orElse(egm.a).a(this.h.c());
    }

    public Optional<yh> x() {
        return this.h.f();
    }

    public void a(yh $$0) {
        this.a(this.h.a($$0));
    }

    public void y() {
        this.a(this.h.a(emz$c.c));
    }

    public void z() {
        this.a(this.h.a(emz$c.b));
    }

    @Override
    public void e() {
        super.e();
        if (this.n instanceof axf) {
            this.n.a(this.aD_(), dzs.a.m(), this.o(), 3);
        }
    }

    public adh A() {
        return adh.a(this);
    }

    @Override
    public uz a(jf.a $$0) {
        return this.d($$0);
    }

    @Override
    protected void a(fnq $$0) {
        $$0.a("data", emz$a.a).ifPresent(this::a);
        this.i.clear();
        this.i.addAll($$0.a("errors", emz$b.b).orElse(List.of()));
    }

    @Override
    protected void a(fns $$0) {
        $$0.a("data", emz$a.a, this.h);
        if (!this.i.isEmpty()) {
            $$0.a("errors", emz$b.b, this.i);
        }
    }

    @Override
    public ele.a b() {
        return ele.a.b;
    }

    public is B() {
        return emz.a(this.aD_());
    }

    public static is a(is $$0) {
        return $$0.a(g);
    }

    @Override
    public ele.b c() {
        return new ele.b(new is(g), this.J());
    }

    @Override
    public List<ekv.a> a() {
        return switch (this.h.e().ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> b;
            case 1 -> c;
            case 2 -> this.x().isEmpty() ? d : (this.I().map(jd::a).map(tb::h).orElse(true) != false ? e : f);
        };
    }

    private jy J() {
        jy $$0 = this.m();
        egm $$1 = this.w();
        boolean $$2 = $$1 == egm.b || $$1 == egm.d;
        int $$3 = $$2 ? $$0.w() : $$0.u();
        int $$4 = $$2 ? $$0.u() : $$0.w();
        return new jy($$3, $$0.v(), $$4);
    }

    public void a(Consumer<yh> $$0) {
        this.F();
        this.G();
        boolean $$1 = this.C();
        if ($$1) {
            $$0.accept(yh.a("test_instance_block.reset_success", this.k()).a(l.k));
        }
        this.a(this.h.a(emz$c.a));
    }

    public Optional<amo> b(Consumer<yh> $$0) {
        Optional<amo> $$3;
        Optional<jd.c<tb>> $$1 = this.I();
        if ($$1.isPresent()) {
            Optional<amo> $$2 = Optional.of($$1.get().a().e());
        } else {
            $$3 = this.h().map(amt::a);
        }
        if ($$3.isEmpty()) {
            is $$4 = this.aD_();
            $$0.accept(yh.a("test_instance_block.error.unable_to_save", $$4.u(), $$4.v(), $$4.w()).a(l.m));
            return $$3;
        }
        dwo dwo2 = this.n;
        if (dwo2 instanceof axf) {
            axf $$5 = (axf)dwo2;
            emx.a($$5, $$3.get(), this.B(), this.m(), this.l(), "", true, List.of(dzs.a));
        }
        return $$3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean c(Consumer<yh> $$0) {
        void $$3;
        dwo dwo2;
        Optional<amo> $$1 = this.b($$0);
        if ($$1.isEmpty() || !((dwo2 = this.n) instanceof axf)) {
            return false;
        }
        axf $$2 = (axf)dwo2;
        return emz.a((axf)$$3, $$1.get(), $$0);
    }

    public static boolean a(axf $$0, amo $$1, Consumer<yh> $$2) {
        Path $$3 = ts.c;
        Path $$4 = $$0.u().a($$1, ".nbt");
        Path $$5 = pe.a(mo.a, $$4, $$1.a(), $$3.resolve($$1.b()).resolve("structure"));
        if ($$5 == null) {
            $$2.accept(yh.b("Failed to export " + String.valueOf($$4)).a(l.m));
            return true;
        }
        try {
            bfp.c($$5.getParent());
        }
        catch (IOException $$6) {
            $$2.accept(yh.b("Could not create folder " + String.valueOf($$5.getParent())).a(l.m));
            return true;
        }
        $$2.accept(yh.b("Exported " + String.valueOf($$1) + " to " + String.valueOf($$5.toAbsolutePath())));
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public void d(Consumer<yh> $$0) {
        void $$2;
        dwo dwo2 = this.n;
        if (!(dwo2 instanceof axf)) {
            return;
        }
        axf $$1 = (axf)dwo2;
        Optional<jd.c<tb>> $$3 = this.I();
        is $$4 = this.aD_();
        if ($$3.isEmpty()) {
            $$0.accept(yh.a("test_instance_block.error.no_test", $$4.u(), $$4.v(), $$4.w()).a(l.m));
            return;
        }
        if (!this.C()) {
            $$0.accept(yh.a("test_instance_block.error.no_test_structure", $$4.u(), $$4.v(), $$4.w()).a(l.m));
            return;
        }
        this.G();
        ti.a.a();
        sp.b();
        $$0.accept(yh.a("test_instance_block.starting", new Object[]{$$3.get().g()}));
        ta $$5 = new ta($$3.get(), this.h.c(), (axf)$$2, tq.a());
        $$5.a($$4);
        tf $$6 = tf.a.b(List.of($$5), (axf)$$2).c();
        tt.a($$2.s().aG(), $$6);
    }

    public boolean C() {
        dwo dwo2 = this.n;
        if (dwo2 instanceof axf) {
            axf $$0 = (axf)dwo2;
            Optional $$12 = this.h.a().flatMap($$1 -> emz.b($$0, $$1));
            if ($$12.isPresent()) {
                this.a($$0, (fjq)$$12.get());
                return true;
            }
        }
        return false;
    }

    private void a(axf $$0, fjq $$1) {
        fjm $$2 = new fjm().a(this.w()).a(this.h.d()).b(true);
        is $$3 = this.D();
        this.L();
        ts.a(this.d(), $$0);
        this.K();
        $$1.a($$0, $$3, $$3, $$2, $$0.G_(), 818);
    }

    private void K() {
        this.n.a_(null, this.f()).stream().filter($$0 -> !($$0 instanceof ddm)).forEach(cgk::aC);
    }

    private void L() {
        dwo dwo2 = this.n;
        if (dwo2 instanceof axf) {
            axf $$0 = (axf)dwo2;
            this.d().b().forEach($$1 -> $$0.a($$1.h, $$1.i, true));
        }
    }

    public is D() {
        jy $$0 = this.m();
        egm $$1 = this.w();
        is $$2 = this.B();
        return switch ($$1) {
            default -> throw new MatchException(null, null);
            case egm.a -> $$2;
            case egm.b -> $$2.b($$0.w() - 1, 0, 0);
            case egm.c -> $$2.b($$0.u() - 1, 0, $$0.w() - 1);
            case egm.d -> $$2.b(0, 0, $$0.u() - 1);
        };
    }

    public void E() {
        this.e((is $$0) -> {
            if (!this.n.a_((is)$$0).a(dzs.qb)) {
                this.n.c((is)$$0, dzs.iO.m());
            }
        });
    }

    public void F() {
        this.e((is $$0) -> {
            if (this.n.a_((is)$$0).a(dzs.iO)) {
                this.n.c((is)$$0, dzs.a.m());
            }
        });
    }

    public void e(Consumer<is> $$02) {
        fth $$1 = this.f();
        boolean $$2 = this.I().map($$0 -> ((tb)$$0.a()).l()).orElse(false) == false;
        is $$3 = is.a($$1.a, $$1.b, $$1.c).b(-1, -1, -1);
        is $$42 = is.a($$1.d, $$1.e, $$1.f);
        is.d($$3, $$42).forEach($$4 -> {
            boolean $$6;
            boolean $$5 = $$4.u() == $$3.u() || $$4.u() == $$42.u() || $$4.w() == $$3.w() || $$4.w() == $$42.w() || $$4.v() == $$3.v();
            boolean bl2 = $$6 = $$4.v() == $$42.v();
            if ($$5 || $$6 && $$2) {
                $$02.accept((is)$$4);
            }
        });
    }

    public void a(is $$0, yh $$1) {
        this.i.add(new b($$0, $$1));
        this.e();
    }

    public void G() {
        if (!this.i.isEmpty()) {
            this.i.clear();
            this.e();
        }
    }

    public List<b> H() {
        return this.i;
    }

    public /* synthetic */ aay ax_() {
        return this.A();
    }

    public static final class a
    extends Record {
        private final Optional<amt<tb>> c;
        private final jy d;
        private final egm e;
        private final boolean f;
        private final c g;
        private final Optional<yh> h;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)amt.a(mj.bv).optionalFieldOf("test").forGetter(a::a), (App)jy.g.fieldOf("size").forGetter(a::b), (App)egm.f.fieldOf("rotation").forGetter(a::c), (App)Codec.BOOL.fieldOf("ignore_entities").forGetter(a::d), (App)emz$c.d.fieldOf("status").forGetter(a::e), (App)yj.a.optionalFieldOf("error_message").forGetter(a::f)).apply((Applicative)$$0, a::new));
        public static final aao<xq, a> b = aao.a(aam.a(amt.b(mj.bv)), a::a, jy.h, a::b, egm.g, a::c, aam.b, a::d, emz$c.e, a::e, aam.a(yj.b), a::f, a::new);

        public a(Optional<amt<tb>> $$0, jy $$1, egm $$2, boolean $$3, c $$4, Optional<yh> $$5) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
            this.f = $$3;
            this.g = $$4;
            this.h = $$5;
        }

        public a a(jy $$0) {
            return new a(this.c, $$0, this.e, this.f, this.g, this.h);
        }

        public a a(c $$0) {
            return new a(this.c, this.d, this.e, this.f, $$0, Optional.empty());
        }

        public a a(yh $$0) {
            return new a(this.c, this.d, this.e, this.f, emz$c.c, Optional.of($$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "test;size;rotation;ignoreEntities;status;errorMessage", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "test;size;rotation;ignoreEntities;status;errorMessage", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "test;size;rotation;ignoreEntities;status;errorMessage", "c", "d", "e", "f", "g", "h"}, this, $$0);
        }

        public Optional<amt<tb>> a() {
            return this.c;
        }

        public jy b() {
            return this.d;
        }

        public egm c() {
            return this.e;
        }

        public boolean d() {
            return this.f;
        }

        public c e() {
            return this.g;
        }

        public Optional<yh> f() {
            return this.h;
        }
    }

    public static final class c
    extends Enum<c>
    implements bhh {
        public static final /* enum */ c a = new c("cleared", 0);
        public static final /* enum */ c b = new c("running", 1);
        public static final /* enum */ c c = new c("finished", 2);
        private static final IntFunction<c> f;
        public static final Codec<c> d;
        public static final aao<ByteBuf, c> e;
        private final String g;
        private final int h;
        private static final /* synthetic */ c[] i;

        public static c[] values() {
            return (c[])i.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private c(String $$0, int $$1) {
            this.g = $$0;
            this.h = $$1;
        }

        @Override
        public String c() {
            return this.g;
        }

        public static c a(int $$0) {
            return f.apply($$0);
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c};
        }

        static {
            i = emz$c.a();
            f = beu.a($$0 -> $$0.h, emz$c.values(), beu.a.a);
            d = bhh.a(c::values);
            e = aam.a(c::a, (T $$0) -> $$0.h);
        }
    }

    public static final class b
    extends Record {
        private final is c;
        private final yh d;
        public static final Codec<b> a = RecordCodecBuilder.create($$0 -> $$0.group((App)is.a.fieldOf("pos").forGetter(b::a), (App)yj.a.fieldOf("text").forGetter(b::b)).apply((Applicative)$$0, b::new));
        public static final Codec<List<b>> b = a.listOf();

        public b(is $$0, yh $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "pos;text", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "pos;text", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "pos;text", "c", "d"}, this, $$0);
        }

        public is a() {
            return this.c;
        }

        public yh b() {
            return this.d;
        }
    }
}


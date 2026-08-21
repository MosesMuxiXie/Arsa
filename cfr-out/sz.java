/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.util.Either
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.embedded.EmbeddedChannel
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import io.netty.channel.ChannelHandler;
import io.netty.channel.embedded.EmbeddedChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import org.jspecify.annotations.Nullable;

public class sz {
    private final ta a;
    private boolean b;

    public sz(ta $$0) {
        this.a = $$0;
    }

    public sr a(yh $$0) {
        return new sr($$0, this.a.p());
    }

    public sr a(String $$0, Object ... $$1) {
        return this.a(yh.b($$0, $$1));
    }

    public ss a(is $$0, yh $$1) {
        return new ss($$1, this.j($$0), $$0, this.a.p());
    }

    public ss a(is $$0, String $$1, Object ... $$2) {
        return this.a($$0, (yh)yh.b($$1, $$2));
    }

    public axf a() {
        return this.a.g();
    }

    public eoh a(is $$0) {
        return this.a().a_(this.j($$0));
    }

    public <T extends elb> T a(is $$0, Class<T> $$1) {
        elb $$2 = this.a().c_(this.j($$0));
        if ($$2 == null) {
            throw this.a($$0, "test.error.missing_block_entity", new Object[0]);
        }
        if ($$1.isInstance($$2)) {
            return (T)((elb)$$1.cast($$2));
        }
        throw this.a($$0, "test.error.wrong_block_entity", new Object[]{$$2.s().a().g()});
    }

    public void b() {
        this.a(cgk.class);
    }

    public void a(Class<? extends cgk> $$02) {
        fth $$1 = this.j();
        List<cgk> $$2 = this.a().a($$02, $$1.g(1.0), (? super T $$0) -> !($$0 instanceof ddm));
        $$2.forEach($$0 -> $$0.c(this.a()));
    }

    public czl a(dlp $$0, ftm $$1) {
        axf $$2 = this.a();
        ftm $$3 = this.a($$1);
        czl $$4 = new czl($$2, $$3.g, $$3.h, $$3.i, new dlt($$0, 1));
        $$4.m(0.0, 0.0, 0.0);
        $$2.b($$4);
        return $$4;
    }

    public czl a(dlp $$0, float $$1, float $$2, float $$3) {
        return this.a($$0, new ftm($$1, $$2, $$3));
    }

    public czl a(dlp $$0, is $$1) {
        return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
    }

    public <E extends cgk> E a(cgu<E> $$0, is $$1) {
        return this.a($$0, ftm.c($$1));
    }

    public <E extends cgk> List<E> a(cgu<E> $$0, is $$1, int $$2) {
        return this.a($$0, ftm.c($$1), $$2);
    }

    public <E extends cgk> List<E> a(cgu<E> $$0, ftm $$1, int $$2) {
        ArrayList<E> $$3 = new ArrayList<E>();
        for (int $$4 = 0; $$4 < $$2; ++$$4) {
            $$3.add(this.a($$0, $$1));
        }
        return $$3;
    }

    public <E extends cgk> E a(cgu<E> $$0, ftm $$1) {
        return this.a($$0, $$1, (cgt)null);
    }

    public <E extends cgk> E a(cgu<E> $$0, ftm $$1, @Nullable cgt $$2) {
        axf $$3 = this.a();
        E $$4 = $$0.a($$3, cgt.d);
        if ($$4 == null) {
            throw this.a(is.a($$1), "test.error.spawn_failure", new Object[]{$$0.r().g()});
        }
        if ($$4 instanceof chn) {
            chn $$5 = (chn)$$4;
            $$5.gz();
        }
        ftm $$6 = this.a($$1);
        float $$7 = ((cgk)$$4).a(this.g());
        ((cgk)$$4).b($$6.g, $$6.h, $$6.i, $$7, ((cgk)$$4).ee());
        ((cgk)$$4).s($$7);
        ((cgk)$$4).r($$7);
        if ($$2 != null && $$4 instanceof chn) {
            chn $$8 = (chn)$$4;
            $$8.a((dxf)this.a(), this.a().c($$8.dK()), $$2, null);
        }
        $$3.a_((cgk)$$4);
        return $$4;
    }

    public <E extends chn> E a(cgu<E> $$0, int $$1, int $$2, int $$3, cgt $$4) {
        return (E)((chn)this.a($$0, new ftm($$1, $$2, $$3), $$4));
    }

    public void a(cgk $$0, cex $$1, float $$2) {
        $$0.a(this.a(), $$1, $$2);
    }

    public void a(cgk $$0) {
        $$0.c(this.a());
    }

    public <E extends cgk> E a(cgu<E> $$0) {
        return this.a($$0, 0, 0, 0, 2.147483647E9);
    }

    public <E extends cgk> E a(cgu<E> $$0, int $$12, int $$22, int $$3, double $$4) {
        List<E> $$5 = this.b($$0, $$12, $$22, $$3, $$4);
        if ($$5.isEmpty()) {
            throw this.a("test.error.expected_entity_around", $$0.h(), $$12, $$22, $$3);
        }
        if ($$5.size() > 1) {
            throw this.a("test.error.too_many_entities", $$0.i(), $$12, $$22, $$3, $$5.size());
        }
        ftm $$6 = this.a(new ftm($$12, $$22, $$3));
        $$5.sort(($$1, $$2) -> {
            double $$3 = $$1.dI().f($$6);
            double $$4 = $$2.dI().f($$6);
            return Double.compare($$3, $$4);
        });
        return (E)((cgk)$$5.get(0));
    }

    public <E extends cgk> List<E> b(cgu<E> $$0, int $$1, int $$2, int $$3, double $$4) {
        return this.a($$0, ftm.c(new is($$1, $$2, $$3)), $$4);
    }

    public <E extends cgk> List<E> a(cgu<E> $$0, ftm $$12, double $$2) {
        axf $$3 = this.a();
        ftm $$4 = this.a($$12);
        fth $$5 = this.a.e();
        fth $$6 = new fth($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
        return $$3.a($$0, $$5, (? super T $$1) -> $$1.dj().c($$6) && $$1.cb());
    }

    public <E extends cgk> E a(cgu<E> $$0, int $$1, int $$2, int $$3) {
        return this.a($$0, new is($$1, $$2, $$3));
    }

    public <E extends cgk> E a(cgu<E> $$0, float $$1, float $$2, float $$3) {
        return this.a($$0, new ftm($$1, $$2, $$3));
    }

    public <E extends chn> E b(cgu<E> $$0, is $$1) {
        chn $$2 = (chn)this.a($$0, $$1);
        $$2.gJ();
        return (E)$$2;
    }

    public <E extends chn> E b(cgu<E> $$0, int $$1, int $$2, int $$3) {
        return this.b($$0, new is($$1, $$2, $$3));
    }

    public <E extends chn> E b(cgu<E> $$0, ftm $$1) {
        chn $$2 = (chn)this.a($$0, $$1);
        $$2.gJ();
        return (E)$$2;
    }

    public <E extends chn> E b(cgu<E> $$0, float $$1, float $$2, float $$3) {
        return this.b($$0, new ftm($$1, $$2, $$3));
    }

    public void a(chn $$0, float $$1, float $$2, float $$3) {
        ftm $$4 = this.a(new ftm($$1, $$2, $$3));
        $$0.b($$4.g, $$4.h, $$4.i, $$0.ec(), $$0.ee());
    }

    public tg a(chn $$0, is $$1, float $$2) {
        return this.f().a(2, () -> {
            flp $$3 = $$0.N().a(this.j($$1), 0);
            $$0.N().a($$3, (double)$$2);
        });
    }

    public void a(int $$0, int $$1, int $$2) {
        this.b(new is($$0, $$1, $$2));
    }

    public void b(is $$0) {
        this.a(bdp.f, $$0);
        is $$1 = this.j($$0);
        eoh $$2 = this.a().a_($$1);
        eab $$3 = (eab)$$2.b();
        $$3.a($$2, (dwo)this.a(), $$1, (ddm)null);
    }

    public void c(is $$0) {
        this.a($$0, this.a(dwl.b));
    }

    public void a(is $$0, ddm $$1) {
        is $$2 = this.j($$0);
        this.a($$0, $$1, new fti(ftm.b($$2), iz.c, $$2, true));
    }

    public void a(is $$0, ddm $$1, fti $$2) {
        cdb $$5;
        is $$3 = this.j($$0);
        eoh $$4 = this.a().a_($$3);
        cdc $$6 = $$4.a($$1.b($$5 = cdb.a), this.a(), $$1, $$5, $$2);
        if ($$6.a()) {
            return;
        }
        if ($$6 instanceof cdc.f && $$4.a((dwo)this.a(), $$1, $$2).a()) {
            return;
        }
        dpw $$7 = new dpw($$1, $$5, $$2);
        $$1.b($$5).a($$7);
    }

    public chl a(chl $$0) {
        $$0.j(0);
        $$0.x(0.25f);
        return $$0;
    }

    public chl b(chl $$0) {
        $$0.x(0.25f);
        return $$0;
    }

    public ddm a(final dwl $$0) {
        return new ddm(this, this.a(), new GameProfile(UUID.randomUUID(), "test-mock-player")){

            @Override
            public dwl a() {
                return $$0;
            }

            @Override
            public boolean aa_() {
                return false;
            }
        };
    }

    @Deprecated(forRemoval=true)
    public axg c() {
        axu $$0 = axu.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
        axg $$1 = new axg(this, this.a().s(), this.a(), $$0.a(), $$0.c()){

            @Override
            public dwl a() {
                return dwl.b;
            }
        };
        wu $$2 = new wu(aaz.a);
        EmbeddedChannel $$3 = new EmbeddedChannel(new ChannelHandler[]{$$2});
        this.a().s().aj().a($$2, $$1, $$0);
        return $$1;
    }

    public void b(int $$0, int $$1, int $$2) {
        this.d(new is($$0, $$1, $$2));
    }

    public void d(is $$0) {
        this.a(dzs.dX, $$0);
        is $$1 = this.j($$0);
        eoh $$2 = this.a().a_($$1);
        eel $$3 = (eel)$$2.b();
        $$3.b($$2, (dwo)this.a(), $$1, null);
    }

    public void a(is $$0, long $$1) {
        this.a($$0, dzs.hR);
        this.b($$1, () -> this.a($$0, dzs.a));
    }

    public void e(is $$0) {
        this.a().a(this.j($$0), false, null);
    }

    public void a(int $$0, int $$1, int $$2, dzq $$3) {
        this.a(new is($$0, $$1, $$2), $$3);
    }

    public void a(int $$0, int $$1, int $$2, eoh $$3) {
        this.a(new is($$0, $$1, $$2), $$3);
    }

    public void a(is $$0, dzq $$1) {
        this.a($$0, $$1.m());
    }

    public void a(is $$0, eoh $$1) {
        this.a().a(this.j($$0), $$1, 3);
    }

    public void a(is $$0, dzq $$1, iz $$2) {
        this.a($$0, $$1.m(), $$2);
    }

    public void a(is $$0, eoh $$1, iz $$2) {
        eoh $$3 = $$1;
        if ($$1.b(edt.f)) {
            $$3 = (eoh)$$1.b(edt.f, $$2);
        }
        if ($$1.b(eox.R)) {
            $$3 = (eoh)$$1.b(eox.R, $$2);
        }
        this.a().a(this.j($$0), $$3, 3);
    }

    public void a(dzq $$0, int $$1, int $$2, int $$3) {
        this.a($$0, new is($$1, $$2, $$3));
    }

    public void a(dzq $$0, is $$12) {
        eoh $$22 = this.a($$12);
        this.a($$12, (dzq $$2) -> $$22.a($$0), (dzq $$1) -> yh.a("test.error.expected_block", $$0.f(), $$1.f()));
    }

    public void b(dzq $$0, int $$1, int $$2, int $$3) {
        this.b($$0, new is($$1, $$2, $$3));
    }

    public void b(dzq $$0, is $$12) {
        this.a($$12, (dzq $$2) -> !this.a($$12).a($$0), (dzq $$1) -> yh.a("test.error.unexpected_block", $$0.f()));
    }

    public void a(bef<dzq> $$0, is $$12) {
        this.b($$12, (eoh $$1) -> $$1.a($$0), (eoh $$1) -> yh.a("test.error.expected_block_tag", yh.a($$0.b()), $$1.b().f()));
    }

    public void c(dzq $$0, int $$1, int $$2, int $$3) {
        this.c($$0, new is($$1, $$2, $$3));
    }

    public void c(dzq $$0, is $$1) {
        this.b(() -> this.a($$0, $$1));
    }

    public void a(is $$0, Predicate<dzq> $$12, Function<dzq, yh> $$2) {
        this.b($$0, (eoh $$1) -> $$12.test($$1.b()), (eoh $$1) -> (yh)$$2.apply($$1.b()));
    }

    public <T extends Comparable<T>> void a(is $$0, epk<T> $$1, T $$2) {
        eoh $$3 = this.a($$0);
        boolean $$4 = $$3.b($$1);
        if (!$$4) {
            throw this.a($$0, "test.error.block_property_missing", $$1.f(), $$2);
        }
        if (!$$3.c($$1).equals($$2)) {
            throw this.a($$0, "test.error.block_property_mismatch", $$1.f(), $$2, $$3.c($$1));
        }
    }

    public <T extends Comparable<T>> void a(is $$0, epk<T> $$12, Predicate<T> $$22, yh $$3) {
        this.b($$0, (eoh $$2) -> {
            if (!$$2.b($$12)) {
                return false;
            }
            Object $$3 = $$2.c($$12);
            return $$22.test($$3);
        }, (eoh $$1) -> $$3);
    }

    public void b(is $$0, eoh $$1) {
        eoh $$2 = this.a($$0);
        if (!$$2.equals($$1)) {
            throw this.a($$0, "test.error.state_not_equal", $$1, $$2);
        }
    }

    public void b(is $$0, Predicate<eoh> $$1, Function<eoh, yh> $$2) {
        eoh $$3 = this.a($$0);
        if (!$$1.test($$3)) {
            throw this.a($$0, $$2.apply($$3));
        }
    }

    public <T extends elb> void a(is $$0, Class<T> $$1, Predicate<T> $$2, Supplier<yh> $$3) {
        T $$4 = this.a($$0, $$1);
        if (!$$2.test($$4)) {
            throw this.a($$0, $$3.get());
        }
    }

    public void a(is $$0, iz $$1, IntPredicate $$2, Supplier<yh> $$3) {
        is $$4 = this.j($$0);
        axf $$5 = this.a();
        eoh $$6 = $$5.a_($$4);
        int $$7 = $$6.a((dvt)$$5, $$4, $$1);
        if (!$$2.test($$7)) {
            throw this.a($$0, $$3.get());
        }
    }

    public void b(cgu<?> $$0) {
        if (!this.a().b($$0, this.j(), cgk::cb)) {
            throw this.a("test.error.expected_entity_in_test", $$0.h());
        }
    }

    public void c(cgu<?> $$0, int $$1, int $$2, int $$3) {
        this.c($$0, new is($$1, $$2, $$3));
    }

    public void c(cgu<?> $$0, is $$1) {
        is $$2 = this.j($$1);
        if (!this.a().b($$0, new fth($$2), cgk::cb)) {
            throw this.a($$1, "test.error.expected_entity", new Object[]{$$0.h()});
        }
    }

    public void a(cgu<?> $$0, fth $$1) {
        fth $$2 = this.a($$1);
        if (!this.a().b($$0, $$2, cgk::cb)) {
            throw this.a(is.a($$1.f()), "test.error.expected_entity", new Object[]{$$0.h()});
        }
    }

    public void a(cgu<?> $$0, fth $$1, yh $$2) {
        fth $$3 = this.a($$1);
        if (!this.a().b($$0, $$3, cgk::cb)) {
            throw this.a(is.a($$1.f()), $$2);
        }
    }

    public void a(cgu<?> $$0, int $$1) {
        List<cgk> $$2 = this.a().a($$0, this.j(), cgk::cb);
        if ($$2.size() != $$1) {
            throw this.a("test.error.expected_entity_count", $$1, $$0.h(), $$2.size());
        }
    }

    public void a(cgu<?> $$0, is $$1, int $$2, double $$3) {
        is $$4 = this.j($$1);
        List<?> $$5 = this.b($$0, $$1, $$3);
        if ($$5.size() != $$2) {
            throw this.a($$1, "test.error.expected_entity_count", $$2, $$0.h(), $$5.size());
        }
    }

    public void a(cgu<?> $$0, is $$1, double $$2) {
        List<?> $$3 = this.b($$0, $$1, $$2);
        if ($$3.isEmpty()) {
            is $$4 = this.j($$1);
            throw this.a($$1, "test.error.expected_entity", new Object[]{$$0.h()});
        }
    }

    public <T extends cgk> List<T> b(cgu<T> $$0, is $$1, double $$2) {
        is $$3 = this.j($$1);
        return this.a().a($$0, new fth($$3).g($$2), cgk::cb);
    }

    public <T extends cgk> List<T> c(cgu<T> $$0) {
        return this.a().a($$0, this.j(), cgk::cb);
    }

    public void a(cgk $$0, int $$1, int $$2, int $$3) {
        this.a($$0, new is($$1, $$2, $$3));
    }

    public void a(cgk $$0, is $$12) {
        is $$2 = this.j($$12);
        List<cgk> $$3 = this.a().a($$0.ay(), new fth($$2), cgk::cb);
        $$3.stream().filter($$1 -> $$1 == $$0).findFirst().orElseThrow(() -> this.a($$12, "test.error.expected_entity", new Object[]{$$0.ay().h()}));
    }

    public void a(dlp $$0, is $$1, double $$2, int $$3) {
        is $$4 = this.j($$1);
        List<czl> $$5 = this.a().a(cgu.av, new fth($$4).g($$2), cgk::cb);
        int $$6 = 0;
        for (czl $$7 : $$5) {
            dlt $$8 = $$7.e();
            if (!$$8.a($$0)) continue;
            $$6 += $$8.N();
        }
        if ($$6 != $$3) {
            throw this.a($$1, "test.error.expected_items_count", $$3, $$0.l(), $$6);
        }
    }

    public void a(dlp $$0, is $$12, double $$2) {
        is $$3 = this.j($$12);
        Predicate<czl> $$4 = $$1 -> $$1.cb() && $$1.e().a($$0);
        if (!this.a().b(cgu.av, new fth($$3).g($$2), $$4)) {
            throw this.a($$12, "test.error.expected_item", new Object[]{$$0.l()});
        }
    }

    public void b(dlp $$0, is $$12, double $$2) {
        is $$3 = this.j($$12);
        Predicate<czl> $$4 = $$1 -> $$1.cb() && $$1.e().a($$0);
        if (this.a().b(cgu.av, new fth($$3).g($$2), $$4)) {
            throw this.a($$12, "test.error.unexpected_item", new Object[]{$$0.l()});
        }
    }

    public void a(dlp $$0) {
        Predicate<czl> $$12 = $$1 -> $$1.cb() && $$1.e().a($$0);
        if (!this.a().b(cgu.av, this.j(), $$12)) {
            throw this.a("test.error.expected_item", $$0.l());
        }
    }

    public void b(dlp $$0) {
        Predicate<czl> $$12 = $$1 -> $$1.cb() && $$1.e().a($$0);
        if (this.a().b(cgu.av, this.j(), $$12)) {
            throw this.a("test.error.unexpected_item", $$0.l());
        }
    }

    public void d(cgu<?> $$0) {
        List<cgk> $$1 = this.a().a($$0, this.j(), cgk::cb);
        if (!$$1.isEmpty()) {
            throw this.a($$1.getFirst().dK(), "test.error.unexpected_entity", new Object[]{$$0.h()});
        }
    }

    public void d(cgu<?> $$0, int $$1, int $$2, int $$3) {
        this.d($$0, new is($$1, $$2, $$3));
    }

    public void d(cgu<?> $$0, is $$1) {
        is $$2 = this.j($$1);
        if (this.a().b($$0, new fth($$2), cgk::cb)) {
            throw this.a($$1, "test.error.unexpected_entity", new Object[]{$$0.h()});
        }
    }

    public void b(cgu<?> $$0, fth $$1) {
        fth $$2 = this.a($$1);
        List<cgk> $$3 = this.a().a($$0, $$2, cgk::cb);
        if (!$$3.isEmpty()) {
            throw this.a($$3.getFirst().dK(), "test.error.unexpected_entity", new Object[]{$$0.h()});
        }
    }

    public void a(cgu<?> $$0, double $$12, double $$2, double $$3) {
        ftm $$4 = new ftm($$12, $$2, $$3);
        ftm $$5 = this.a($$4);
        Predicate<cgk> $$6 = $$1 -> $$1.dj().a($$5, $$5);
        if (!this.a().b($$0, this.j(), $$6)) {
            throw this.a("test.error.expected_entity_touching", $$0.h(), $$5.a(), $$5.b(), $$5.c(), $$12, $$2, $$3);
        }
    }

    public void b(cgu<?> $$0, double $$12, double $$2, double $$3) {
        ftm $$4 = new ftm($$12, $$2, $$3);
        ftm $$5 = this.a($$4);
        Predicate<cgk> $$6 = $$1 -> !$$1.dj().a($$5, $$5);
        if (!this.a().b($$0, this.j(), $$6)) {
            throw this.a("test.error.expected_entity_not_touching", $$0.h(), $$5.a(), $$5.b(), $$5.c(), $$12, $$2, $$3);
        }
    }

    public <E extends cgk, T> void a(is $$0, cgu<E> $$1, Predicate<E> $$2) {
        is $$3 = this.j($$0);
        List<cgk> $$4 = this.a().a($$1, new fth($$3), cgk::cb);
        if ($$4.isEmpty()) {
            throw this.a($$0, "test.error.expected_entity", new Object[]{$$1.h()});
        }
        for (cgk $$5 : $$4) {
            if ($$2.test($$5)) continue;
            throw this.a($$5.dK(), "test.error.expected_entity_data_predicate", new Object[]{$$5.ap()});
        }
    }

    public <E extends cgk, T> void a(is $$0, cgu<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
        this.a(new fth($$0), $$1, $$2, $$3);
    }

    public <E extends cgk, T> void a(fth $$0, cgu<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
        List<cgk> $$4 = this.a().a($$1, this.a($$0), cgk::cb);
        if ($$4.isEmpty()) {
            throw this.a(is.a($$0.g()), "test.error.expected_entity", new Object[]{$$1.h()});
        }
        for (cgk $$5 : $$4) {
            T $$6 = $$2.apply($$5);
            if (Objects.equals($$6, $$3)) continue;
            throw this.a(is.a($$0.g()), "test.error.expected_entity_data", $$3, $$6);
        }
    }

    public <E extends chl> void a(is $$0, cgu<E> $$1, dlp $$2) {
        is $$3 = this.j($$0);
        List<chl> $$4 = this.a().a($$1, new fth($$3), cgk::cb);
        if ($$4.isEmpty()) {
            throw this.a($$0, "test.error.expected_entity", new Object[]{$$1.h()});
        }
        for (chl $$5 : $$4) {
            if (!$$5.b($$2)) continue;
            return;
        }
        throw this.a($$0, "test.error.expected_entity_holding", new Object[]{$$2.l()});
    }

    public <E extends cgk> void b(is $$02, cgu<E> $$12, dlp $$2) {
        is $$3 = this.j($$02);
        List<cgk> $$4 = this.a().a($$12, new fth($$3), (? super T $$0) -> ((cgk)$$0).cb());
        if ($$4.isEmpty()) {
            throw this.a($$02, "test.error.expected_entity", new Object[]{$$12.h()});
        }
        for (cgk $$5 : $$4) {
            if (!((dct)((Object)$$5)).gP().a_($$1 -> $$1.a($$2))) continue;
            return;
        }
        throw this.a($$02, "test.error.expected_entity_having", new Object[]{$$2.l()});
    }

    public void f(is $$0) {
        eku $$1 = this.a($$0, eku.class);
        if (!$$1.c()) {
            throw this.a($$0, "test.error.expected_empty_container", new Object[0]);
        }
    }

    public void a(is $$0, dlp $$1) {
        eku $$2 = this.a($$0, eku.class);
        if ($$2.a_($$1) != 1) {
            throw this.a($$0, "test.error.expected_container_contents_single", new Object[]{$$1.l()});
        }
    }

    public void b(is $$0, dlp $$1) {
        eku $$2 = this.a($$0, eku.class);
        if ($$2.a_($$1) == 0) {
            throw this.a($$0, "test.error.expected_container_contents", new Object[]{$$1.l()});
        }
    }

    public void a(ffg $$0, is $$1) {
        is.a($$0).forEach($$2 -> {
            is $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
            this.a((is)$$2, $$3);
        });
    }

    public void a(is $$0, is $$1) {
        eoh $$3;
        eoh $$2 = this.a($$0);
        if ($$2 != ($$3 = this.a($$1))) {
            throw this.a($$0, "test.error.state_not_equal", $$3, $$2);
        }
    }

    public void a(long $$0, is $$1, dlp $$2) {
        this.a($$0, () -> this.a($$1, $$2));
    }

    public void a(long $$0, is $$1) {
        this.a($$0, () -> this.f($$1));
    }

    public <E extends cgk, T> void b(is $$0, cgu<E> $$1, Function<E, T> $$2, T $$3) {
        this.b(() -> this.a($$0, $$1, $$2, $$3));
    }

    public <E extends cgk> void a(E $$0, Predicate<E> $$1, yh $$2) {
        if (!$$1.test($$0)) {
            throw this.a($$0.dK(), "test.error.entity_property", $$0.ap(), $$2);
        }
    }

    public <E extends cgk, T> void a(E $$0, Function<E, T> $$1, T $$2, yh $$3) {
        T $$4 = $$1.apply($$0);
        if (!$$4.equals($$2)) {
            throw this.a($$0.dK(), "test.error.entity_property_details", $$0.ap(), $$3, $$4, $$2);
        }
    }

    public void a(chl $$0, jd<cfk> $$1, int $$2) {
        cfm $$3 = $$0.e($$1);
        if ($$3 == null || $$3.e() != $$2) {
            throw this.a("test.error.expected_entity_effect", new Object[]{$$0.ap(), dnr.a($$1, $$2)});
        }
    }

    public void e(cgu<?> $$0, int $$1, int $$2, int $$3) {
        this.e($$0, new is($$1, $$2, $$3));
    }

    public void e(cgu<?> $$0, is $$1) {
        this.b(() -> this.c($$0, $$1));
    }

    public void f(cgu<?> $$0, int $$1, int $$2, int $$3) {
        this.f($$0, new is($$1, $$2, $$3));
    }

    public void f(cgu<?> $$0, is $$1) {
        this.b(() -> this.d($$0, $$1));
    }

    public void d() {
        this.a.m();
    }

    private void l() {
        if (this.b) {
            throw new IllegalStateException("This test already has final clause");
        }
        this.b = true;
    }

    public void a(Runnable $$0) {
        this.l();
        this.a.q().a(0L, $$0).a();
    }

    public void b(Runnable $$0) {
        this.l();
        this.a.q().a($$0).a();
    }

    public void a(int $$0, Runnable $$1) {
        this.l();
        this.a.q().a((long)$$0, $$1).a();
    }

    public void a(long $$0, Runnable $$1) {
        this.a.a($$0, $$1);
    }

    public void b(long $$0, Runnable $$1) {
        this.a((long)this.a.p() + $$0, $$1);
    }

    public void g(is $$0) {
        is $$1 = this.j($$0);
        axf $$2 = this.a();
        $$2.a_($$1).b($$2, $$1, $$2.y);
    }

    public void h(is $$0) {
        is $$1 = this.j($$0);
        axf $$2 = this.a();
        $$2.a_($$1).a($$2, $$1, $$2.y);
    }

    public void i(is $$0) {
        is $$1 = this.j($$0);
        axf $$2 = this.a();
        $$2.a($$1);
    }

    public void e() {
        fth $$0 = this.k();
        int $$1 = (int)Math.floor($$0.d);
        int $$2 = (int)Math.floor($$0.f);
        int $$3 = (int)Math.floor($$0.e);
        for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; ++$$4) {
            for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; ++$$5) {
                this.i(new is($$4, $$3, $$5));
            }
        }
    }

    public int a(euq.a $$0, int $$1, int $$2) {
        is $$3 = this.j(new is($$1, 0, $$2));
        return this.k(this.a().a($$0, $$3)).v();
    }

    public void a(yh $$0, is $$1) {
        throw this.a($$1, $$0);
    }

    public void a(yh $$0, cgk $$1) {
        throw this.a($$1.dK(), $$0);
    }

    public void b(yh $$0) {
        throw this.a($$0);
    }

    public void a(String $$0) {
        throw this.a(yh.b($$0));
    }

    public void c(Runnable $$0) {
        this.a.q().a($$0).a(() -> this.a("test.error.fail", new Object[0]));
    }

    public void d(Runnable $$0) {
        LongStream.range(this.a.p(), this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
    }

    public tg f() {
        return this.a.q();
    }

    public is j(is $$0) {
        is $$1 = this.a.d();
        is $$2 = $$1.a($$0);
        return fjq.a($$2, eev.a, this.a.u(), $$1);
    }

    public is k(is $$0) {
        is $$1 = this.a.d();
        egm $$2 = this.a.u().a(egm.c);
        is $$3 = fjq.a($$0, eev.a, $$2, $$1);
        return $$3.b($$1);
    }

    public fth a(fth $$0) {
        ftm $$1 = this.a($$0.h());
        ftm $$2 = this.a($$0.i());
        return new fth($$1, $$2);
    }

    public fth b(fth $$0) {
        ftm $$1 = this.b($$0.h());
        ftm $$2 = this.b($$0.i());
        return new fth($$1, $$2);
    }

    public ftm a(ftm $$0) {
        ftm $$1 = ftm.a(this.a.d());
        return fjq.a($$1.e($$0), eev.a, this.a.u(), this.a.d());
    }

    public ftm b(ftm $$0) {
        ftm $$1 = ftm.a(this.a.d());
        return fjq.a($$0.d($$1), eev.a, this.a.u(), this.a.d());
    }

    public egm g() {
        return this.a.u();
    }

    public iz h() {
        return this.a.u().a(iz.d);
    }

    public iz a(iz $$0) {
        return this.g().a($$0);
    }

    public void a(boolean $$0, yh $$1) {
        if (!$$0) {
            throw this.a($$1);
        }
    }

    public void a(boolean $$0, String $$1) {
        this.a($$0, (yh)yh.b($$1));
    }

    public <N> void a(N $$0, N $$1, String $$2) {
        this.a($$0, $$1, (yh)yh.b($$2));
    }

    public <N> void a(N $$0, N $$1, yh $$2) {
        if (!$$0.equals($$1)) {
            throw this.a("test.error.value_not_equal", $$2, $$0, $$1);
        }
    }

    public void b(boolean $$0, yh $$1) {
        this.a(!$$0, $$1);
    }

    public void b(boolean $$0, String $$1) {
        this.b($$0, yh.b($$1));
    }

    public long i() {
        return this.a.p();
    }

    public fth j() {
        return this.a.e();
    }

    public fth k() {
        fth $$0 = this.a.e();
        egm $$1 = this.a.u();
        switch ($$1) {
            case d: 
            case b: {
                return new fth(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
            }
        }
        return new fth(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
    }

    public void a(Consumer<is> $$0) {
        fth $$1 = this.k().a(1.0, 1.0, 1.0);
        is.a.b($$1).forEach($$0);
    }

    public void e(Runnable $$0) {
        LongStream.range(this.a.p(), this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
    }

    public void a(ddm $$0, dlt $$1, is $$2, iz $$3) {
        is $$4 = this.j($$2.a($$3));
        fti $$5 = new fti(ftm.b($$4), $$3, $$4, false);
        dpw $$6 = new dpw($$0, cdb.a, $$5);
        $$1.a($$6);
    }

    public void a(amt<dxo> $$0) {
        fth $$1 = this.j();
        is $$2 = is.a($$1.a, $$1.b, $$1.c);
        is $$3 = is.a($$1.d, $$1.e, $$1.f);
        Either<Integer, CommandSyntaxException> $$4 = apa.a(this.a(), $$2, $$3, this.a().J_().f(mj.aS).b($$0));
        if ($$4.right().isPresent()) {
            throw this.a("test.error.set_biome", new Object[0]);
        }
    }
}


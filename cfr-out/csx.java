/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class csx
extends esb<csz, csz.a> {
    public static final int a = 6;
    public static final int b = 1;
    private final a d;
    private final LongSet e = new LongOpenHashSet();

    public csx(esa $$0, Path $$1, DataFixer $$2, boolean $$3, jr $$4, erq $$5, dwq $$6) {
        super(new esd($$0, $$1, $$2, $$3, bhz.t), csz.a.a, csz::a, csz.a::a, csz::new, $$4, $$5, $$6);
        this.d = new a();
    }

    public @Nullable csy a(is $$0, jd<cta> $$1) {
        return ((csz)this.f(jw.c($$0))).a($$0, $$1);
    }

    public void a(is $$0) {
        this.d(jw.c($$0)).ifPresent($$1 -> $$1.a($$0));
    }

    public long a(Predicate<jd<cta>> $$0, is $$1, int $$2, b $$3) {
        return this.c($$0, $$1, $$2, $$3).count();
    }

    public boolean a(amt<cta> $$0, is $$12) {
        return this.a($$12, (jd<cta> $$1) -> $$1.a($$0));
    }

    public Stream<csy> b(Predicate<jd<cta>> $$0, is $$1, int $$22, b $$3) {
        int $$4 = Math.floorDiv($$22, 16) + 1;
        return dvu.a(new dvu($$1), $$4).flatMap($$2 -> this.a($$0, (dvu)$$2, $$3)).filter($$2 -> {
            is $$3 = $$2.g();
            return Math.abs($$3.u() - $$1.u()) <= $$22 && Math.abs($$3.w() - $$1.w()) <= $$22;
        });
    }

    public Stream<csy> c(Predicate<jd<cta>> $$0, is $$1, int $$22, b $$3) {
        int $$4 = $$22 * $$22;
        return this.b($$0, $$1, $$22, $$3).filter($$2 -> $$2.g().j($$1) <= (double)$$4);
    }

    @bht
    public Stream<csy> a(Predicate<jd<cta>> $$0, dvu $$12, b $$22) {
        return IntStream.rangeClosed(this.c.ay(), this.c.az()).boxed().map($$1 -> this.d(jw.a($$12, (int)$$1).s())).filter(Optional::isPresent).flatMap($$2 -> ((csz)$$2.get()).a($$0, $$22));
    }

    public Stream<is> a(Predicate<jd<cta>> $$0, Predicate<is> $$1, is $$2, int $$3, b $$4) {
        return this.c($$0, $$2, $$3, $$4).map(csy::g).filter($$1);
    }

    public Stream<Pair<jd<cta>, is>> b(Predicate<jd<cta>> $$02, Predicate<is> $$12, is $$2, int $$3, b $$4) {
        return this.c($$02, $$2, $$3, $$4).filter($$1 -> $$12.test($$1.g())).map($$0 -> Pair.of($$0.h(), (Object)$$0.g()));
    }

    public Stream<Pair<jd<cta>, is>> c(Predicate<jd<cta>> $$0, Predicate<is> $$12, is $$2, int $$3, b $$4) {
        return this.b($$0, $$12, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1 -> ((is)$$1.getSecond()).j($$2)));
    }

    public Optional<is> d(Predicate<jd<cta>> $$0, Predicate<is> $$1, is $$2, int $$3, b $$4) {
        return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
    }

    public Optional<is> d(Predicate<jd<cta>> $$0, is $$12, int $$2, b $$3) {
        return this.c($$0, $$12, $$2, $$3).map(csy::g).min(Comparator.comparingDouble($$1 -> $$1.j($$12)));
    }

    public Optional<Pair<jd<cta>, is>> e(Predicate<jd<cta>> $$02, is $$12, int $$2, b $$3) {
        return this.c($$02, $$12, $$2, $$3).min(Comparator.comparingDouble($$1 -> $$1.g().j($$12))).map($$0 -> Pair.of($$0.h(), (Object)$$0.g()));
    }

    public Optional<is> e(Predicate<jd<cta>> $$0, Predicate<is> $$12, is $$2, int $$3, b $$4) {
        return this.c($$0, $$2, $$3, $$4).map(csy::g).filter($$12).min(Comparator.comparingDouble($$1 -> $$1.j($$2)));
    }

    public Optional<is> a(Predicate<jd<cta>> $$02, BiPredicate<jd<cta>, is> $$12, is $$2, int $$3) {
        return this.c($$02, $$2, $$3, csx$b.a).filter($$1 -> $$12.test($$1.h(), $$1.g())).findFirst().map($$0 -> {
            $$0.c();
            return $$0.g();
        });
    }

    public Optional<is> a(Predicate<jd<cta>> $$0, Predicate<is> $$12, b $$2, is $$3, int $$4, bgr $$5) {
        List<csy> $$6 = bhs.a(this.c($$0, $$3, $$4, $$2), $$5);
        return $$6.stream().filter($$1 -> $$12.test($$1.g())).findFirst().map(csy::g);
    }

    public boolean b(is $$0) {
        return this.d(jw.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> bhs.b(new IllegalStateException("POI never registered at " + String.valueOf($$0))));
    }

    public boolean a(is $$0, Predicate<jd<cta>> $$1) {
        return this.d(jw.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
    }

    public Optional<jd<cta>> c(is $$0) {
        return this.d(jw.c($$0)).flatMap($$1 -> $$1.d($$0));
    }

    @bht
    public @Nullable bxc d(is $$0) {
        return this.d(jw.c($$0)).flatMap($$1 -> $$1.e($$0)).orElse(null);
    }

    public int a(jw $$0) {
        this.d.a();
        return this.d.c($$0.s());
    }

    boolean g(long $$0) {
        Optional $$1 = this.c($$0);
        if ($$1 == null) {
            return false;
        }
        return $$1.map($$02 -> $$02.a((jd<cta> $$0) -> $$0.a(bea.b), csx$b.b).findAny().isPresent()).orElse(false);
    }

    @Override
    public void a(BooleanSupplier $$0) {
        super.a($$0);
        this.d.a();
    }

    @Override
    protected void a(long $$0) {
        super.a($$0);
        this.d.b($$0, this.d.b($$0), false);
    }

    @Override
    protected void b(long $$0) {
        this.d.b($$0, this.d.b($$0), false);
    }

    public void a(jw $$0, eqr $$1) {
        bhs.a(this.d($$0.s()), (T $$22) -> $$22.a((BiConsumer<is, jd<cta>> $$2) -> {
            if (csx.a($$1)) {
                this.a($$1, $$0, (BiConsumer<is, jd<cta>>)$$2);
            }
        }), () -> {
            if (csx.a($$1)) {
                csz $$2 = (csz)this.f($$0.s());
                this.a($$1, $$0, $$2::a);
            }
        });
    }

    private static boolean a(eqr $$0) {
        return $$0.a(ctb::b);
    }

    private void a(eqr $$0, jw $$1, BiConsumer<is, jd<cta>> $$2) {
        $$1.t().forEach($$22 -> {
            eoh $$3 = $$0.a(jw.b($$22.u()), jw.b($$22.v()), jw.b($$22.w()));
            ctb.a($$3).ifPresent($$2 -> $$2.accept((is)$$22, (jd<cta>)$$2));
        });
    }

    public void a(dwr $$02, is $$12, int $$2) {
        jw.a(new dvu($$12), Math.floorDiv($$2, 16), this.c.ay(), this.c.az()).map($$0 -> Pair.of((Object)$$0, this.d($$0.s()))).filter($$0 -> ((Optional)$$0.getSecond()).map(csz::b).orElse(false) == false).map($$0 -> ((jw)$$0.getFirst()).r()).filter($$0 -> this.e.add($$0.b())).forEach($$1 -> $$02.a($$1.h, $$1.i, erj.c));
    }

    final class a
    extends axa {
        private final Long2ByteMap b;

        protected a() {
            super(7, 16, 256);
            this.b = new Long2ByteOpenHashMap();
            this.b.defaultReturnValue((byte)7);
        }

        @Override
        protected int b(long $$0) {
            return csx.this.g($$0) ? 0 : 7;
        }

        @Override
        protected int c(long $$0) {
            return this.b.get($$0);
        }

        @Override
        protected void a(long $$0, int $$1) {
            if ($$1 > 6) {
                this.b.remove($$0);
            } else {
                this.b.put($$0, (byte)$$1);
            }
        }

        public void a() {
            super.b(Integer.MAX_VALUE);
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(csy::e);
        public static final /* enum */ b b = new b(csy::f);
        public static final /* enum */ b c = new b($$0 -> true);
        private final Predicate<? super csy> d;
        private static final /* synthetic */ b[] e;

        public static b[] values() {
            return (b[])e.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(Predicate<? super csy> $$0) {
            this.d = $$0;
        }

        public Predicate<? super csy> a() {
            return this.d;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c};
        }

        static {
            e = csx$b.b();
        }
    }
}


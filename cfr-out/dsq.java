/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.apache.commons.lang3.mutable.MutableFloat
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public class dsq {
    public static int a(jd<dso> $$0, dlt $$1) {
        dsu $$2 = $$1.a(ki.o, dsu.a);
        return $$2.a($$0);
    }

    public static dsu a(dlt $$0, Consumer<dsu.a> $$1) {
        kh<dsu> $$2 = dsq.d($$0);
        dsu $$3 = $$0.a($$2);
        if ($$3 == null) {
            return dsu.a;
        }
        dsu.a $$4 = new dsu.a($$3);
        $$1.accept($$4);
        dsu $$5 = $$4.b();
        $$0.b($$2, $$5);
        return $$5;
    }

    public static boolean a(dlt $$0) {
        return $$0.c(dsq.d($$0));
    }

    public static void a(dlt $$0, dsu $$1) {
        $$0.b(dsq.d($$0), $$1);
    }

    public static dsu b(dlt $$0) {
        return $$0.a(dsq.d($$0), dsu.a);
    }

    private static kh<dsu> d(dlt $$0) {
        return $$0.a(dlx.wI) ? ki.Q : ki.o;
    }

    public static boolean c(dlt $$0) {
        return !$$0.a(ki.o, dsu.a).d() || !$$0.a(ki.Q, dsu.a).d();
    }

    public static int a(axf $$0, dlt $$1, int $$2) {
        MutableFloat $$32 = new MutableFloat((float)$$2);
        dsq.a($$1, (jd<dso> $$3, int $$4) -> ((dso)$$3.a()).a($$0, $$4, $$1, $$32));
        return $$32.intValue();
    }

    public static int a(axf $$0, dlt $$1, dlt $$2, int $$32) {
        MutableFloat $$42 = new MutableFloat((float)$$32);
        dsq.a($$1, (jd<dso> $$3, int $$4) -> ((dso)$$3.a()).b($$0, $$4, $$2, $$42));
        return $$42.intValue();
    }

    public static int b(axf $$0, dlt $$1, int $$2) {
        MutableFloat $$32 = new MutableFloat((float)$$2);
        dsq.a($$1, (jd<dso> $$3, int $$4) -> ((dso)$$3.a()).d($$0, $$4, $$1, $$32));
        return $$32.intValue();
    }

    public static int a(axf $$0, @Nullable cgk $$1, cgk $$2, int $$32) {
        if ($$1 instanceof chl) {
            chl $$42 = (chl)$$1;
            MutableFloat $$52 = new MutableFloat((float)$$32);
            dsq.a($$42, (jd<dso> $$3, int $$4, dsn $$5) -> ((dso)$$3.a()).a($$0, $$4, $$5.a(), $$2, $$52));
            return $$52.intValue();
        }
        return $$32;
    }

    public static dlt a(dsr $$0) {
        dlt $$1 = new dlt(dlx.wI);
        $$1.a($$0.b(), $$0.c());
        return $$1;
    }

    private static void a(dlt $$0, b $$1) {
        dsu $$2 = $$0.a(ki.o, dsu.a);
        for (Object2IntMap.Entry<jd<dso>> $$3 : $$2.b()) {
            $$1.accept((jd)$$3.getKey(), $$3.getIntValue());
        }
    }

    private static void a(dlt $$0, cgv $$1, chl $$2, a $$3) {
        if ($$0.f()) {
            return;
        }
        dsu $$4 = $$0.a(ki.o);
        if ($$4 == null || $$4.d()) {
            return;
        }
        dsn $$5 = new dsn($$0, $$1, $$2);
        for (Object2IntMap.Entry<jd<dso>> $$6 : $$4.b()) {
            jd $$7 = (jd)$$6.getKey();
            if (!((dso)$$7.a()).a($$1)) continue;
            $$3.accept($$7, $$6.getIntValue(), $$5);
        }
    }

    private static void a(chl $$0, a $$1) {
        for (cgv $$2 : cgv.j) {
            dsq.a($$0.a($$2), $$2, $$0, $$1);
        }
    }

    public static boolean a(axf $$0, chl $$1, cex $$2) {
        MutableBoolean $$3 = new MutableBoolean();
        dsq.a($$1, (jd<dso> $$4, int $$5, dsn $$6) -> $$3.setValue($$3.isTrue() || ((dso)$$4.a()).a($$0, $$5, $$1, $$2)));
        return $$3.isTrue();
    }

    public static float b(axf $$0, chl $$1, cex $$2) {
        MutableFloat $$3 = new MutableFloat(0.0f);
        dsq.a($$1, (jd<dso> $$4, int $$5, dsn $$6) -> ((dso)$$4.a()).a($$0, $$5, $$6.a(), (cgk)$$1, $$2, $$3));
        return $$3.floatValue();
    }

    public static float a(axf $$0, dlt $$1, cgk $$2, cex $$3, float $$4) {
        MutableFloat $$52 = new MutableFloat($$4);
        dsq.a($$1, (jd<dso> $$5, int $$6) -> ((dso)$$5.a()).b($$0, $$6, $$1, $$2, $$3, $$52));
        return $$52.floatValue();
    }

    public static float b(axf $$0, dlt $$1, cgk $$2, cex $$3, float $$4) {
        MutableFloat $$52 = new MutableFloat($$4);
        dsq.a($$1, (jd<dso> $$5, int $$6) -> ((dso)$$5.a()).c($$0, $$6, $$1, $$2, $$3, $$52));
        return $$52.floatValue();
    }

    public static float c(axf $$0, dlt $$1, cgk $$2, cex $$3, float $$4) {
        MutableFloat $$52 = new MutableFloat($$4);
        dsq.a($$1, (jd<dso> $$5, int $$6) -> ((dso)$$5.a()).e($$0, $$6, $$1, $$2, $$3, $$52));
        return $$52.floatValue();
    }

    public static float d(axf $$0, dlt $$1, cgk $$2, cex $$3, float $$4) {
        MutableFloat $$52 = new MutableFloat($$4);
        dsq.a($$1, (jd<dso> $$5, int $$6) -> ((dso)$$5.a()).d($$0, $$6, $$1, $$2, $$3, $$52));
        return $$52.floatValue();
    }

    public static void a(axf $$0, cgk $$1, cex $$2) {
        cgk cgk2 = $$2.d();
        if (cgk2 instanceof chl) {
            chl $$3 = (chl)cgk2;
            dsq.a($$0, $$1, $$2, $$3.eq());
        } else {
            dsq.a($$0, $$1, $$2, null);
        }
    }

    public static void a(axf $$0, cgk $$1) {
        if ($$1 instanceof chl) {
            chl $$22 = (chl)$$1;
            dsq.a($$1.eq(), cgv.a, $$22, (jd<dso> $$2, int $$3, dsn $$4) -> ((dso)$$2.a()).a($$0, $$3, $$4, $$1));
        }
    }

    public static void a(axf $$0, cgk $$1, cex $$2, @Nullable dlt $$3) {
        dsq.a($$0, $$1, $$2, $$3, null);
    }

    public static void a(axf $$0, cgk $$1, cex $$2, @Nullable dlt $$32, @Nullable Consumer<dlp> $$42) {
        if ($$1 instanceof chl) {
            chl $$52 = (chl)$$1;
            dsq.a($$52, (jd<dso> $$3, int $$4, dsn $$5) -> ((dso)$$3.a()).a($$0, $$4, $$5, dss.c, $$1, $$2));
        }
        if ($$32 != null) {
            cgk cgk2 = $$2.d();
            if (cgk2 instanceof chl) {
                chl $$6 = (chl)cgk2;
                dsq.a($$32, cgv.a, $$6, (jd<dso> $$3, int $$4, dsn $$5) -> ((dso)$$3.a()).a($$0, $$4, $$5, dss.a, $$1, $$2));
            } else if ($$42 != null) {
                dsn $$7 = new dsn($$32, null, null, $$42);
                dsq.a($$32, (jd<dso> $$4, int $$5) -> ((dso)$$4.a()).a($$0, $$5, $$7, dss.a, $$1, $$2));
            }
        }
    }

    public static void a(axf $$0, chl $$1) {
        dsq.a($$1, (jd<dso> $$2, int $$3, dsn $$4) -> ((dso)$$2.a()).a($$0, $$3, $$4, $$1));
    }

    public static void a(axf $$0, dlt $$1, chl $$22, cgv $$32) {
        dsq.a($$1, $$32, $$22, (jd<dso> $$2, int $$3, dsn $$4) -> ((dso)$$2.a()).a($$0, $$3, $$4, $$22));
    }

    public static void a(chl $$0) {
        dsq.a($$0, (jd<dso> $$1, int $$2, dsn $$3) -> ((dso)$$1.a()).a($$2, $$3, $$0));
    }

    public static void a(dlt $$0, chl $$12, cgv $$22) {
        dsq.a($$0, $$22, $$12, (jd<dso> $$1, int $$2, dsn $$3) -> ((dso)$$1.a()).a($$2, $$3, $$12));
    }

    public static void b(axf $$0, chl $$1) {
        dsq.a($$1, (jd<dso> $$2, int $$3, dsn $$4) -> ((dso)$$2.a()).b($$0, $$3, $$4, $$1));
    }

    public static int a(jd<dso> $$0, chl $$1) {
        Collection<dlt> $$2 = $$0.a().a($$1).values();
        int $$3 = 0;
        for (dlt $$4 : $$2) {
            int $$5 = dsq.a($$0, $$4);
            if ($$5 <= $$3) continue;
            $$3 = $$5;
        }
        return $$3;
    }

    public static int a(axf $$0, dlt $$1, cgk $$2, int $$3) {
        MutableFloat $$42 = new MutableFloat((float)$$3);
        dsq.a($$1, (jd<dso> $$4, int $$5) -> ((dso)$$4.a()).e($$0, $$5, $$1, $$2, $$42));
        return Math.max(0, $$42.intValue());
    }

    public static float a(axf $$0, dlt $$1, cgk $$2, float $$3) {
        MutableFloat $$42 = new MutableFloat($$3);
        dsq.a($$1, (jd<dso> $$4, int $$5) -> ((dso)$$4.a()).f($$0, $$5, $$1, $$2, $$42));
        return Math.max(0.0f, $$42.floatValue());
    }

    public static int a(axf $$0, dlt $$1, dlt $$2) {
        MutableFloat $$32 = new MutableFloat(0.0f);
        dsq.a($$1, (jd<dso> $$3, int $$4) -> ((dso)$$3.a()).c($$0, $$4, $$2, $$32));
        return Math.max(0, $$32.intValue());
    }

    public static void a(axf $$0, dlt $$1, dec $$2, Consumer<dlp> $$32) {
        chl $$42;
        cgk cgk2 = $$2.p();
        chl $$5 = cgk2 instanceof chl ? ($$42 = (chl)cgk2) : null;
        dsn $$6 = new dsn($$1, null, $$5, $$32);
        dsq.a($$1, (jd<dso> $$3, int $$4) -> ((dso)$$3.a()).c($$0, $$4, $$6, $$2));
    }

    public static void a(axf $$0, dlt $$1, @Nullable chl $$2, cgk $$3, @Nullable cgv $$4, ftm $$52, eoh $$62, Consumer<dlp> $$7) {
        dsn $$8 = new dsn($$1, $$4, $$2, $$7);
        dsq.a($$1, (jd<dso> $$5, int $$6) -> ((dso)$$5.a()).a($$0, $$6, $$8, $$3, $$52, $$62));
    }

    public static int c(axf $$0, dlt $$1, int $$2) {
        MutableFloat $$32 = new MutableFloat((float)$$2);
        dsq.a($$1, (jd<dso> $$3, int $$4) -> ((dso)$$3.a()).e($$0, $$4, $$1, $$32));
        return Math.max(0, $$32.intValue());
    }

    public static float a(axf $$0, chl $$1, cex $$2, float $$3) {
        MutableFloat $$4 = new MutableFloat($$3);
        bgr $$52 = $$1.ep();
        dsq.a($$1, (jd<dso> $$5, int $$6, dsn $$7) -> {
            fnz $$8 = dso.b($$0, $$6, (cgk)$$1, $$2);
            ((dso)$$5.a()).a(dsp.n).forEach($$4 -> {
                if ($$4.a() == dss.c && $$4.b() == dss.c && $$4.a($$8)) {
                    $$4.setValue(((dtj)$$4.c()).a($$6, $$52, $$4.floatValue()));
                }
            });
        });
        cgk $$62 = $$2.d();
        if ($$62 instanceof chl) {
            chl $$72 = (chl)$$62;
            dsq.a($$72, (jd<dso> $$5, int $$6, dsn $$7) -> {
                fnz $$8 = dso.b($$0, $$6, (cgk)$$1, $$2);
                ((dso)$$5.a()).a(dsp.n).forEach($$4 -> {
                    if ($$4.a() == dss.a && $$4.b() == dss.c && $$4.a($$8)) {
                        $$4.setValue(((dtj)$$4.c()).a($$6, $$52, $$4.floatValue()));
                    }
                });
            });
        }
        return $$4.floatValue();
    }

    public static void a(dlt $$0, cgw $$1, BiConsumer<jd<cin>, ciq> $$22) {
        dsq.a($$0, (jd<dso> $$2, int $$3) -> ((dso)$$2.a()).a(dsp.m).forEach($$4 -> {
            if (((dso)$$2.a()).g().h().contains($$1)) {
                $$22.accept($$4.c(), $$4.a($$3, $$1));
            }
        }));
    }

    public static void a(dlt $$0, cgv $$1, BiConsumer<jd<cin>, ciq> $$22) {
        dsq.a($$0, (jd<dso> $$2, int $$3) -> ((dso)$$2.a()).a(dsp.m).forEach($$4 -> {
            if (((dso)$$2.a()).a($$1)) {
                $$22.accept($$4.c(), $$4.a($$3, (bhh)$$1));
            }
        }));
    }

    public static int a(axf $$0, dlt $$1, cgk $$2) {
        MutableFloat $$3 = new MutableFloat(0.0f);
        dsq.a($$1, (jd<dso> $$4, int $$5) -> ((dso)$$4.a()).d($$0, $$5, $$1, $$2, $$3));
        return Math.max(0, $$3.intValue());
    }

    public static float b(axf $$0, dlt $$1, cgk $$2) {
        MutableFloat $$3 = new MutableFloat(0.0f);
        dsq.a($$1, (jd<dso> $$4, int $$5) -> ((dso)$$4.a()).c($$0, $$5, $$1, $$2, $$3));
        return Math.max(0.0f, $$3.floatValue());
    }

    public static int c(axf $$0, dlt $$1, cgk $$2) {
        MutableFloat $$3 = new MutableFloat(0.0f);
        dsq.a($$1, (jd<dso> $$4, int $$5) -> ((dso)$$4.a()).b($$0, $$5, $$1, $$2, $$3));
        return Math.max(0, $$3.intValue());
    }

    public static float a(dlt $$0, chl $$1, float $$22) {
        MutableFloat $$32 = new MutableFloat($$22);
        dsq.a($$0, (jd<dso> $$2, int $$3) -> ((dso)$$2.a()).b($$1.ep(), $$3, $$32));
        return Math.max(0.0f, $$32.floatValue());
    }

    public static float a(dlt $$0, chl $$1) {
        MutableFloat $$22 = new MutableFloat(0.0f);
        dsq.a($$0, (jd<dso> $$2, int $$3) -> ((dso)$$2.a()).a($$1.ep(), $$3, $$22));
        return $$22.floatValue();
    }

    public static boolean a(dlt $$0, bef<dso> $$1) {
        dsu $$2 = $$0.a(ki.o, dsu.a);
        for (Object2IntMap.Entry<jd<dso>> $$3 : $$2.b()) {
            jd $$4 = (jd)$$3.getKey();
            if (!$$4.a($$1)) continue;
            return true;
        }
        return false;
    }

    public static boolean a(dlt $$0, kh<?> $$1) {
        MutableBoolean $$22 = new MutableBoolean(false);
        dsq.a($$0, (jd<dso> $$2, int $$3) -> {
            if (((dso)$$2.a()).i().c($$1)) {
                $$22.setTrue();
            }
        });
        return $$22.booleanValue();
    }

    public static <T> Optional<T> b(dlt $$0, kh<List<T>> $$1) {
        Pair<List<T>, Integer> $$2 = dsq.c($$0, $$1);
        if ($$2 != null) {
            List $$3 = (List)$$2.getFirst();
            int $$4 = (Integer)$$2.getSecond();
            return Optional.of($$3.get(Math.min($$4, $$3.size()) - 1));
        }
        return Optional.empty();
    }

    /*
     * Issues handling annotations - annotations may be inaccurate
     */
    public static <T> @Nullable Pair<T, Integer> c(dlt $$0, kh<T> $$1) {
        @Nullable MutableObject $$22 = new MutableObject();
        dsq.a($$0, (jd<dso> $$2, int $$3) -> {
            Object $$4;
            if (($$22.get() == null || (Integer)((Pair)$$22.get()).getSecond() < $$3) && ($$4 = ((dso)$$2.a()).i().a($$1)) != null) {
                $$22.setValue((Object)Pair.of($$4, (Object)$$3));
            }
        });
        return (Pair)$$22.get();
    }

    public static Optional<dsn> a(kh<?> $$0, chl $$1, Predicate<dlt> $$2) {
        ArrayList<dsn> $$3 = new ArrayList<dsn>();
        for (cgv $$4 : cgv.j) {
            dlt $$5 = $$1.a($$4);
            if (!$$2.test($$5)) continue;
            dsu $$6 = $$5.a(ki.o, dsu.a);
            for (Object2IntMap.Entry<jd<dso>> $$7 : $$6.b()) {
                jd $$8 = (jd)$$7.getKey();
                if (!((dso)$$8.a()).i().c($$0) || !((dso)$$8.a()).a($$4)) continue;
                $$3.add(new dsn($$5, $$4, $$1));
            }
        }
        return bhs.b($$3, $$1.ep());
    }

    public static int a(bgr $$0, int $$1, int $$2, dlt $$3) {
        dsm $$4 = $$3.a(ki.G);
        if ($$4 == null) {
            return 0;
        }
        if ($$2 > 15) {
            $$2 = 15;
        }
        int $$5 = $$0.a(8) + 1 + ($$2 >> 1) + $$0.a($$2 + 1);
        if ($$1 == 0) {
            return Math.max($$5 / 3, 1);
        }
        if ($$1 == 1) {
            return $$5 * 2 / 3 + 1;
        }
        return Math.max($$5, $$2 * 2);
    }

    public static dlt a(bgr $$0, dlt $$1, int $$2, jr $$3, Optional<? extends jh<dso>> $$4) {
        return dsq.a($$0, $$1, $$2, $$4.map(jh::a).orElseGet(() -> $$3.f(mj.bf).c().map($$0 -> $$0)));
    }

    public static dlt a(bgr $$0, dlt $$1, int $$2, Stream<jd<dso>> $$3) {
        List<dsr> $$4 = dsq.b($$0, $$1, $$2, $$3);
        if ($$1.a(dlx.sB)) {
            $$1 = new dlt(dlx.wI);
        }
        for (dsr $$5 : $$4) {
            $$1.a($$5.b(), $$5.c());
        }
        return $$1;
    }

    public static List<dsr> b(bgr $$0, dlt $$1, int $$2, Stream<jd<dso>> $$3) {
        ArrayList $$4 = Lists.newArrayList();
        dsm $$5 = $$1.a(ki.G);
        if ($$5 == null) {
            return $$4;
        }
        $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
        float $$6 = ($$0.i() + $$0.i() - 1.0f) * 0.15f;
        List<dsr> $$7 = dsq.a($$2 = bgj.a(Math.round((float)$$2 + (float)$$2 * $$6), 1, Integer.MAX_VALUE), $$1, $$3);
        if (!$$7.isEmpty()) {
            cbo.a($$0, $$7, dsr::a).ifPresent($$4::add);
            while ($$0.a(50) <= $$2) {
                if (!$$4.isEmpty()) {
                    dsq.a($$7, (dsr)$$4.getLast());
                }
                if ($$7.isEmpty()) break;
                cbo.a($$0, $$7, dsr::a).ifPresent($$4::add);
                $$2 /= 2;
            }
        }
        return $$4;
    }

    public static void a(List<dsr> $$0, dsr $$12) {
        $$0.removeIf($$1 -> !dso.a($$12.b(), $$1.b()));
    }

    public static boolean a(Collection<jd<dso>> $$0, jd<dso> $$1) {
        for (jd<dso> $$2 : $$0) {
            if (dso.a($$2, $$1)) continue;
            return false;
        }
        return true;
    }

    public static List<dsr> a(int $$0, dlt $$1, Stream<jd<dso>> $$22) {
        ArrayList $$3 = Lists.newArrayList();
        boolean $$4 = $$1.a(dlx.sB);
        $$22.filter($$2 -> ((dso)$$2.a()).a($$1) || $$4).forEach($$2 -> {
            dso $$3 = (dso)$$2.a();
            for (int $$4 = $$3.e(); $$4 >= $$3.d(); --$$4) {
                if ($$0 < $$3.b($$4) || $$0 > $$3.c($$4)) continue;
                $$3.add(new dsr((jd<dso>)$$2, $$4));
                break;
            }
        });
        return $$3;
    }

    public static void a(dlt $$0, jr $$1, amt<dtz> $$2, cda $$3, bgr $$42) {
        dtz $$5 = $$1.f(mj.be).c($$2);
        if ($$5 != null) {
            dsq.a($$0, (dsu.a $$4) -> $$5.a($$0, (dsu.a)$$4, $$42, $$3));
        }
    }

    @FunctionalInterface
    static interface b {
        public void accept(jd<dso> var1, int var2);
    }

    @FunctionalInterface
    static interface a {
        public void accept(jd<dso> var1, int var2, dsn var3);
    }
}

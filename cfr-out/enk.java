/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public final class enk
extends Enum<enk>
implements bhh {
    public static final /* enum */ enk a = new enk("inactive", 0, enk$b.a, -1.0, false);
    public static final /* enum */ enk b = new enk("waiting_for_players", 4, enk$b.b, 200.0, true);
    public static final /* enum */ enk c = new enk("active", 8, enk$b.c, 1000.0, true);
    public static final /* enum */ enk d = new enk("waiting_for_reward_ejection", 8, enk$b.b, -1.0, false);
    public static final /* enum */ enk e = new enk("ejecting_reward", 8, enk$b.b, -1.0, false);
    public static final /* enum */ enk f = new enk("cooldown", 0, enk$b.d, -1.0, false);
    private static final float g = 40.0f;
    private static final int h;
    private final String i;
    private final int j;
    private final double k;
    private final b l;
    private final boolean m;
    private static final /* synthetic */ enk[] n;

    public static enk[] values() {
        return (enk[])n.clone();
    }

    public static enk valueOf(String $$0) {
        return Enum.valueOf(enk.class, $$0);
    }

    private enk(String $$0, int $$1, b $$2, double $$3, boolean $$4) {
        this.i = $$0;
        this.j = $$1;
        this.l = $$2;
        this.k = $$3;
        this.m = $$4;
    }

    enk a(is $$0, enh $$1, axf $$2) {
        enl $$32 = $$1.h();
        eni $$42 = $$1.a();
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                if ($$32.a($$1, $$2, b) == null) {
                    yield this;
                }
                yield b;
            }
            case 1 -> {
                if (!$$1.a($$2)) {
                    $$32.c();
                    yield this;
                }
                if (!$$32.a($$1, $$2.y)) {
                    yield a;
                }
                $$32.a($$2, $$0, $$1);
                if ($$32.a.isEmpty()) {
                    yield this;
                }
                yield c;
            }
            case 2 -> {
                if (!$$1.a($$2)) {
                    $$32.c();
                    yield b;
                }
                if (!$$32.a($$1, $$2.y)) {
                    yield a;
                }
                int $$5 = $$32.a($$0);
                $$32.a($$2, $$0, $$1);
                if ($$1.d()) {
                    this.a($$2, $$0, $$1);
                }
                if ($$32.a($$42, $$5)) {
                    if ($$32.d()) {
                        $$32.c = $$2.au() + (long)$$1.e();
                        $$32.e = 0;
                        $$32.d = 0L;
                        yield d;
                    }
                } else if ($$32.a($$2, $$42, $$5)) {
                    $$1.c($$2, $$0).ifPresent($$4 -> {
                        $$0.b.add((UUID)$$4);
                        ++$$0.e;
                        $$0.d = $$2.au() + (long)$$42.h();
                        $$42.i().a($$2.G_()).ifPresent($$2 -> {
                            $$0.f = Optional.of($$2);
                            $$1.i();
                        });
                    });
                }
                yield this;
            }
            case 3 -> {
                if ($$32.a($$2, 40.0f, $$1.e())) {
                    $$2.a(null, $$0, bda.oe, bdb.e);
                    yield e;
                }
                yield this;
            }
            case 4 -> {
                if (!$$32.b($$2, h, $$1.e())) {
                    yield this;
                }
                if ($$32.a.isEmpty()) {
                    $$2.a(null, $$0, bda.of, bdb.e);
                    $$32.g = Optional.empty();
                    yield f;
                }
                if ($$32.g.isEmpty()) {
                    $$32.g = $$42.j().a($$2.G_());
                }
                $$32.g.ifPresent($$3 -> $$1.a($$2, $$0, (amt<fof>)$$3));
                $$32.a.remove($$32.a.iterator().next());
                yield this;
            }
            case 5 -> {
                $$32.a($$2, $$0, $$1);
                if (!$$32.a.isEmpty()) {
                    $$32.e = 0;
                    $$32.d = 0L;
                    yield c;
                }
                if ($$32.a($$2)) {
                    $$1.b($$2, $$0);
                    $$32.b();
                    yield b;
                }
                yield this;
            }
        };
    }

    private void a(axf $$0, is $$1, enh $$2) {
        eni $$42;
        enl $$3 = $$2.h();
        dlt $$5 = $$3.a($$0, $$42 = $$2.a(), $$1).a($$0.y).orElse(dlt.l);
        if ($$5.f()) {
            return;
        }
        if (this.a($$0, $$3)) {
            enk.a($$0, $$1, $$2, $$3).ifPresent($$4 -> {
                chr $$5 = chr.a((dwo)$$0, $$5);
                $$5.f((ftm)$$4);
                $$0.b($$5);
                float $$6 = ($$0.G_().i() - $$0.G_().i()) * 0.2f + 1.0f;
                $$0.a(null, is.a($$4), bda.nZ, bdb.e, 1.0f, $$6);
                $$2.c = $$0.au() + $$2.c().a();
            });
        }
    }

    private static Optional<ftm> a(axf $$0, is $$1, enh $$22, enl $$3) {
        List<ddm> $$4 = $$3.a.stream().map($$0::c).filter(Objects::nonNull).filter($$2 -> !$$2.ha() && !$$2.au() && $$2.cb() && $$2.g($$1.b()) <= (double)bgj.i($$22.f())).toList();
        if ($$4.isEmpty()) {
            return Optional.empty();
        }
        cgk $$5 = enk.a($$4, $$3.b, $$22, $$1, $$0);
        if ($$5 == null) {
            return Optional.empty();
        }
        return enk.a($$5, $$0);
    }

    private static Optional<ftm> a(cgk $$0, axf $$1) {
        ftm $$3;
        ftm $$2 = $$0.dI();
        fti $$4 = $$1.a(new dvw($$2, $$3 = $$2.a(iz.b, (double)($$0.dG() + 2.0f + (float)$$1.y.a(4))), dvw.a.c, dvw.b.a, ftr.a()));
        ftm $$5 = $$4.b().b().a(iz.a, 1.0);
        is $$6 = is.a($$5);
        if (!$$1.a_($$6).g($$1, $$6).c()) {
            return Optional.empty();
        }
        return Optional.of($$5);
    }

    private static @Nullable cgk a(List<ddm> $$0, Set<UUID> $$1, enh $$22, is $$3, axf $$4) {
        List<cgk> $$6;
        Stream<cgk> $$5 = $$1.stream().map($$4::d).filter(Objects::nonNull).filter($$2 -> $$2.cb() && $$2.g($$3.b()) <= (double)bgj.i($$22.f()));
        List<cgk> list = $$6 = $$4.y.h() ? $$5.toList() : $$0;
        if ($$6.isEmpty()) {
            return null;
        }
        if ($$6.size() == 1) {
            return $$6.getFirst();
        }
        return bhs.a($$6, $$4.y);
    }

    private boolean a(axf $$0, enl $$1) {
        return $$0.au() >= $$1.c;
    }

    public int a() {
        return this.j;
    }

    public double b() {
        return this.k;
    }

    public boolean d() {
        return this.k >= 0.0;
    }

    public boolean e() {
        return this.m;
    }

    public void a(dwo $$0, is $$1, boolean $$2) {
        this.l.emit($$0, $$0.G_(), $$1, $$2);
    }

    @Override
    public String c() {
        return this.i;
    }

    private static /* synthetic */ enk[] f() {
        return new enk[]{a, b, c, d, e, f};
    }

    static {
        n = enk.f();
        h = bgj.b(30.0f);
    }

    static interface b {
        public static final b a = ($$0, $$1, $$2, $$3) -> {};
        public static final b b = ($$0, $$1, $$2, $$3) -> {
            if ($$1.a(2) == 0) {
                ftm $$4 = $$2.b().a($$1, 0.9f);
                enk$b.a($$3 ? ly.O : ly.aN, $$4, $$0);
            }
        };
        public static final b c = ($$0, $$1, $$2, $$3) -> {
            ftm $$4 = $$2.b().a($$1, 1.0f);
            enk$b.a(ly.ai, $$4, $$0);
            enk$b.a($$3 ? ly.O : ly.G, $$4, $$0);
        };
        public static final b d = ($$0, $$1, $$2, $$3) -> {
            ftm $$4 = $$2.b().a($$1, 0.9f);
            if ($$1.a(3) == 0) {
                enk$b.a(ly.ai, $$4, $$0);
            }
            if ($$0.au() % 20L == 0L) {
                ftm $$5 = $$2.b().b(0.0, 0.5, 0.0);
                int $$6 = $$0.G_().a(4) + 20;
                for (int $$7 = 0; $$7 < $$6; ++$$7) {
                    enk$b.a(ly.ai, $$5, $$0);
                }
            }
        };

        private static void a(md $$0, ftm $$1, dwo $$2) {
            $$2.a($$0, $$1.a(), $$1.b(), $$1.c(), 0.0, 0.0, 0.0);
        }

        public void emit(dwo var1, bgr var2, is var3, boolean var4);
    }

    static class a {
        private static final int a = 0;
        private static final int b = 4;
        private static final int c = 8;

        private a() {
        }
    }

    static class c {
        private static final double a = -1.0;
        private static final double b = 200.0;
        private static final double c = 1000.0;

        private c() {
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.jspecify.annotations.Nullable;

class gdp
extends gmr
implements gdh {
    static final yh a = yh.c("mco.configure.worlds.title");
    private final gdi b;
    private final gfj d;
    private gbg e;
    private final gje f;
    private final gje g;
    private final gje h;
    private final List<gck> i = Lists.newArrayList();

    gdp(gdi $$02, gfj $$1, gbg $$2) {
        super(a);
        this.b = $$02;
        this.d = $$1;
        this.e = $$2;
        got.b $$32 = this.c.c(20).d(1);
        got.b $$4 = new got().c(16).d(4);
        this.i.clear();
        for (int $$5 = 1; $$5 < 5; ++$$5) {
            this.i.add($$4.a(this.a($$5), gox.i().f()));
        }
        $$32.a($$4.a());
        got.b $$6 = new got().c(8).d(1);
        this.f = $$6.a(gje.a(yh.c("mco.configure.world.buttons.options"), $$3 -> $$1.a(new gdn($$02, $$2.j.get($$2.q).a(), $$2.n, $$2.q))).a(0, 0, 150, 20).a());
        this.g = $$6.a(gje.a(yh.c("mco.configure.world.backup"), $$3 -> $$1.a(new gdg($$02, $$2.h(), $$2.q))).a(0, 0, 150, 20).a());
        this.h = $$6.a(gje.a(yh.i(), $$0 -> this.c()).a(0, 0, 150, 20).a());
        $$32.a($$6.a(), gox.i().b());
        this.g.k = true;
        this.a($$2);
    }

    private void c() {
        if (this.d()) {
            this.d.a(new gdb(yh.c("mco.template.title.minigame"), this::a, gbg.d.b, null));
        } else {
            this.d.a(gcz.a(this.b, this.e.h(), () -> this.d.execute(() -> this.d.a(this.b.o()))));
        }
    }

    private void a(@Nullable gbz $$0) {
        if ($$0 != null && gbz.a.b == $$0.i()) {
            this.b.n();
            gdi $$1 = this.b.o();
            this.d.a(new gcu($$1, new gen(this.e.b, $$0, $$1)));
        } else {
            this.d.a(this.b);
        }
    }

    private boolean d() {
        return this.e.j();
    }

    @Override
    public void b(gbg $$0) {
        this.a($$0);
    }

    @Override
    public void a(gbg $$0) {
        this.e = $$0;
        this.f.k = !$$0.k && !this.d();
        boolean bl2 = this.h.k = !$$0.k;
        if (this.d()) {
            this.h.a_(yh.c("mco.configure.world.buttons.switchminigame"));
        } else {
            boolean $$1;
            boolean bl3 = $$1 = $$0.j.containsKey($$0.q) && $$0.j.get((Object)Integer.valueOf((int)$$0.q)).b.i;
            if ($$1) {
                this.h.a_(yh.c("mco.configure.world.buttons.newworld"));
            } else {
                this.h.a_(yh.c("mco.configure.world.buttons.resetworld"));
            }
        }
        this.g.k = !this.d();
        for (gck $$2 : this.i) {
            gck.b $$3 = $$2.a($$0);
            if ($$3.e) {
                $$2.b(80, 80);
                continue;
            }
            $$2.b(50, 50);
        }
    }

    private gck a(int $$0) {
        return new gck(0, 0, 80, 80, $$0, this.e, $$1 -> {
            gck.b $$2 = ((gck)$$1).a();
            switch ($$2.c) {
                case a: {
                    break;
                }
                case b: {
                    if ($$2.b) {
                        this.e();
                        break;
                    }
                    if ($$2.a) {
                        this.b($$0, this.e);
                        break;
                    }
                    this.a($$0, this.e);
                    break;
                }
                default: {
                    throw new IllegalStateException("Unknown action " + String.valueOf((Object)$$2.c));
                }
            }
        });
    }

    private void e() {
        gdb $$0 = new gdb(yh.c("mco.template.title.minigame"), this::a, gbg.d.b, null, List.of(yh.c("mco.minigame.world.info.line1").b(-4539718), yh.c("mco.minigame.world.info.line2").b(-4539718)));
        this.d.a($$0);
    }

    private void a(int $$0, gbg $$1) {
        this.d.a(gcy.a(this.b, yh.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
            gdi $$3 = this.b.o();
            this.b.n();
            this.d.a(new gcu($$3, new geo($$0.b, $$0, () -> this.d.execute(() -> this.d.a($$3)))));
        }));
    }

    private void b(int $$0, gbg $$1) {
        this.d.a(gcy.a(this.b, yh.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
            this.b.n();
            gcz $$3 = gcz.a((gsb)this.b, $$0, $$1, () -> this.d.execute(() -> this.d.a(this.b.o())));
            this.d.a($$3);
        }));
    }
}


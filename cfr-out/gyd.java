/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.function.ToIntFunction;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gyd
extends gsb {
    private static final Logger a = LogUtils.getLogger();
    private static final ToIntFunction<amt<dwo>> b = (ToIntFunction)bhs.a(new Reference2IntOpenHashMap(), (? super T $$0) -> {
        $$0.put(dwo.h, -13408734);
        $$0.put(dwo.i, -10075085);
        $$0.put(dwo.j, -8943531);
        $$0.defaultReturnValue(-2236963);
    });
    private final BooleanConsumer c;
    private final ccq d;

    public static @Nullable gyd a(gfj $$0, BooleanConsumer $$1, DataFixer $$2, fni.c $$3, boolean $$4) {
        gyk $$5 = $$0.B();
        bak $$6 = ban.a($$3);
        ans $$7 = $$5.a($$3.h(), false, $$6);
        try {
            fnt $$8 = $$7.d();
            jr.b $$9 = $$7.c().a();
            $$3.a($$9, $$8);
            gyd gyd2 = new gyd($$1, $$2, $$3, $$8, $$4, $$9);
            if ($$7 != null) {
                $$7.close();
            }
            return gyd2;
        }
        catch (Throwable throwable) {
            try {
                if ($$7 != null) {
                    try {
                        $$7.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
            catch (Exception $$10) {
                a.warn("Failed to load datapacks, can't optimize world", (Throwable)$$10);
                return null;
            }
        }
    }

    private gyd(BooleanConsumer $$0, DataFixer $$1, fni.c $$2, fnt $$3, boolean $$4, jr $$5) {
        super(yh.a("optimizeWorld.title", new Object[]{$$3.I().a()}));
        this.c = $$0;
        this.d = new ccq($$2, $$1, $$3, $$5, $$4, false);
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.c(gje.a(yg.e, (gje $$0) -> {
            this.d.a();
            this.c.accept(false);
        }).a(this.o / 2 - 100, this.p / 4 + 150, 200, 20).a());
    }

    @Override
    public void e() {
        if (this.d.b()) {
            this.c.accept(true);
        }
    }

    @Override
    public void aX_() {
        this.c.accept(false);
    }

    @Override
    public void aZ_() {
        this.d.a();
        this.d.close();
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(this.q, this.m, this.o / 2, 20, -1);
        int $$4 = this.o / 2 - 150;
        int $$5 = this.o / 2 + 150;
        int $$6 = this.p / 4 + 100;
        int $$7 = $$6 + 10;
        $$0.a(this.q, this.d.h(), this.o / 2, $$6 - this.q.b - 2, -6250336);
        if (this.d.e() > 0) {
            $$0.a($$4 - 1, $$6 - 1, $$5 + 1, $$7 + 1, -16777216);
            $$0.b(this.q, yh.a("optimizeWorld.info.converted", this.d.f()), $$4, 40, -6250336);
            $$0.b(this.q, yh.a("optimizeWorld.info.skipped", this.d.g()), $$4, 40 + this.q.b + 3, -6250336);
            $$0.b(this.q, yh.a("optimizeWorld.info.total", this.d.e()), $$4, 40 + (this.q.b + 3) * 2, -6250336);
            int $$8 = 0;
            for (amt<dwo> $$9 : this.d.c()) {
                int $$10 = bgj.b(this.d.a($$9) * (float)($$5 - $$4));
                $$0.a($$4 + $$8, $$6, $$4 + $$8 + $$10, $$7, b.applyAsInt($$9));
                $$8 += $$10;
            }
            int $$11 = this.d.f() + this.d.g();
            yw $$12 = yh.a("optimizeWorld.progress.counter", $$11, this.d.e());
            yw $$13 = yh.a("optimizeWorld.progress.percentage", bgj.b(this.d.d() * 100.0f));
            $$0.a(this.q, (yh)$$12, this.o / 2, $$6 + 2 * this.q.b + 2, -6250336);
            $$0.a(this.q, (yh)$$13, this.o / 2, $$6 + ($$7 - $$6) / 2 - this.q.b / 2, -6250336);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  org.apache.commons.io.FileUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class gya
extends gsb {
    private static final Logger a = LogUtils.getLogger();
    private static final yh b = yh.c("selectWorld.enterName").a(l.h);
    private static final yh c = yh.c("selectWorld.edit.resetIcon");
    private static final yh d = yh.c("selectWorld.edit.openFolder");
    private static final yh e = yh.c("selectWorld.edit.backup");
    private static final yh f = yh.c("selectWorld.edit.backupFolder");
    private static final yh t = yh.c("selectWorld.edit.optimize");
    private static final yh u = yh.c("optimizeWorld.confirm.title");
    private static final yh v = yh.c("optimizeWorld.confirm.description");
    private static final yh w = yh.c("optimizeWorld.confirm.proceed");
    private static final yh x = yh.c("selectWorld.edit.save");
    private static final int y = 200;
    private static final int z = 4;
    private static final int A = 98;
    private final goy B = goy.d().a(5);
    private final BooleanConsumer C;
    private final fni.c D;
    private final gjn E;

    public static gya a(gfj $$0, fni.c $$1, BooleanConsumer $$2) throws IOException {
        fnj $$3 = $$1.a($$1.h());
        return new gya($$0, $$1, $$3.b(), $$2);
    }

    private gya(gfj $$02, fni.c $$12, String $$2, BooleanConsumer $$3) {
        super(yh.c("selectWorld.edit.title"));
        this.C = $$3;
        this.D = $$12;
        gio $$4 = $$02.g;
        this.B.a(new goz(200, 20));
        this.B.a(new gko(b, $$4));
        this.E = this.B.a(new gjn($$4, 200, 20, b));
        this.E.a($$2);
        goy $$5 = goy.e().a(4);
        gje $$6 = $$5.a(gje.a(x, (gje $$0) -> this.a(this.E.a())).a(98).a());
        $$5.a(gje.a(yg.e, (gje $$0) -> this.aX_()).a(98).a());
        this.E.b((String $$1) -> {
            $$0.k = !bhi.h($$1);
        });
        this.B.a(gje.a((yh)gya.c, (gje.c)(gje.c)LambdaMetafactory.metafactory(null, null, null, (Lgje;)V, c(fni$c gje ), (Lgje;)V)((fni.c)$$12)).a((int)200).a()).k = $$12.j().filter($$0 -> Files.isRegularFile($$0, new LinkOption[0])).isPresent();
        this.B.a(gje.a(d, (gje $$1) -> bhs.n().a($$12.a(fng.l))).a(200).a());
        this.B.a(gje.a(e, (gje $$1) -> {
            boolean $$2 = gya.a($$12);
            this.C.accept(!$$2);
        }).a(200).a());
        this.B.a(gje.a(f, (gje $$1) -> {
            fni $$2 = $$02.q();
            Path $$3 = $$2.d();
            try {
                bfp.c($$3);
            }
            catch (IOException $$4) {
                throw new RuntimeException($$4);
            }
            bhs.n().a($$3);
        }).a(200).a());
        this.B.a(gje.a(t, (gje $$22) -> $$02.a(new gqw(() -> $$02.a(this), ($$2, $$3) -> {
            if ($$2) {
                gya.a($$12);
            }
            $$02.a(gyd.a($$02, this.C, $$02.aC(), $$12, $$3));
        }, u, v, w, true))).a(200).a());
        this.B.a(new goz(200, 20));
        this.B.a($$5);
        this.B.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
    }

    @Override
    protected void aI_() {
        this.b(this.E);
    }

    @Override
    protected void bg_() {
        this.c();
    }

    @Override
    protected void c() {
        this.B.a();
        gos.a(this.B, this.aV_());
    }

    @Override
    public boolean a(gzb $$0) {
        if (this.E.aP_() && $$0.d()) {
            this.a(this.E.a());
            this.aX_();
            return true;
        }
        return super.a($$0);
    }

    @Override
    public void aX_() {
        this.C.accept(false);
    }

    private void a(String $$0) {
        try {
            this.D.a($$0);
        }
        catch (IOException | vk | vr $$1) {
            a.error("Failed to access world '{}'", (Object)this.D.f(), (Object)$$1);
            gna.a(this.n, this.D.f());
        }
        this.C.accept(true);
    }

    public static boolean a(fni.c $$0) {
        long $$1 = 0L;
        IOException $$2 = null;
        try {
            $$1 = $$0.l();
        }
        catch (IOException $$3) {
            $$2 = $$3;
        }
        if ($$2 != null) {
            yw $$4 = yh.c("selectWorld.edit.backupFailed");
            yw $$5 = yh.b($$2.getMessage());
            gfj.V().aG().a(new gna(gna.a.b, $$4, $$5));
            return false;
        }
        yw $$6 = yh.a("selectWorld.edit.backupCreated", new Object[]{$$0.f()});
        yw $$7 = yh.a("selectWorld.edit.backupSize", bgj.e((double)$$1 / 1048576.0));
        gfj.V().aG().a(new gna(gna.a.b, $$6, $$7));
        return true;
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(this.q, this.m, this.o / 2, 15, -1);
    }

    private static /* synthetic */ void c(fni.c $$02, gje $$1) {
        $$02.j().ifPresent($$0 -> FileUtils.deleteQuietly((File)$$0.toFile()));
        $$1.k = false;
    }
}


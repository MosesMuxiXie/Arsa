/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class ffy
extends ffs {
    private static final Logger h = LogUtils.getLogger();
    protected final String a;
    protected fjq b;
    protected fjm c;
    protected is d;

    public ffy(fgf $$0, int $$1, fjr $$2, amo $$3, String $$4, fjm $$5, is $$6) {
        super($$0, $$1, $$2.a($$3).b($$5, $$6));
        this.a(iz.c);
        this.a = $$4;
        this.d = $$6;
        this.b = $$2.a($$3);
        this.c = $$5;
    }

    public ffy(fgf $$0, uz $$1, fjr $$2, Function<amo, fjm> $$3) {
        super($$0, $$1);
        this.a(iz.c);
        this.a = $$1.b("Template", "");
        this.d = new is($$1.b("TPX", 0), $$1.b("TPY", 0), $$1.b("TPZ", 0));
        amo $$4 = this.b();
        this.b = $$2.a($$4);
        this.c = $$3.apply($$4);
        this.f = this.b.b(this.c, this.d);
    }

    protected amo b() {
        return amo.a(this.a);
    }

    @Override
    protected void a(fge $$0, uz $$1) {
        $$1.a("TPX", this.d.u());
        $$1.a("TPY", this.d.v());
        $$1.a("TPZ", this.d.w());
        $$1.a("Template", this.a);
    }

    @Override
    public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
        this.c.a($$4);
        this.f = this.b.b(this.c, this.d);
        if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
            List<fjq.d> $$7 = this.b.a(this.d, this.c, dzs.pY);
            for (fjq.d $$8 : $$7) {
                eps $$9;
                if ($$8.c() == null || ($$9 = $$8.c().a("mode", eps.e).orElseThrow()) != eps.d) continue;
                this.a($$8.c().b("metadata", ""), $$8.a(), $$0, $$3, $$4);
            }
            List<fjq.d> $$10 = this.b.a(this.d, this.c, dzs.pZ);
            for (fjq.d $$11 : $$10) {
                if ($$11.c() == null) continue;
                String $$12 = $$11.c().b("final_state", "minecraft:air");
                eoh $$13 = dzs.a.m();
                try {
                    $$13 = ga.a($$0.a(mj.i), $$12, true).a();
                }
                catch (CommandSyntaxException $$14) {
                    h.error("Error while parsing blockstate {} in jigsaw block @ {}", (Object)$$12, (Object)$$11.a());
                }
                $$0.a($$11.a(), $$13, 3);
            }
        }
    }

    protected abstract void a(String var1, is var2, dxf var3, bgr var4, ffg var5);

    @Override
    @Deprecated
    public void a(int $$0, int $$1, int $$2) {
        super.a($$0, $$1, $$2);
        this.d = this.d.b($$0, $$1, $$2);
    }

    @Override
    public egm a() {
        return this.c.d();
    }

    public fjq c() {
        return this.b;
    }

    public is d() {
        return this.d;
    }

    public fjm e() {
        return this.c;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class ezl
extends exx<fba> {
    public ezl(Codec<fba> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<fba> $$0) {
        jy $$7;
        dxn $$12 = $$0.b();
        is $$22 = $$0.e();
        fba $$3 = $$0.f();
        bgr $$4 = $$0.d();
        OptionalInt $$5 = ezl.a($$12, $$22, $$3);
        if ($$5.isEmpty()) {
            return false;
        }
        is $$6 = $$22.h($$5.getAsInt());
        ffg $$8 = ffg.a((jy)$$6.b($$7 = new jy($$3.c, $$3.c, $$3.c)), (jy)$$6.a($$7));
        return is.a($$8).filter($$2 -> $$4.i() < $$1.d).filter($$1 -> this.b($$12, (is)$$1)).mapToInt($$1 -> {
            $$12.a((is)$$1, dzs.lF.m(), 2);
            return 1;
        }).sum() > 0;
    }

    private static OptionalInt a(dxn $$02, is $$1, fba $$2) {
        Predicate<eoh> $$3 = $$0 -> $$0.a(dzs.J);
        Predicate<eoh> $$4 = $$0 -> !$$0.a(dzs.J);
        Optional<eug> $$5 = eug.a($$02, $$1, $$2.b, $$3, $$4);
        return $$5.map(eug::c).orElseGet(OptionalInt::empty);
    }

    private boolean b(dxn $$0, is $$1) {
        if (ezl.c($$0.a_($$1)) || this.a($$0, $$1.e(), iz.b)) {
            return false;
        }
        for (iz $$2 : iz.c.a) {
            if (!this.a($$0, $$1.a($$2), $$2.g())) continue;
            return false;
        }
        return true;
    }

    private static boolean c(eoh $$0) {
        return $$0.a(dzs.J) || $$0.l();
    }

    private boolean a(dwp $$0, is $$1, iz $$2) {
        eoh $$3 = $$0.a_($$1);
        fug $$4 = $$3.a($$2);
        return $$4 == fud.a() || !dzq.a($$4);
    }
}


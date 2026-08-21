/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class ehu
extends dzq {
    public static final MapCodec<ehu> a = ehu.b(ehu::new);
    public static final int b = 6;
    public static final int c = 64;
    private static final iz[] d = iz.values();

    public MapCodec<ehu> a() {
        return a;
    }

    protected ehu(eog.d $$0) {
        super($$0);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        if ($$3.a($$0.b())) {
            return;
        }
        this.a($$1, $$2);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        this.a($$1, $$2);
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    protected void a(dwo $$0, is $$1) {
        if (this.b($$0, $$1)) {
            $$0.a($$1, dzs.aW.m(), 2);
            $$0.a(null, $$1, bda.Co, bdb.e, 1.0f, 1.0f);
        }
    }

    private boolean b(dwo $$02, is $$12) {
        return is.a($$12, 6, 65, (is $$0, Consumer<is> $$1) -> {
            for (iz $$2 : d) {
                $$1.accept($$0.a($$2));
            }
        }, $$2 -> {
            dzy $$6;
            if ($$2.equals($$12)) {
                return is.b.a;
            }
            eoh $$3 = $$02.a_((is)$$2);
            flb $$4 = $$02.b_((is)$$2);
            if (!$$4.a(bdv.a)) {
                return is.b.b;
            }
            dzq $$5 = $$3.b();
            if ($$5 instanceof dzy && !($$6 = (dzy)((Object)$$5)).a(null, $$02, (is)$$2, $$3).f()) {
                return is.b.a;
            }
            if ($$3.b() instanceof eeo) {
                $$02.a((is)$$2, dzs.a.m(), 3);
            } else if ($$3.a(dzs.mY) || $$3.a(dzs.mZ) || $$3.a(dzs.bG) || $$3.a(dzs.bH)) {
                elb $$7 = $$3.x() ? $$02.c_((is)$$2) : null;
                ehu.a($$3, $$02, $$2, $$7);
                $$02.a((is)$$2, dzs.a.m(), 3);
            } else {
                return is.b.b;
            }
            return is.b.a;
        }) > 1;
    }
}


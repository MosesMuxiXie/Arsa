/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fcp
extends fcy {
    public static final MapCodec<fcp> a = fcd.a.fieldOf("provider").xmap(fcp::new, $$0 -> $$0.b);
    private final fcd b;

    public fcp(fcd $$0) {
        this.b = $$0;
    }

    @Override
    protected fcz<?> a() {
        return fcz.g;
    }

    @Override
    public void a(fcy.a $$0) {
        List<is> $$12 = ezj.a($$0);
        if ($$12.isEmpty()) {
            return;
        }
        int $$2 = $$12.get(0).v();
        $$12.stream().filter($$1 -> $$1.v() == $$2).forEach($$1 -> {
            this.a($$0, $$1.h().f());
            this.a($$0, $$1.g(2).f());
            this.a($$0, $$1.h().e(2));
            this.a($$0, $$1.g(2).e(2));
            for (int $$2 = 0; $$2 < 5; ++$$2) {
                int $$3 = $$0.b().a(64);
                int $$4 = $$3 % 8;
                int $$5 = $$3 / 8;
                if ($$4 != 0 && $$4 != 7 && $$5 != 0 && $$5 != 7) continue;
                this.a($$0, $$1.b(-3 + $$4, 0, -3 + $$5));
            }
        });
    }

    private void a(fcy.a $$0, is $$1) {
        for (int $$2 = -2; $$2 <= 2; ++$$2) {
            for (int $$3 = -2; $$3 <= 2; ++$$3) {
                if (Math.abs($$2) == 2 && Math.abs($$3) == 2) continue;
                this.b($$0, $$1.b($$2, 0, $$3));
            }
        }
    }

    private void b(fcy.a $$0, is $$1) {
        for (int $$2 = 2; $$2 >= -3; --$$2) {
            is $$3 = $$1.b($$2);
            if (exx.a($$0.a(), $$3)) {
                $$0.a($$3, this.b.a($$0.b(), $$1));
                break;
            }
            if (!$$0.a($$3) && $$2 < 0) break;
        }
    }
}


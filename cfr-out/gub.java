/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class gub {
    private static final int a = 30;
    private static final int b = 16;
    private static final int c = 4;
    private final int d;
    private List<amo> e = List.of();
    private int f;
    private int g;

    public gub(int $$0) {
        this.d = $$0;
    }

    public void a(List<amo> $$0) {
        if (!this.e.equals($$0)) {
            this.e = $$0;
            this.g = 0;
        }
        if (!this.e.isEmpty() && ++this.f % 30 == 0) {
            this.g = (this.g + 1) % this.e.size();
        }
    }

    public void a(dhi $$0, gir $$1, float $$2, int $$3, int $$4) {
        float $$7;
        dji $$5 = $$0.b(this.d);
        if (this.e.isEmpty() || $$5.h()) {
            return;
        }
        boolean $$6 = this.e.size() > 1 && this.f >= 30;
        float f2 = $$7 = $$6 ? this.a($$2) : 1.0f;
        if ($$7 < 1.0f) {
            int $$8 = Math.floorMod(this.g - 1, this.e.size());
            this.a($$5, this.e.get($$8), 1.0f - $$7, $$1, $$3, $$4);
        }
        this.a($$5, this.e.get(this.g), $$7, $$1, $$3, $$4);
    }

    private void a(dji $$0, amo $$1, float $$2, gir $$3, int $$4, int $$5) {
        $$3.a(hpa.at, $$1, $$4 + $$0.e, $$5 + $$0.f, 16, 16, bel.b($$2));
    }

    private float a(float $$0) {
        float $$1 = (float)(this.f % 30) + $$0;
        return Math.min($$1, 4.0f) / 4.0f;
    }
}


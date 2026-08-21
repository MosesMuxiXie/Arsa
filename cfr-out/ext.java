/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class ext
extends exx<faj> {
    public ext(Codec<faj> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<faj> $$0) {
        dxn $$1 = $$0.b();
        bgr $$2 = $$0.d();
        is $$3 = $$0.e();
        float $$4 = (float)$$2.a(3) + 4.0f;
        int $$5 = 0;
        while ($$4 > 0.5f) {
            for (int $$6 = bgj.b(-$$4); $$6 <= bgj.d($$4); ++$$6) {
                for (int $$7 = bgj.b(-$$4); $$7 <= bgj.d($$4); ++$$7) {
                    if (!((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0f) * ($$4 + 1.0f))) continue;
                    this.a($$1, $$3.b($$6, $$5, $$7), dzs.go.m());
                }
            }
            $$4 -= (float)$$2.a(2) + 0.5f;
            --$$5;
        }
        return true;
    }
}


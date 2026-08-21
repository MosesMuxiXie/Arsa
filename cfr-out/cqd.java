/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cqd
extends cpm {
    public static final float i = 0.001f;
    protected final float j;

    public cqd(cht $$0, double $$1) {
        this($$0, $$1, 0.001f);
    }

    public cqd(cht $$0, double $$1, float $$2) {
        super($$0, $$1);
        this.j = $$2;
    }

    @Override
    protected @Nullable ftm h() {
        if (this.b.by()) {
            ftm $$0 = csr.a(this.b, 15, 7);
            return $$0 == null ? super.h() : $$0;
        }
        if (this.b.ep().i() >= this.j) {
            return csr.a(this.b, 10, 7);
        }
        return super.h();
    }
}


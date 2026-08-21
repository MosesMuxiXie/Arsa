/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface czq
extends dac {
    public void b(boolean var1);

    public @Nullable chl ag_();

    public void a();

    default public void b(chl $$0, float $$1) {
        cdb $$2 = dee.a($$0, dlx.yz);
        dlt $$3 = $$0.b($$2);
        dlp dlp2 = $$3.h();
        if (dlp2 instanceof dkm) {
            dkm $$4 = (dkm)dlp2;
            $$4.a($$0.ao(), $$0, $$2, $$3, $$1, (float)(14 - $$0.ao().av().a() * 4), this.ag_());
        }
        this.a();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import org.jspecify.annotations.Nullable;

public class ddu {
    private final ddt<jd<dlp>> a = new ddt();

    public void a(dlt $$0) {
        if (ddl.e($$0)) {
            this.b($$0);
        }
    }

    public void b(dlt $$0) {
        this.a($$0, $$0.k());
    }

    public void a(dlt $$0, int $$1) {
        if (!$$0.f()) {
            int $$2 = Math.min($$1, $$0.N());
            this.a.a($$0.i(), $$2);
        }
    }

    public boolean a(dqs<?> $$0, @Nullable ddt.b<jd<dlp>> $$1) {
        return this.a($$0, 1, $$1);
    }

    public boolean a(dqs<?> $$0, int $$1, @Nullable ddt.b<jd<dlp>> $$2) {
        dqr $$3 = $$0.aq_();
        if ($$3.c()) {
            return false;
        }
        return this.a($$3.b(), $$1, $$2);
    }

    public boolean a(List<? extends ddt.a<jd<dlp>>> $$0, @Nullable ddt.b<jd<dlp>> $$1) {
        return this.a($$0, 1, $$1);
    }

    private boolean a(List<? extends ddt.a<jd<dlp>>> $$0, int $$1, @Nullable ddt.b<jd<dlp>> $$2) {
        return this.a.a($$0, $$1, $$2);
    }

    public int b(dqs<?> $$0, @Nullable ddt.b<jd<dlp>> $$1) {
        return this.b($$0, Integer.MAX_VALUE, $$1);
    }

    public int b(dqs<?> $$0, int $$1, @Nullable ddt.b<jd<dlp>> $$2) {
        return this.a.b($$0.aq_().b(), $$1, $$2);
    }

    public void a() {
        this.a.a();
    }
}


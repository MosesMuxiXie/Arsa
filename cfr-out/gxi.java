/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class gxi
extends gxe<hji.a> {
    private static final yh A = yh.c("gui.abuseReport.name.title");
    private static final yh B = yh.c("gui.abuseReport.name.comment_box_label");
    private @Nullable gjx C;

    private gxi(gsb $$0, hjn $$1, hji.a $$2) {
        super(A, $$0, $$1, $$2);
    }

    public gxi(gsb $$0, hjn $$1, UUID $$2, String $$3) {
        this($$0, $$1, new hji.a($$2, $$3, $$1.a().b()));
    }

    public gxi(gsb $$0, hjn $$1, hji $$2) {
        this($$0, $$1, new hji.a($$2, $$1.a().b()));
    }

    @Override
    protected void p() {
        yw $$02 = yh.b(((hji)((hji.a)this.y).e()).a()).a(l.o);
        this.x.a(new gko(yh.a("gui.abuseReport.name.reporting", $$02), this.q), $$0 -> $$0.b().a(0, 8));
        this.C = this.a(280, this.q.b * 8, $$0 -> {
            ((hji.a)this.y).a((String)$$0);
            this.I();
        });
        this.x.a(goq.a(this.q, this.C, B, $$0 -> $$0.e(12)));
    }

    @Override
    public boolean b(gzc $$0) {
        if (super.b($$0)) {
            return true;
        }
        if (this.C != null) {
            return this.C.b($$0);
        }
        return false;
    }
}


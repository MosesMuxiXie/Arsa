/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class iqt
implements iqu<ipj> {
    private final List<iqu<ipj>> a = Lists.newArrayList();
    private final @Nullable yh b;

    public iqt(amo $$0, @Nullable String $$1) {
        if (w.aI) {
            yw $$2 = yh.b($$0.a());
            if ("FOR THE DEBUG!".equals($$1)) {
                $$2 = $$2.b(yh.b(" missing").a(l.m));
            }
            this.b = $$2;
        } else {
            this.b = $$1 == null ? null : yh.c($$1);
        }
    }

    @Override
    public int e() {
        int $$0 = 0;
        for (iqu<ipj> $$1 : this.a) {
            $$0 += $$1.e();
        }
        return $$0;
    }

    public ipj a(bgr $$0) {
        int $$1 = this.e();
        if (this.a.isEmpty() || $$1 == 0) {
            return iqr.b;
        }
        int $$2 = $$0.a($$1);
        for (iqu<ipj> $$3 : this.a) {
            if (($$2 -= $$3.e()) >= 0) continue;
            return $$3.b($$0);
        }
        return iqr.b;
    }

    public void a(iqu<ipj> $$0) {
        this.a.add($$0);
    }

    public @Nullable yh a() {
        return this.b;
    }

    @Override
    public void a(iqo $$0) {
        for (iqu<ipj> $$1 : this.a) {
            $$1.a($$0);
        }
    }

    @Override
    public /* synthetic */ Object b(bgr bgr2) {
        return this.a(bgr2);
    }
}


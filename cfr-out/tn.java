/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class tn
implements ua {
    private static final Logger a = LogUtils.getLogger();

    @Override
    public void a(ta $$0) {
        String $$1 = $$0.c().y();
        if ($$0.r()) {
            a.error("{} failed at {}! {}", new Object[]{$$0.b(), $$1, bhs.c($$0.n())});
        } else {
            a.warn("(optional) {} failed at {}. {}", new Object[]{$$0.b(), $$1, bhs.c($$0.n())});
        }
    }

    @Override
    public void b(ta $$0) {
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hpe {
    private static final Logger a = LogUtils.getLogger();
    private final Queue<hpd> b;
    private volatile int c;

    private hpe(List<hpd> $$0) {
        this.b = Queues.newArrayDeque($$0);
        this.c = this.b.size();
    }

    public static hpe a(int $$0) {
        int $$1 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / hpd.a);
        int $$2 = Math.max(1, Math.min($$0, $$1));
        ArrayList<hpd> $$3 = new ArrayList<hpd>($$2);
        try {
            for (int $$4 = 0; $$4 < $$2; ++$$4) {
                $$3.add(new hpd());
            }
        }
        catch (OutOfMemoryError $$5) {
            a.warn("Allocated only {}/{} buffers", (Object)$$3.size(), (Object)$$2);
            int $$6 = Math.min($$3.size() * 2 / 3, $$3.size() - 1);
            for (int $$7 = 0; $$7 < $$6; ++$$7) {
                ((hpd)$$3.remove($$3.size() - 1)).close();
            }
        }
        return new hpe($$3);
    }

    public @Nullable hpd a() {
        hpd $$0 = this.b.poll();
        if ($$0 != null) {
            this.c = this.b.size();
            return $$0;
        }
        return null;
    }

    public void a(hpd $$0) {
        this.b.add($$0);
        this.c = this.b.size();
    }

    public boolean b() {
        return this.b.isEmpty();
    }

    public int c() {
        return this.c;
    }
}


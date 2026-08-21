/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.base.Stopwatch;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;

public class mp {
    private static final Logger a = LogUtils.getLogger();
    private final Path b;
    private final ms c;
    final Set<String> d = new HashSet<String>();
    final Map<String, mq> e = new LinkedHashMap<String, mq>();
    private final aa f;
    private final boolean g;

    public mp(Path $$0, aa $$1, boolean $$2) {
        this.b = $$0;
        this.c = new ms(this.b);
        this.f = $$1;
        this.g = $$2;
    }

    public void a() throws IOException {
        mr $$0 = new mr(this.b, this.d, this.f);
        Stopwatch $$1 = Stopwatch.createStarted();
        Stopwatch $$22 = Stopwatch.createUnstarted();
        this.e.forEach(($$2, $$3) -> {
            if (!this.g && !$$0.a((String)$$2)) {
                a.debug("Generator {} already run for version {}", $$2, (Object)this.f.c());
                return;
            }
            a.info("Starting provider: {}", $$2);
            $$22.start();
            $$0.a($$0.a((String)$$2, $$3::a).join());
            $$22.stop();
            a.info("{} finished after {} ms", $$2, (Object)$$22.elapsed(TimeUnit.MILLISECONDS));
            $$22.reset();
        });
        a.info("All providers took: {} ms", (Object)$$1.elapsed(TimeUnit.MILLISECONDS));
        $$0.a();
    }

    public a a(boolean $$0) {
        return new a($$0, "vanilla", this.c);
    }

    public a a(boolean $$0, String $$1) {
        Path $$2 = this.c.a(ms.b.a).resolve("minecraft").resolve("datapacks").resolve($$1);
        return new a($$0, $$1, new ms($$2));
    }

    static {
        amv.a();
    }

    public class a {
        private final boolean b;
        private final String c;
        private final ms d;

        a(boolean $$1, String $$2, ms $$3) {
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        public <T extends mq> T a(mq.a<T> $$0) {
            T $$1 = $$0.create(this.d);
            String $$2 = this.c + "/" + $$1.a();
            if (!mp.this.d.add($$2)) {
                throw new IllegalStateException("Duplicate provider: " + $$2);
            }
            if (this.b) {
                mp.this.e.put($$2, (mq)$$1);
            }
            return $$1;
        }
    }
}


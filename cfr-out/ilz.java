/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.jspecify.annotations.Nullable;

public class ilz {
    private final amo a;
    private final bax b;
    private final AtomicReference<@Nullable fyh> c = new AtomicReference();
    private final AtomicInteger d;

    public ilz(amo $$0, bax $$1, int $$2) {
        this.a = $$0;
        this.b = $$1;
        this.d = new AtomicInteger($$2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public fyh a() throws IOException {
        fyh $$0 = this.c.get();
        if ($$0 == null) {
            ilz ilz2 = this;
            synchronized (ilz2) {
                $$0 = this.c.get();
                if ($$0 == null) {
                    try (InputStream $$1 = this.b.d();){
                        $$0 = fyh.a($$1);
                        this.c.set($$0);
                    }
                    catch (IOException $$2) {
                        throw new IOException("Failed to load image " + String.valueOf(this.a), $$2);
                    }
                }
            }
        }
        return $$0;
    }

    public void b() {
        fyh $$1;
        int $$0 = this.d.decrementAndGet();
        if ($$0 <= 0 && ($$1 = (fyh)this.c.getAndSet(null)) != null) {
            $$1.close();
        }
    }
}


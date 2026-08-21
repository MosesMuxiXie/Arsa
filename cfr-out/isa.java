/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import java.util.Objects;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class isa {
    static final Logger a = LogUtils.getLogger();
    final gsb b;
    volatile boolean c;
    @Nullable wu d;

    public isa(gsb $$0) {
        this.b = $$0;
    }

    public void a(final gbg $$0, hjw $$1) {
        final gfj $$2 = gfj.V();
        $$2.aX();
        $$2.aZ().d(yh.c("mco.connect.success"));
        final String $$3 = $$1.a();
        final int $$4 = $$1.b();
        new Thread("Realms-connect-task"){

            @Override
            public void run() {
                InetSocketAddress $$02 = null;
                try {
                    $$02 = new InetSocketAddress($$3, $$4);
                    if (isa.this.c) {
                        return;
                    }
                    isa.this.d = wu.a($$02, axw.a($$2.k.aU()), $$2.aT().k());
                    if (isa.this.c) {
                        return;
                    }
                    hie $$1 = new hie(isa.this.d, $$2, $$0.c($$3), isa.this.b, false, null, $$0 -> {}, new hin(), null);
                    if ($$0.j()) {
                        $$1.a($$0.r);
                    }
                    if (isa.this.c) {
                        return;
                    }
                    isa.this.d.a($$3, $$4, $$1);
                    if (isa.this.c) {
                        return;
                    }
                    isa.this.d.a(new aky($$2.ac().c(), $$2.ac().b()));
                    $$2.a(hjk.a($$0));
                    $$2.bd().a(hnq.c.c, String.valueOf($$0.b), Objects.requireNonNullElse($$0.d, "unknown"));
                    $$2.ak().a(isa.this.d, ioq.c.b);
                }
                catch (Exception $$22) {
                    $$2.ak().i();
                    if (isa.this.c) {
                        return;
                    }
                    a.error("Couldn't connect to world", (Throwable)$$22);
                    String $$32 = $$22.toString();
                    if ($$02 != null) {
                        String $$42 = String.valueOf($$02) + ":" + $$4;
                        $$32 = $$32.replaceAll($$42, "");
                    }
                    grj $$5 = new grj(isa.this.b, (yh)yh.c("mco.connect.failed"), yh.a("disconnect.genericReason", new Object[]{$$32}), yg.k);
                    $$2.execute(() -> $$2.a($$5));
                }
            }
        }.start();
    }

    public void a() {
        this.c = true;
        if (this.d != null && this.d.i()) {
            this.d.a(yh.c("disconnect.genericReason"));
            this.d.n();
        }
    }

    public void b() {
        if (this.d != null) {
            if (this.d.i()) {
                this.d.b();
            } else {
                this.d.n();
            }
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.PrintStream;
import java.time.Duration;
import java.time.Instant;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.Supplier;
import org.slf4j.Logger;

@x(a="System.out setup")
public class amv {
    public static final PrintStream a = System.out;
    private static volatile boolean c;
    private static final Logger d;
    public static final AtomicLong b;

    public static void a() {
        if (c) {
            return;
        }
        c = true;
        Instant $$0 = Instant.now();
        if (mi.aR.i().isEmpty()) {
            throw new IllegalStateException("Unable to load registries");
        }
        ecv.b();
        ebc.b();
        if (cgu.a(cgu.cb) == null) {
            throw new IllegalStateException("Failed loading EntityTypes");
        }
        gy.a();
        lg.a();
        ka.a();
        mi.a();
        dkl.a();
        amv.d();
        b.set(Duration.between($$0, Instant.now()).toMillis());
    }

    private static <T> void a(Iterable<T> $$0, Function<T, String> $$1, Set<String> $$2) {
        uu $$32 = uu.a();
        $$0.forEach($$3 -> {
            String $$4 = (String)$$1.apply($$3);
            if (!$$32.b($$4)) {
                $$2.add($$4);
            }
        });
    }

    private static void a(final Set<String> $$0) {
        final uu $$1 = uu.a();
        eua $$2 = new eua(dhb.e.a());
        $$2.a(new etz(){

            @Override
            public <T> void a(etv<T> $$02) {
                if (!$$1.b($$02.c())) {
                    $$0.add($$02.a());
                }
            }
        });
    }

    public static Set<String> b() {
        TreeSet<String> $$02 = new TreeSet<String>();
        amv.a(mi.t, cin::c, $$02);
        amv.a(mi.g, cgu::g, $$02);
        amv.a(mi.d, cfk::f, $$02);
        amv.a(mi.h, dlp::j, $$02);
        amv.a(mi.e, eog::z, $$02);
        amv.a(mi.l, $$0 -> "stat." + $$0.toString().replace(':', '.'), $$02);
        amv.a($$02);
        return $$02;
    }

    public static void a(Supplier<String> $$0) {
        if (!c) {
            throw amv.b($$0);
        }
    }

    private static RuntimeException b(Supplier<String> $$0) {
        try {
            String $$1 = $$0.get();
            return new IllegalArgumentException("Not bootstrapped (called from " + $$1 + ")");
        }
        catch (Exception $$2) {
            IllegalArgumentException $$3 = new IllegalArgumentException("Not bootstrapped (failed to resolve location)");
            $$3.addSuppressed($$2);
            return $$3;
        }
    }

    public static void c() {
        amv.a(() -> "validate");
        if (w.aX) {
            amv.b().forEach($$0 -> d.error("Missing translations: {}", $$0));
            ee.b();
        }
        cit.a();
    }

    private static void d() {
        if (d.isDebugEnabled()) {
            System.setErr(new amy("STDERR", System.err));
            System.setOut(new amy("STDOUT", a));
        } else {
            System.setErr(new ana("STDERR", System.err));
            System.setOut(new ana("STDOUT", a));
        }
    }

    public static void a(String $$0) {
        a.println($$0);
    }

    static {
        d = LogUtils.getLogger();
        b = new AtomicLong(-1L);
    }
}


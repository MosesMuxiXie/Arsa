/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Streams
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Streams;
import com.mojang.logging.LogUtils;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class asb
implements Runnable {
    private static final Logger a = LogUtils.getLogger();
    private static final long b = 10000L;
    private static final int c = 1;
    private final ary d;
    private final long e;

    public asb(ary $$0) {
        this.d = $$0;
        this.e = $$0.bF() * bhn.b;
    }

    @Override
    public void run() {
        while (this.d.z()) {
            long $$0 = this.d.az();
            long $$1 = bhs.d();
            long $$2 = $$1 - $$0;
            if ($$2 > this.e) {
                a.error(LogUtils.FATAL_MARKER, "A single server tick took {} seconds (should be max {})", (Object)String.format(Locale.ROOT, "%.2f", Float.valueOf((float)$$2 / (float)bhn.a)), (Object)String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d.aR().g() / (float)bhn.c)));
                a.error(LogUtils.FATAL_MARKER, "Considering it to be crashed, server will forcibly shutdown.");
                m $$3 = asb.a("Watching Server", this.d.aw().threadId());
                this.d.b($$3.f());
                n $$4 = $$3.a("Performance stats");
                $$4.a("Random tick rate", () -> this.d.bb().n().b(eua.O));
                $$4.a("Level stats", () -> Streams.stream(this.d.P()).map($$0 -> String.valueOf($$0.aq().a()) + ": " + $$0.L()).collect(Collectors.joining(",\n")));
                amv.a("Crash report:\n" + $$3.a(u.a));
                Path $$5 = this.d.G().resolve("crash-reports").resolve("crash-" + bhs.f() + "-server.txt");
                if ($$3.a($$5, u.a)) {
                    a.error("This crash report has been saved to: {}", (Object)$$5.toAbsolutePath());
                } else {
                    a.error("We were unable to save this crash report to disk.");
                }
                this.a();
            }
            try {
                Thread.sleep(($$0 + this.e - $$1) / bhn.b);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    public static m a(String $$0, long $$1) {
        ThreadMXBean $$2 = ManagementFactory.getThreadMXBean();
        ThreadInfo[] $$3 = $$2.dumpAllThreads(true, true);
        StringBuilder $$4 = new StringBuilder();
        Error $$5 = new Error("Watchdog");
        for (ThreadInfo $$6 : $$3) {
            if ($$6.getThreadId() == $$1) {
                $$5.setStackTrace($$6.getStackTrace());
            }
            $$4.append($$6);
            $$4.append("\n");
        }
        m $$7 = new m($$0, $$5);
        n $$8 = $$7.a("Thread Dump");
        $$8.a("Threads", $$4);
        return $$7;
    }

    private void a() {
        try {
            Timer $$0 = new Timer();
            $$0.schedule(new TimerTask(this){

                @Override
                public void run() {
                    Runtime.getRuntime().halt(1);
                }
            }, 10000L);
            System.exit(1);
        }
        catch (Throwable $$1) {
            Runtime.getRuntime().halt(1);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.jtracy.Plot
 *  com.mojang.jtracy.TracyClient
 *  com.mojang.jtracy.Zone
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.jtracy.Plot;
import com.mojang.jtracy.TracyClient;
import com.mojang.jtracy.Zone;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class bzq
implements bzm {
    private static final Logger a = LogUtils.getLogger();
    private static final StackWalker c = StackWalker.getInstance(Set.of(StackWalker.Option.RETAIN_CLASS_REFERENCE), 5);
    private final List<Zone> d = new ArrayList<Zone>();
    private final Map<String, a> e = new HashMap<String, a>();
    private final String f = Thread.currentThread().getName();

    @Override
    public void a() {
    }

    @Override
    public void b() {
        for (a $$0 : this.e.values()) {
            $$0.a(0);
        }
    }

    @Override
    public void a(String $$0) {
        Optional $$4;
        String $$1 = "";
        String $$2 = "";
        int $$3 = 0;
        if (w.aX && ($$4 = c.walk($$02 -> $$02.filter($$0 -> $$0.getDeclaringClass() != bzq.class && $$0.getDeclaringClass() != bzm.a.class).findFirst())).isPresent()) {
            StackWalker.StackFrame $$5 = (StackWalker.StackFrame)$$4.get();
            $$1 = $$5.getMethodName();
            $$2 = $$5.getFileName();
            $$3 = $$5.getLineNumber();
        }
        Zone $$6 = TracyClient.beginZone((String)$$0, (String)$$1, (String)$$2, (int)$$3);
        this.d.add($$6);
    }

    @Override
    public void a(Supplier<String> $$0) {
        this.a($$0.get());
    }

    @Override
    public void c() {
        if (this.d.isEmpty()) {
            a.error("Tried to pop one too many times! Mismatched push() and pop()?");
            return;
        }
        Zone $$0 = this.d.removeLast();
        $$0.close();
    }

    @Override
    public void b(String $$0) {
        this.c();
        this.a($$0);
    }

    @Override
    public void b(Supplier<String> $$0) {
        this.c();
        this.a($$0.get());
    }

    @Override
    public void a(caw $$0) {
    }

    @Override
    public void a(String $$0, int $$12) {
        this.e.computeIfAbsent($$0, $$1 -> new a(this.f + " " + $$0)).b($$12);
    }

    @Override
    public void a(Supplier<String> $$0, int $$1) {
        this.a($$0.get(), $$1);
    }

    private Zone d() {
        return this.d.getLast();
    }

    @Override
    public void e(String $$0) {
        this.d().addText($$0);
    }

    @Override
    public void a(long $$0) {
        this.d().addValue($$0);
    }

    @Override
    public void a(int $$0) {
        this.d().setColor($$0);
    }

    static final class a {
        private final Plot a;
        private int b;

        a(String $$0) {
            this.a = TracyClient.createPlot((String)$$0);
            this.b = 0;
        }

        void a(int $$0) {
            this.b = $$0;
            this.a.setValue((double)$$0);
        }

        void b(int $$0) {
            this.a(this.b + $$0);
        }
    }
}


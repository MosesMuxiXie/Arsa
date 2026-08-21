/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2LongMap
 *  it.unimi.dsi.fastutil.objects.Object2LongMaps
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.ObjectUtils
 *  org.slf4j.Logger
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongMaps;
import java.io.BufferedWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;

public class bzh
implements bzk {
    private static final Logger a = LogUtils.getLogger();
    private static final bzn b = new bzn(){

        @Override
        public long a() {
            return 0L;
        }

        @Override
        public long b() {
            return 0L;
        }

        @Override
        public long c() {
            return 0L;
        }

        @Override
        public Object2LongMap<String> d() {
            return Object2LongMaps.emptyMap();
        }
    };
    private static final Splitter c = Splitter.on((char)'\u001e');
    private static final Comparator<Map.Entry<String, a>> e = Map.Entry.comparingByValue(Comparator.comparingLong($$0 -> $$0.b)).reversed();
    private final Map<String, ? extends bzn> f;
    private final long g;
    private final int h;
    private final long i;
    private final int j;
    private final int k;

    public bzh(Map<String, ? extends bzn> $$0, long $$1, int $$2, long $$3, int $$4) {
        this.f = $$0;
        this.g = $$1;
        this.h = $$2;
        this.i = $$3;
        this.j = $$4;
        this.k = $$4 - $$2;
    }

    private bzn c(String $$0) {
        bzn $$1 = this.f.get($$0);
        return $$1 != null ? $$1 : b;
    }

    @Override
    public List<bzo> a(String $$0) {
        String $$1 = $$0;
        bzn $$2 = this.c("root");
        long $$3 = $$2.a();
        bzn $$4 = this.c((String)$$0);
        long $$5 = $$4.a();
        long $$6 = $$4.c();
        ArrayList $$7 = Lists.newArrayList();
        if (!((String)$$0).isEmpty()) {
            $$0 = (String)$$0 + "\u001e";
        }
        long $$8 = 0L;
        for (String $$9 : this.f.keySet()) {
            if (!bzh.a((String)$$0, $$9)) continue;
            $$8 += this.c($$9).a();
        }
        float $$10 = $$8;
        if ($$8 < $$5) {
            $$8 = $$5;
        }
        if ($$3 < $$8) {
            $$3 = $$8;
        }
        for (String $$11 : this.f.keySet()) {
            if (!bzh.a((String)$$0, $$11)) continue;
            bzn $$12 = this.c($$11);
            long $$13 = $$12.a();
            double $$14 = (double)$$13 * 100.0 / (double)$$8;
            double $$15 = (double)$$13 * 100.0 / (double)$$3;
            String $$16 = $$11.substring(((String)$$0).length());
            $$7.add(new bzo($$16, $$14, $$15, $$12.c()));
        }
        if ((float)$$8 > $$10) {
            $$7.add(new bzo("unspecified", (double)((float)$$8 - $$10) * 100.0 / (double)$$8, (double)((float)$$8 - $$10) * 100.0 / (double)$$3, $$6));
        }
        Collections.sort($$7);
        $$7.add(0, new bzo($$1, 100.0, (double)$$8 * 100.0 / (double)$$3, $$6));
        return $$7;
    }

    private static boolean a(String $$0, String $$1) {
        return $$1.length() > $$0.length() && $$1.startsWith($$0) && $$1.indexOf(30, $$0.length() + 1) < 0;
    }

    private Map<String, a> h() {
        TreeMap $$0 = Maps.newTreeMap();
        this.f.forEach(($$1, $$22) -> {
            Object2LongMap<String> $$32 = $$22.d();
            if (!$$32.isEmpty()) {
                List $$4 = c.splitToList((CharSequence)$$1);
                $$32.forEach(($$2, $$3) -> $$0.computeIfAbsent($$2, $$0 -> new a()).a($$4.iterator(), $$3));
            }
        });
        return $$0;
    }

    @Override
    public long a() {
        return this.g;
    }

    @Override
    public int b() {
        return this.h;
    }

    @Override
    public long c() {
        return this.i;
    }

    @Override
    public int d() {
        return this.j;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(Path $$0) {
        boolean bl2;
        BufferedWriter $$1 = null;
        try {
            Files.createDirectories($$0.getParent(), new FileAttribute[0]);
            $$1 = Files.newBufferedWriter($$0, StandardCharsets.UTF_8, new OpenOption[0]);
            $$1.write(this.a(this.g(), this.f()));
            bl2 = true;
        }
        catch (Throwable $$2) {
            boolean bl3;
            try {
                a.error("Could not save profiler results to {}", (Object)$$0, (Object)$$2);
                bl3 = false;
            }
            catch (Throwable throwable) {
                IOUtils.closeQuietly($$1);
                throw throwable;
            }
            IOUtils.closeQuietly((Writer)$$1);
            return bl3;
        }
        IOUtils.closeQuietly((Writer)$$1);
        return bl2;
    }

    protected String a(long $$0, int $$1) {
        StringBuilder $$2 = new StringBuilder();
        u.b.a($$2, List.of());
        $$2.append("Version: ").append(w.b().b()).append('\n');
        $$2.append("Time span: ").append($$0 / 1000000L).append(" ms\n");
        $$2.append("Tick span: ").append($$1).append(" ticks\n");
        $$2.append("// This is approximately ").append(String.format(Locale.ROOT, "%.2f", Float.valueOf((float)$$1 / ((float)$$0 / 1.0E9f)))).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
        $$2.append("--- BEGIN PROFILE DUMP ---\n\n");
        this.a(0, "root", $$2);
        $$2.append("--- END PROFILE DUMP ---\n\n");
        Map<String, a> $$3 = this.h();
        if (!$$3.isEmpty()) {
            $$2.append("--- BEGIN COUNTER DUMP ---\n\n");
            this.a($$3, $$2, $$1);
            $$2.append("--- END COUNTER DUMP ---\n\n");
        }
        return $$2.toString();
    }

    @Override
    public String e() {
        StringBuilder $$0 = new StringBuilder();
        this.a(0, "root", $$0);
        return $$0.toString();
    }

    private static StringBuilder a(StringBuilder $$0, int $$1) {
        $$0.append(String.format(Locale.ROOT, "[%02d] ", $$1));
        for (int $$2 = 0; $$2 < $$1; ++$$2) {
            $$0.append("|   ");
        }
        return $$0;
    }

    private void a(int $$0, String $$1, StringBuilder $$22) {
        List<bzo> $$32 = this.a($$1);
        Object2LongMap<String> $$4 = ((bzn)ObjectUtils.firstNonNull((Object[])new bzn[]{this.f.get($$1), b})).d();
        $$4.forEach(($$2, $$3) -> bzh.a($$22, $$0).append('#').append((String)$$2).append(' ').append($$3).append('/').append($$3 / (long)this.k).append('\n'));
        if ($$32.size() < 3) {
            return;
        }
        for (int $$5 = 1; $$5 < $$32.size(); ++$$5) {
            bzo $$6 = $$32.get($$5);
            bzh.a($$22, $$0).append($$6.d).append('(').append($$6.c).append('/').append(String.format(Locale.ROOT, "%.0f", Float.valueOf((float)$$6.c / (float)this.k))).append(')').append(" - ").append(String.format(Locale.ROOT, "%.2f", $$6.a)).append("%/").append(String.format(Locale.ROOT, "%.2f", $$6.b)).append("%\n");
            if ("unspecified".equals($$6.d)) continue;
            try {
                this.a($$0 + 1, $$1 + "\u001e" + $$6.d, $$22);
                continue;
            }
            catch (Exception $$7) {
                $$22.append("[[ EXCEPTION ").append($$7).append(" ]]");
            }
        }
    }

    private void a(int $$0, String $$1, a $$2, int $$32, StringBuilder $$4) {
        bzh.a($$4, $$0).append($$1).append(" total:").append($$2.a).append('/').append($$2.b).append(" average: ").append($$2.a / (long)$$32).append('/').append($$2.b / (long)$$32).append('\n');
        $$2.c.entrySet().stream().sorted(e).forEach($$3 -> this.a($$0 + 1, (String)$$3.getKey(), (a)$$3.getValue(), $$32, $$4));
    }

    private void a(Map<String, a> $$0, StringBuilder $$1, int $$22) {
        $$0.forEach(($$2, $$3) -> {
            $$1.append("-- Counter: ").append((String)$$2).append(" --\n");
            this.a(0, "root", $$3.c.get("root"), $$22, $$1);
            $$1.append("\n\n");
        });
    }

    @Override
    public int f() {
        return this.k;
    }

    static class a {
        long a;
        long b;
        final Map<String, a> c = Maps.newHashMap();

        a() {
        }

        public void a(Iterator<String> $$02, long $$1) {
            this.b += $$1;
            if (!$$02.hasNext()) {
                this.a += $$1;
            } else {
                this.c.computeIfAbsent($$02.next(), $$0 -> new a()).a($$02, $$1);
            }
        }
    }
}


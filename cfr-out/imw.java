/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class imw
implements bba {
    private static final Logger a = LogUtils.getLogger();
    private static final imv b = new imv("US", "English", false);
    private Map<String, imv> c = ImmutableMap.of((Object)"en_us", (Object)b);
    private String d;
    private final Consumer<ims> e;

    public imw(String $$0, Consumer<ims> $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    private static Map<String, imv> a(Stream<azl> $$0) {
        HashMap $$12 = Maps.newHashMap();
        $$0.forEach($$1 -> {
            try {
                ing $$2 = $$1.a(ing.c);
                if ($$2 != null) {
                    $$2.a().forEach($$12::putIfAbsent);
                }
            }
            catch (IOException | RuntimeException $$3) {
                a.warn("Unable to parse language metadata section of resourcepack: {}", (Object)$$1.b(), (Object)$$3);
            }
        });
        return ImmutableMap.copyOf((Map)$$12);
    }

    @Override
    public void a(baz $$0) {
        imv $$3;
        this.c = imw.a($$0.b());
        ArrayList<String> $$1 = new ArrayList<String>(2);
        boolean $$2 = b.d();
        $$1.add("en_us");
        if (!this.d.equals("en_us") && ($$3 = this.c.get(this.d)) != null) {
            $$1.add(this.d);
            $$2 = $$3.d();
        }
        ims $$4 = ims.a($$0, $$1, $$2);
        imu.a($$4);
        uu.a($$4);
        this.e.accept($$4);
    }

    public void a(String $$0) {
        this.d = $$0;
    }

    public String a() {
        return this.d;
    }

    public SortedMap<String, imv> b() {
        return new TreeMap<String, imv>(this.c);
    }

    public @Nullable imv b(String $$0) {
        return this.c.get($$0);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonIOException
 *  com.google.gson.JsonParseException
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class anb {
    private static final Logger a = LogUtils.getLogger();
    private static final Gson b = new GsonBuilder().setPrettyPrinting().create();
    private final bbz c;
    private final Path d;
    private ah e;
    private final Map<ac, ae> f = new LinkedHashMap<ac, ae>();
    private final Set<ac> g = new HashSet<ac>();
    private final Set<ac> h = new HashSet<ac>();
    private final Set<ad> i = new HashSet<ad>();
    private axg j;
    private @Nullable ac k;
    private boolean l = true;
    private final Codec<a> m;

    public anb(DataFixer $$0, bbz $$1, ang $$2, Path $$3, axg $$4) {
        this.c = $$1;
        this.d = $$3;
        this.j = $$4;
        this.e = $$2.a();
        int $$5 = 1343;
        this.m = bhz.s.a(anb$a.a, $$0, 1343);
        this.d($$2);
    }

    public void a(axg $$0) {
        this.j = $$0;
    }

    public void a() {
        for (am am2 : mi.ak) {
            am2.a(this);
        }
    }

    public void a(ang $$0) {
        this.a();
        this.f.clear();
        this.g.clear();
        this.i.clear();
        this.h.clear();
        this.l = true;
        this.k = null;
        this.e = $$0.a();
        this.d($$0);
    }

    private void b(ang $$0) {
        for (ac $$1 : $$0.b()) {
            this.d($$1);
        }
    }

    private void c(ang $$0) {
        for (ac $$1 : $$0.b()) {
            ab $$2 = $$1.b();
            if (!$$2.e().isEmpty()) continue;
            this.a($$1, "");
            $$2.d().a(this.j);
        }
    }

    private void d(ang $$0) {
        if (Files.isRegularFile(this.d, new LinkOption[0])) {
            try (BufferedReader $$1 = Files.newBufferedReader(this.d, StandardCharsets.UTF_8);){
                JsonElement $$2 = bhf.a($$1);
                a $$3 = (a)this.m.parse((DynamicOps)JsonOps.INSTANCE, (Object)$$2).getOrThrow(JsonParseException::new);
                this.a($$0, $$3);
            }
            catch (JsonIOException | IOException $$4) {
                a.error("Couldn't access player advancements in {}", (Object)this.d, (Object)$$4);
            }
            catch (JsonParseException $$5) {
                a.error("Couldn't parse player advancements in {}", (Object)this.d, (Object)$$5);
            }
        }
        this.c($$0);
        this.b($$0);
    }

    public void b() {
        JsonElement $$0 = (JsonElement)this.m.encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)this.c()).getOrThrow();
        try {
            bfp.c(this.d.getParent());
            try (BufferedWriter $$1 = Files.newBufferedWriter(this.d, StandardCharsets.UTF_8, new OpenOption[0]);){
                b.toJson($$0, b.newJsonWriter((Writer)$$1));
            }
        }
        catch (JsonIOException | IOException $$2) {
            a.error("Couldn't save player advancements to {}", (Object)this.d, (Object)$$2);
        }
    }

    private void a(ang $$0, a $$12) {
        $$12.a((amo $$1, ae $$2) -> {
            ac $$3 = $$0.a((amo)$$1);
            if ($$3 == null) {
                a.warn("Ignored advancement '{}' in progress file {} - it doesn't exist anymore?", $$1, (Object)this.d);
                return;
            }
            this.a($$3, (ae)$$2);
            this.h.add($$3);
            this.c($$3);
        });
    }

    private a c() {
        LinkedHashMap<amo, ae> $$0 = new LinkedHashMap<amo, ae>();
        this.f.forEach(($$1, $$2) -> {
            if ($$2.b()) {
                $$0.put($$1.a(), (ae)$$2);
            }
        });
        return new a($$0);
    }

    public boolean a(ac $$0, String $$12) {
        boolean $$2 = false;
        ae $$3 = this.b($$0);
        boolean $$4 = $$3.a();
        if ($$3.a($$12)) {
            this.e($$0);
            this.h.add($$0);
            $$2 = true;
            if (!$$4 && $$3.a()) {
                $$0.b().d().a(this.j);
                $$0.b().c().ifPresent($$1 -> {
                    if ($$1.i() && this.j.A().U().a(eua.S).booleanValue()) {
                        this.c.a($$1.e().a($$0, this.j), false);
                    }
                });
            }
        }
        if (!$$4 && $$3.a()) {
            this.c($$0);
        }
        return $$2;
    }

    public boolean b(ac $$0, String $$1) {
        boolean $$2 = false;
        ae $$3 = this.b($$0);
        boolean $$4 = $$3.a();
        if ($$3.b($$1)) {
            this.d($$0);
            this.h.add($$0);
            $$2 = true;
        }
        if ($$4 && !$$3.a()) {
            this.c($$0);
        }
        return $$2;
    }

    private void c(ac $$0) {
        ad $$1 = this.e.a($$0);
        if ($$1 != null) {
            this.i.add($$1.d());
        }
    }

    private void d(ac $$0) {
        ae $$1 = this.b($$0);
        if ($$1.a()) {
            return;
        }
        for (Map.Entry<String, ak<?>> $$2 : $$0.b().e().entrySet()) {
            al $$3 = $$1.c($$2.getKey());
            if ($$3 == null || $$3.a()) continue;
            this.a($$0, $$2.getKey(), $$2.getValue());
        }
    }

    private <T extends an> void a(ac $$0, String $$1, ak<T> $$2) {
        $$2.a().a(this, new am.a<T>($$2.b(), $$0, $$1));
    }

    private void e(ac $$0) {
        ae $$1 = this.b($$0);
        for (Map.Entry<String, ak<?>> $$2 : $$0.b().e().entrySet()) {
            al $$3 = $$1.c($$2.getKey());
            if ($$3 == null || !$$3.a() && !$$1.a()) continue;
            this.b($$0, $$2.getKey(), $$2.getValue());
        }
    }

    private <T extends an> void b(ac $$0, String $$1, ak<T> $$2) {
        $$2.a().b(this, new am.a<T>($$2.b(), $$0, $$1));
    }

    public void a(axg $$0, boolean $$1) {
        if (this.l || !this.i.isEmpty() || !this.h.isEmpty()) {
            HashMap<amo, ae> $$2 = new HashMap<amo, ae>();
            HashSet<ac> $$3 = new HashSet<ac>();
            HashSet<amo> $$4 = new HashSet<amo>();
            for (ad $$5 : this.i) {
                this.a($$5, $$3, $$4);
            }
            this.i.clear();
            for (ac $$6 : this.h) {
                if (!this.g.contains($$6)) continue;
                $$2.put($$6.a(), this.f.get($$6));
            }
            this.h.clear();
            if (!($$2.isEmpty() && $$3.isEmpty() && $$4.isEmpty())) {
                $$0.g.b(new aht(this.l, $$3, $$4, $$2, $$1));
            }
        }
        this.l = false;
    }

    public void a(@Nullable ac $$0) {
        ac $$1 = this.k;
        this.k = $$0 != null && $$0.b().a() && $$0.b().c().isPresent() ? $$0 : null;
        if ($$1 != this.k) {
            this.j.g.b(new agb(this.k == null ? null : this.k.a()));
        }
    }

    public ae b(ac $$0) {
        ae $$1 = this.f.get($$0);
        if ($$1 == null) {
            $$1 = new ae();
            this.a($$0, $$1);
        }
        return $$1;
    }

    private void a(ac $$0, ae $$1) {
        $$1.a($$0.b().f());
        this.f.put($$0, $$1);
    }

    private void a(ad $$02, Set<ac> $$1, Set<amo> $$22) {
        ant.a($$02, (ad $$0) -> this.b($$0.b()).a(), (ad $$2, boolean $$3) -> {
            ac $$4 = $$2.b();
            if ($$3) {
                if (this.g.add($$4)) {
                    $$1.add($$4);
                    if (this.f.containsKey($$4)) {
                        this.h.add($$4);
                    }
                }
            } else if (this.g.remove($$4)) {
                $$22.add($$4.a());
            }
        });
    }

    static final class a
    extends Record {
        private final Map<amo, ae> b;
        public static final Codec<a> a = Codec.unboundedMap(amo.a, ae.a).xmap(a::new, a::a);

        a(Map<amo, ae> $$0) {
            this.b = $$0;
        }

        public void a(BiConsumer<amo, ae> $$0) {
            this.b.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach($$1 -> $$0.accept((amo)$$1.getKey(), (ae)$$1.getValue()));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "map", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "map", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "map", "b"}, this, $$0);
        }

        public Map<amo, ae> a() {
            return this.b;
        }
    }
}


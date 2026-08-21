/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class fur {
    public static final String a = "#";
    private static final Logger b = LogUtils.getLogger();
    private final Object2ObjectMap<String, fuj> c = new Object2ObjectOpenHashMap(16, 0.5f);
    private final Reference2ObjectMap<fuu, List<fuj>> d = new Reference2ObjectOpenHashMap();
    private final Map<String, ful> e = new Object2ObjectOpenHashMap(16, 0.5f);
    private final Map<fui, fuj> f = new EnumMap<fui, fuj>(fui.class);
    private final Object2ObjectMap<String, fum> g = new Object2ObjectOpenHashMap();
    private final Object2ObjectMap<String, fum> h = new Object2ObjectOpenHashMap();

    public @Nullable fuj a(@Nullable String $$0) {
        return (fuj)this.c.get((Object)$$0);
    }

    public fuj a(String $$02, fuu $$1, yh $$2, fuu.a $$3, boolean $$4, @Nullable aag $$5) {
        if (this.c.containsKey((Object)$$02)) {
            throw new IllegalArgumentException("An objective with the name '" + $$02 + "' already exists!");
        }
        fuj $$6 = new fuj(this, $$02, $$1, $$2, $$3, $$4, $$5);
        ((List)this.d.computeIfAbsent((Object)$$1, $$0 -> Lists.newArrayList())).add($$6);
        this.c.put((Object)$$02, (Object)$$6);
        this.a($$6);
        return $$6;
    }

    public final void a(fuu $$0, fuq $$1, Consumer<fup> $$22) {
        ((List)this.d.getOrDefault((Object)$$0, Collections.emptyList())).forEach($$2 -> $$22.accept(this.a($$1, (fuj)$$2, true)));
    }

    private ful f(String $$02) {
        return this.e.computeIfAbsent($$02, $$0 -> new ful());
    }

    public fup c(fuq $$0, fuj $$1) {
        return this.a($$0, $$1, false);
    }

    public fup a(final fuq $$0, final fuj $$12, boolean $$2) {
        final boolean $$3 = $$2 || !$$12.d().e();
        ful $$4 = this.f($$0.da());
        final MutableBoolean $$5 = new MutableBoolean();
        final fuo $$6 = $$4.a($$12, (fuo $$1) -> $$5.setTrue());
        return new fup(){

            @Override
            public int a() {
                return $$6.a();
            }

            @Override
            public void a(int $$02) {
                yh $$2;
                if (!$$3) {
                    throw new IllegalStateException("Cannot modify read-only score");
                }
                boolean $$1 = $$5.isTrue();
                if ($$12.f() && ($$2 = $$0.R_()) != null && !$$2.equals($$6.e())) {
                    $$6.a($$2);
                    $$1 = true;
                }
                if ($$02 != $$6.a()) {
                    $$6.a($$02);
                    $$1 = true;
                }
                if ($$1) {
                    this.h();
                }
            }

            @Override
            public @Nullable yh g() {
                return $$6.e();
            }

            @Override
            public void a(@Nullable yh $$02) {
                if ($$5.isTrue() || !Objects.equals($$02, $$6.e())) {
                    $$6.a($$02);
                    this.h();
                }
            }

            @Override
            public void a(@Nullable aag $$02) {
                $$6.b($$02);
                this.h();
            }

            @Override
            public boolean d() {
                return $$6.b();
            }

            @Override
            public void e() {
                this.a(false);
            }

            @Override
            public void f() {
                this.a(true);
            }

            private void a(boolean $$02) {
                $$6.a($$02);
                if ($$5.isTrue()) {
                    this.h();
                }
                fur.this.a($$0, $$12);
            }

            private void h() {
                fur.this.a($$0, $$12, $$6);
                $$5.setFalse();
            }
        };
    }

    public @Nullable fun d(fuq $$0, fuj $$1) {
        ful $$2 = this.e.get($$0.da());
        if ($$2 != null) {
            return $$2.a($$1);
        }
        return null;
    }

    public Collection<fuk> i(fuj $$0) {
        ArrayList<fuk> $$1 = new ArrayList<fuk>();
        this.e.forEach(($$2, $$3) -> {
            fuo $$4 = $$3.a($$0);
            if ($$4 != null) {
                $$1.add(new fuk((String)$$2, $$4.a(), $$4.e(), $$4.c()));
            }
        });
        return $$1;
    }

    public Collection<fuj> b() {
        return this.c.values();
    }

    public Collection<String> c() {
        return this.c.keySet();
    }

    public Collection<fuq> d() {
        return this.e.keySet().stream().map(fuq::c).toList();
    }

    public void b(fuq $$0) {
        ful $$1 = this.e.remove($$0.da());
        if ($$1 != null) {
            this.a($$0);
        }
    }

    public void e(fuq $$0, fuj $$1) {
        ful $$2 = this.e.get($$0.da());
        if ($$2 != null) {
            boolean $$3 = $$2.b($$1);
            if (!$$2.a()) {
                ful $$4 = this.e.remove($$0.da());
                if ($$4 != null) {
                    this.a($$0);
                }
            } else if ($$3) {
                this.b($$0, $$1);
            }
        }
    }

    public Object2IntMap<fuj> c(fuq $$0) {
        ful $$1 = this.e.get($$0.da());
        return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
    }

    public void j(fuj $$0) {
        this.c.remove((Object)$$0.c());
        for (fui $$1 : fui.values()) {
            if (this.a($$1) != $$0) continue;
            this.a($$1, null);
        }
        List $$2 = (List)this.d.get((Object)$$0.d());
        if ($$2 != null) {
            $$2.remove($$0);
        }
        for (ful $$3 : this.e.values()) {
            $$3.b($$0);
        }
        this.c($$0);
    }

    public void a(fui $$0, @Nullable fuj $$1) {
        this.f.put($$0, $$1);
    }

    public @Nullable fuj a(fui $$0) {
        return this.f.get($$0);
    }

    public @Nullable fum b(String $$0) {
        return (fum)this.g.get((Object)$$0);
    }

    public fum c(String $$0) {
        fum $$1 = this.b($$0);
        if ($$1 != null) {
            b.warn("Requested creation of existing team '{}'", (Object)$$0);
            return $$1;
        }
        $$1 = new fum(this, $$0);
        this.g.put((Object)$$0, (Object)$$1);
        this.a($$1);
        return $$1;
    }

    public void d(fum $$0) {
        this.g.remove((Object)$$0.c());
        for (String $$1 : $$0.h()) {
            this.h.remove((Object)$$1);
        }
        this.c($$0);
    }

    public boolean a(String $$0, fum $$1) {
        if (this.e($$0) != null) {
            this.d($$0);
        }
        this.h.put((Object)$$0, (Object)$$1);
        return $$1.h().add($$0);
    }

    public boolean d(String $$0) {
        fum $$1 = this.e($$0);
        if ($$1 != null) {
            this.b($$0, $$1);
            return true;
        }
        return false;
    }

    public void b(String $$0, fum $$1) {
        if (this.e($$0) != $$1) {
            throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + $$1.c() + "'.");
        }
        this.h.remove((Object)$$0);
        $$1.h().remove($$0);
    }

    public Collection<String> e() {
        return this.g.keySet();
    }

    public Collection<fum> f() {
        return this.g.values();
    }

    public @Nullable fum e(String $$0) {
        return (fum)this.h.get((Object)$$0);
    }

    public void a(fuj $$0) {
    }

    public void b(fuj $$0) {
    }

    public void c(fuj $$0) {
    }

    protected void a(fuq $$0, fuj $$1, fuo $$2) {
    }

    protected void a(fuq $$0, fuj $$1) {
    }

    public void a(fuq $$0) {
    }

    public void b(fuq $$0, fuj $$1) {
    }

    public void a(fum $$0) {
    }

    public void b(fum $$0) {
    }

    public void c(fum $$0) {
    }

    public void a(cgk $$0) {
        if ($$0 instanceof ddm || $$0.cb()) {
            return;
        }
        this.b($$0);
        this.d($$0.da());
    }

    protected List<a> g() {
        return this.e.entrySet().stream().flatMap($$0 -> {
            String $$12 = (String)$$0.getKey();
            return ((ful)$$0.getValue()).c().entrySet().stream().map($$1 -> new a($$12, ((fuj)$$1.getKey()).c(), ((fuo)$$1.getValue()).d()));
        }).toList();
    }

    protected void a(a $$0) {
        fuj $$1 = this.a($$0.c);
        if ($$1 == null) {
            b.error("Unknown objective {} for name {}, ignoring", (Object)$$0.c, (Object)$$0.b);
            return;
        }
        this.f($$0.b).a($$1, new fuo($$0.d));
    }

    protected List<fum.a> h() {
        return this.f().stream().map(fum::a).toList();
    }

    protected void a(fum.a $$0) {
        fum $$1 = this.c($$0.a());
        $$0.b().ifPresent($$1::a);
        $$0.c().ifPresent($$1::a);
        $$1.a($$0.d());
        $$1.b($$0.e());
        $$1.b($$0.f());
        $$1.c($$0.g());
        $$1.a($$0.h());
        $$1.b($$0.i());
        $$1.a($$0.j());
        for (String $$2 : $$0.k()) {
            this.a($$2, $$1);
        }
    }

    protected List<fuj.a> i() {
        return this.b().stream().map(fuj::a).toList();
    }

    protected void a(fuj.a $$0) {
        this.a($$0.a(), $$0.b(), $$0.c(), $$0.d(), $$0.e(), $$0.f().orElse(null));
    }

    protected Map<fui, String> j() {
        EnumMap<fui, String> $$0 = new EnumMap<fui, String>(fui.class);
        for (fui $$1 : fui.values()) {
            fuj $$2 = this.a($$1);
            if ($$2 == null) continue;
            $$0.put($$1, $$2.c());
        }
        return $$0;
    }

    public static final class a
    extends Record {
        final String b;
        final String c;
        final fuo.a d;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.STRING.fieldOf("Name").forGetter(a::a), (App)Codec.STRING.fieldOf("Objective").forGetter(a::b), (App)fuo.a.a.forGetter(a::c)).apply((Applicative)$$0, a::new));

        public a(String $$0, String $$1, fuo.a $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "owner;objective;score", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "owner;objective;score", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "owner;objective;score", "b", "c", "d"}, this, $$0);
        }

        public String a() {
            return this.b;
        }

        public String b() {
            return this.c;
        }

        public fuo.a c() {
            return this.d;
        }
    }
}


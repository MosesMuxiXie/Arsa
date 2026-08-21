/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class ae
implements Comparable<ae> {
    private static final DateTimeFormatter b = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z", Locale.ROOT);
    private static final Codec<Instant> c = bfm.a(b).xmap(Instant::from, $$0 -> $$0.atZone(ZoneId.systemDefault()));
    private static final Codec<Map<String, al>> d = Codec.unboundedMap((Codec)Codec.STRING, c).xmap($$0 -> bhs.a($$0, al::new), $$02 -> $$02.entrySet().stream().filter($$0 -> ((al)$$0.getValue()).a()).collect(Collectors.toMap(Map.Entry::getKey, $$0 -> Objects.requireNonNull(((al)$$0.getValue()).d()))));
    public static final Codec<ae> a = RecordCodecBuilder.create($$02 -> $$02.group((App)d.optionalFieldOf("criteria", Map.of()).forGetter($$0 -> $$0.e), (App)Codec.BOOL.fieldOf("done").orElse((Object)true).forGetter(ae::a)).apply((Applicative)$$02, ($$0, $$1) -> new ae(new HashMap<String, al>((Map<String, al>)$$0))));
    private final Map<String, al> e;
    private af f = af.b;

    private ae(Map<String, al> $$0) {
        this.e = $$0;
    }

    public ae() {
        this.e = Maps.newHashMap();
    }

    public void a(af $$0) {
        Set<String> $$12 = $$0.c();
        this.e.entrySet().removeIf($$1 -> !$$12.contains($$1.getKey()));
        for (String $$2 : $$12) {
            this.e.putIfAbsent($$2, new al());
        }
        this.f = $$0;
    }

    public boolean a() {
        return this.f.a(this::d);
    }

    public boolean b() {
        for (al $$0 : this.e.values()) {
            if (!$$0.a()) continue;
            return true;
        }
        return false;
    }

    public boolean a(String $$0) {
        al $$1 = this.e.get($$0);
        if ($$1 != null && !$$1.a()) {
            $$1.b();
            return true;
        }
        return false;
    }

    public boolean b(String $$0) {
        al $$1 = this.e.get($$0);
        if ($$1 != null && $$1.a()) {
            $$1.c();
            return true;
        }
        return false;
    }

    public String toString() {
        return "AdvancementProgress{criteria=" + String.valueOf(this.e) + ", requirements=" + String.valueOf(this.f) + "}";
    }

    public void a(wx $$02) {
        $$02.a(this.e, wx::a, ($$0, $$1) -> $$1.a((wx)((Object)$$0)));
    }

    public static ae b(wx $$0) {
        al $$1 = $$0.a(wx::p, al::b);
        return new ae((Map<String, al>)((Object)$$1));
    }

    public @Nullable al c(String $$0) {
        return this.e.get($$0);
    }

    private boolean d(String $$0) {
        al $$1 = this.c($$0);
        return $$1 != null && $$1.a();
    }

    public float c() {
        if (this.e.isEmpty()) {
            return 0.0f;
        }
        float $$0 = this.f.a();
        float $$1 = this.h();
        return $$1 / $$0;
    }

    public @Nullable yh d() {
        if (this.e.isEmpty()) {
            return null;
        }
        int $$0 = this.f.a();
        if ($$0 <= 1) {
            return null;
        }
        int $$1 = this.h();
        return yh.a("advancements.progress", $$1, $$0);
    }

    private int h() {
        return this.f.b(this::d);
    }

    public Iterable<String> e() {
        ArrayList $$0 = Lists.newArrayList();
        for (Map.Entry<String, al> $$1 : this.e.entrySet()) {
            if ($$1.getValue().a()) continue;
            $$0.add($$1.getKey());
        }
        return $$0;
    }

    public Iterable<String> f() {
        ArrayList $$0 = Lists.newArrayList();
        for (Map.Entry<String, al> $$1 : this.e.entrySet()) {
            if (!$$1.getValue().a()) continue;
            $$0.add($$1.getKey());
        }
        return $$0;
    }

    public @Nullable Instant g() {
        return this.e.values().stream().map(al::d).filter(Objects::nonNull).min(Comparator.naturalOrder()).orElse(null);
    }

    public int a(ae $$0) {
        Instant $$1 = this.g();
        Instant $$2 = $$0.g();
        if ($$1 == null && $$2 != null) {
            return 1;
        }
        if ($$1 != null && $$2 == null) {
            return -1;
        }
        if ($$1 == null && $$2 == null) {
            return 0;
        }
        return $$1.compareTo($$2);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((ae)object);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.annotations.JsonAdapter
 *  com.google.gson.annotations.SerializedName
 *  com.mojang.logging.LogUtils
 *  com.mojang.util.UUIDTypeAdapter
 *  org.apache.commons.lang3.builder.EqualsBuilder
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.mojang.logging.LogUtils;
import com.mojang.util.UUIDTypeAdapter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gbg
extends gbx
implements gbp {
    private static final Logger z = LogUtils.getLogger();
    private static final int A = -1;
    public static final yh a = yh.c("mco.play.button.realm.closed");
    @SerializedName(value="id")
    public long b = -1L;
    @SerializedName(value="remoteSubscriptionId")
    public @Nullable String c;
    @SerializedName(value="name")
    public @Nullable String d;
    @SerializedName(value="motd")
    public String e = "";
    @SerializedName(value="state")
    public c f = gbg$c.a;
    @SerializedName(value="owner")
    public @Nullable String g;
    @SerializedName(value="ownerUUID")
    @JsonAdapter(value=UUIDTypeAdapter.class)
    public UUID h = bhs.e;
    @SerializedName(value="players")
    public List<gay> i = Lists.newArrayList();
    @SerializedName(value="slots")
    private List<gbk> B = gbg.k();
    @gar
    public Map<Integer, gbk> j = new HashMap<Integer, gbk>();
    @SerializedName(value="expired")
    public boolean k;
    @SerializedName(value="expiredTrial")
    public boolean l = false;
    @SerializedName(value="daysLeft")
    public int m;
    @SerializedName(value="worldType")
    public d n = gbg$d.a;
    @SerializedName(value="isHardcore")
    public boolean o = false;
    @SerializedName(value="gameMode")
    public int p = -1;
    @SerializedName(value="activeSlot")
    public int q = -1;
    @SerializedName(value="minigameName")
    public @Nullable String r;
    @SerializedName(value="minigameId")
    public int s = -1;
    @SerializedName(value="minigameImage")
    public @Nullable String t;
    @SerializedName(value="parentWorldId")
    public long u = -1L;
    @SerializedName(value="parentWorldName")
    public @Nullable String v;
    @SerializedName(value="activeVersion")
    public String w = "";
    @SerializedName(value="compatibility")
    public a x = gbg$a.a;
    @SerializedName(value="regionSelectionPreference")
    public @Nullable gbt y;

    public String a() {
        return this.e;
    }

    public @Nullable String b() {
        return this.d;
    }

    public @Nullable String c() {
        return this.r;
    }

    public void a(String $$0) {
        this.d = $$0;
    }

    public void b(String $$0) {
        this.e = $$0;
    }

    public static gbg a(gas $$0, String $$1) {
        try {
            gbg $$2 = $$0.a($$1, gbg.class);
            if ($$2 == null) {
                z.error("Could not parse McoServer: {}", (Object)$$1);
                return new gbg();
            }
            gbg.a($$2);
            return $$2;
        }
        catch (Exception $$3) {
            z.error("Could not parse McoServer", (Throwable)$$3);
            return new gbg();
        }
    }

    public static void a(gbg $$0) {
        if ($$0.i == null) {
            $$0.i = Lists.newArrayList();
        }
        if ($$0.B == null) {
            $$0.B = gbg.k();
        }
        if ($$0.j == null) {
            $$0.j = new HashMap<Integer, gbk>();
        }
        if ($$0.n == null) {
            $$0.n = gbg$d.a;
        }
        if ($$0.w == null) {
            $$0.w = "";
        }
        if ($$0.x == null) {
            $$0.x = gbg$a.a;
        }
        if ($$0.y == null) {
            $$0.y = gbt.a;
        }
        gbg.b($$0);
        gbg.c($$0);
    }

    private static void b(gbg $$02) {
        $$02.i.sort(($$0, $$1) -> ComparisonChain.start().compareFalseFirst($$1.d, $$0.d).compare((Comparable)((Object)$$0.a.toLowerCase(Locale.ROOT)), (Comparable)((Object)$$1.a.toLowerCase(Locale.ROOT))).result());
    }

    private static void c(gbg $$0) {
        $$0.B.forEach($$1 -> $$0.j.put($$1.a, (gbk)$$1));
        for (int $$12 = 1; $$12 <= 3; ++$$12) {
            if ($$0.j.containsKey($$12)) continue;
            $$0.j.put($$12, gbk.a($$12));
        }
    }

    private static List<gbk> k() {
        ArrayList<gbk> $$0 = new ArrayList<gbk>();
        $$0.add(gbk.a(1));
        $$0.add(gbk.a(2));
        $$0.add(gbk.a(3));
        return $$0;
    }

    public boolean d() {
        return this.x.a();
    }

    public boolean e() {
        return this.x.b();
    }

    public boolean f() {
        return this.x.c();
    }

    public boolean g() {
        boolean $$0 = !this.k && this.f == gbg$c.b;
        return $$0 && (this.d() || this.e() || this.l());
    }

    private boolean l() {
        return gfj.V().b(this.h);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.b, this.d, this.e, this.f, this.g, this.k});
    }

    public boolean equals(Object $$0) {
        if ($$0 == null) {
            return false;
        }
        if ($$0 == this) {
            return true;
        }
        if ($$0.getClass() != this.getClass()) {
            return false;
        }
        gbg $$1 = (gbg)$$0;
        return new EqualsBuilder().append(this.b, $$1.b).append((Object)this.d, (Object)$$1.d).append((Object)this.e, (Object)$$1.e).append((Object)this.f, (Object)$$1.f).append((Object)this.g, (Object)$$1.g).append(this.k, $$1.k).append((Object)this.n, (Object)this.n).isEquals();
    }

    public gbg h() {
        gbg $$0 = new gbg();
        $$0.b = this.b;
        $$0.c = this.c;
        $$0.d = this.d;
        $$0.e = this.e;
        $$0.f = this.f;
        $$0.g = this.g;
        $$0.i = this.i;
        $$0.B = this.B.stream().map(gbk::a).toList();
        $$0.j = this.a(this.j);
        $$0.k = this.k;
        $$0.l = this.l;
        $$0.m = this.m;
        $$0.n = this.n;
        $$0.o = this.o;
        $$0.p = this.p;
        $$0.h = this.h;
        $$0.r = this.r;
        $$0.q = this.q;
        $$0.s = this.s;
        $$0.t = this.t;
        $$0.v = this.v;
        $$0.u = this.u;
        $$0.w = this.w;
        $$0.x = this.x;
        $$0.y = this.y != null ? this.y.a() : null;
        return $$0;
    }

    public Map<Integer, gbk> a(Map<Integer, gbk> $$0) {
        HashMap $$1 = Maps.newHashMap();
        for (Map.Entry<Integer, gbk> $$2 : $$0.entrySet()) {
            $$1.put($$2.getKey(), new gbk($$2.getKey(), $$2.getValue().b.c(), $$2.getValue().c));
        }
        return $$1;
    }

    public boolean i() {
        return this.u != -1L;
    }

    public boolean j() {
        return this.n == gbg$d.b;
    }

    public String a(int $$0) {
        if (this.d == null) {
            return this.j.get((Object)Integer.valueOf((int)$$0)).b.a($$0);
        }
        return this.d + " (" + this.j.get((Object)Integer.valueOf((int)$$0)).b.a($$0) + ")";
    }

    public hit c(String $$0) {
        return new hit(Objects.requireNonNullElse(this.d, "unknown server"), $$0, hit.c.b);
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c();
        public static final /* enum */ c b = new c();
        public static final /* enum */ c c = new c();
        private static final /* synthetic */ c[] d;

        public static c[] values() {
            return (c[])d.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c};
        }

        static {
            d = gbg$c.a();
        }
    }

    public static final class d
    extends Enum<d> {
        public static final /* enum */ d a = new d("normal");
        public static final /* enum */ d b = new d("minigame");
        public static final /* enum */ d c = new d("adventureMap");
        public static final /* enum */ d d = new d("experience");
        public static final /* enum */ d e = new d("inspiration");
        public static final /* enum */ d f = new d("unknown");
        private static final String g = "mco.backup.entry.worldType.";
        private final yh h;
        private static final /* synthetic */ d[] i;

        public static d[] values() {
            return (d[])i.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        private d(String $$0) {
            this.h = yh.c(g + $$0);
        }

        public yh a() {
            return this.h;
        }

        private static /* synthetic */ d[] b() {
            return new d[]{a, b, c, d, e, f};
        }

        static {
            i = gbg$d.b();
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        public static final /* enum */ a f = new a();
        private static final /* synthetic */ a[] g;

        public static a[] values() {
            return (a[])g.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        public boolean a() {
            return this == f;
        }

        public boolean b() {
            return this == e;
        }

        public boolean c() {
            return this == d;
        }

        private static /* synthetic */ a[] d() {
            return new a[]{a, b, c, d, e, f};
        }

        static {
            g = gbg$a.d();
        }
    }

    public static class b
    implements Comparator<gbg> {
        private final String a;

        public b(String $$0) {
            this.a = $$0;
        }

        public int a(gbg $$0, gbg $$1) {
            return ComparisonChain.start().compareTrueFirst($$0.i(), $$1.i()).compareTrueFirst($$0.f == gbg$c.c, $$1.f == gbg$c.c).compareTrueFirst($$0.l, $$1.l).compareTrueFirst(Objects.equals($$0.g, this.a), Objects.equals($$1.g, this.a)).compareFalseFirst($$0.k, $$1.k).compareTrueFirst($$0.f == gbg$c.b, $$1.f == gbg$c.b).compare($$0.b, $$1.b).result();
        }

        @Override
        public /* synthetic */ int compare(Object object, Object object2) {
            return this.a((gbg)object, (gbg)object2);
        }
    }
}


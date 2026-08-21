/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.Lifecycle
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class fnm
implements fnn,
fnt {
    private static final Logger f = LogUtils.getLogger();
    public static final String a = "LevelName";
    protected static final String b = "Player";
    protected static final String c = "WorldGenSettings";
    private dws g;
    private final evo h;
    private final a i;
    private final Lifecycle j;
    private fne.a k;
    private long l;
    private long m;
    private final @Nullable uz n;
    private final int o;
    private int p;
    private boolean q;
    private int r;
    private boolean s;
    private int t;
    private boolean u;
    private boolean v;
    @Deprecated
    private Optional<eqa.c> w;
    private esk.a x;
    private @Nullable uz y;
    private int z;
    private int A;
    private @Nullable UUID B;
    private final Set<String> C;
    private boolean D;
    private final Set<String> E;
    private final fsz<MinecraftServer> F;

    private fnm(@Nullable uz $$0, boolean $$1, fne.a $$2, long $$3, long $$4, int $$5, int $$6, int $$7, boolean $$8, int $$9, boolean $$10, boolean $$11, boolean $$12, Optional<eqa.c> $$13, int $$14, int $$15, @Nullable UUID $$16, Set<String> $$17, Set<String> $$18, fsz<MinecraftServer> $$19, @Nullable uz $$20, esk.a $$21, dws $$22, evo $$23, a $$24, Lifecycle $$25) {
        this.D = $$1;
        this.k = $$2;
        this.l = $$3;
        this.m = $$4;
        this.o = $$5;
        this.p = $$6;
        this.r = $$7;
        this.q = $$8;
        this.t = $$9;
        this.s = $$10;
        this.u = $$11;
        this.v = $$12;
        this.w = $$13;
        this.z = $$14;
        this.A = $$15;
        this.B = $$16;
        this.C = $$17;
        this.E = $$18;
        this.n = $$0;
        this.F = $$19;
        this.y = $$20;
        this.x = $$21;
        this.g = $$22;
        this.h = $$23;
        this.i = $$24;
        this.j = $$25;
    }

    public fnm(dws $$0, evo $$1, a $$2, Lifecycle $$3) {
        this(null, false, fne.a.a, 0L, 0L, 19133, 0, 0, false, 0, false, false, false, Optional.empty(), 0, 0, null, Sets.newLinkedHashSet(), new HashSet<String>(), new fsz<MinecraftServer>(fsy.a), null, esk.a.b, $$0.h(), $$1, $$2, $$3);
    }

    public static <T> fnm a(Dynamic<T> $$02, dws $$1, a $$2, evo $$3, Lifecycle $$4) {
        long $$5 = $$02.get("Time").asLong(0L);
        return new fnm($$02.get(b).flatMap(arg_0 -> uz.a.parse(arg_0)).result().orElse(null), $$02.get("WasModded").asBoolean(false), $$02.get("spawn").read(fne.a.c).result().orElse(fne.a.a), $$5, $$02.get("DayTime").asLong($$5), fnk.a($$02).a(), $$02.get("clearWeatherTime").asInt(0), $$02.get("rainTime").asInt(0), $$02.get("raining").asBoolean(false), $$02.get("thunderTime").asInt(0), $$02.get("thundering").asBoolean(false), $$02.get("initialized").asBoolean(true), $$02.get("DifficultyLocked").asBoolean(false), eqa.c.b.parse($$02.get("world_border").orElseEmptyMap()).result(), $$02.get("WanderingTraderSpawnDelay").asInt(0), $$02.get("WanderingTraderSpawnChance").asInt(0), $$02.get("WanderingTraderId").read(jx.a).result().orElse(null), $$02.get("ServerBrands").asStream().flatMap($$0 -> $$0.asString().result().stream()).collect(Collectors.toCollection(Sets::newLinkedHashSet)), $$02.get("removed_features").asStream().flatMap($$0 -> $$0.asString().result().stream()).collect(Collectors.toSet()), new fsz<MinecraftServer>(fsy.a, $$02.get("ScheduledEvents").asStream()), (uz)$$02.get("CustomBossEvents").orElseEmptyMap().getValue(), $$02.get("DragonFight").read(esk.a.a).resultOrPartial(arg_0 -> ((Logger)f).error(arg_0)).orElse(esk.a.b), $$1, $$3, $$2, $$4);
    }

    @Override
    public uz a(jr $$0, @Nullable uz $$1) {
        if ($$1 == null) {
            $$1 = this.n;
        }
        uz $$2 = new uz();
        this.a($$0, $$2, $$1);
        return $$2;
    }

    private void a(jr $$0, uz $$12, @Nullable uz $$2) {
        $$12.a("ServerBrands", fnm.a(this.C));
        $$12.a("WasModded", this.D);
        if (!this.E.isEmpty()) {
            $$12.a("removed_features", fnm.a(this.E));
        }
        uz $$3 = new uz();
        $$3.a("Name", w.b().c());
        $$3.a("Id", w.b().a().b());
        $$3.a("Snapshot", !w.b().f());
        $$3.a("Series", w.b().a().c());
        $$12.a("Version", $$3);
        vo.e($$12);
        ams<vz> $$4 = $$0.a(vn.a);
        evm.a($$4, this.h, $$0).resultOrPartial(bhs.a("WorldGenSettings: ", arg_0 -> ((Logger)f).error(arg_0))).ifPresent($$1 -> $$12.a(c, (vz)$$1));
        $$12.a("GameType", this.g.b().a());
        $$12.a("spawn", fne.a.c, this.k);
        $$12.a("Time", this.l);
        $$12.a("DayTime", this.m);
        $$12.a("LastPlayed", bhs.e());
        $$12.a(a, this.g.a());
        $$12.a("version", 19133);
        $$12.a("clearWeatherTime", this.p);
        $$12.a("rainTime", this.r);
        $$12.a("raining", this.q);
        $$12.a("thunderTime", this.t);
        $$12.a("thundering", this.s);
        $$12.a("hardcore", this.g.c());
        $$12.a("allowCommands", this.g.e());
        $$12.a("initialized", this.u);
        this.w.ifPresent($$1 -> $$12.a("world_border", eqa.c.b, $$1));
        $$12.a("Difficulty", (byte)this.g.d().a());
        $$12.a("DifficultyLocked", this.v);
        $$12.a("game_rules", eua.a(this.J()), this.g.f());
        $$12.a("DragonFight", esk.a.a, this.x);
        if ($$2 != null) {
            $$12.a(b, $$2);
        }
        $$12.a(dxm.b, this.g.g());
        if (this.y != null) {
            $$12.a("CustomBossEvents", this.y);
        }
        $$12.a("ScheduledEvents", this.F.b());
        $$12.a("WanderingTraderSpawnDelay", this.z);
        $$12.a("WanderingTraderSpawnChance", this.A);
        $$12.b("WanderingTraderId", jx.a, this.B);
    }

    private static vf a(Set<String> $$0) {
        vf $$1 = new vf();
        $$0.stream().map(vx::a).forEach($$1::add);
        return $$1;
    }

    @Override
    public fne.a a() {
        return this.k;
    }

    @Override
    public long b() {
        return this.l;
    }

    @Override
    public long c() {
        return this.m;
    }

    @Override
    public @Nullable uz v() {
        return this.n;
    }

    @Override
    public void a(long $$0) {
        this.l = $$0;
    }

    @Override
    public void b(long $$0) {
        this.m = $$0;
    }

    @Override
    public void a(fne.a $$0) {
        this.k = $$0;
    }

    @Override
    public String d() {
        return this.g.a();
    }

    @Override
    public int w() {
        return this.o;
    }

    @Override
    public int e() {
        return this.p;
    }

    @Override
    public void a(int $$0) {
        this.p = $$0;
    }

    @Override
    public boolean f() {
        return this.s;
    }

    @Override
    public void a(boolean $$0) {
        this.s = $$0;
    }

    @Override
    public int g() {
        return this.t;
    }

    @Override
    public void b(int $$0) {
        this.t = $$0;
    }

    @Override
    public boolean h() {
        return this.q;
    }

    @Override
    public void b(boolean $$0) {
        this.q = $$0;
    }

    @Override
    public int i() {
        return this.r;
    }

    @Override
    public void c(int $$0) {
        this.r = $$0;
    }

    @Override
    public dwl j() {
        return this.g.b();
    }

    @Override
    public void a(dwl $$0) {
        this.g = this.g.a($$0);
    }

    @Override
    public boolean k() {
        return this.g.c();
    }

    @Override
    public boolean l() {
        return this.g.e();
    }

    @Override
    public boolean m() {
        return this.u;
    }

    @Override
    public void c(boolean $$0) {
        this.u = $$0;
    }

    @Override
    public eua n() {
        return this.g.f();
    }

    @Override
    public Optional<eqa.c> o() {
        return this.w;
    }

    @Override
    public void a(Optional<eqa.c> $$0) {
        this.w = $$0;
    }

    @Override
    public ccz p() {
        return this.g.d();
    }

    @Override
    public void a(ccz $$0) {
        this.g = this.g.a($$0);
    }

    @Override
    public boolean q() {
        return this.v;
    }

    @Override
    public void d(boolean $$0) {
        this.v = $$0;
    }

    @Override
    public fsz<MinecraftServer> r() {
        return this.F;
    }

    @Override
    public void a(n $$0, dwq $$1) {
        fnn.super.a($$0, $$1);
        fnt.super.a($$0);
    }

    @Override
    public evo x() {
        return this.h;
    }

    @Override
    public boolean y() {
        return this.i == fnm$a.b;
    }

    @Override
    public boolean z() {
        return this.i == fnm$a.c;
    }

    @Override
    public Lifecycle A() {
        return this.j;
    }

    @Override
    public esk.a B() {
        return this.x;
    }

    @Override
    public void a(esk.a $$0) {
        this.x = $$0;
    }

    @Override
    public dxm C() {
        return this.g.g();
    }

    @Override
    public void a(dxm $$0) {
        this.g = this.g.a($$0);
    }

    @Override
    public @Nullable uz D() {
        return this.y;
    }

    @Override
    public void a(@Nullable uz $$0) {
        this.y = $$0;
    }

    @Override
    public int s() {
        return this.z;
    }

    @Override
    public void d(int $$0) {
        this.z = $$0;
    }

    @Override
    public int t() {
        return this.A;
    }

    @Override
    public void e(int $$0) {
        this.A = $$0;
    }

    @Override
    public @Nullable UUID u() {
        return this.B;
    }

    @Override
    public void a(UUID $$0) {
        this.B = $$0;
    }

    @Override
    public void a(String $$0, boolean $$1) {
        this.C.add($$0);
        this.D |= $$1;
    }

    @Override
    public boolean E() {
        return this.D;
    }

    @Override
    public Set<String> F() {
        return ImmutableSet.copyOf(this.C);
    }

    @Override
    public Set<String> G() {
        return Set.copyOf(this.E);
    }

    @Override
    public fnn H() {
        return this;
    }

    @Override
    public dws I() {
        return this.g.h();
    }

    @Deprecated
    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = fnm$a.a();
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.MapLike
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class uz
implements vz {
    private static final Logger c = LogUtils.getLogger();
    public static final Codec<uz> a = Codec.PASSTHROUGH.comapFlatMap($$0 -> {
        vz $$1 = (vz)$$0.convert((DynamicOps)vn.a).getValue();
        if ($$1 instanceof uz) {
            uz $$2 = (uz)$$1;
            return DataResult.success((Object)($$2 == $$0.getValue() ? $$2.l() : $$2));
        }
        return DataResult.error(() -> "Not a compound tag: " + String.valueOf($$1));
    }, $$0 -> new Dynamic((DynamicOps)vn.a, (Object)$$0.l()));
    private static final int v = 48;
    private static final int w = 32;
    public static final wb<uz> b = new wb.b<uz>(){

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public uz a(DataInput $$0, vi $$1) throws IOException {
            $$1.d();
            try {
                uz uz2 = 1.d($$0, $$1);
                return uz2;
            }
            finally {
                $$1.e();
            }
        }

        private static uz d(DataInput $$0, vi $$1) throws IOException {
            byte $$3;
            $$1.b(48L);
            HashMap $$2 = Maps.newHashMap();
            while (($$3 = $$0.readByte()) != 0) {
                vz $$5;
                String $$4 = 1.e($$0, $$1);
                if ($$2.put($$4, $$5 = uz.a(wc.a($$3), $$4, $$0, $$1)) != null) continue;
                $$1.b(36L);
            }
            return new uz($$2);
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public vw.b a(DataInput $$0, vw $$1, vi $$2) throws IOException {
            $$2.d();
            try {
                vw.b b2 = 1.c($$0, $$1, $$2);
                return b2;
            }
            finally {
                $$2.e();
            }
        }

        private static vw.b c(DataInput $$0, vw $$1, vi $$2) throws IOException {
            byte $$3;
            $$2.b(48L);
            block13: while (($$3 = $$0.readByte()) != 0) {
                wb<?> $$4 = wc.a($$3);
                switch ($$1.a($$4)) {
                    case d: {
                        return vw.b.c;
                    }
                    case c: {
                        vx.a($$0);
                        $$4.b($$0, $$2);
                        break block13;
                    }
                    case b: {
                        vx.a($$0);
                        $$4.b($$0, $$2);
                        continue block13;
                    }
                    default: {
                        String $$5 = 1.e($$0, $$2);
                        switch ($$1.a($$4, $$5)) {
                            case d: {
                                return vw.b.c;
                            }
                            case c: {
                                $$4.b($$0, $$2);
                                break block13;
                            }
                            case b: {
                                $$4.b($$0, $$2);
                                continue block13;
                            }
                        }
                        $$2.b(36L);
                        switch ($$4.a($$0, $$1, $$2)) {
                            case c: {
                                return vw.b.c;
                            }
                        }
                        continue block13;
                    }
                }
            }
            if ($$3 != 0) {
                while (($$3 = $$0.readByte()) != 0) {
                    vx.a($$0);
                    wc.a($$3).b($$0, $$2);
                }
            }
            return $$1.b();
        }

        private static String e(DataInput $$0, vi $$1) throws IOException {
            String $$2 = $$0.readUTF();
            $$1.b(28L);
            $$1.a(2L, $$2.length());
            return $$2;
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void b(DataInput $$0, vi $$1) throws IOException {
            $$1.d();
            try {
                byte $$2;
                while (($$2 = $$0.readByte()) != 0) {
                    vx.a($$0);
                    wc.a($$2).b($$0, $$1);
                }
            }
            finally {
                $$1.e();
            }
        }

        @Override
        public String a() {
            return "COMPOUND";
        }

        @Override
        public String b() {
            return "TAG_Compound";
        }

        @Override
        public /* synthetic */ vz c(DataInput dataInput, vi vi2) throws IOException {
            return this.a(dataInput, vi2);
        }
    };
    private final Map<String, vz> x;

    uz(Map<String, vz> $$0) {
        this.x = $$0;
    }

    public uz() {
        this(new HashMap<String, vz>());
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
        for (String $$1 : this.x.keySet()) {
            vz $$2 = this.x.get($$1);
            uz.a($$1, $$2, $$0);
        }
        $$0.writeByte(0);
    }

    @Override
    public int a() {
        int $$0 = 48;
        for (Map.Entry<String, vz> $$1 : this.x.entrySet()) {
            $$0 += 28 + 2 * $$1.getKey().length();
            $$0 += 36;
            $$0 += $$1.getValue().a();
        }
        return $$0;
    }

    public Set<String> e() {
        return this.x.keySet();
    }

    public Set<Map.Entry<String, vz>> g() {
        return this.x.entrySet();
    }

    public Collection<vz> h() {
        return this.x.values();
    }

    public void a(BiConsumer<String, vz> $$0) {
        this.x.forEach($$0);
    }

    @Override
    public byte b() {
        return 10;
    }

    public wb<uz> c() {
        return b;
    }

    public int i() {
        return this.x.size();
    }

    public @Nullable vz a(String $$0, vz $$1) {
        return this.x.put($$0, $$1);
    }

    public void a(String $$0, byte $$1) {
        this.x.put($$0, ux.a($$1));
    }

    public void a(String $$0, short $$1) {
        this.x.put($$0, vs.a($$1));
    }

    public void a(String $$0, int $$1) {
        this.x.put($$0, ve.a($$1));
    }

    public void a(String $$0, long $$1) {
        this.x.put($$0, vh.a($$1));
    }

    public void a(String $$0, float $$1) {
        this.x.put($$0, vc.a($$1));
    }

    public void a(String $$0, double $$1) {
        this.x.put($$0, va.a($$1));
    }

    public void a(String $$0, String $$1) {
        this.x.put($$0, vx.a($$1));
    }

    public void a(String $$0, byte[] $$1) {
        this.x.put($$0, new uw($$1));
    }

    public void a(String $$0, int[] $$1) {
        this.x.put($$0, new vd($$1));
    }

    public void a(String $$0, long[] $$1) {
        this.x.put($$0, new vg($$1));
    }

    public void a(String $$0, boolean $$1) {
        this.x.put($$0, ux.a($$1));
    }

    public @Nullable vz a(String $$0) {
        return this.x.get($$0);
    }

    public boolean b(String $$0) {
        return this.x.containsKey($$0);
    }

    private Optional<vz> s(String $$0) {
        return Optional.ofNullable(this.x.get($$0));
    }

    public Optional<Byte> c(String $$0) {
        return this.s($$0).flatMap(vz::p);
    }

    public byte b(String $$0, byte $$1) {
        vz vz2 = this.x.get($$0);
        if (vz2 instanceof vp) {
            vp $$2 = (vp)vz2;
            return $$2.j();
        }
        return $$1;
    }

    public Optional<Short> d(String $$0) {
        return this.s($$0).flatMap(vz::q);
    }

    public short b(String $$0, short $$1) {
        vz vz2 = this.x.get($$0);
        if (vz2 instanceof vp) {
            vp $$2 = (vp)vz2;
            return $$2.i();
        }
        return $$1;
    }

    public Optional<Integer> e(String $$0) {
        return this.s($$0).flatMap(vz::r);
    }

    public int b(String $$0, int $$1) {
        vz vz2 = this.x.get($$0);
        if (vz2 instanceof vp) {
            vp $$2 = (vp)vz2;
            return $$2.h();
        }
        return $$1;
    }

    public Optional<Long> f(String $$0) {
        return this.s($$0).flatMap(vz::s);
    }

    public long b(String $$0, long $$1) {
        vz vz2 = this.x.get($$0);
        if (vz2 instanceof vp) {
            vp $$2 = (vp)vz2;
            return $$2.g();
        }
        return $$1;
    }

    public Optional<Float> g(String $$0) {
        return this.s($$0).flatMap(vz::t);
    }

    public float b(String $$0, float $$1) {
        vz vz2 = this.x.get($$0);
        if (vz2 instanceof vp) {
            vp $$2 = (vp)vz2;
            return $$2.l();
        }
        return $$1;
    }

    public Optional<Double> h(String $$0) {
        return this.s($$0).flatMap(vz::u);
    }

    public double b(String $$0, double $$1) {
        vz vz2 = this.x.get($$0);
        if (vz2 instanceof vp) {
            vp $$2 = (vp)vz2;
            return $$2.k();
        }
        return $$1;
    }

    public Optional<String> i(String $$0) {
        return this.s($$0).flatMap(vz::p_);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String b(String $$0, String $$1) {
        vz vz2 = this.x.get($$0);
        if (!(vz2 instanceof vx)) return $$1;
        vx vx2 = (vx)vz2;
        try {
            String string = vx2.k();
            return string;
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
    }

    public Optional<byte[]> j(String $$0) {
        vz vz2 = this.x.get($$0);
        if (vz2 instanceof uw) {
            uw $$1 = (uw)vz2;
            return Optional.of($$1.e());
        }
        return Optional.empty();
    }

    public Optional<int[]> k(String $$0) {
        vz vz2 = this.x.get($$0);
        if (vz2 instanceof vd) {
            vd $$1 = (vd)vz2;
            return Optional.of($$1.g());
        }
        return Optional.empty();
    }

    public Optional<long[]> l(String $$0) {
        vz vz2 = this.x.get($$0);
        if (vz2 instanceof vg) {
            vg $$1 = (vg)vz2;
            return Optional.of($$1.g());
        }
        return Optional.empty();
    }

    public Optional<uz> m(String $$0) {
        vz vz2 = this.x.get($$0);
        if (vz2 instanceof uz) {
            uz $$1 = (uz)vz2;
            return Optional.of($$1);
        }
        return Optional.empty();
    }

    public uz n(String $$0) {
        return this.m($$0).orElseGet(uz::new);
    }

    public Optional<vf> o(String $$0) {
        vz vz2 = this.x.get($$0);
        if (vz2 instanceof vf) {
            vf $$1 = (vf)vz2;
            return Optional.of($$1);
        }
        return Optional.empty();
    }

    public vf p(String $$0) {
        return this.o($$0).orElseGet(vf::new);
    }

    public Optional<Boolean> q(String $$0) {
        return this.s($$0).flatMap(vz::v);
    }

    public boolean b(String $$0, boolean $$1) {
        return this.b($$0, $$1 ? (byte)1 : 0) != 0;
    }

    public @Nullable vz r(String $$0) {
        return this.x.remove($$0);
    }

    @Override
    public String toString() {
        vy $$0 = new vy();
        $$0.a(this);
        return $$0.a();
    }

    public boolean j() {
        return this.x.isEmpty();
    }

    protected uz k() {
        return new uz(new HashMap<String, vz>(this.x));
    }

    public uz l() {
        HashMap<String, vz> $$0 = new HashMap<String, vz>();
        this.x.forEach(($$1, $$2) -> $$0.put((String)$$1, $$2.d()));
        return new uz($$0);
    }

    @Override
    public Optional<uz> s_() {
        return Optional.of(this);
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        return $$0 instanceof uz && Objects.equals(this.x, ((uz)$$0).x);
    }

    public int hashCode() {
        return this.x.hashCode();
    }

    private static void a(String $$0, vz $$1, DataOutput $$2) throws IOException {
        $$2.writeByte($$1.b());
        if ($$1.b() == 0) {
            return;
        }
        $$2.writeUTF($$0);
        $$1.a($$2);
    }

    static vz a(wb<?> $$0, String $$1, DataInput $$2, vi $$3) {
        try {
            return $$0.c($$2, $$3);
        }
        catch (IOException $$4) {
            m $$5 = m.a($$4, "Loading NBT data");
            n $$6 = $$5.a("NBT Tag");
            $$6.a("Tag name", $$1);
            $$6.a("Tag type", $$0.a());
            throw new vr($$5);
        }
    }

    public uz a(uz $$0) {
        for (String $$1 : $$0.x.keySet()) {
            vz $$2 = $$0.x.get($$1);
            if ($$2 instanceof uz) {
                uz $$3 = (uz)$$2;
                vz vz2 = this.x.get($$1);
                if (vz2 instanceof uz) {
                    uz $$4 = (uz)vz2;
                    $$4.a($$3);
                    continue;
                }
            }
            this.a($$1, $$2.d());
        }
        return this;
    }

    @Override
    public void a(wd $$0) {
        $$0.a(this);
    }

    @Override
    public vw.b a(vw $$0) {
        block14: for (Map.Entry<String, vz> $$1 : this.x.entrySet()) {
            vz $$2 = $$1.getValue();
            wb<?> $$3 = $$2.c();
            vw.a $$4 = $$0.a($$3);
            switch ($$4) {
                case d: {
                    return vw.b.c;
                }
                case c: {
                    return $$0.b();
                }
                case b: {
                    continue block14;
                }
            }
            $$4 = $$0.a($$3, $$1.getKey());
            switch ($$4) {
                case d: {
                    return vw.b.c;
                }
                case c: {
                    return $$0.b();
                }
                case b: {
                    continue block14;
                }
            }
            vw.b $$5 = $$2.a($$0);
            switch ($$5) {
                case c: {
                    return vw.b.c;
                }
                case b: {
                    return $$0.b();
                }
            }
        }
        return $$0.b();
    }

    public <T> void a(String $$0, Codec<T> $$1, T $$2) {
        this.a($$0, $$1, vn.a, $$2);
    }

    public <T> void b(String $$0, Codec<T> $$1, @Nullable T $$2) {
        if ($$2 != null) {
            this.a($$0, $$1, $$2);
        }
    }

    public <T> void a(String $$0, Codec<T> $$1, DynamicOps<vz> $$2, T $$3) {
        this.a($$0, (vz)$$1.encodeStart($$2, $$3).getOrThrow());
    }

    public <T> void b(String $$0, Codec<T> $$1, DynamicOps<vz> $$2, @Nullable T $$3) {
        if ($$3 != null) {
            this.a($$0, $$1, $$2, $$3);
        }
    }

    public <T> void a(MapCodec<T> $$0, T $$1) {
        this.a($$0, vn.a, $$1);
    }

    public <T> void a(MapCodec<T> $$0, DynamicOps<vz> $$1, T $$2) {
        this.a((uz)$$0.encoder().encodeStart($$1, $$2).getOrThrow());
    }

    public <T> Optional<T> a(String $$0, Codec<T> $$1) {
        return this.a($$0, $$1, vn.a);
    }

    public <T> Optional<T> a(String $$0, Codec<T> $$1, DynamicOps<vz> $$22) {
        vz $$3 = this.a($$0);
        if ($$3 == null) {
            return Optional.empty();
        }
        return $$1.parse($$22, (Object)$$3).resultOrPartial($$2 -> c.error("Failed to read field ({}={}): {}", new Object[]{$$0, $$3, $$2}));
    }

    public <T> Optional<T> a(MapCodec<T> $$0) {
        return this.a($$0, vn.a);
    }

    public <T> Optional<T> a(MapCodec<T> $$02, DynamicOps<vz> $$1) {
        return $$02.decode($$1, (MapLike)$$1.getMap((Object)this).getOrThrow()).resultOrPartial($$0 -> c.error("Failed to read value ({}): {}", (Object)this, $$0));
    }

    @Override
    public /* synthetic */ vz d() {
        return this.l();
    }
}


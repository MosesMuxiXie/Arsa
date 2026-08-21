/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntListIterator
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class bke
extends DataFix {
    private static final int a = 128;
    private static final int b = 64;
    private static final int c = 32;
    private static final int d = 16;
    private static final int e = 8;
    private static final int f = 4;
    private static final int g = 2;
    private static final int h = 1;
    static final Logger i = LogUtils.getLogger();
    private static final int j = 4096;

    public bke(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    public static String a(Dynamic<?> $$0) {
        return $$0.get("Name").asString("");
    }

    public static String a(Dynamic<?> $$0, String $$1) {
        return $$0.get("Properties").get($$1).asString("");
    }

    public static int a(bfa<Dynamic<?>> $$0, Dynamic<?> $$1) {
        int $$2 = $$0.a($$1);
        if ($$2 == -1) {
            $$2 = $$0.d($$1);
        }
        return $$2;
    }

    private Dynamic<?> b(Dynamic<?> $$0) {
        Optional $$1 = $$0.get("Level").result();
        if ($$1.isPresent() && ((Dynamic)$$1.get()).get("Sections").asStreamOpt().result().isPresent()) {
            return $$0.set("Level", new e((Dynamic)$$1.get()).a());
        }
        return $$0;
    }

    public TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(bqh.d);
        Type $$1 = this.getOutputSchema().getType(bqh.d);
        return this.writeFixAndRead("ChunkPalettedStorageFix", $$0, $$1, this::b);
    }

    public static int a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
        int $$4 = 0;
        if ($$2) {
            $$4 = $$1 ? ($$4 |= 2) : ($$0 ? ($$4 |= 0x80) : ($$4 |= 1));
        } else if ($$3) {
            $$4 = $$0 ? ($$4 |= 0x20) : ($$1 ? ($$4 |= 8) : ($$4 |= 0x10));
        } else if ($$1) {
            $$4 |= 4;
        } else if ($$0) {
            $$4 |= 0x40;
        }
        return $$4;
    }

    static final class e {
        private int a;
        private final @Nullable d[] b = new d[16];
        private final Dynamic<?> c;
        private final int d;
        private final int e;
        private final Int2ObjectMap<Dynamic<?>> f = new Int2ObjectLinkedOpenHashMap(16);

        public e(Dynamic<?> $$0) {
            this.c = $$0;
            this.d = $$0.get("xPos").asInt(0) << 4;
            this.e = $$0.get("zPos").asInt(0) << 4;
            $$0.get("TileEntities").asStreamOpt().ifSuccess($$02 -> $$02.forEach($$0 -> {
                int $$3;
                int $$1 = $$0.get("x").asInt(0) - this.d & 0xF;
                int $$2 = $$0.get("y").asInt(0);
                int $$4 = $$2 << 8 | ($$3 = $$0.get("z").asInt(0) - this.e & 0xF) << 4 | $$1;
                if (this.f.put($$4, $$0) != null) {
                    i.warn("In chunk: {}x{} found a duplicate block entity at position: [{}, {}, {}]", new Object[]{this.d, this.e, $$1, $$2, $$3});
                }
            }));
            boolean $$1 = $$0.get("convertedFromAlphaFormat").asBoolean(false);
            $$0.get("Sections").asStreamOpt().ifSuccess($$02 -> $$02.forEach($$0 -> {
                d $$1 = new d((Dynamic<?>)$$0);
                this.a = $$1.b(this.a);
                this.b[$$1.a] = $$1;
            }));
            for (d $$2 : this.b) {
                if ($$2 == null) continue;
                block30: for (Int2ObjectMap.Entry $$3 : $$2.f.int2ObjectEntrySet()) {
                    int $$4 = $$2.a << 12;
                    switch ($$3.getIntKey()) {
                        case 2: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                String $$7;
                                int $$5 = (Integer)intListIterator.next();
                                Dynamic<?> $$6 = this.a($$5 |= $$4);
                                if (!"minecraft:grass_block".equals(bke.a($$6)) || !"minecraft:snow".equals($$7 = bke.a(this.a(bke$e.a($$5, bke$b.b)))) && !"minecraft:snow_layer".equals($$7)) continue;
                                this.a($$5, bke$c.e);
                            }
                            continue block30;
                        }
                        case 3: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                String $$10;
                                int $$8 = (Integer)intListIterator.next();
                                Dynamic<?> $$9 = this.a($$8 |= $$4);
                                if (!"minecraft:podzol".equals(bke.a($$9)) || !"minecraft:snow".equals($$10 = bke.a(this.a(bke$e.a($$8, bke$b.b)))) && !"minecraft:snow_layer".equals($$10)) continue;
                                this.a($$8, bke$c.d);
                            }
                            continue block30;
                        }
                        case 110: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                String $$13;
                                int $$11 = (Integer)intListIterator.next();
                                Dynamic<?> $$12 = this.a($$11 |= $$4);
                                if (!"minecraft:mycelium".equals(bke.a($$12)) || !"minecraft:snow".equals($$13 = bke.a(this.a(bke$e.a($$11, bke$b.b)))) && !"minecraft:snow_layer".equals($$13)) continue;
                                this.a($$11, bke$c.f);
                            }
                            continue block30;
                        }
                        case 25: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                int $$14 = (Integer)intListIterator.next();
                                Dynamic<?> $$15 = this.c($$14 |= $$4);
                                if ($$15 == null) continue;
                                String $$16 = Boolean.toString($$15.get("powered").asBoolean(false)) + (byte)Math.min(Math.max($$15.get("note").asInt(0), 0), 24);
                                this.a($$14, bke$c.p.getOrDefault($$16, bke$c.p.get("false0")));
                            }
                            continue block30;
                        }
                        case 26: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                String $$21;
                                int $$20;
                                int $$17 = (Integer)intListIterator.next();
                                Dynamic<?> $$18 = this.b($$17 |= $$4);
                                Dynamic<?> $$19 = this.a($$17);
                                if ($$18 == null || ($$20 = $$18.get("color").asInt(0)) == 14 || $$20 < 0 || $$20 >= 16 || !bke$c.r.containsKey($$21 = bke.a($$19, "facing") + bke.a($$19, "occupied") + bke.a($$19, "part") + $$20)) continue;
                                this.a($$17, bke$c.r.get($$21));
                            }
                            continue block30;
                        }
                        case 176: 
                        case 177: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                String $$26;
                                int $$25;
                                int $$22 = (Integer)intListIterator.next();
                                Dynamic<?> $$23 = this.b($$22 |= $$4);
                                Dynamic<?> $$24 = this.a($$22);
                                if ($$23 == null || ($$25 = $$23.get("Base").asInt(0)) == 15 || $$25 < 0 || $$25 >= 16 || !bke$c.s.containsKey($$26 = bke.a($$24, $$3.getIntKey() == 176 ? "rotation" : "facing") + "_" + $$25)) continue;
                                this.a($$22, bke$c.s.get($$26));
                            }
                            continue block30;
                        }
                        case 86: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                String $$29;
                                int $$27 = (Integer)intListIterator.next();
                                Dynamic<?> $$28 = this.a($$27 |= $$4);
                                if (!"minecraft:carved_pumpkin".equals(bke.a($$28)) || !"minecraft:grass_block".equals($$29 = bke.a(this.a(bke$e.a($$27, bke$b.a)))) && !"minecraft:dirt".equals($$29)) continue;
                                this.a($$27, bke$c.c);
                            }
                            continue block30;
                        }
                        case 140: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                int $$30 = (Integer)intListIterator.next();
                                Dynamic<?> $$31 = this.c($$30 |= $$4);
                                if ($$31 == null) continue;
                                String $$32 = $$31.get("Item").asString("") + $$31.get("Data").asInt(0);
                                this.a($$30, bke$c.m.getOrDefault($$32, bke$c.m.get("minecraft:air0")));
                            }
                            continue block30;
                        }
                        case 144: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                String $$38;
                                int $$33 = (Integer)intListIterator.next();
                                Dynamic<?> $$34 = this.b($$33 |= $$4);
                                if ($$34 == null) continue;
                                String $$35 = String.valueOf($$34.get("SkullType").asInt(0));
                                String $$36 = bke.a(this.a($$33), "facing");
                                if ("up".equals($$36) || "down".equals($$36)) {
                                    String $$37 = $$35 + $$34.get("Rot").asInt(0);
                                } else {
                                    $$38 = $$35 + $$36;
                                }
                                $$34.remove("SkullType");
                                $$34.remove("facing");
                                $$34.remove("Rot");
                                this.a($$33, bke$c.n.getOrDefault($$38, bke$c.n.get("0north")));
                            }
                            continue block30;
                        }
                        case 64: 
                        case 71: 
                        case 193: 
                        case 194: 
                        case 195: 
                        case 196: 
                        case 197: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                Dynamic<?> $$41;
                                int $$39 = (Integer)intListIterator.next();
                                Dynamic<?> $$40 = this.a($$39 |= $$4);
                                if (!bke.a($$40).endsWith("_door") || !"lower".equals(bke.a($$41 = this.a($$39), "half"))) continue;
                                int $$42 = bke$e.a($$39, bke$b.b);
                                Dynamic<?> $$43 = this.a($$42);
                                String $$44 = bke.a($$41);
                                if (!$$44.equals(bke.a($$43))) continue;
                                String $$45 = bke.a($$41, "facing");
                                String $$46 = bke.a($$41, "open");
                                String $$47 = $$1 ? "left" : bke.a($$43, "hinge");
                                String $$48 = $$1 ? "false" : bke.a($$43, "powered");
                                this.a($$39, bke$c.o.get($$44 + $$45 + "lower" + $$47 + $$46 + $$48));
                                this.a($$42, bke$c.o.get($$44 + $$45 + "upper" + $$47 + $$46 + $$48));
                            }
                            continue block30;
                        }
                        case 175: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                String $$52;
                                int $$49 = (Integer)intListIterator.next();
                                Dynamic<?> $$50 = this.a($$49 |= $$4);
                                if (!"upper".equals(bke.a($$50, "half"))) continue;
                                Dynamic<?> $$51 = this.a(bke$e.a($$49, bke$b.a));
                                switch ($$52 = bke.a($$51)) {
                                    case "minecraft:sunflower": {
                                        this.a($$49, bke$c.g);
                                        break;
                                    }
                                    case "minecraft:lilac": {
                                        this.a($$49, bke$c.h);
                                        break;
                                    }
                                    case "minecraft:tall_grass": {
                                        this.a($$49, bke$c.i);
                                        break;
                                    }
                                    case "minecraft:large_fern": {
                                        this.a($$49, bke$c.j);
                                        break;
                                    }
                                    case "minecraft:rose_bush": {
                                        this.a($$49, bke$c.k);
                                        break;
                                    }
                                    case "minecraft:peony": {
                                        this.a($$49, bke$c.l);
                                    }
                                }
                            }
                            break;
                        }
                    }
                }
            }
        }

        private @Nullable Dynamic<?> b(int $$0) {
            return (Dynamic)this.f.get($$0);
        }

        private @Nullable Dynamic<?> c(int $$0) {
            return (Dynamic)this.f.remove($$0);
        }

        public static int a(int $$0, b $$1) {
            return switch ($$1.b().ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> {
                    int $$2 = ($$0 & 0xF) + $$1.a().a();
                    if ($$2 < 0 || $$2 > 15) {
                        yield -1;
                    }
                    yield $$0 & 0xFFFFFFF0 | $$2;
                }
                case 1 -> {
                    int $$3 = ($$0 >> 8) + $$1.a().a();
                    if ($$3 < 0 || $$3 > 255) {
                        yield -1;
                    }
                    yield $$0 & 0xFF | $$3 << 8;
                }
                case 2 -> {
                    int $$4 = ($$0 >> 4 & 0xF) + $$1.a().a();
                    if ($$4 < 0 || $$4 > 15) {
                        yield -1;
                    }
                    yield $$0 & 0xFFFFFF0F | $$4 << 4;
                }
            };
        }

        private void a(int $$0, Dynamic<?> $$1) {
            if ($$0 < 0 || $$0 > 65535) {
                return;
            }
            d $$2 = this.d($$0);
            if ($$2 == null) {
                return;
            }
            $$2.a($$0 & 0xFFF, $$1);
        }

        private @Nullable d d(int $$0) {
            int $$1 = $$0 >> 12;
            return $$1 < this.b.length ? this.b[$$1] : null;
        }

        public Dynamic<?> a(int $$0) {
            if ($$0 < 0 || $$0 > 65535) {
                return bke$c.t;
            }
            d $$1 = this.d($$0);
            if ($$1 == null) {
                return bke$c.t;
            }
            return $$1.a($$0 & 0xFFF);
        }

        public Dynamic<?> a() {
            Dynamic $$0 = this.c;
            $$0 = this.f.isEmpty() ? $$0.remove("TileEntities") : $$0.set("TileEntities", $$0.createList(this.f.values().stream()));
            Dynamic $$1 = $$0.emptyMap();
            ArrayList $$2 = Lists.newArrayList();
            for (d $$3 : this.b) {
                if ($$3 == null) continue;
                $$2.add($$3.a());
                $$1 = $$1.set(String.valueOf($$3.a), $$1.createIntList(Arrays.stream($$3.g.toIntArray())));
            }
            Dynamic $$4 = $$0.emptyMap();
            $$4 = $$4.set("Sides", $$4.createByte((byte)this.a));
            $$4 = $$4.set("Indices", $$1);
            return $$0.set("UpgradeData", $$4).set("Sections", $$4.createList($$2.stream()));
        }
    }

    public static final class bke$b
    extends Enum<bke$b> {
        public static final /* enum */ bke$b a = new bke$b(b.b, a.b);
        public static final /* enum */ bke$b b = new bke$b(b.a, a.b);
        public static final /* enum */ bke$b c = new bke$b(b.b, a.c);
        public static final /* enum */ bke$b d = new bke$b(b.a, a.c);
        public static final /* enum */ bke$b e = new bke$b(b.b, a.a);
        public static final /* enum */ bke$b f = new bke$b(b.a, a.a);
        private final a g;
        private final b h;
        private static final /* synthetic */ bke$b[] i;

        public static bke$b[] values() {
            return (bke$b[])i.clone();
        }

        public static bke$b valueOf(String $$0) {
            return Enum.valueOf(bke$b.class, $$0);
        }

        private bke$b(b $$0, a $$1) {
            this.g = $$1;
            this.h = $$0;
        }

        public b a() {
            return this.h;
        }

        public a b() {
            return this.g;
        }

        private static /* synthetic */ bke$b[] c() {
            return new bke$b[]{a, b, c, d, e, f};
        }

        static {
            i = bke$b.c();
        }

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
                d = bke$b$a.a();
            }
        }

        public static final class b
        extends Enum<b> {
            public static final /* enum */ b a = new b(1);
            public static final /* enum */ b b = new b(-1);
            private final int c;
            private static final /* synthetic */ b[] d;

            public static b[] values() {
                return (b[])d.clone();
            }

            public static b valueOf(String $$0) {
                return Enum.valueOf(b.class, $$0);
            }

            private b(int $$0) {
                this.c = $$0;
            }

            public int a() {
                return this.c;
            }

            private static /* synthetic */ b[] b() {
                return new b[]{a, b};
            }

            static {
                d = bke$b$b.b();
            }
        }
    }

    static class a {
        private static final int a = 2048;
        private static final int b = 4;
        private final byte[] c;

        public a() {
            this.c = new byte[2048];
        }

        public a(byte[] $$0) {
            this.c = $$0;
            if ($$0.length != 2048) {
                throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + $$0.length);
            }
        }

        public int a(int $$0, int $$1, int $$2) {
            int $$3 = this.b($$1 << 8 | $$2 << 4 | $$0);
            if (this.a($$1 << 8 | $$2 << 4 | $$0)) {
                return this.c[$$3] & 0xF;
            }
            return this.c[$$3] >> 4 & 0xF;
        }

        private boolean a(int $$0) {
            return ($$0 & 1) == 0;
        }

        private int b(int $$0) {
            return $$0 >> 1;
        }
    }

    static class d {
        private final bfa<Dynamic<?>> b = bfa.c(32);
        private final List<Dynamic<?>> c;
        private final Dynamic<?> d;
        private final boolean e;
        final Int2ObjectMap<IntList> f = new Int2ObjectLinkedOpenHashMap();
        final IntList g = new IntArrayList();
        public final int a;
        private final Set<Dynamic<?>> h = Sets.newIdentityHashSet();
        private final int[] i = new int[4096];

        public d(Dynamic<?> $$0) {
            this.c = Lists.newArrayList();
            this.d = $$0;
            this.a = $$0.get("Y").asInt(0);
            this.e = $$0.get("Blocks").result().isPresent();
        }

        public Dynamic<?> a(int $$0) {
            if ($$0 < 0 || $$0 > 4095) {
                return bke$c.t;
            }
            Dynamic<?> $$1 = this.b.a(this.i[$$0]);
            return $$1 == null ? bke$c.t : $$1;
        }

        public void a(int $$0, Dynamic<?> $$1) {
            if (this.h.add($$1)) {
                this.c.add("%%FILTER_ME%%".equals(bke.a($$1)) ? bke$c.t : $$1);
            }
            this.i[$$0] = bke.a(this.b, $$1);
        }

        public int b(int $$02) {
            if (!this.e) {
                return $$02;
            }
            ByteBuffer $$1 = (ByteBuffer)this.d.get("Blocks").asByteBufferOpt().result().get();
            a $$2 = this.d.get("Data").asByteBufferOpt().map($$0 -> new a(DataFixUtils.toArray((ByteBuffer)$$0))).result().orElseGet(a::new);
            a $$3 = this.d.get("Add").asByteBufferOpt().map($$0 -> new a(DataFixUtils.toArray((ByteBuffer)$$0))).result().orElseGet(a::new);
            this.h.add(bke$c.t);
            bke.a(this.b, bke$c.t);
            this.c.add(bke$c.t);
            for (int $$4 = 0; $$4 < 4096; ++$$4) {
                int $$5 = $$4 & 0xF;
                int $$6 = $$4 >> 8 & 0xF;
                int $$7 = $$4 >> 4 & 0xF;
                int $$8 = $$3.a($$5, $$6, $$7) << 12 | ($$1.get($$4) & 0xFF) << 4 | $$2.a($$5, $$6, $$7);
                if (bke$c.b.get($$8 >> 4)) {
                    this.a($$8 >> 4, $$4);
                }
                if (bke$c.a.get($$8 >> 4)) {
                    int $$9 = bke.a($$5 == 0, $$5 == 15, $$7 == 0, $$7 == 15);
                    if ($$9 == 0) {
                        this.g.add($$4);
                    } else {
                        $$02 |= $$9;
                    }
                }
                this.a($$4, bjq.b($$8));
            }
            return $$02;
        }

        private void a(int $$0, int $$1) {
            IntList $$2 = (IntList)this.f.get($$0);
            if ($$2 == null) {
                $$2 = new IntArrayList();
                this.f.put($$0, (Object)$$2);
            }
            $$2.add($$1);
        }

        public Dynamic<?> a() {
            Dynamic $$0 = this.d;
            if (!this.e) {
                return $$0;
            }
            $$0 = $$0.set("Palette", $$0.createList(this.c.stream()));
            int $$1 = Math.max(4, DataFixUtils.ceillog2((int)this.h.size()));
            bid $$2 = new bid($$1, 4096);
            for (int $$3 = 0; $$3 < this.i.length; ++$$3) {
                $$2.a($$3, this.i[$$3]);
            }
            $$0 = $$0.set("BlockStates", $$0.createLongList(Arrays.stream($$2.a())));
            $$0 = $$0.remove("Blocks");
            $$0 = $$0.remove("Data");
            $$0 = $$0.remove("Add");
            return $$0;
        }
    }

    static class c {
        static final BitSet a = new BitSet(256);
        static final BitSet b = new BitSet(256);
        static final Dynamic<?> c = bib.a("minecraft:pumpkin");
        static final Dynamic<?> d = bib.a("minecraft:podzol", Map.of("snowy", "true"));
        static final Dynamic<?> e = bib.a("minecraft:grass_block", Map.of("snowy", "true"));
        static final Dynamic<?> f = bib.a("minecraft:mycelium", Map.of("snowy", "true"));
        static final Dynamic<?> g = bib.a("minecraft:sunflower", Map.of("half", "upper"));
        static final Dynamic<?> h = bib.a("minecraft:lilac", Map.of("half", "upper"));
        static final Dynamic<?> i = bib.a("minecraft:tall_grass", Map.of("half", "upper"));
        static final Dynamic<?> j = bib.a("minecraft:large_fern", Map.of("half", "upper"));
        static final Dynamic<?> k = bib.a("minecraft:rose_bush", Map.of("half", "upper"));
        static final Dynamic<?> l = bib.a("minecraft:peony", Map.of("half", "upper"));
        static final Map<String, Dynamic<?>> m = (Map)DataFixUtils.make((Object)Maps.newHashMap(), $$0 -> {
            $$0.put("minecraft:air0", bib.a("minecraft:flower_pot"));
            $$0.put("minecraft:red_flower0", bib.a("minecraft:potted_poppy"));
            $$0.put("minecraft:red_flower1", bib.a("minecraft:potted_blue_orchid"));
            $$0.put("minecraft:red_flower2", bib.a("minecraft:potted_allium"));
            $$0.put("minecraft:red_flower3", bib.a("minecraft:potted_azure_bluet"));
            $$0.put("minecraft:red_flower4", bib.a("minecraft:potted_red_tulip"));
            $$0.put("minecraft:red_flower5", bib.a("minecraft:potted_orange_tulip"));
            $$0.put("minecraft:red_flower6", bib.a("minecraft:potted_white_tulip"));
            $$0.put("minecraft:red_flower7", bib.a("minecraft:potted_pink_tulip"));
            $$0.put("minecraft:red_flower8", bib.a("minecraft:potted_oxeye_daisy"));
            $$0.put("minecraft:yellow_flower0", bib.a("minecraft:potted_dandelion"));
            $$0.put("minecraft:sapling0", bib.a("minecraft:potted_oak_sapling"));
            $$0.put("minecraft:sapling1", bib.a("minecraft:potted_spruce_sapling"));
            $$0.put("minecraft:sapling2", bib.a("minecraft:potted_birch_sapling"));
            $$0.put("minecraft:sapling3", bib.a("minecraft:potted_jungle_sapling"));
            $$0.put("minecraft:sapling4", bib.a("minecraft:potted_acacia_sapling"));
            $$0.put("minecraft:sapling5", bib.a("minecraft:potted_dark_oak_sapling"));
            $$0.put("minecraft:red_mushroom0", bib.a("minecraft:potted_red_mushroom"));
            $$0.put("minecraft:brown_mushroom0", bib.a("minecraft:potted_brown_mushroom"));
            $$0.put("minecraft:deadbush0", bib.a("minecraft:potted_dead_bush"));
            $$0.put("minecraft:tallgrass2", bib.a("minecraft:potted_fern"));
            $$0.put("minecraft:cactus0", bib.a("minecraft:potted_cactus"));
        });
        static final Map<String, Dynamic<?>> n = (Map)DataFixUtils.make((Object)Maps.newHashMap(), $$0 -> {
            bke$c.a($$0, 0, "skeleton", "skull");
            bke$c.a($$0, 1, "wither_skeleton", "skull");
            bke$c.a($$0, 2, "zombie", "head");
            bke$c.a($$0, 3, "player", "head");
            bke$c.a($$0, 4, "creeper", "head");
            bke$c.a($$0, 5, "dragon", "head");
        });
        static final Map<String, Dynamic<?>> o = (Map)DataFixUtils.make((Object)Maps.newHashMap(), $$0 -> {
            bke$c.a($$0, "oak_door");
            bke$c.a($$0, "iron_door");
            bke$c.a($$0, "spruce_door");
            bke$c.a($$0, "birch_door");
            bke$c.a($$0, "jungle_door");
            bke$c.a($$0, "acacia_door");
            bke$c.a($$0, "dark_oak_door");
        });
        static final Map<String, Dynamic<?>> p = (Map)DataFixUtils.make((Object)Maps.newHashMap(), $$0 -> {
            for (int $$1 = 0; $$1 < 26; ++$$1) {
                $$0.put("true" + $$1, bib.a("minecraft:note_block", Map.of("powered", "true", "note", String.valueOf($$1))));
                $$0.put("false" + $$1, bib.a("minecraft:note_block", Map.of("powered", "false", "note", String.valueOf($$1))));
            }
        });
        private static final Int2ObjectMap<String> q = (Int2ObjectMap)DataFixUtils.make((Object)new Int2ObjectOpenHashMap(), $$0 -> {
            $$0.put(0, (Object)"white");
            $$0.put(1, (Object)"orange");
            $$0.put(2, (Object)"magenta");
            $$0.put(3, (Object)"light_blue");
            $$0.put(4, (Object)"yellow");
            $$0.put(5, (Object)"lime");
            $$0.put(6, (Object)"pink");
            $$0.put(7, (Object)"gray");
            $$0.put(8, (Object)"light_gray");
            $$0.put(9, (Object)"cyan");
            $$0.put(10, (Object)"purple");
            $$0.put(11, (Object)"blue");
            $$0.put(12, (Object)"brown");
            $$0.put(13, (Object)"green");
            $$0.put(14, (Object)"red");
            $$0.put(15, (Object)"black");
        });
        static final Map<String, Dynamic<?>> r = (Map)DataFixUtils.make((Object)Maps.newHashMap(), $$0 -> {
            for (Int2ObjectMap.Entry $$1 : q.int2ObjectEntrySet()) {
                if (Objects.equals($$1.getValue(), "red")) continue;
                bke$c.a($$0, $$1.getIntKey(), (String)$$1.getValue());
            }
        });
        static final Map<String, Dynamic<?>> s = (Map)DataFixUtils.make((Object)Maps.newHashMap(), $$0 -> {
            for (Int2ObjectMap.Entry $$1 : q.int2ObjectEntrySet()) {
                if (Objects.equals($$1.getValue(), "white")) continue;
                bke$c.b($$0, 15 - $$1.getIntKey(), (String)$$1.getValue());
            }
        });
        static final Dynamic<?> t;

        private c() {
        }

        private static void a(Map<String, Dynamic<?>> $$0, int $$1, String $$2, String $$3) {
            $$0.put($$1 + "north", bib.a("minecraft:" + $$2 + "_wall_" + $$3, Map.of("facing", "north")));
            $$0.put($$1 + "east", bib.a("minecraft:" + $$2 + "_wall_" + $$3, Map.of("facing", "east")));
            $$0.put($$1 + "south", bib.a("minecraft:" + $$2 + "_wall_" + $$3, Map.of("facing", "south")));
            $$0.put($$1 + "west", bib.a("minecraft:" + $$2 + "_wall_" + $$3, Map.of("facing", "west")));
            for (int $$4 = 0; $$4 < 16; ++$$4) {
                $$0.put("" + $$1 + $$4, bib.a("minecraft:" + $$2 + "_" + $$3, Map.of("rotation", String.valueOf($$4))));
            }
        }

        private static void a(Map<String, Dynamic<?>> $$0, String $$1) {
            String $$2 = "minecraft:" + $$1;
            $$0.put("minecraft:" + $$1 + "eastlowerleftfalsefalse", bib.a($$2, Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "false", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "eastlowerleftfalsetrue", bib.a($$2, Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "false", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "eastlowerlefttruefalse", bib.a($$2, Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "true", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "eastlowerlefttruetrue", bib.a($$2, Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "true", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "eastlowerrightfalsefalse", bib.a($$2, Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "false", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "eastlowerrightfalsetrue", bib.a($$2, Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "false", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "eastlowerrighttruefalse", bib.a($$2, Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "true", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "eastlowerrighttruetrue", bib.a($$2, Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "true", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "eastupperleftfalsefalse", bib.a($$2, Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "false", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "eastupperleftfalsetrue", bib.a($$2, Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "false", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "eastupperlefttruefalse", bib.a($$2, Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "true", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "eastupperlefttruetrue", bib.a($$2, Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "true", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "eastupperrightfalsefalse", bib.a($$2, Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "false", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "eastupperrightfalsetrue", bib.a($$2, Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "false", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "eastupperrighttruefalse", bib.a($$2, Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "true", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "eastupperrighttruetrue", bib.a($$2, Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "true", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "northlowerleftfalsefalse", bib.a($$2, Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "false", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "northlowerleftfalsetrue", bib.a($$2, Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "false", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "northlowerlefttruefalse", bib.a($$2, Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "true", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "northlowerlefttruetrue", bib.a($$2, Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "true", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "northlowerrightfalsefalse", bib.a($$2, Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "false", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "northlowerrightfalsetrue", bib.a($$2, Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "false", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "northlowerrighttruefalse", bib.a($$2, Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "true", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "northlowerrighttruetrue", bib.a($$2, Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "true", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "northupperleftfalsefalse", bib.a($$2, Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "false", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "northupperleftfalsetrue", bib.a($$2, Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "false", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "northupperlefttruefalse", bib.a($$2, Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "true", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "northupperlefttruetrue", bib.a($$2, Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "true", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "northupperrightfalsefalse", bib.a($$2, Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "false", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "northupperrightfalsetrue", bib.a($$2, Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "false", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "northupperrighttruefalse", bib.a($$2, Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "true", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "northupperrighttruetrue", bib.a($$2, Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "true", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "southlowerleftfalsefalse", bib.a($$2, Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "false", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "southlowerleftfalsetrue", bib.a($$2, Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "false", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "southlowerlefttruefalse", bib.a($$2, Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "true", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "southlowerlefttruetrue", bib.a($$2, Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "true", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "southlowerrightfalsefalse", bib.a($$2, Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "false", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "southlowerrightfalsetrue", bib.a($$2, Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "false", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "southlowerrighttruefalse", bib.a($$2, Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "true", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "southlowerrighttruetrue", bib.a($$2, Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "true", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "southupperleftfalsefalse", bib.a($$2, Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "false", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "southupperleftfalsetrue", bib.a($$2, Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "false", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "southupperlefttruefalse", bib.a($$2, Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "true", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "southupperlefttruetrue", bib.a($$2, Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "true", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "southupperrightfalsefalse", bib.a($$2, Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "false", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "southupperrightfalsetrue", bib.a($$2, Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "false", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "southupperrighttruefalse", bib.a($$2, Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "true", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "southupperrighttruetrue", bib.a($$2, Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "true", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "westlowerleftfalsefalse", bib.a($$2, Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "false", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "westlowerleftfalsetrue", bib.a($$2, Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "false", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "westlowerlefttruefalse", bib.a($$2, Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "true", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "westlowerlefttruetrue", bib.a($$2, Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "true", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "westlowerrightfalsefalse", bib.a($$2, Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "false", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "westlowerrightfalsetrue", bib.a($$2, Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "false", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "westlowerrighttruefalse", bib.a($$2, Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "true", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "westlowerrighttruetrue", bib.a($$2, Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "true", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "westupperleftfalsefalse", bib.a($$2, Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "false", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "westupperleftfalsetrue", bib.a($$2, Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "false", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "westupperlefttruefalse", bib.a($$2, Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "true", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "westupperlefttruetrue", bib.a($$2, Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "true", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "westupperrightfalsefalse", bib.a($$2, Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "false", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "westupperrightfalsetrue", bib.a($$2, Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "false", "powered", "true")));
            $$0.put("minecraft:" + $$1 + "westupperrighttruefalse", bib.a($$2, Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "true", "powered", "false")));
            $$0.put("minecraft:" + $$1 + "westupperrighttruetrue", bib.a($$2, Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "true", "powered", "true")));
        }

        private static void a(Map<String, Dynamic<?>> $$0, int $$1, String $$2) {
            $$0.put("southfalsefoot" + $$1, bib.a("minecraft:" + $$2 + "_bed", Map.of("facing", "south", "occupied", "false", "part", "foot")));
            $$0.put("westfalsefoot" + $$1, bib.a("minecraft:" + $$2 + "_bed", Map.of("facing", "west", "occupied", "false", "part", "foot")));
            $$0.put("northfalsefoot" + $$1, bib.a("minecraft:" + $$2 + "_bed", Map.of("facing", "north", "occupied", "false", "part", "foot")));
            $$0.put("eastfalsefoot" + $$1, bib.a("minecraft:" + $$2 + "_bed", Map.of("facing", "east", "occupied", "false", "part", "foot")));
            $$0.put("southfalsehead" + $$1, bib.a("minecraft:" + $$2 + "_bed", Map.of("facing", "south", "occupied", "false", "part", "head")));
            $$0.put("westfalsehead" + $$1, bib.a("minecraft:" + $$2 + "_bed", Map.of("facing", "west", "occupied", "false", "part", "head")));
            $$0.put("northfalsehead" + $$1, bib.a("minecraft:" + $$2 + "_bed", Map.of("facing", "north", "occupied", "false", "part", "head")));
            $$0.put("eastfalsehead" + $$1, bib.a("minecraft:" + $$2 + "_bed", Map.of("facing", "east", "occupied", "false", "part", "head")));
            $$0.put("southtruehead" + $$1, bib.a("minecraft:" + $$2 + "_bed", Map.of("facing", "south", "occupied", "true", "part", "head")));
            $$0.put("westtruehead" + $$1, bib.a("minecraft:" + $$2 + "_bed", Map.of("facing", "west", "occupied", "true", "part", "head")));
            $$0.put("northtruehead" + $$1, bib.a("minecraft:" + $$2 + "_bed", Map.of("facing", "north", "occupied", "true", "part", "head")));
            $$0.put("easttruehead" + $$1, bib.a("minecraft:" + $$2 + "_bed", Map.of("facing", "east", "occupied", "true", "part", "head")));
        }

        private static void b(Map<String, Dynamic<?>> $$0, int $$1, String $$2) {
            for (int $$3 = 0; $$3 < 16; ++$$3) {
                $$0.put($$3 + "_" + $$1, bib.a("minecraft:" + $$2 + "_banner", Map.of("rotation", String.valueOf($$3))));
            }
            $$0.put("north_" + $$1, bib.a("minecraft:" + $$2 + "_wall_banner", Map.of("facing", "north")));
            $$0.put("south_" + $$1, bib.a("minecraft:" + $$2 + "_wall_banner", Map.of("facing", "south")));
            $$0.put("west_" + $$1, bib.a("minecraft:" + $$2 + "_wall_banner", Map.of("facing", "west")));
            $$0.put("east_" + $$1, bib.a("minecraft:" + $$2 + "_wall_banner", Map.of("facing", "east")));
        }

        static {
            b.set(2);
            b.set(3);
            b.set(110);
            b.set(140);
            b.set(144);
            b.set(25);
            b.set(86);
            b.set(26);
            b.set(176);
            b.set(177);
            b.set(175);
            b.set(64);
            b.set(71);
            b.set(193);
            b.set(194);
            b.set(195);
            b.set(196);
            b.set(197);
            a.set(54);
            a.set(146);
            a.set(25);
            a.set(26);
            a.set(51);
            a.set(53);
            a.set(67);
            a.set(108);
            a.set(109);
            a.set(114);
            a.set(128);
            a.set(134);
            a.set(135);
            a.set(136);
            a.set(156);
            a.set(163);
            a.set(164);
            a.set(180);
            a.set(203);
            a.set(55);
            a.set(85);
            a.set(113);
            a.set(188);
            a.set(189);
            a.set(190);
            a.set(191);
            a.set(192);
            a.set(93);
            a.set(94);
            a.set(101);
            a.set(102);
            a.set(160);
            a.set(106);
            a.set(107);
            a.set(183);
            a.set(184);
            a.set(185);
            a.set(186);
            a.set(187);
            a.set(132);
            a.set(139);
            a.set(199);
            t = bib.a("minecraft:air");
        }
    }
}


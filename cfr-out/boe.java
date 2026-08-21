/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.List$ListType
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntIterator
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class boe
extends DataFix {
    private static final int a = 128;
    private static final int b = 64;
    private static final int c = 32;
    private static final int d = 16;
    private static final int e = 8;
    private static final int f = 4;
    private static final int g = 2;
    private static final int h = 1;
    private static final int[][] i = new int[][]{{-1, 0, 0}, {1, 0, 0}, {0, -1, 0}, {0, 1, 0}, {0, 0, -1}, {0, 0, 1}};
    private static final int j = 7;
    private static final int k = 12;
    private static final int l = 4096;
    static final Object2IntMap<String> m = (Object2IntMap)DataFixUtils.make((Object)new Object2IntOpenHashMap(), $$0 -> {
        $$0.put((Object)"minecraft:acacia_leaves", 0);
        $$0.put((Object)"minecraft:birch_leaves", 1);
        $$0.put((Object)"minecraft:dark_oak_leaves", 2);
        $$0.put((Object)"minecraft:jungle_leaves", 3);
        $$0.put((Object)"minecraft:oak_leaves", 4);
        $$0.put((Object)"minecraft:spruce_leaves", 5);
    });
    static final Set<String> n = ImmutableSet.of((Object)"minecraft:acacia_bark", (Object)"minecraft:birch_bark", (Object)"minecraft:dark_oak_bark", (Object)"minecraft:jungle_bark", (Object)"minecraft:oak_bark", (Object)"minecraft:spruce_bark", (Object[])new String[]{"minecraft:acacia_log", "minecraft:birch_log", "minecraft:dark_oak_log", "minecraft:jungle_log", "minecraft:oak_log", "minecraft:spruce_log", "minecraft:stripped_acacia_log", "minecraft:stripped_birch_log", "minecraft:stripped_dark_oak_log", "minecraft:stripped_jungle_log", "minecraft:stripped_oak_log", "minecraft:stripped_spruce_log"});

    public boe(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(bqh.d);
        OpticFinder $$1 = $$0.findField("Level");
        OpticFinder $$2 = $$1.type().findField("Sections");
        Type $$32 = $$2.type();
        if (!($$32 instanceof List.ListType)) {
            throw new IllegalStateException("Expecting sections to be a list.");
        }
        Type $$4 = ((List.ListType)$$32).getElement();
        OpticFinder $$5 = DSL.typeFinder((Type)$$4);
        return this.fixTypeEverywhereTyped("Leaves fix", $$0, $$3 -> $$3.updateTyped($$1, $$22 -> {
            Object $$3 = new int[]{0};
            Typed $$4 = $$22.updateTyped($$2, $$2 -> {
                Object $$3 = new Int2ObjectOpenHashMap($$2.getAllTyped($$5).stream().map($$0 -> new a((Typed<?>)$$0, this.getInputSchema())).collect(Collectors.toMap(b::c, $$0 -> $$0)));
                if ($$3.values().stream().allMatch(b::b)) {
                    return $$2;
                }
                ArrayList $$4 = Lists.newArrayList();
                for (int $$5 = 0; $$5 < 7; ++$$5) {
                    $$4.add(new IntOpenHashSet());
                }
                for (a $$6 : $$3.values()) {
                    if ($$6.b()) continue;
                    for (int $$7 = 0; $$7 < 4096; ++$$7) {
                        int $$8 = $$6.c($$7);
                        if ($$6.a($$8)) {
                            ((IntSet)$$4.get(0)).add($$6.c() << 12 | $$7);
                            continue;
                        }
                        if (!$$6.b($$8)) continue;
                        int $$9 = this.a($$7);
                        int $$10 = this.c($$7);
                        $$1[0] = $$3[0] | boe.a($$9 == 0, $$9 == 15, $$10 == 0, $$10 == 15);
                    }
                }
                for (int $$11 = 1; $$11 < 7; ++$$11) {
                    IntSet $$12 = (IntSet)$$4.get($$11 - 1);
                    IntSet $$13 = (IntSet)$$4.get($$11);
                    IntIterator $$14 = $$12.iterator();
                    while ($$14.hasNext()) {
                        int $$15 = $$14.nextInt();
                        int $$16 = this.a($$15);
                        int $$17 = this.b($$15);
                        int $$18 = this.c($$15);
                        for (int[] $$19 : i) {
                            int $$26;
                            int $$24;
                            int $$25;
                            a $$23;
                            int $$20 = $$16 + $$19[0];
                            int $$21 = $$17 + $$19[1];
                            int $$22 = $$18 + $$19[2];
                            if ($$20 < 0 || $$20 > 15 || $$22 < 0 || $$22 > 15 || $$21 < 0 || $$21 > 255 || ($$23 = (a)$$3.get($$21 >> 4)) == null || $$23.b() || !$$23.b($$25 = $$23.c($$24 = boe.a($$20, $$21 & 0xF, $$22))) || ($$26 = $$23.d($$25)) <= $$11) continue;
                            $$23.a($$24, $$25, $$11);
                            $$13.add(boe.a($$20, $$21, $$22));
                        }
                    }
                }
                return $$2.updateTyped($$5, arg_0 -> boe.a((Int2ObjectMap)$$3, arg_0));
            });
            if ($$3[0] != 0) {
                $$4 = $$4.update(DSL.remainderFinder(), $$1 -> {
                    Dynamic $$2 = (Dynamic)DataFixUtils.orElse((Optional)$$1.get("UpgradeData").result(), (Object)$$1.emptyMap());
                    return $$1.set("UpgradeData", $$2.set("Sides", $$1.createByte((byte)($$2.get("Sides").asByte((byte)0) | $$3[0]))));
                });
            }
            return $$4;
        }));
    }

    public static int a(int $$0, int $$1, int $$2) {
        return $$1 << 8 | $$2 << 4 | $$0;
    }

    private int a(int $$0) {
        return $$0 & 0xF;
    }

    private int b(int $$0) {
        return $$0 >> 8 & 0xFF;
    }

    private int c(int $$0) {
        return $$0 >> 4 & 0xF;
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

    private static /* synthetic */ Typed a(Int2ObjectMap $$0, Typed $$1) {
        return ((a)$$0.get(((Dynamic)$$1.get(DSL.remainderFinder())).get("Y").asInt(0))).a($$1);
    }

    public static final class a
    extends b {
        private static final String h = "persistent";
        private static final String i = "decayable";
        private static final String j = "distance";
        private @Nullable IntSet k;
        private @Nullable IntSet l;
        private @Nullable Int2IntMap m;

        public a(Typed<?> $$0, Schema $$1) {
            super($$0, $$1);
        }

        @Override
        protected boolean a() {
            this.k = new IntOpenHashSet();
            this.l = new IntOpenHashSet();
            this.m = new Int2IntOpenHashMap();
            for (int $$0 = 0; $$0 < this.e.size(); ++$$0) {
                Dynamic $$1 = (Dynamic)this.e.get($$0);
                String $$2 = $$1.get("Name").asString("");
                if (m.containsKey((Object)$$2)) {
                    boolean $$3 = Objects.equals($$1.get("Properties").get(i).asString(""), "false");
                    this.k.add($$0);
                    this.m.put(this.a($$2, $$3, 7), $$0);
                    this.e.set($$0, this.a($$1, $$2, $$3, 7));
                }
                if (!n.contains($$2)) continue;
                this.l.add($$0);
            }
            return this.k.isEmpty() && this.l.isEmpty();
        }

        private Dynamic<?> a(Dynamic<?> $$0, String $$1, boolean $$2, int $$3) {
            Dynamic $$4 = $$0.emptyMap();
            $$4 = $$4.set(h, $$4.createString($$2 ? "true" : "false"));
            $$4 = $$4.set(j, $$4.createString(Integer.toString($$3)));
            Dynamic $$5 = $$0.emptyMap();
            $$5 = $$5.set("Properties", $$4);
            $$5 = $$5.set("Name", $$5.createString($$1));
            return $$5;
        }

        public boolean a(int $$0) {
            return this.l.contains($$0);
        }

        public boolean b(int $$0) {
            return this.k.contains($$0);
        }

        int d(int $$0) {
            if (this.a($$0)) {
                return 0;
            }
            return Integer.parseInt(((Dynamic)this.e.get($$0)).get("Properties").get(j).asString(""));
        }

        void a(int $$0, int $$1, int $$2) {
            boolean $$5;
            Dynamic $$3 = (Dynamic)this.e.get($$1);
            String $$4 = $$3.get("Name").asString("");
            int $$6 = this.a($$4, $$5 = Objects.equals($$3.get("Properties").get(h).asString(""), "true"), $$2);
            if (!this.m.containsKey($$6)) {
                int $$7 = this.e.size();
                this.k.add($$7);
                this.m.put($$6, $$7);
                this.e.add(this.a($$3, $$4, $$5, $$2));
            }
            int $$8 = this.m.get($$6);
            if (1 << this.g.b() <= $$8) {
                bid $$9 = new bid(this.g.b() + 1, 4096);
                for (int $$10 = 0; $$10 < 4096; ++$$10) {
                    $$9.a($$10, this.g.a($$10));
                }
                this.g = $$9;
            }
            this.g.a($$0, $$8);
        }
    }

    public static abstract class b {
        protected static final String a = "BlockStates";
        protected static final String b = "Name";
        protected static final String c = "Properties";
        private final Type<Pair<String, Dynamic<?>>> h = DSL.named((String)bqh.y.typeName(), (Type)DSL.remainderType());
        protected final OpticFinder<List<Pair<String, Dynamic<?>>>> d = DSL.fieldFinder((String)"Palette", (Type)DSL.list(this.h));
        protected final List<Dynamic<?>> e;
        protected final int f;
        protected @Nullable bid g;

        public b(Typed<?> $$02, Schema $$1) {
            if (!Objects.equals($$1.getType(bqh.y), this.h)) {
                throw new IllegalStateException("Block state type is not what was expected.");
            }
            Optional $$2 = $$02.getOptional(this.d);
            this.e = $$2.map($$0 -> $$0.stream().map(Pair::getSecond).collect(Collectors.toList())).orElse((List)ImmutableList.of());
            Dynamic $$3 = (Dynamic)$$02.get(DSL.remainderFinder());
            this.f = $$3.get("Y").asInt(0);
            this.a($$3);
        }

        protected void a(Dynamic<?> $$0) {
            if (this.a()) {
                this.g = null;
            } else {
                long[] $$1 = $$0.get(a).asLongStream().toArray();
                int $$2 = Math.max(4, DataFixUtils.ceillog2((int)this.e.size()));
                this.g = new bid($$2, 4096, $$1);
            }
        }

        public Typed<?> a(Typed<?> $$02) {
            if (this.b()) {
                return $$02;
            }
            return $$02.update(DSL.remainderFinder(), $$0 -> $$0.set(a, $$0.createLongList(Arrays.stream(this.g.a())))).set(this.d, this.e.stream().map($$0 -> Pair.of((Object)bqh.y.typeName(), (Object)$$0)).collect(Collectors.toList()));
        }

        public boolean b() {
            return this.g == null;
        }

        public int c(int $$0) {
            return this.g.a($$0);
        }

        protected int a(String $$0, boolean $$1, int $$2) {
            return m.get((Object)$$0) << 5 | ($$1 ? 16 : 0) | $$2;
        }

        int c() {
            return this.f;
        }

        protected abstract boolean a();
    }
}


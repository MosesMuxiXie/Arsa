/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.Arrays
 *  it.unimi.dsi.fastutil.Swapper
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntComparator
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.Swapper;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntComparator;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.slf4j.Logger;

public class ipx<T> {
    private static final boolean b = Boolean.parseBoolean(System.getProperty("SuffixArray.printComparisons", "false"));
    private static final boolean c = Boolean.parseBoolean(System.getProperty("SuffixArray.printArray", "false"));
    private static final Logger d = LogUtils.getLogger();
    private static final int e = -1;
    private static final int f = -2;
    protected final List<T> a = Lists.newArrayList();
    private final IntList g = new IntArrayList();
    private final IntList h = new IntArrayList();
    private IntList i = new IntArrayList();
    private IntList j = new IntArrayList();
    private int k;

    public void a(T $$0, String $$1) {
        this.k = Math.max(this.k, $$1.length());
        int $$2 = this.a.size();
        this.a.add($$0);
        this.h.add(this.g.size());
        for (int $$3 = 0; $$3 < $$1.length(); ++$$3) {
            this.i.add($$2);
            this.j.add($$3);
            this.g.add((int)$$1.charAt($$3));
        }
        this.i.add($$2);
        this.j.add($$1.length());
        this.g.add(-1);
    }

    public void a() {
        int $$0 = this.g.size();
        int[] $$1 = new int[$$0];
        int[] $$22 = new int[$$0];
        int[] $$32 = new int[$$0];
        int[] $$42 = new int[$$0];
        IntComparator $$5 = ($$2, $$3) -> {
            if ($$22[$$2] == $$22[$$3]) {
                return Integer.compare($$32[$$2], $$32[$$3]);
            }
            return Integer.compare($$22[$$2], $$22[$$3]);
        };
        Swapper $$6 = ($$3, $$4) -> {
            if ($$3 != $$4) {
                int $$5 = $$22[$$3];
                $$0[$$3] = $$22[$$4];
                $$0[$$4] = $$5;
                $$5 = $$32[$$3];
                $$1[$$3] = $$32[$$4];
                $$1[$$4] = $$5;
                $$5 = $$42[$$3];
                $$2[$$3] = $$42[$$4];
                $$2[$$4] = $$5;
            }
        };
        for (int $$7 = 0; $$7 < $$0; ++$$7) {
            $$1[$$7] = this.g.getInt($$7);
        }
        int $$8 = 1;
        int $$9 = Math.min($$0, this.k);
        while ($$8 * 2 < $$9) {
            for (int $$10 = 0; $$10 < $$0; ++$$10) {
                $$22[$$10] = $$1[$$10];
                $$32[$$10] = $$10 + $$8 < $$0 ? $$1[$$10 + $$8] : -2;
                $$42[$$10] = $$10;
            }
            it.unimi.dsi.fastutil.Arrays.quickSort((int)0, (int)$$0, (IntComparator)$$5, (Swapper)$$6);
            for (int $$11 = 0; $$11 < $$0; ++$$11) {
                $$1[$$42[$$11]] = $$11 > 0 && $$22[$$11] == $$22[$$11 - 1] && $$32[$$11] == $$32[$$11 - 1] ? $$1[$$42[$$11 - 1]] : $$11;
            }
            $$8 *= 2;
        }
        IntList $$12 = this.i;
        IntList $$13 = this.j;
        this.i = new IntArrayList($$12.size());
        this.j = new IntArrayList($$13.size());
        for (int $$14 = 0; $$14 < $$0; ++$$14) {
            int $$15 = $$42[$$14];
            this.i.add($$12.getInt($$15));
            this.j.add($$13.getInt($$15));
        }
        if (c) {
            this.b();
        }
    }

    private void b() {
        for (int $$0 = 0; $$0 < this.i.size(); ++$$0) {
            d.debug("{} {}", (Object)$$0, (Object)this.a($$0));
        }
        d.debug("");
    }

    private String a(int $$0) {
        int $$1 = this.j.getInt($$0);
        int $$2 = this.h.getInt(this.i.getInt($$0));
        StringBuilder $$3 = new StringBuilder();
        int $$4 = 0;
        while ($$2 + $$4 < this.g.size()) {
            int $$5;
            if ($$4 == $$1) {
                $$3.append('^');
            }
            if (($$5 = this.g.getInt($$2 + $$4)) == -1) break;
            $$3.append((char)$$5);
            ++$$4;
        }
        return $$3.toString();
    }

    private int a(String $$0, int $$1) {
        int $$2 = this.h.getInt(this.i.getInt($$1));
        int $$3 = this.j.getInt($$1);
        for (int $$4 = 0; $$4 < $$0.length(); ++$$4) {
            char $$7;
            int $$5 = this.g.getInt($$2 + $$3 + $$4);
            if ($$5 == -1) {
                return 1;
            }
            char $$6 = $$0.charAt($$4);
            if ($$6 < ($$7 = (char)$$5)) {
                return -1;
            }
            if ($$6 <= $$7) continue;
            return 1;
        }
        return 0;
    }

    public List<T> a(String $$0) {
        int $$1 = this.i.size();
        int $$2 = 0;
        int $$3 = $$1;
        while ($$2 < $$3) {
            int $$4 = $$2 + ($$3 - $$2) / 2;
            int $$5 = this.a($$0, $$4);
            if (b) {
                d.debug("comparing lower \"{}\" with {} \"{}\": {}", new Object[]{$$0, $$4, this.a($$4), $$5});
            }
            if ($$5 > 0) {
                $$2 = $$4 + 1;
                continue;
            }
            $$3 = $$4;
        }
        if ($$2 < 0 || $$2 >= $$1) {
            return Collections.emptyList();
        }
        int $$6 = $$2;
        $$3 = $$1;
        while ($$2 < $$3) {
            int $$7 = $$2 + ($$3 - $$2) / 2;
            int $$8 = this.a($$0, $$7);
            if (b) {
                d.debug("comparing upper \"{}\" with {} \"{}\": {}", new Object[]{$$0, $$7, this.a($$7), $$8});
            }
            if ($$8 >= 0) {
                $$2 = $$7 + 1;
                continue;
            }
            $$3 = $$7;
        }
        int $$9 = $$2;
        IntOpenHashSet $$10 = new IntOpenHashSet();
        for (int $$11 = $$6; $$11 < $$9; ++$$11) {
            $$10.add(this.i.getInt($$11));
        }
        int[] $$12 = $$10.toIntArray();
        Arrays.sort($$12);
        LinkedHashSet $$13 = Sets.newLinkedHashSet();
        for (int $$14 : $$12) {
            $$13.add(this.a.get($$14));
        }
        return Lists.newArrayList((Iterable)$$13);
    }
}


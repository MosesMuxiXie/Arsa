/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayFIFOQueue
 */
import it.unimi.dsi.fastutil.ints.IntArrayFIFOQueue;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Set;

public class htu {
    private static final int a = 4;
    private static final int b = 16;
    private static final int c = 15;
    private static final int d = 4096;
    private static final int e = 0;
    private static final int f = 4;
    private static final int g = 8;
    private static final int h = (int)Math.pow(16.0, 0.0);
    private static final int i = (int)Math.pow(16.0, 1.0);
    private static final int j = (int)Math.pow(16.0, 2.0);
    private static final int k = -1;
    private static final iz[] l = iz.values();
    private final BitSet m = new BitSet(4096);
    private static final int[] n = bhs.a(new int[1352], $$0 -> {
        boolean $$1 = false;
        int $$2 = 15;
        int $$3 = 0;
        for (int $$4 = 0; $$4 < 16; ++$$4) {
            for (int $$5 = 0; $$5 < 16; ++$$5) {
                for (int $$6 = 0; $$6 < 16; ++$$6) {
                    if ($$4 != 0 && $$4 != 15 && $$5 != 0 && $$5 != 15 && $$6 != 0 && $$6 != 15) continue;
                    $$0[$$3++] = htu.a($$4, $$5, $$6);
                }
            }
        }
    });
    private int o = 4096;

    public void a(is $$0) {
        this.m.set(htu.b($$0), true);
        --this.o;
    }

    private static int b(is $$0) {
        return htu.a($$0.u() & 0xF, $$0.v() & 0xF, $$0.w() & 0xF);
    }

    private static int a(int $$0, int $$1, int $$2) {
        return $$0 << 0 | $$1 << 8 | $$2 << 4;
    }

    public htv a() {
        htv $$0 = new htv();
        if (4096 - this.o < 256) {
            $$0.a(true);
        } else if (this.o == 0) {
            $$0.a(false);
        } else {
            for (int $$1 : n) {
                if (this.m.get($$1)) continue;
                $$0.a(this.a($$1));
            }
        }
        return $$0;
    }

    private Set<iz> a(int $$0) {
        EnumSet<iz> $$1 = EnumSet.noneOf(iz.class);
        IntArrayFIFOQueue $$2 = new IntArrayFIFOQueue();
        $$2.enqueue($$0);
        this.m.set($$0, true);
        while (!$$2.isEmpty()) {
            int $$3 = $$2.dequeueInt();
            this.a($$3, $$1);
            for (iz $$4 : l) {
                int $$5 = this.a($$3, $$4);
                if ($$5 < 0 || this.m.get($$5)) continue;
                this.m.set($$5, true);
                $$2.enqueue($$5);
            }
        }
        return $$1;
    }

    private void a(int $$0, Set<iz> $$1) {
        int $$2 = $$0 >> 0 & 0xF;
        if ($$2 == 0) {
            $$1.add(iz.e);
        } else if ($$2 == 15) {
            $$1.add(iz.f);
        }
        int $$3 = $$0 >> 8 & 0xF;
        if ($$3 == 0) {
            $$1.add(iz.a);
        } else if ($$3 == 15) {
            $$1.add(iz.b);
        }
        int $$4 = $$0 >> 4 & 0xF;
        if ($$4 == 0) {
            $$1.add(iz.c);
        } else if ($$4 == 15) {
            $$1.add(iz.d);
        }
    }

    private int a(int $$0, iz $$1) {
        switch ($$1) {
            case a: {
                if (($$0 >> 8 & 0xF) == 0) {
                    return -1;
                }
                return $$0 - j;
            }
            case b: {
                if (($$0 >> 8 & 0xF) == 15) {
                    return -1;
                }
                return $$0 + j;
            }
            case c: {
                if (($$0 >> 4 & 0xF) == 0) {
                    return -1;
                }
                return $$0 - i;
            }
            case d: {
                if (($$0 >> 4 & 0xF) == 15) {
                    return -1;
                }
                return $$0 + i;
            }
            case e: {
                if (($$0 >> 0 & 0xF) == 0) {
                    return -1;
                }
                return $$0 - h;
            }
            case f: {
                if (($$0 >> 0 & 0xF) == 15) {
                    return -1;
                }
                return $$0 + h;
            }
        }
        return -1;
    }
}


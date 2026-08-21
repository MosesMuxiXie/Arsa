/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;
import java.util.stream.Stream;

public class eqe {
    private final int a;
    private final BitSet b;
    private a c = ($$0, $$1, $$2) -> false;

    public eqe(int $$02, int $$12) {
        this.a = $$12;
        this.b = new BitSet(256 * $$02);
    }

    public void a(a $$0) {
        this.c = $$0;
    }

    public eqe(long[] $$02, int $$12) {
        this.a = $$12;
        this.b = BitSet.valueOf($$02);
    }

    private int c(int $$0, int $$1, int $$2) {
        return $$0 & 0xF | ($$2 & 0xF) << 4 | $$1 - this.a << 8;
    }

    public void a(int $$0, int $$1, int $$2) {
        this.b.set(this.c($$0, $$1, $$2));
    }

    public boolean b(int $$0, int $$1, int $$2) {
        return this.c.test($$0, $$1, $$2) || this.b.get(this.c($$0, $$1, $$2));
    }

    public Stream<is> a(dvu $$0) {
        return this.b.stream().mapToObj($$1 -> {
            int $$2 = $$1 & 0xF;
            int $$3 = $$1 >> 4 & 0xF;
            int $$4 = $$1 >> 8;
            return $$0.a($$2, $$4 + this.a, $$3);
        });
    }

    public long[] a() {
        return this.b.toLongArray();
    }

    public static interface a {
        public boolean test(int var1, int var2, int var3);
    }
}


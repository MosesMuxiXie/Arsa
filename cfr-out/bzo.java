/*
 * Decompiled with CFR 0.152.
 */
public final class bzo
implements Comparable<bzo> {
    public final double a;
    public final double b;
    public final long c;
    public final String d;

    public bzo(String $$0, double $$1, double $$2, long $$3) {
        this.d = $$0;
        this.a = $$1;
        this.b = $$2;
        this.c = $$3;
    }

    public int a(bzo $$0) {
        if ($$0.a < this.a) {
            return -1;
        }
        if ($$0.a > this.a) {
            return 1;
        }
        return $$0.d.compareTo(this.d);
    }

    public int a() {
        return (this.d.hashCode() & 0xAAAAAA) + -12303292;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((bzo)object);
    }
}


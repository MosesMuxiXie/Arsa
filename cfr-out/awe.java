/*
 * Decompiled with CFR 0.152.
 */
public class awe
implements Comparable<awe> {
    private final int a;
    private final is b;
    private int c;
    private int d;

    public awe(int $$0, is $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public int a() {
        return this.a;
    }

    public is b() {
        return this.b;
    }

    public void a(int $$0) {
        if ($$0 > 10) {
            $$0 = 10;
        }
        this.c = $$0;
    }

    public int c() {
        return this.c;
    }

    public void b(int $$0) {
        this.d = $$0;
    }

    public int d() {
        return this.d;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        awe $$1 = (awe)$$0;
        return this.a == $$1.a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public int a(awe $$0) {
        if (this.c != $$0.c) {
            return Integer.compare(this.c, $$0.c);
        }
        return Integer.compare(this.a, $$0.a);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((awe)object);
    }
}


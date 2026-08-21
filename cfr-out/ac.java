/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class ac
extends Record {
    private final amo c;
    private final ab d;
    public static final aao<xq, ac> a = aao.a(amo.b, ac::a, ab.b, ac::b, ac::new);
    public static final aao<xq, List<ac>> b = a.a(aam.a());

    public ac(amo $$0, ab $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof ac)) return false;
        ac $$1 = (ac)$$0;
        if (!this.c.equals($$1.c)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override
    public String toString() {
        return this.c.toString();
    }

    public amo a() {
        return this.c;
    }

    public ab b() {
        return this.d;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class gxb
extends Enum<gxb>
implements dqk {
    public static final /* enum */ gxb a = new gxb(dqu.c, dqu.a, dqu.d, dqu.b);
    public static final /* enum */ gxb b = new gxb(dqu.e, dqu.f, dqu.g);
    public static final /* enum */ gxb c = new gxb(dqu.h, dqu.i);
    public static final /* enum */ gxb d = new gxb(dqu.j);
    private final List<dqv> e;
    private static final /* synthetic */ gxb[] f;

    public static gxb[] values() {
        return (gxb[])f.clone();
    }

    public static gxb valueOf(String $$0) {
        return Enum.valueOf(gxb.class, $$0);
    }

    private gxb(dqv ... $$0) {
        this.e = List.of($$0);
    }

    public List<dqv> a() {
        return this.e;
    }

    private static /* synthetic */ gxb[] b() {
        return new gxb[]{a, b, c, d};
    }

    static {
        f = gxb.b();
    }
}


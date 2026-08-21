/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public final class ja
extends Enum<ja> {
    public static final /* enum */ ja a = new ja(iz.c);
    public static final /* enum */ ja b = new ja(iz.c, iz.f);
    public static final /* enum */ ja c = new ja(iz.f);
    public static final /* enum */ ja d = new ja(iz.d, iz.f);
    public static final /* enum */ ja e = new ja(iz.d);
    public static final /* enum */ ja f = new ja(iz.d, iz.e);
    public static final /* enum */ ja g = new ja(iz.e);
    public static final /* enum */ ja h = new ja(iz.c, iz.e);
    private final Set<iz> i;
    private final jy j;
    private static final /* synthetic */ ja[] k;

    public static ja[] values() {
        return (ja[])k.clone();
    }

    public static ja valueOf(String $$0) {
        return Enum.valueOf(ja.class, $$0);
    }

    private ja(iz ... $$0) {
        this.i = Sets.immutableEnumSet(Arrays.asList($$0));
        this.j = new jy(0, 0, 0);
        for (iz $$1 : $$0) {
            this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
        }
    }

    public Set<iz> a() {
        return this.i;
    }

    public int b() {
        return this.j.u();
    }

    public int c() {
        return this.j.w();
    }

    private static /* synthetic */ ja[] d() {
        return new ja[]{a, b, c, d, e, f, g, h};
    }

    static {
        k = ja.d();
    }
}


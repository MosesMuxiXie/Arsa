/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class dss
extends Enum<dss>
implements bhh {
    public static final /* enum */ dss a = new dss("attacker");
    public static final /* enum */ dss b = new dss("damaging_entity");
    public static final /* enum */ dss c = new dss("victim");
    public static final Codec<dss> d;
    private final String e;
    private static final /* synthetic */ dss[] f;

    public static dss[] values() {
        return (dss[])f.clone();
    }

    public static dss valueOf(String $$0) {
        return Enum.valueOf(dss.class, $$0);
    }

    private dss(String $$0) {
        this.e = $$0;
    }

    @Override
    public String c() {
        return this.e;
    }

    private static /* synthetic */ dss[] a() {
        return new dss[]{a, b, c};
    }

    static {
        f = dss.a();
        d = bhh.a(dss::values);
    }
}


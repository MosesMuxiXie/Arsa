/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class cfb
extends Enum<cfb>
implements bhh {
    public static final /* enum */ cfb a = new cfb("default");
    public static final /* enum */ cfb b = new cfb("fall_variants");
    public static final /* enum */ cfb c = new cfb("intentional_game_design");
    public static final Codec<cfb> d;
    private final String e;
    private static final /* synthetic */ cfb[] f;

    public static cfb[] values() {
        return (cfb[])f.clone();
    }

    public static cfb valueOf(String $$0) {
        return Enum.valueOf(cfb.class, $$0);
    }

    private cfb(String $$0) {
        this.e = $$0;
    }

    @Override
    public String c() {
        return this.e;
    }

    private static /* synthetic */ cfb[] a() {
        return new cfb[]{a, b, c};
    }

    static {
        f = cfb.a();
        d = bhh.a(cfb::values);
    }
}


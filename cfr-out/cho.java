/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class cho
extends Enum<cho>
implements bhh {
    public static final /* enum */ cho a = new cho("monster", 70, false, false, 128);
    public static final /* enum */ cho b = new cho("creature", 10, true, true, 128);
    public static final /* enum */ cho c = new cho("ambient", 15, true, false, 128);
    public static final /* enum */ cho d = new cho("axolotls", 5, true, false, 128);
    public static final /* enum */ cho e = new cho("underground_water_creature", 5, true, false, 128);
    public static final /* enum */ cho f = new cho("water_creature", 5, true, false, 128);
    public static final /* enum */ cho g = new cho("water_ambient", 20, true, false, 64);
    public static final /* enum */ cho h = new cho("misc", -1, true, true, 128);
    public static final Codec<cho> i;
    private final int j;
    private final boolean k;
    private final boolean l;
    private final String m;
    private final int n = 32;
    private final int o;
    private static final /* synthetic */ cho[] p;

    public static cho[] values() {
        return (cho[])p.clone();
    }

    public static cho valueOf(String $$0) {
        return Enum.valueOf(cho.class, $$0);
    }

    private cho(String $$0, int $$1, boolean $$2, boolean $$3, int $$4) {
        this.m = $$0;
        this.j = $$1;
        this.k = $$2;
        this.l = $$3;
        this.o = $$4;
    }

    public String a() {
        return this.m;
    }

    @Override
    public String c() {
        return this.m;
    }

    public int b() {
        return this.j;
    }

    public boolean d() {
        return this.k;
    }

    public boolean e() {
        return this.l;
    }

    public int f() {
        return this.o;
    }

    public int g() {
        return 32;
    }

    private static /* synthetic */ cho[] h() {
        return new cho[]{a, b, c, d, e, f, g, h};
    }

    static {
        p = cho.h();
        i = bhh.a(cho::values);
    }
}


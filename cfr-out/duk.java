/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class duk
extends Enum<duk>
implements bhh {
    public static final /* enum */ duk a = new duk(cgv.f, 11, "helmet");
    public static final /* enum */ duk b = new duk(cgv.e, 16, "chestplate");
    public static final /* enum */ duk c = new duk(cgv.d, 15, "leggings");
    public static final /* enum */ duk d = new duk(cgv.c, 13, "boots");
    public static final /* enum */ duk e = new duk(cgv.g, 16, "body");
    public static final Codec<duk> f;
    private final cgv g;
    private final String h;
    private final int i;
    private static final /* synthetic */ duk[] j;

    public static duk[] values() {
        return (duk[])j.clone();
    }

    public static duk valueOf(String $$0) {
        return Enum.valueOf(duk.class, $$0);
    }

    private duk(cgv $$0, int $$1, String $$2) {
        this.g = $$0;
        this.h = $$2;
        this.i = $$1;
    }

    public int a(int $$0) {
        return this.i * $$0;
    }

    public cgv a() {
        return this.g;
    }

    public String b() {
        return this.h;
    }

    @Override
    public String c() {
        return this.h;
    }

    private static /* synthetic */ duk[] d() {
        return new duk[]{a, b, c, d, e};
    }

    static {
        j = duk.d();
        f = bhh.b(duk::values);
    }
}


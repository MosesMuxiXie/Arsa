/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class ai
extends Enum<ai>
implements bhh {
    public static final /* enum */ ai a = new ai("task", l.k);
    public static final /* enum */ ai b = new ai("challenge", l.f);
    public static final /* enum */ ai c = new ai("goal", l.k);
    public static final Codec<ai> d;
    private final String e;
    private final l f;
    private final yh g;
    private static final /* synthetic */ ai[] h;

    public static ai[] values() {
        return (ai[])h.clone();
    }

    public static ai valueOf(String $$0) {
        return Enum.valueOf(ai.class, $$0);
    }

    private ai(String $$0, l $$1) {
        this.e = $$0;
        this.f = $$1;
        this.g = yh.c("advancements.toast." + $$0);
    }

    public l a() {
        return this.f;
    }

    public yh b() {
        return this.g;
    }

    @Override
    public String c() {
        return this.e;
    }

    public yw a(ac $$0, axg $$1) {
        return yh.a("chat.type.advancement." + this.e, $$1.R_(), ab.a($$0));
    }

    private static /* synthetic */ ai[] d() {
        return new ai[]{a, b, c};
    }

    static {
        h = ai.d();
        d = bhh.a(ai::values);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class fdu
extends fdv {
    public static final fdu a = new fdu(evk.a(0));
    public static final MapCodec<fdu> b = evk.a.fieldOf("value").xmap(fdu::new, fdu::b);
    private final evk d;

    public static fdu a(evk $$0) {
        return new fdu($$0);
    }

    private fdu(evk $$0) {
        this.d = $$0;
    }

    public evk b() {
        return this.d;
    }

    @Override
    public int a(bgr $$0, evn $$1) {
        return this.d.a($$1);
    }

    @Override
    public fdw<?> a() {
        return fdw.a;
    }

    public String toString() {
        return this.d.toString();
    }
}


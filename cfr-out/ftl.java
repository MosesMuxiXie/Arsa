/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;

public class ftl {
    public static final ftl a = new ftl(0.0f, 0.0f);
    public static final ftl b = new ftl(1.0f, 1.0f);
    public static final ftl c = new ftl(1.0f, 0.0f);
    public static final ftl d = new ftl(-1.0f, 0.0f);
    public static final ftl e = new ftl(0.0f, 1.0f);
    public static final ftl f = new ftl(0.0f, -1.0f);
    public static final ftl g = new ftl(Float.MAX_VALUE, Float.MAX_VALUE);
    public static final ftl h = new ftl(Float.MIN_VALUE, Float.MIN_VALUE);
    public static final Codec<ftl> i = Codec.FLOAT.listOf().comapFlatMap($$02 -> bhs.a($$02, 2).map($$0 -> new ftl(((Float)$$0.get(0)).floatValue(), ((Float)$$0.get(1)).floatValue())), $$0 -> List.of(Float.valueOf($$0.j), Float.valueOf($$0.k)));
    public final float j;
    public final float k;

    public ftl(float $$0, float $$1) {
        this.j = $$0;
        this.k = $$1;
    }

    public ftl a(float $$0) {
        return new ftl(this.j * $$0, this.k * $$0);
    }

    public float a(ftl $$0) {
        return this.j * $$0.j + this.k * $$0.k;
    }

    public ftl b(ftl $$0) {
        return new ftl(this.j + $$0.j, this.k + $$0.k);
    }

    public ftl b(float $$0) {
        return new ftl(this.j + $$0, this.k + $$0);
    }

    public boolean c(ftl $$0) {
        return this.j == $$0.j && this.k == $$0.k;
    }

    public ftl a() {
        float $$0 = bgj.a(this.j * this.j + this.k * this.k);
        return $$0 < 1.0E-4f ? a : new ftl(this.j / $$0, this.k / $$0);
    }

    public float b() {
        return bgj.a(this.j * this.j + this.k * this.k);
    }

    public float c() {
        return this.j * this.j + this.k * this.k;
    }

    public float d(ftl $$0) {
        float $$1 = $$0.j - this.j;
        float $$2 = $$0.k - this.k;
        return $$1 * $$1 + $$2 * $$2;
    }

    public ftl d() {
        return new ftl(-this.j, -this.k);
    }
}


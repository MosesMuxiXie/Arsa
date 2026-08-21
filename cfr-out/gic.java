/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public final class gic {
    public static final gic a = gic.a("all");
    public static final gic b = gic.a("texture", a);
    public static final gic c = gic.a("particle", b);
    public static final gic d = gic.a("end", a);
    public static final gic e = gic.a("bottom", d);
    public static final gic f = gic.a("top", d);
    public static final gic g = gic.a("front", a);
    public static final gic h = gic.a("back", a);
    public static final gic i = gic.a("side", a);
    public static final gic j = gic.a("north", i);
    public static final gic k = gic.a("south", i);
    public static final gic l = gic.a("east", i);
    public static final gic m = gic.a("west", i);
    public static final gic n = gic.a("up");
    public static final gic o = gic.a("down");
    public static final gic p = gic.a("cross");
    public static final gic q = gic.a("cross_emissive");
    public static final gic r = gic.a("plant");
    public static final gic s = gic.a("wall", a);
    public static final gic t = gic.a("rail");
    public static final gic u = gic.a("wool");
    public static final gic v = gic.a("pattern");
    public static final gic w = gic.a("pane");
    public static final gic x = gic.a("edge");
    public static final gic y = gic.a("fan");
    public static final gic z = gic.a("stem");
    public static final gic A = gic.a("upperstem");
    public static final gic B = gic.a("crop");
    public static final gic C = gic.a("dirt");
    public static final gic D = gic.a("fire");
    public static final gic E = gic.a("lantern");
    public static final gic F = gic.a("platform");
    public static final gic G = gic.a("unsticky");
    public static final gic H = gic.a("torch");
    public static final gic I = gic.a("layer0");
    public static final gic J = gic.a("layer1");
    public static final gic K = gic.a("layer2");
    public static final gic L = gic.a("lit_log");
    public static final gic M = gic.a("candle");
    public static final gic N = gic.a("inside");
    public static final gic O = gic.a("content");
    public static final gic P = gic.a("inner_top");
    public static final gic Q = gic.a("flowerbed");
    public static final gic R = gic.a("tentacles");
    public static final gic S = gic.a("bars");
    private final String T;
    private final @Nullable gic U;

    private static gic a(String $$0) {
        return new gic($$0, null);
    }

    private static gic a(String $$0, gic $$1) {
        return new gic($$0, $$1);
    }

    private gic(String $$0, @Nullable gic $$1) {
        this.T = $$0;
        this.U = $$1;
    }

    public String a() {
        return this.T;
    }

    public @Nullable gic b() {
        return this.U;
    }

    public String toString() {
        return "#" + this.T;
    }
}


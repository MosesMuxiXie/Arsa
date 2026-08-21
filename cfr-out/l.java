/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  org.jetbrains.annotations.Contract
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;

public final class l
extends Enum<l>
implements bhh {
    public static final /* enum */ l a = new l("BLACK", '0', 0, 0);
    public static final /* enum */ l b = new l("DARK_BLUE", '1', 1, 170);
    public static final /* enum */ l c = new l("DARK_GREEN", '2', 2, 43520);
    public static final /* enum */ l d = new l("DARK_AQUA", '3', 3, 43690);
    public static final /* enum */ l e = new l("DARK_RED", '4', 4, 0xAA0000);
    public static final /* enum */ l f = new l("DARK_PURPLE", '5', 5, 0xAA00AA);
    public static final /* enum */ l g = new l("GOLD", '6', 6, 0xFFAA00);
    public static final /* enum */ l h = new l("GRAY", '7', 7, 0xAAAAAA);
    public static final /* enum */ l i = new l("DARK_GRAY", '8', 8, 0x555555);
    public static final /* enum */ l j = new l("BLUE", '9', 9, 0x5555FF);
    public static final /* enum */ l k = new l("GREEN", 'a', 10, 0x55FF55);
    public static final /* enum */ l l = new l("AQUA", 'b', 11, 0x55FFFF);
    public static final /* enum */ l m = new l("RED", 'c', 12, 0xFF5555);
    public static final /* enum */ l n = new l("LIGHT_PURPLE", 'd', 13, 0xFF55FF);
    public static final /* enum */ l o = new l("YELLOW", 'e', 14, 0xFFFF55);
    public static final /* enum */ l p = new l("WHITE", 'f', 15, 0xFFFFFF);
    public static final /* enum */ l q = new l("OBFUSCATED", 'k', true);
    public static final /* enum */ l r = new l("BOLD", 'l', true);
    public static final /* enum */ l s = new l("STRIKETHROUGH", 'm', true);
    public static final /* enum */ l t = new l("UNDERLINE", 'n', true);
    public static final /* enum */ l u = new l("ITALIC", 'o', true);
    public static final /* enum */ l v = new l("RESET", 'r', -1, null);
    public static final Codec<l> w;
    public static final Codec<l> x;
    public static final char y = '\u00a7';
    private static final Map<String, l> z;
    private static final Pattern A;
    private final String B;
    private final char C;
    private final boolean D;
    private final String E;
    private final int F;
    private final @Nullable Integer G;
    private static final /* synthetic */ l[] H;

    public static l[] values() {
        return (l[])H.clone();
    }

    public static l valueOf(String $$0) {
        return Enum.valueOf(l.class, $$0);
    }

    private static String c(String $$0) {
        return $$0.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
    }

    private l(String $$0, @Nullable char $$1, int $$2, Integer $$3) {
        this($$0, $$1, false, $$2, $$3);
    }

    private l(String $$0, char $$1, boolean $$2) {
        this($$0, $$1, $$2, -1, null);
    }

    private l(String $$0, char $$1, @Nullable boolean $$2, int $$3, Integer $$4) {
        this.B = $$0;
        this.C = $$1;
        this.D = $$2;
        this.F = $$3;
        this.G = $$4;
        this.E = "\u00a7" + String.valueOf($$1);
    }

    public char a() {
        return this.C;
    }

    public int b() {
        return this.F;
    }

    public boolean d() {
        return this.D;
    }

    public boolean e() {
        return !this.D && this != v;
    }

    public @Nullable Integer f() {
        return this.G;
    }

    public String g() {
        return this.name().toLowerCase(Locale.ROOT);
    }

    public String toString() {
        return this.E;
    }

    @Contract(value="!null->!null;_->_")
    public static @Nullable String a(@Nullable String $$0) {
        return $$0 == null ? null : A.matcher($$0).replaceAll("");
    }

    public static @Nullable l b(@Nullable String $$0) {
        if ($$0 == null) {
            return null;
        }
        return z.get(l.c($$0));
    }

    public static @Nullable l a(int $$0) {
        if ($$0 < 0) {
            return v;
        }
        for (l $$1 : l.values()) {
            if ($$1.b() != $$0) continue;
            return $$1;
        }
        return null;
    }

    public static @Nullable l a(char $$0) {
        char $$1 = Character.toLowerCase($$0);
        for (l $$2 : l.values()) {
            if ($$2.C != $$1) continue;
            return $$2;
        }
        return null;
    }

    public static Collection<String> a(boolean $$0, boolean $$1) {
        ArrayList $$2 = Lists.newArrayList();
        for (l $$3 : l.values()) {
            if ($$3.e() && !$$0 || $$3.d() && !$$1) continue;
            $$2.add($$3.g());
        }
        return $$2;
    }

    @Override
    public String c() {
        return this.g();
    }

    private static /* synthetic */ l[] h() {
        return new l[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v};
    }

    static {
        H = l.h();
        w = bhh.a(l::values);
        x = w.validate($$0 -> $$0.d() ? DataResult.error(() -> "Formatting was not a valid color: " + String.valueOf($$0)) : DataResult.success((Object)$$0));
        z = Arrays.stream(l.values()).collect(Collectors.toMap($$0 -> l.c($$0.B), $$0 -> $$0));
        A = Pattern.compile("(?i)\u00a7[0-9A-FK-OR]");
    }
}


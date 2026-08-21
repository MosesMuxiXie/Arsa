/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.chars.CharArraySet
 *  it.unimi.dsi.fastutil.chars.CharSet
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.chars.CharArraySet;
import it.unimi.dsi.fastutil.chars.CharSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public final class drh {
    private static final int d = 3;
    public static final char a = ' ';
    public static final MapCodec<drh> b = drh$a.a.flatXmap(drh::a, $$0 -> $$0.h.map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Cannot encode unpacked recipe")));
    public static final aao<xq, drh> c = aao.a(aam.h, (C $$0) -> $$0.e, aam.h, (C $$0) -> $$0.f, dqo.b.a(aam.a()), (C $$0) -> $$0.g, drh::a);
    private final int e;
    private final int f;
    private final List<Optional<dqo>> g;
    private final Optional<a> h;
    private final int i;
    private final boolean j;

    public drh(int $$0, int $$1, List<Optional<dqo>> $$2, Optional<a> $$3) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
        this.i = (int)$$2.stream().flatMap(Optional::stream).count();
        this.j = bhs.a($$0, $$1, $$2);
    }

    private static drh a(Integer $$0, Integer $$1, List<Optional<dqo>> $$2) {
        return new drh($$0, $$1, $$2, Optional.empty());
    }

    public static drh a(Map<Character, dqo> $$0, String ... $$1) {
        return drh.a($$0, List.of($$1));
    }

    public static drh a(Map<Character, dqo> $$0, List<String> $$1) {
        a $$2 = new a($$0, $$1);
        return (drh)drh.a($$2).getOrThrow();
    }

    private static DataResult<drh> a(a $$0) {
        String[] $$1 = drh.a($$0.c);
        int $$2 = $$1[0].length();
        int $$3 = $$1.length;
        ArrayList<Optional<dqo>> $$4 = new ArrayList<Optional<dqo>>($$2 * $$3);
        CharArraySet $$5 = new CharArraySet($$0.b.keySet());
        for (String $$6 : $$1) {
            for (int $$7 = 0; $$7 < $$6.length(); ++$$7) {
                Optional<dqo> $$11;
                char $$8 = $$6.charAt($$7);
                if ($$8 == ' ') {
                    Optional $$9 = Optional.empty();
                } else {
                    dqo $$10 = $$0.b.get(Character.valueOf($$8));
                    if ($$10 == null) {
                        return DataResult.error(() -> "Pattern references symbol '" + $$8 + "' but it's not defined in the key");
                    }
                    $$11 = Optional.of($$10);
                }
                $$5.remove($$8);
                $$4.add($$11);
            }
        }
        if (!$$5.isEmpty()) {
            return DataResult.error(() -> drh.a((CharSet)$$5));
        }
        return DataResult.success((Object)new drh($$2, $$3, $$4, Optional.of($$0)));
    }

    @VisibleForTesting
    static String[] a(List<String> $$0) {
        int $$1 = Integer.MAX_VALUE;
        int $$2 = 0;
        int $$3 = 0;
        int $$4 = 0;
        for (int $$5 = 0; $$5 < $$0.size(); ++$$5) {
            String $$6 = $$0.get($$5);
            $$1 = Math.min($$1, drh.a($$6));
            int $$7 = drh.b($$6);
            $$2 = Math.max($$2, $$7);
            if ($$7 < 0) {
                if ($$3 == $$5) {
                    ++$$3;
                }
                ++$$4;
                continue;
            }
            $$4 = 0;
        }
        if ($$0.size() == $$4) {
            return new String[0];
        }
        String[] $$8 = new String[$$0.size() - $$4 - $$3];
        for (int $$9 = 0; $$9 < $$8.length; ++$$9) {
            $$8[$$9] = $$0.get($$9 + $$3).substring($$1, $$2 + 1);
        }
        return $$8;
    }

    private static int a(String $$0) {
        int $$1;
        for ($$1 = 0; $$1 < $$0.length() && $$0.charAt($$1) == ' '; ++$$1) {
        }
        return $$1;
    }

    private static int b(String $$0) {
        int $$1;
        for ($$1 = $$0.length() - 1; $$1 >= 0 && $$0.charAt($$1) == ' '; --$$1) {
        }
        return $$1;
    }

    public boolean a(dqg $$0) {
        if ($$0.e() != this.i) {
            return false;
        }
        if ($$0.f() == this.e && $$0.g() == this.f) {
            if (!this.j && this.a($$0, true)) {
                return true;
            }
            if (this.a($$0, false)) {
                return true;
            }
        }
        return false;
    }

    private boolean a(dqg $$0, boolean $$1) {
        for (int $$2 = 0; $$2 < this.f; ++$$2) {
            for (int $$3 = 0; $$3 < this.e; ++$$3) {
                Optional<dqo> $$5;
                if ($$1) {
                    Optional<dqo> $$4 = this.g.get(this.e - $$3 - 1 + $$2 * this.e);
                } else {
                    $$5 = this.g.get($$3 + $$2 * this.e);
                }
                dlt $$6 = $$0.a($$3, $$2);
                if (dqo.a($$5, $$6)) continue;
                return false;
            }
        }
        return true;
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public List<Optional<dqo>> c() {
        return this.g;
    }

    private static /* synthetic */ String a(CharSet $$0) {
        return "Key defines symbols that aren't used in pattern: " + String.valueOf($$0);
    }

    public static final class a
    extends Record {
        final Map<Character, dqo> b;
        final List<String> c;
        private static final Codec<List<String>> d = Codec.STRING.listOf().comapFlatMap($$0 -> {
            if ($$0.size() > 3) {
                return DataResult.error(() -> "Invalid pattern: too many rows, 3 is maximum");
            }
            if ($$0.isEmpty()) {
                return DataResult.error(() -> "Invalid pattern: empty pattern not allowed");
            }
            int $$1 = ((String)$$0.getFirst()).length();
            for (String $$2 : $$0) {
                if ($$2.length() > 3) {
                    return DataResult.error(() -> "Invalid pattern: too many columns, 3 is maximum");
                }
                if ($$1 == $$2.length()) continue;
                return DataResult.error(() -> "Invalid pattern: each row must be the same width");
            }
            return DataResult.success((Object)$$0);
        }, Function.identity());
        private static final Codec<Character> e = Codec.STRING.comapFlatMap($$0 -> {
            if ($$0.length() != 1) {
                return DataResult.error(() -> "Invalid key entry: '" + $$0 + "' is an invalid symbol (must be 1 character only).");
            }
            if (" ".equals($$0)) {
                return DataResult.error(() -> "Invalid key entry: ' ' is a reserved symbol.");
            }
            return DataResult.success((Object)Character.valueOf($$0.charAt(0)));
        }, String::valueOf);
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)bfm.b(e, dqo.d).fieldOf("key").forGetter($$0 -> $$0.b), (App)d.fieldOf("pattern").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, a::new));

        public a(Map<Character, dqo> $$0, List<String> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "key;pattern", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "key;pattern", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "key;pattern", "b", "c"}, this, $$0);
        }

        public Map<Character, dqo> a() {
            return this.b;
        }

        public List<String> b() {
            return this.c;
        }
    }
}


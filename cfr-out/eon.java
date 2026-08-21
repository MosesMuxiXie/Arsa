/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.chars.CharOpenHashSet
 *  it.unimi.dsi.fastutil.chars.CharSet
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.chars.CharOpenHashSet;
import it.unimi.dsi.fastutil.chars.CharSet;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class eon {
    private final List<String[]> a = Lists.newArrayList();
    private final Map<Character, Predicate<@Nullable eol>> b = Maps.newHashMap();
    private int c;
    private int d;
    private final CharSet e = new CharOpenHashSet();

    private eon() {
        this.b.put(Character.valueOf(' '), $$0 -> true);
    }

    public eon a(String ... $$0) {
        if (ArrayUtils.isEmpty((Object[])$$0) || StringUtils.isEmpty((CharSequence)$$0[0])) {
            throw new IllegalArgumentException("Empty pattern for aisle");
        }
        if (this.a.isEmpty()) {
            this.c = $$0.length;
            this.d = $$0[0].length();
        }
        if ($$0.length != this.c) {
            throw new IllegalArgumentException("Expected aisle with height of " + this.c + ", but was given one with a height of " + $$0.length + ")");
        }
        for (String $$1 : $$0) {
            if ($$1.length() != this.d) {
                throw new IllegalArgumentException("Not all rows in the given aisle are the correct width (expected " + this.d + ", found one with " + $$1.length() + ")");
            }
            for (char $$2 : $$1.toCharArray()) {
                if (this.b.containsKey(Character.valueOf($$2))) continue;
                this.e.add($$2);
            }
        }
        this.a.add($$0);
        return this;
    }

    public static eon a() {
        return new eon();
    }

    public eon a(char $$0, Predicate<@Nullable eol> $$1) {
        this.b.put(Character.valueOf($$0), $$1);
        this.e.remove($$0);
        return this;
    }

    public eom b() {
        return new eom(this.c());
    }

    private Predicate<eol>[][][] c() {
        if (!this.e.isEmpty()) {
            throw new IllegalStateException("Predicates for character(s) " + String.valueOf(this.e) + " are missing");
        }
        Predicate[][][] $$0 = (Predicate[][][])Array.newInstance(Predicate.class, this.a.size(), this.c, this.d);
        for (int $$1 = 0; $$1 < this.a.size(); ++$$1) {
            for (int $$2 = 0; $$2 < this.c; ++$$2) {
                for (int $$3 = 0; $$3 < this.d; ++$$3) {
                    $$0[$$1][$$2][$$3] = this.b.get(Character.valueOf(this.a.get($$1)[$$2].charAt($$3)));
                }
            }
        }
        return $$0;
    }
}


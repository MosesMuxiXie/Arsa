/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.context.StringRange
 *  com.mojang.brigadier.suggestion.Suggestion
 *  com.mojang.brigadier.suggestion.Suggestions
 */
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;

public final class ads
extends Record
implements aay<adb> {
    private final int b;
    private final int c;
    private final int d;
    private final List<a> e;
    public static final aao<xq, ads> a = aao.a(aam.h, ads::e, aam.h, ads::f, aam.h, ads::g, ads$a.a.a(aam.a()), ads::h, ads::new);

    public ads(int $$02, Suggestions $$1) {
        this($$02, $$1.getRange().getStart(), $$1.getRange().getLength(), $$1.getList().stream().map($$0 -> new a($$0.getText(), Optional.ofNullable($$0.getTooltip()).map(yk::a))).toList());
    }

    public ads(int $$0, int $$1, int $$2, List<a> $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    @Override
    public aba<ads> a() {
        return ahz.q;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public Suggestions b() {
        StringRange $$0 = StringRange.between((int)this.c, (int)(this.c + this.d));
        return new Suggestions($$0, this.e.stream().map($$1 -> new Suggestion($$0, $$1.a(), (Message)$$1.b().orElse(null))).toList());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ads.class, "id;start;length;suggestions", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ads.class, "id;start;length;suggestions", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ads.class, "id;start;length;suggestions", "b", "c", "d", "e"}, this, $$0);
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.c;
    }

    public int g() {
        return this.d;
    }

    public List<a> h() {
        return this.e;
    }

    public static final class a
    extends Record {
        private final String b;
        private final Optional<yh> c;
        public static final aao<xq, a> a = aao.a(aam.p, a::a, yj.e, a::b, a::new);

        public a(String $$0, Optional<yh> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "text;tooltip", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "text;tooltip", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "text;tooltip", "b", "c"}, this, $$0);
        }

        public String a() {
            return this.b;
        }

        public Optional<yh> b() {
            return this.c;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class cea<Value> {
    private final cdw<Value> a;
    private final Value b;
    private final cdv<Value> c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    cea(cdw<Value> $$0, Value $$1, cdv<Value> $$2, boolean $$3, boolean $$4, boolean $$5) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
        this.f = $$5;
    }

    public static <Value> a<Value> a(cdw<Value> $$0) {
        return new a<Value>($$0);
    }

    public cdw<Value> a() {
        return this.a;
    }

    public Value b() {
        return this.b;
    }

    public Codec<Value> c() {
        return this.a.a().validate(this.c::a);
    }

    public Value a(Value $$0) {
        return this.c.b($$0);
    }

    public boolean d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public String toString() {
        return bhs.a(mi.aN, this);
    }

    public static class a<Value> {
        private final cdw<Value> a;
        private @Nullable Value b;
        private cdv<Value> c = cdv.a();
        private boolean d = false;
        private boolean e = true;
        private boolean f = false;

        public a(cdw<Value> $$0) {
            this.a = $$0;
        }

        public a<Value> a(Value $$0) {
            this.b = $$0;
            return this;
        }

        public a<Value> a(cdv<Value> $$0) {
            this.c = $$0;
            return this;
        }

        public a<Value> a() {
            this.d = true;
            return this;
        }

        public a<Value> b() {
            this.e = false;
            return this;
        }

        public a<Value> c() {
            this.f = true;
            return this;
        }

        public cea<Value> d() {
            return new cea<Value>(this.a, Objects.requireNonNull(this.b, "Missing default value"), this.c, this.d, this.e, this.f);
        }
    }
}


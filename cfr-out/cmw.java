/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.K1
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.Optional;

public final class cmw<F extends K1, Value> {
    private final cim<?> a;
    private final cqw<Value> b;
    private final App<F, Value> c;

    public cmw(cim<?> $$0, cqw<Value> $$1, App<F, Value> $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public App<F, Value> a() {
        return this.c;
    }

    public void a(Value $$0) {
        this.a.a(this.b, Optional.of($$0));
    }

    public void a(Optional<Value> $$0) {
        this.a.a(this.b, $$0);
    }

    public void a(Value $$0, long $$1) {
        this.a.a(this.b, $$0, $$1);
    }

    public void b() {
        this.a.b(this.b);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 */
import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class coj
extends cop {
    private static final int a = 200;
    private final cvh b;
    private int c;
    private int d;

    public coj(cvh $$0) {
        this.b = $$0;
        this.d = this.a($$0);
    }

    protected int a(cvh $$0) {
        return coj.b(200 + $$0.ep().a(200) % 20);
    }

    @Override
    public boolean b() {
        if (this.b.gU()) {
            return false;
        }
        if (this.b.gR()) {
            return true;
        }
        if (this.d > 0) {
            --this.d;
            return false;
        }
        this.d = this.a(this.b);
        Predicate<cvh> $$02 = $$0 -> $$0.gT() || !$$0.gR();
        List<cvh> $$1 = this.b.ao().a(this.b.getClass(), this.b.dj().c(8.0, 8.0, 8.0), $$02);
        cvh $$2 = (cvh)DataFixUtils.orElse($$1.stream().filter(cvh::gT).findAny(), (Object)this.b);
        $$2.a($$1.stream().filter($$0 -> !$$0.gR()));
        return this.b.gR();
    }

    @Override
    public boolean c() {
        return this.b.gR() && this.b.gV();
    }

    @Override
    public void d() {
        this.c = 0;
    }

    @Override
    public void e() {
        this.b.gS();
    }

    @Override
    public void a() {
        if (--this.c > 0) {
            return;
        }
        this.c = this.a(10);
        this.b.gW();
    }
}


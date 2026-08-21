/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class wl
extends wh {
    private final Deque<wj> a = new ArrayDeque<wj>();

    public wl(wi ... $$0) {
        wj $$1 = wj.a();
        for (wi $$2 : $$0) {
            $$1.a($$2);
        }
        this.a.push($$1);
    }

    @Override
    public vw.a a(wb<?> $$0, String $$1) {
        wj $$3;
        wj $$2 = this.a.element();
        if ($$2.a($$0, $$1)) {
            return vw.a.b;
        }
        if ($$0 == uz.b && ($$3 = $$2.d().get($$1)) != null) {
            this.a.push($$3);
        }
        return super.a($$0, $$1);
    }

    @Override
    public vw.b b() {
        if (this.e() == this.a.element().b()) {
            this.a.pop();
        }
        return super.b();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class emy
extends elb {
    private static final Logger a = LogUtils.getLogger();
    private static final String b = "";
    private static final boolean c = false;
    private ept d;
    private String e = "";
    private boolean f = false;
    private boolean g;

    public emy(is $$0, eoh $$1) {
        super(eld.U, $$0, $$1);
        this.d = $$1.c(eio.b);
    }

    @Override
    protected void a(fns $$0) {
        $$0.a("mode", ept.e, this.d);
        $$0.a("message", this.e);
        $$0.a("powered", this.f);
    }

    @Override
    protected void a(fnq $$0) {
        this.d = $$0.a("mode", ept.e).orElse(ept.c);
        this.e = $$0.a("message", b);
        this.f = $$0.a("powered", false);
    }

    private void w() {
        if (this.n == null) {
            return;
        }
        is $$0 = this.aD_();
        eoh $$1 = this.n.a_($$0);
        if ($$1.a(dzs.qa)) {
            this.n.a($$0, (eoh)$$1.b(eio.b, this.d), 2);
        }
    }

    public @Nullable adh a() {
        return adh.a(this);
    }

    @Override
    public uz a(jf.a $$0) {
        return this.d($$0);
    }

    public boolean c() {
        return this.f;
    }

    public void a(boolean $$0) {
        this.f = $$0;
    }

    public ept d() {
        return this.d;
    }

    public void a(ept $$0) {
        this.d = $$0;
        this.w();
    }

    private dzq x() {
        return this.o().b();
    }

    public void f() {
        this.g = false;
        if (this.d == ept.a && this.n != null) {
            this.a(false);
            this.n.a(this.aD_(), this.x());
        }
    }

    public void h() {
        if (this.d == ept.a && this.n != null) {
            this.a(true);
            is $$0 = this.aD_();
            this.n.a($$0, this.x());
            this.n.af().b($$0, this.x());
            this.k();
            return;
        }
        if (this.d == ept.b) {
            this.k();
        }
        this.g = true;
    }

    public void k() {
        if (!this.e.isBlank()) {
            a.info("Test {} (at {}): {}", new Object[]{this.d.c(), this.aD_(), this.e});
        }
    }

    public boolean l() {
        return this.g;
    }

    public String m() {
        return this.e;
    }

    public void a(String $$0) {
        this.e = $$0;
    }

    public /* synthetic */ @Nullable aay ax_() {
        return this.a();
    }
}


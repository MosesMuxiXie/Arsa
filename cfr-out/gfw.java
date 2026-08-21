/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.BooleanSupplier;

public class gfw
extends gfh {
    private final BooleanSupplier b;
    private boolean c;
    private final boolean d;

    public gfw(String $$0, int $$1, gfh.a $$2, BooleanSupplier $$3, boolean $$4) {
        this($$0, fyc.b.a, $$1, $$2, $$3, $$4);
    }

    public gfw(String $$0, fyc.b $$1, int $$2, gfh.a $$3, BooleanSupplier $$4, boolean $$5) {
        super($$0, $$1, $$2, $$3);
        this.b = $$4;
        this.d = $$5;
    }

    @Override
    protected boolean j() {
        return super.j() && !this.b.getAsBoolean();
    }

    @Override
    public void a(boolean $$0) {
        if (this.b.getAsBoolean()) {
            if ($$0) {
                super.a(!this.f());
            }
        } else {
            super.a($$0);
        }
    }

    @Override
    protected void i() {
        if (this.b.getAsBoolean() && this.f() || this.c) {
            this.c = true;
        }
        this.r();
    }

    public boolean q() {
        boolean $$0 = this.d && this.b.getAsBoolean() && this.a.a() == fyc.b.a && this.c;
        this.c = false;
        return $$0;
    }

    protected void r() {
        super.a(false);
    }
}


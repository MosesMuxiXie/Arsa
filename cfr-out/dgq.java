/*
 * Decompiled with CFR 0.152.
 */
public class dgq
extends dgi {
    private final dvp e = new dvp(){

        @Override
        public void a(dwo $$0, is $$1, int $$2) {
            $$0.a((cgk)dgq.this, (byte)$$2);
        }
    };
    private final Runnable f;

    public dgq(cgu<? extends dgq> $$0, dwo $$1) {
        super($$0, $$1);
        this.f = this.c($$1);
    }

    @Override
    protected dlp p() {
        return dlx.pi;
    }

    @Override
    public dlt dZ() {
        return new dlt(dlx.pi);
    }

    private Runnable c(dwo $$0) {
        return $$0 instanceof axf ? () -> this.e.a((axf)$$0, this.dK()) : () -> this.e.a($$0, this.dK());
    }

    @Override
    public eoh w() {
        return dzs.cP.m();
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.e.a(this.ao(), this.dK(), $$0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        this.e.a($$0);
    }

    @Override
    public void b(byte $$0) {
        this.e.a(this.ao(), $$0);
    }

    @Override
    public void g() {
        super.g();
        this.f.run();
    }

    public dvp e() {
        return this.e;
    }
}


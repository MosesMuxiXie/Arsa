/*
 * Decompiled with CFR 0.152.
 */
public class bxp
extends bxm {
    private final bxj c;
    private final bxo d;

    public bxp(int $$0, bxj $$1, bxo $$2) {
        this($$0, $$1, $$2, new long[$$0]);
    }

    public bxp(int $$0, bxj $$1, bxo $$2, long[] $$3) {
        super($$0, $$3);
        this.c = $$1;
        this.d = $$2;
    }

    @Override
    protected void a() {
        if (this.c.a(this.d.a())) {
            this.c.a(this.d.a(), new aef((long[])this.b.clone(), this.d));
        }
    }
}

